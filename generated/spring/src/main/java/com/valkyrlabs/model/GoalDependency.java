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
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
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
* A dependency that a goal depends upon
*/

@Schema(name = "GoalDependency", description = "A dependency that a goal depends upon")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class GoalDependency  implements DataObject   {
    
    @AuditedField
        private UUID goalId;
    
    @AuditedField
        private Integer dependencyOrder;
    
    @AuditedField
        private String dependencyName;
    
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
        public GoalDependency goalId(UUID goalId) {
            this.goalId = goalId;
        return this;
        }
            /**
                * Get goalId
            * @return goalId
            */
                @Valid 
                @Schema(name = "goalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("goalId")
            public UUID getGoalId() {
            return goalId;
            }
            public void setGoalId(UUID goalId) {
            this.goalId = goalId;
            }
        public GoalDependency dependencyOrder(Integer dependencyOrder) {
            this.dependencyOrder = dependencyOrder;
        return this;
        }
            /**
                * the order in which this dependency exists
            * @return dependencyOrder
            */
                
                @Schema(name = "dependencyOrder", description = "the order in which this dependency exists", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("dependencyOrder")
            public Integer getDependencyOrder() {
            return dependencyOrder;
            }
            public void setDependencyOrder(Integer dependencyOrder) {
            this.dependencyOrder = dependencyOrder;
            }
        public GoalDependency dependencyName(String dependencyName) {
            this.dependencyName = dependencyName;
        return this;
        }
            /**
                * the name of the dependency
            * @return dependencyName
            */
                
                @Schema(name = "dependencyName", description = "the name of the dependency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("dependencyName")
            public String getDependencyName() {
            return dependencyName;
            }
            public void setDependencyName(String dependencyName) {
            this.dependencyName = dependencyName;
            }
        public GoalDependency id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "aa69b5cd-6773-4bd7-b923-6880238ede45", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public GoalDependency ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "b5bfd1a7-6fe0-46b9-9ea7-e287df1b7d53", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public GoalDependency createdDate(OffsetDateTime createdDate) {
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
        public GoalDependency keyHash(String keyHash) {
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
        public GoalDependency lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "b11c0ca4-6d9b-4433-8758-bf05df3fc049", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public GoalDependency lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public GoalDependency lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "96e56a99-f729-44ab-98d2-d76856d2774c", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public GoalDependency lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            GoalDependency goalDependency = (GoalDependency) o;
            return Objects.equals(this.goalId, goalDependency.goalId) &&
            Objects.equals(this.dependencyOrder, goalDependency.dependencyOrder) &&
            Objects.equals(this.dependencyName, goalDependency.dependencyName) &&
            Objects.equals(this.id, goalDependency.id) &&
            Objects.equals(this.ownerId, goalDependency.ownerId) &&
            Objects.equals(this.createdDate, goalDependency.createdDate) &&
            Objects.equals(this.keyHash, goalDependency.keyHash) &&
            Objects.equals(this.lastAccessedById, goalDependency.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, goalDependency.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, goalDependency.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, goalDependency.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(goalId, dependencyOrder, dependencyName, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GoalDependency {\n");
        sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
        sb.append("    dependencyOrder: ").append(toIndentedString(dependencyOrder)).append("\n");
        sb.append("    dependencyName: ").append(toIndentedString(dependencyName)).append("\n");
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
