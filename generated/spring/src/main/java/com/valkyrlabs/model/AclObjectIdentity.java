package com.valkyrlabs.model;

import java.net.URI;
import java.util.Objects;

import jakarta.persistence.FetchType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.transaction.annotation.Transactional;
import com.valkyrlabs.valkyrai.audit.AuditedField;
import com.valkyrlabs.valkyrai.audit.AuditedClass;
import com.valkyrlabs.valkyrai.audit.AuditingField;
import com.valkyrlabs.thorapi.data.DataField;

import com.valkyrlabs.valkyrai.service.SecureField;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

// BEGIN POJO.MUSTACHE
/**
* ACL identity for an object
*/

@Schema(name = "AclObjectIdentity", description = "ACL identity for an object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class AclObjectIdentity  implements DataObject   {
    
    @AuditedField
        private JsonNullable<UUID> objectIdClass = JsonNullable.<UUID>undefined();
    
    @AuditedField
        private JsonNullable<UUID> objectIdIdentity = JsonNullable.<UUID>undefined();
    
    @AuditedField
        private JsonNullable<UUID> parentObject = JsonNullable.<UUID>undefined();
    
    @AuditedField
        private JsonNullable<UUID> ownerSid = JsonNullable.<UUID>undefined();
    
    @AuditedField
        private JsonNullable<Integer> entriesInheriting = JsonNullable.<Integer>undefined();
    
    @AuditedField
        @Id  
        @GeneratedValue(generator = "UUID")

        private UUID id;
    
    @AuditedField
                @AuditingField(fieldType = AuditingField.FieldType.CREATED_BY, enabled = true)
        private UUID ownerId;
    
    @AuditedField
                @AuditingField(fieldType = AuditingField.FieldType.CREATED_DATE, enabled = true)
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private OffsetDateTime createdDate;
    
    @AuditedField
        private String keyHash;
    
    @AuditedField
                @AuditingField(fieldType = AuditingField.FieldType.LAST_ACCESSED_BY, enabled = true)
        private UUID lastAccessedById;
    
    @AuditedField
                @AuditingField(fieldType = AuditingField.FieldType.LAST_ACCESSED_DATE, enabled = true)
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private OffsetDateTime lastAccessedDate;
    
    @AuditedField
                @AuditingField(fieldType = AuditingField.FieldType.LAST_MODIFIED_BY, enabled = true)
        private UUID lastModifiedById;
    
    @AuditedField
            @AuditingField(fieldType = AuditingField.FieldType.LAST_MODIFIED_DATE, enabled = true)
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private OffsetDateTime lastModifiedDate;
        public AclObjectIdentity objectIdClass(UUID objectIdClass) {
            this.objectIdClass = JsonNullable.of(objectIdClass);
        return this;
        }
            /**
                * Get objectIdClass
            * @return objectIdClass
            */
                @Valid 
                @Schema(name = "objectIdClass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("objectIdClass")
            public JsonNullable<UUID> getObjectIdClass() {
            return objectIdClass;
            }
            public void setObjectIdClass(JsonNullable<UUID> objectIdClass) {
            this.objectIdClass = objectIdClass;
            }
        public AclObjectIdentity objectIdIdentity(UUID objectIdIdentity) {
            this.objectIdIdentity = JsonNullable.of(objectIdIdentity);
        return this;
        }
            /**
                * Get objectIdIdentity
            * @return objectIdIdentity
            */
                @Valid 
                @Schema(name = "objectIdIdentity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("objectIdIdentity")
            public JsonNullable<UUID> getObjectIdIdentity() {
            return objectIdIdentity;
            }
            public void setObjectIdIdentity(JsonNullable<UUID> objectIdIdentity) {
            this.objectIdIdentity = objectIdIdentity;
            }
        public AclObjectIdentity parentObject(UUID parentObject) {
            this.parentObject = JsonNullable.of(parentObject);
        return this;
        }
            /**
                * Get parentObject
            * @return parentObject
            */
                @Valid 
                @Schema(name = "parentObject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("parentObject")
            public JsonNullable<UUID> getParentObject() {
            return parentObject;
            }
            public void setParentObject(JsonNullable<UUID> parentObject) {
            this.parentObject = parentObject;
            }
        public AclObjectIdentity ownerSid(UUID ownerSid) {
            this.ownerSid = JsonNullable.of(ownerSid);
        return this;
        }
            /**
                * Get ownerSid
            * @return ownerSid
            */
                @Valid 
                @Schema(name = "ownerSid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerSid")
            public JsonNullable<UUID> getOwnerSid() {
            return ownerSid;
            }
            public void setOwnerSid(JsonNullable<UUID> ownerSid) {
            this.ownerSid = ownerSid;
            }
        public AclObjectIdentity entriesInheriting(Integer entriesInheriting) {
            this.entriesInheriting = JsonNullable.of(entriesInheriting);
        return this;
        }
            /**
                * Get entriesInheriting
            * @return entriesInheriting
            */
                
                @Schema(name = "entriesInheriting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("entriesInheriting")
            public JsonNullable<Integer> getEntriesInheriting() {
            return entriesInheriting;
            }
            public void setEntriesInheriting(JsonNullable<Integer> entriesInheriting) {
            this.entriesInheriting = entriesInheriting;
            }
        public AclObjectIdentity id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "d5156291-8bfd-48e1-86c4-b7410caa1e21", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public AclObjectIdentity ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "b2df36b1-1ae5-4dac-b1d7-f9972a5ad5be", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public AclObjectIdentity createdDate(OffsetDateTime createdDate) {
            this.createdDate = createdDate;
        return this;
        }
            /**
                * Date of object creation
            * @return createdDate
            */
                @Valid 
                @Schema(name = "createdDate", description = "Date of object creation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("createdDate")
            public OffsetDateTime getCreatedDate() {
            return createdDate;
            }
            public void setCreatedDate(OffsetDateTime createdDate) {
            this.createdDate = createdDate;
            }
        public AclObjectIdentity keyHash(String keyHash) {
            this.keyHash = keyHash;
        return this;
        }
            /**
                * Data, including hash of the key(s) used to encrypt this record.
            * @return keyHash
            */
                
                @Schema(name = "keyHash", description = "Data, including hash of the key(s) used to encrypt this record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("keyHash")
            public String getKeyHash() {
            return keyHash;
            }
            public void setKeyHash(String keyHash) {
            this.keyHash = keyHash;
            }
        public AclObjectIdentity lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "32414f52-7019-4948-b5d0-f2843057c5bf", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public AclObjectIdentity lastAccessedDate(OffsetDateTime lastAccessedDate) {
            this.lastAccessedDate = lastAccessedDate;
        return this;
        }
            /**
                * Timestamp of last access of object
            * @return lastAccessedDate
            */
                @Valid 
                @Schema(name = "lastAccessedDate", description = "Timestamp of last access of object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedDate")
            public OffsetDateTime getLastAccessedDate() {
            return lastAccessedDate;
            }
            public void setLastAccessedDate(OffsetDateTime lastAccessedDate) {
            this.lastAccessedDate = lastAccessedDate;
            }
        public AclObjectIdentity lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "916157d1-7695-431e-b37e-32321c646272", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public AclObjectIdentity lastModifiedDate(OffsetDateTime lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
        return this;
        }
            /**
                * Date of last object modification
            * @return lastModifiedDate
            */
                @Valid 
                @Schema(name = "lastModifiedDate", description = "Date of last object modification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedDate")
            public OffsetDateTime getLastModifiedDate() {
            return lastModifiedDate;
            }
            public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            AclObjectIdentity aclObjectIdentity = (AclObjectIdentity) o;
            return equalsNullable(this.objectIdClass, aclObjectIdentity.objectIdClass) &&
            equalsNullable(this.objectIdIdentity, aclObjectIdentity.objectIdIdentity) &&
            equalsNullable(this.parentObject, aclObjectIdentity.parentObject) &&
            equalsNullable(this.ownerSid, aclObjectIdentity.ownerSid) &&
            equalsNullable(this.entriesInheriting, aclObjectIdentity.entriesInheriting) &&
            Objects.equals(this.id, aclObjectIdentity.id) &&
            Objects.equals(this.ownerId, aclObjectIdentity.ownerId) &&
            Objects.equals(this.createdDate, aclObjectIdentity.createdDate) &&
            Objects.equals(this.keyHash, aclObjectIdentity.keyHash) &&
            Objects.equals(this.lastAccessedById, aclObjectIdentity.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, aclObjectIdentity.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, aclObjectIdentity.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, aclObjectIdentity.lastModifiedDate);
        }

            private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
                return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
                }

            @Override
            public int hashCode() {
            return Objects.hash(hashCodeNullable(objectIdClass), hashCodeNullable(objectIdIdentity), hashCodeNullable(parentObject), hashCodeNullable(ownerSid), hashCodeNullable(entriesInheriting), id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }

                private static <T> int hashCodeNullable(JsonNullable<T> a) {
                if (a == null) {
                return 1;
                }
                return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
                }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AclObjectIdentity {\n");
        sb.append("    objectIdClass: ").append(toIndentedString(objectIdClass)).append("\n");
        sb.append("    objectIdIdentity: ").append(toIndentedString(objectIdIdentity)).append("\n");
        sb.append("    parentObject: ").append(toIndentedString(parentObject)).append("\n");
        sb.append("    ownerSid: ").append(toIndentedString(ownerSid)).append("\n");
        sb.append("    entriesInheriting: ").append(toIndentedString(entriesInheriting)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    keyHash: ").append(toIndentedString(keyHash)).append("\n");
        sb.append("    lastAccessedById: ").append(toIndentedString(lastAccessedById)).append("\n");
        sb.append("    lastAccessedDate: ").append(toIndentedString(lastAccessedDate)).append("\n");
        sb.append("    lastModifiedById: ").append(toIndentedString(lastModifiedById)).append("\n");
        sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
        sb.append("}");
            return sb.toString();
            }

            /**
            * Convert the given object to string with each line indented by 4 spaces
            * (except the first line).
            */
            private String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
                return o.toString().replace("\n", "\n    ");
            }
    }

