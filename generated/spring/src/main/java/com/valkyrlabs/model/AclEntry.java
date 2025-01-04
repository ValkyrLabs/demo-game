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
* TODO AclEntry CLASS DESCRIPTION
*/

@Schema(name = "AclEntry", description = "TODO AclEntry CLASS DESCRIPTION")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class AclEntry  implements DataObject   {
    
    @AuditedField
        private JsonNullable<UUID> aclObjectOdentity = JsonNullable.<UUID>undefined();
    
    @AuditedField
        private JsonNullable<Integer> aceOrder = JsonNullable.<Integer>undefined();
    
    @AuditedField
        private JsonNullable<UUID> sid = JsonNullable.<UUID>undefined();
    
    @AuditedField
        private JsonNullable<Integer> mask = JsonNullable.<Integer>undefined();
    
    @AuditedField
        private JsonNullable<Integer> granting = JsonNullable.<Integer>undefined();
    
    @AuditedField
        private JsonNullable<Integer> auditSuccess = JsonNullable.<Integer>undefined();
    
    @AuditedField
        private JsonNullable<Integer> auditFailure = JsonNullable.<Integer>undefined();
    
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
        public AclEntry aclObjectOdentity(UUID aclObjectOdentity) {
            this.aclObjectOdentity = JsonNullable.of(aclObjectOdentity);
        return this;
        }
            /**
                * Get aclObjectOdentity
            * @return aclObjectOdentity
            */
                @Valid 
                @Schema(name = "aclObjectOdentity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("aclObjectOdentity")
            public JsonNullable<UUID> getAclObjectOdentity() {
            return aclObjectOdentity;
            }
            public void setAclObjectOdentity(JsonNullable<UUID> aclObjectOdentity) {
            this.aclObjectOdentity = aclObjectOdentity;
            }
        public AclEntry aceOrder(Integer aceOrder) {
            this.aceOrder = JsonNullable.of(aceOrder);
        return this;
        }
            /**
                * Get aceOrder
            * @return aceOrder
            */
                
                @Schema(name = "aceOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("aceOrder")
            public JsonNullable<Integer> getAceOrder() {
            return aceOrder;
            }
            public void setAceOrder(JsonNullable<Integer> aceOrder) {
            this.aceOrder = aceOrder;
            }
        public AclEntry sid(UUID sid) {
            this.sid = JsonNullable.of(sid);
        return this;
        }
            /**
                * Get sid
            * @return sid
            */
                @Valid 
                @Schema(name = "sid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("sid")
            public JsonNullable<UUID> getSid() {
            return sid;
            }
            public void setSid(JsonNullable<UUID> sid) {
            this.sid = sid;
            }
        public AclEntry mask(Integer mask) {
            this.mask = JsonNullable.of(mask);
        return this;
        }
            /**
                * Get mask
            * @return mask
            */
                
                @Schema(name = "mask", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("mask")
            public JsonNullable<Integer> getMask() {
            return mask;
            }
            public void setMask(JsonNullable<Integer> mask) {
            this.mask = mask;
            }
        public AclEntry granting(Integer granting) {
            this.granting = JsonNullable.of(granting);
        return this;
        }
            /**
                * Get granting
            * @return granting
            */
                
                @Schema(name = "granting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("granting")
            public JsonNullable<Integer> getGranting() {
            return granting;
            }
            public void setGranting(JsonNullable<Integer> granting) {
            this.granting = granting;
            }
        public AclEntry auditSuccess(Integer auditSuccess) {
            this.auditSuccess = JsonNullable.of(auditSuccess);
        return this;
        }
            /**
                * Get auditSuccess
            * @return auditSuccess
            */
                
                @Schema(name = "auditSuccess", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("auditSuccess")
            public JsonNullable<Integer> getAuditSuccess() {
            return auditSuccess;
            }
            public void setAuditSuccess(JsonNullable<Integer> auditSuccess) {
            this.auditSuccess = auditSuccess;
            }
        public AclEntry auditFailure(Integer auditFailure) {
            this.auditFailure = JsonNullable.of(auditFailure);
        return this;
        }
            /**
                * Get auditFailure
            * @return auditFailure
            */
                
                @Schema(name = "auditFailure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("auditFailure")
            public JsonNullable<Integer> getAuditFailure() {
            return auditFailure;
            }
            public void setAuditFailure(JsonNullable<Integer> auditFailure) {
            this.auditFailure = auditFailure;
            }
        public AclEntry id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "7413f82e-9a3a-4d5d-8d2e-916e8afbe8ff", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public AclEntry ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "2c1fed55-df40-4850-b97f-48867b50b339", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public AclEntry createdDate(OffsetDateTime createdDate) {
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
        public AclEntry keyHash(String keyHash) {
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
        public AclEntry lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "bc414fd8-a228-441a-b606-edd49cc0bbef", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public AclEntry lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public AclEntry lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "53283013-1c3d-4728-8d1f-0aef4f0089a9", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public AclEntry lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            AclEntry aclEntry = (AclEntry) o;
            return equalsNullable(this.aclObjectOdentity, aclEntry.aclObjectOdentity) &&
            equalsNullable(this.aceOrder, aclEntry.aceOrder) &&
            equalsNullable(this.sid, aclEntry.sid) &&
            equalsNullable(this.mask, aclEntry.mask) &&
            equalsNullable(this.granting, aclEntry.granting) &&
            equalsNullable(this.auditSuccess, aclEntry.auditSuccess) &&
            equalsNullable(this.auditFailure, aclEntry.auditFailure) &&
            Objects.equals(this.id, aclEntry.id) &&
            Objects.equals(this.ownerId, aclEntry.ownerId) &&
            Objects.equals(this.createdDate, aclEntry.createdDate) &&
            Objects.equals(this.keyHash, aclEntry.keyHash) &&
            Objects.equals(this.lastAccessedById, aclEntry.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, aclEntry.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, aclEntry.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, aclEntry.lastModifiedDate);
        }

            private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
                return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
                }

            @Override
            public int hashCode() {
            return Objects.hash(hashCodeNullable(aclObjectOdentity), hashCodeNullable(aceOrder), hashCodeNullable(sid), hashCodeNullable(mask), hashCodeNullable(granting), hashCodeNullable(auditSuccess), hashCodeNullable(auditFailure), id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
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
            sb.append("class AclEntry {\n");
        sb.append("    aclObjectOdentity: ").append(toIndentedString(aclObjectOdentity)).append("\n");
        sb.append("    aceOrder: ").append(toIndentedString(aceOrder)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
        sb.append("    granting: ").append(toIndentedString(granting)).append("\n");
        sb.append("    auditSuccess: ").append(toIndentedString(auditSuccess)).append("\n");
        sb.append("    auditFailure: ").append(toIndentedString(auditFailure)).append("\n");
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

