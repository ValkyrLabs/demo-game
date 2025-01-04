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
import com.valkyrlabs.model.Goal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
* Organization-Wide Strategic Priorities
*/

@Schema(name = "StrategicPriority", description = "Organization-Wide Strategic Priorities")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class StrategicPriority  implements DataObject   {
    
    @AuditedField
        private String name;
    
    @AuditedField
        private String description;
    
              /**
   * Gets or Sets priorityLevel
   */
  public enum PriorityLevelEnum {
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high"),
    
    CRITICAL("critical");

    private String value;

    PriorityLevelEnum(String value) {
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
    public static PriorityLevelEnum fromValue(String value) {
      for (PriorityLevelEnum b : PriorityLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private PriorityLevelEnum priorityLevel;
    
    @AuditedField
        private String imageUrl;
    
    @AuditedField
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        private LocalDate startDate;
    
    @AuditedField
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        private LocalDate targetDate;
    
    @AuditedField
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "strategicPriorityId",
            orphanRemoval = false
        )
        
        private List<@Valid Goal> goals = new ArrayList<>();
    
              /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NOT_STARTED("Not-Started"),
    
    IN_PROGRESS("In-Progress"),
    
    COMPLETE("Complete");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private StatusEnum status;
    
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
        public StrategicPriority name(String name) {
            this.name = name;
        return this;
        }
            /**
                * Get name
            * @return name
            */
                
                @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("name")
            public String getName() {
            return name;
            }
            public void setName(String name) {
            this.name = name;
            }
        public StrategicPriority description(String description) {
            this.description = description;
        return this;
        }
            /**
                * high-level description of the strategic priority
            * @return description
            */
                
                @Schema(name = "description", description = "high-level description of the strategic priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("description")
            public String getDescription() {
            return description;
            }
            public void setDescription(String description) {
            this.description = description;
            }
        public StrategicPriority priorityLevel(PriorityLevelEnum priorityLevel) {
            this.priorityLevel = priorityLevel;
        return this;
        }
            /**
                * Get priorityLevel
            * @return priorityLevel
            */
                
                @Schema(name = "priorityLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("priorityLevel")
            public PriorityLevelEnum getPriorityLevel() {
            return priorityLevel;
            }
            public void setPriorityLevel(PriorityLevelEnum priorityLevel) {
            this.priorityLevel = priorityLevel;
            }
        public StrategicPriority imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        return this;
        }
            /**
                * URL for the strategic priority
            * @return imageUrl
            */
                
                @Schema(name = "imageUrl", example = "https://strategic-images.irl/image.png", description = "URL for the strategic priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("imageUrl")
            public String getImageUrl() {
            return imageUrl;
            }
            public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            }
        public StrategicPriority startDate(LocalDate startDate) {
            this.startDate = startDate;
        return this;
        }
            /**
                * Get startDate
            * @return startDate
            */
                @Valid 
                @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("startDate")
            public LocalDate getStartDate() {
            return startDate;
            }
            public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
            }
        public StrategicPriority targetDate(LocalDate targetDate) {
            this.targetDate = targetDate;
        return this;
        }
            /**
                * Get targetDate
            * @return targetDate
            */
                @Valid 
                @Schema(name = "targetDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("targetDate")
            public LocalDate getTargetDate() {
            return targetDate;
            }
            public void setTargetDate(LocalDate targetDate) {
            this.targetDate = targetDate;
            }
        public StrategicPriority goals(List<@Valid Goal> goals) {
            this.goals = goals;
        return this;
        }
            public StrategicPriority addGoalsItem(Goal goalsItem) {
                if (this.goals == null) {
                this.goals = new ArrayList<>();
                }
                this.goals.add(goalsItem);
            return this;
            }
            /**
                * Get goals
            * @return goals
            */
                @Valid 
                @Schema(name = "goals", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("goals")
            public List<@Valid Goal> getGoals() {
            return goals;
            }
            public void setGoals(List<@Valid Goal> goals) {
            this.goals = goals;
            }
        public StrategicPriority status(StatusEnum status) {
            this.status = status;
        return this;
        }
            /**
                * Get status
            * @return status
            */
                
                @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("status")
            public StatusEnum getStatus() {
            return status;
            }
            public void setStatus(StatusEnum status) {
            this.status = status;
            }
        public StrategicPriority id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "fcb7f22d-8218-4520-873b-7745b7c62259", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public StrategicPriority ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "95d2359b-8984-4779-b31a-03dfa3b6f475", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public StrategicPriority createdDate(OffsetDateTime createdDate) {
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
        public StrategicPriority keyHash(String keyHash) {
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
        public StrategicPriority lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "b6bb36ab-05e4-433a-8cba-a623adb6d860", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public StrategicPriority lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public StrategicPriority lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "7b8145ba-18b0-48be-8005-7ba6e173c2a6", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public StrategicPriority lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            StrategicPriority strategicPriority = (StrategicPriority) o;
            return Objects.equals(this.name, strategicPriority.name) &&
            Objects.equals(this.description, strategicPriority.description) &&
            Objects.equals(this.priorityLevel, strategicPriority.priorityLevel) &&
            Objects.equals(this.imageUrl, strategicPriority.imageUrl) &&
            Objects.equals(this.startDate, strategicPriority.startDate) &&
            Objects.equals(this.targetDate, strategicPriority.targetDate) &&
            Objects.equals(this.goals, strategicPriority.goals) &&
            Objects.equals(this.status, strategicPriority.status) &&
            Objects.equals(this.id, strategicPriority.id) &&
            Objects.equals(this.ownerId, strategicPriority.ownerId) &&
            Objects.equals(this.createdDate, strategicPriority.createdDate) &&
            Objects.equals(this.keyHash, strategicPriority.keyHash) &&
            Objects.equals(this.lastAccessedById, strategicPriority.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, strategicPriority.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, strategicPriority.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, strategicPriority.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(name, description, priorityLevel, imageUrl, startDate, targetDate, goals, status, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StrategicPriority {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    priorityLevel: ").append(toIndentedString(priorityLevel)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    targetDate: ").append(toIndentedString(targetDate)).append("\n");
        sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

