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
import com.fasterxml.jackson.annotation.JsonValue;
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
* Represents a sales activity or engagement related to an opportunity.
*/

@Schema(name = "SalesActivity", description = "Represents a sales activity or engagement related to an opportunity.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class SalesActivity  implements DataObject   {
    
    @AuditedField
        private UUID opportunityId;
    
              /**
   * Type of the sales activity.
   */
  public enum TypeEnum {
    CALL("call"),
    
    MEETING("meeting"),
    
    EMAIL("email"),
    
    FOLLOW_UP("follow-up");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private TypeEnum type;
    
    @AuditedField
        private String details;
    
    @AuditedField
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private OffsetDateTime activityDate;
    
    @AuditedField
        private UUID performedBy;
    
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
        public SalesActivity() {
        super();
        }
        /**
        * Constructor with only required parameters
        */
        public SalesActivity(UUID opportunityId, TypeEnum type, OffsetDateTime activityDate, UUID performedBy) {
                            this.opportunityId = opportunityId;
                            this.type = type;
                            this.activityDate = activityDate;
                            this.performedBy = performedBy;
                }
        public SalesActivity opportunityId(UUID opportunityId) {
            this.opportunityId = opportunityId;
        return this;
        }
            /**
                * The associated opportunity.
            * @return opportunityId
            */
                @NotNull @Valid 
                @Schema(name = "opportunityId", description = "The associated opportunity.", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("opportunityId")
            public UUID getOpportunityId() {
            return opportunityId;
            }
            public void setOpportunityId(UUID opportunityId) {
            this.opportunityId = opportunityId;
            }
        public SalesActivity type(TypeEnum type) {
            this.type = type;
        return this;
        }
            /**
                * Type of the sales activity.
            * @return type
            */
                @NotNull 
                @Schema(name = "type", description = "Type of the sales activity.", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("type")
            public TypeEnum getType() {
            return type;
            }
            public void setType(TypeEnum type) {
            this.type = type;
            }
        public SalesActivity details(String details) {
            this.details = details;
        return this;
        }
            /**
                * Details about the activity.
            * @return details
            */
                
                @Schema(name = "details", description = "Details about the activity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("details")
            public String getDetails() {
            return details;
            }
            public void setDetails(String details) {
            this.details = details;
            }
        public SalesActivity activityDate(OffsetDateTime activityDate) {
            this.activityDate = activityDate;
        return this;
        }
            /**
                * Date and time of the activity.
            * @return activityDate
            */
                @NotNull @Valid 
                @Schema(name = "activityDate", description = "Date and time of the activity.", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("activityDate")
            public OffsetDateTime getActivityDate() {
            return activityDate;
            }
            public void setActivityDate(OffsetDateTime activityDate) {
            this.activityDate = activityDate;
            }
        public SalesActivity performedBy(UUID performedBy) {
            this.performedBy = performedBy;
        return this;
        }
            /**
                * The user who performed the activity.
            * @return performedBy
            */
                @NotNull @Valid 
                @Schema(name = "performedBy", description = "The user who performed the activity.", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("performedBy")
            public UUID getPerformedBy() {
            return performedBy;
            }
            public void setPerformedBy(UUID performedBy) {
            this.performedBy = performedBy;
            }
        public SalesActivity id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "d1291c3e-0260-4bc5-92e9-8931b67fc35a", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public SalesActivity ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "2b9f9be4-683a-4113-ac6d-7067d94037bc", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public SalesActivity createdDate(OffsetDateTime createdDate) {
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
        public SalesActivity keyHash(String keyHash) {
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
        public SalesActivity lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "bba43247-148c-44b5-b60e-3eca205c491d", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public SalesActivity lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public SalesActivity lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "5600d31a-f57e-499f-8454-20c54f0eba79", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public SalesActivity lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            SalesActivity salesActivity = (SalesActivity) o;
            return Objects.equals(this.opportunityId, salesActivity.opportunityId) &&
            Objects.equals(this.type, salesActivity.type) &&
            Objects.equals(this.details, salesActivity.details) &&
            Objects.equals(this.activityDate, salesActivity.activityDate) &&
            Objects.equals(this.performedBy, salesActivity.performedBy) &&
            Objects.equals(this.id, salesActivity.id) &&
            Objects.equals(this.ownerId, salesActivity.ownerId) &&
            Objects.equals(this.createdDate, salesActivity.createdDate) &&
            Objects.equals(this.keyHash, salesActivity.keyHash) &&
            Objects.equals(this.lastAccessedById, salesActivity.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, salesActivity.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, salesActivity.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, salesActivity.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(opportunityId, type, details, activityDate, performedBy, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SalesActivity {\n");
        sb.append("    opportunityId: ").append(toIndentedString(opportunityId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    activityDate: ").append(toIndentedString(activityDate)).append("\n");
        sb.append("    performedBy: ").append(toIndentedString(performedBy)).append("\n");
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

