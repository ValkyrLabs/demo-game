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
import com.valkyrlabs.model.GoalDependency;
import com.valkyrlabs.model.KeyMetric;
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
* A Strategic Goal
*/

@Schema(name = "Goal", description = "A Strategic Goal")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class Goal  implements DataObject   {
    
    @AuditedField
        private UUID strategicPriorityId;
    
    @AuditedField
        private String name;
    
    @AuditedField
        private String description;
    
    @AuditedField
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "goalId",
            orphanRemoval = false
        )
        
        private List<@Valid KeyMetric> keyMetrics = new ArrayList<>();
    
    @AuditedField
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "goalId",
            orphanRemoval = false
        )
        
        private List<@Valid GoalDependency> goalDependencies = new ArrayList<>();
    
    @AuditedField
        private String expectedOutcome;
    
    @AuditedField
        private String risks;
    
    @AuditedField
        private String timeline;
    
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
        public Goal strategicPriorityId(UUID strategicPriorityId) {
            this.strategicPriorityId = strategicPriorityId;
        return this;
        }
            /**
                * The strategic priority that this goal supports.
            * @return strategicPriorityId
            */
                @Valid 
                @Schema(name = "strategicPriorityId", description = "The strategic priority that this goal supports.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("strategicPriorityId")
            public UUID getStrategicPriorityId() {
            return strategicPriorityId;
            }
            public void setStrategicPriorityId(UUID strategicPriorityId) {
            this.strategicPriorityId = strategicPriorityId;
            }
        public Goal name(String name) {
            this.name = name;
        return this;
        }
            /**
                * the name of the goal
            * @return name
            */
                
                @Schema(name = "name", description = "the name of the goal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("name")
            public String getName() {
            return name;
            }
            public void setName(String name) {
            this.name = name;
            }
        public Goal description(String description) {
            this.description = description;
        return this;
        }
            /**
                * the description of the goal
            * @return description
            */
                
                @Schema(name = "description", description = "the description of the goal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("description")
            public String getDescription() {
            return description;
            }
            public void setDescription(String description) {
            this.description = description;
            }
        public Goal keyMetrics(List<@Valid KeyMetric> keyMetrics) {
            this.keyMetrics = keyMetrics;
        return this;
        }
            public Goal addKeyMetricsItem(KeyMetric keyMetricsItem) {
                if (this.keyMetrics == null) {
                this.keyMetrics = new ArrayList<>();
                }
                this.keyMetrics.add(keyMetricsItem);
            return this;
            }
            /**
                * measurements used to track success
            * @return keyMetrics
            */
                @Valid 
                @Schema(name = "keyMetrics", description = "measurements used to track success", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("keyMetrics")
            public List<@Valid KeyMetric> getKeyMetrics() {
            return keyMetrics;
            }
            public void setKeyMetrics(List<@Valid KeyMetric> keyMetrics) {
            this.keyMetrics = keyMetrics;
            }
        public Goal goalDependencies(List<@Valid GoalDependency> goalDependencies) {
            this.goalDependencies = goalDependencies;
        return this;
        }
            public Goal addGoalDependenciesItem(GoalDependency goalDependenciesItem) {
                if (this.goalDependencies == null) {
                this.goalDependencies = new ArrayList<>();
                }
                this.goalDependencies.add(goalDependenciesItem);
            return this;
            }
            /**
                * Get goalDependencies
            * @return goalDependencies
            */
                @Valid 
                @Schema(name = "goalDependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("goalDependencies")
            public List<@Valid GoalDependency> getGoalDependencies() {
            return goalDependencies;
            }
            public void setGoalDependencies(List<@Valid GoalDependency> goalDependencies) {
            this.goalDependencies = goalDependencies;
            }
        public Goal expectedOutcome(String expectedOutcome) {
            this.expectedOutcome = expectedOutcome;
        return this;
        }
            /**
                * the positive expected outcome of the goal
            * @return expectedOutcome
            */
                
                @Schema(name = "expectedOutcome", example = "faster code execution", description = "the positive expected outcome of the goal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("expectedOutcome")
            public String getExpectedOutcome() {
            return expectedOutcome;
            }
            public void setExpectedOutcome(String expectedOutcome) {
            this.expectedOutcome = expectedOutcome;
            }
        public Goal risks(String risks) {
            this.risks = risks;
        return this;
        }
            /**
                * description of the risk if the goal is not successful
            * @return risks
            */
                
                @Schema(name = "risks", example = "lower stock price", description = "description of the risk if the goal is not successful", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("risks")
            public String getRisks() {
            return risks;
            }
            public void setRisks(String risks) {
            this.risks = risks;
            }
        public Goal timeline(String timeline) {
            this.timeline = timeline;
        return this;
        }
            /**
                * Get timeline
            * @return timeline
            */
                
                @Schema(name = "timeline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("timeline")
            public String getTimeline() {
            return timeline;
            }
            public void setTimeline(String timeline) {
            this.timeline = timeline;
            }
        public Goal id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "5b1356eb-0ef0-4b8d-b822-3e3969e4f17e", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public Goal ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "d18e9265-7c0c-4285-b9e2-9bfcbc42d00b", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public Goal createdDate(OffsetDateTime createdDate) {
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
        public Goal keyHash(String keyHash) {
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
        public Goal lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "e51f413f-9ef9-4b12-b18f-fce57fcdd848", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public Goal lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public Goal lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "8fa90a56-2720-46bd-95de-c20095c1d11e", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public Goal lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            Goal goal = (Goal) o;
            return Objects.equals(this.strategicPriorityId, goal.strategicPriorityId) &&
            Objects.equals(this.name, goal.name) &&
            Objects.equals(this.description, goal.description) &&
            Objects.equals(this.keyMetrics, goal.keyMetrics) &&
            Objects.equals(this.goalDependencies, goal.goalDependencies) &&
            Objects.equals(this.expectedOutcome, goal.expectedOutcome) &&
            Objects.equals(this.risks, goal.risks) &&
            Objects.equals(this.timeline, goal.timeline) &&
            Objects.equals(this.id, goal.id) &&
            Objects.equals(this.ownerId, goal.ownerId) &&
            Objects.equals(this.createdDate, goal.createdDate) &&
            Objects.equals(this.keyHash, goal.keyHash) &&
            Objects.equals(this.lastAccessedById, goal.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, goal.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, goal.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, goal.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(strategicPriorityId, name, description, keyMetrics, goalDependencies, expectedOutcome, risks, timeline, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Goal {\n");
        sb.append("    strategicPriorityId: ").append(toIndentedString(strategicPriorityId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    keyMetrics: ").append(toIndentedString(keyMetrics)).append("\n");
        sb.append("    goalDependencies: ").append(toIndentedString(goalDependencies)).append("\n");
        sb.append("    expectedOutcome: ").append(toIndentedString(expectedOutcome)).append("\n");
        sb.append("    risks: ").append(toIndentedString(risks)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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

