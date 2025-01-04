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
import com.valkyrlabs.model.Solution;
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
* TODO BuildOutput CLASS DESCRIPTION
*/

@Schema(name = "BuildOutput", description = "TODO BuildOutput CLASS DESCRIPTION")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class BuildOutput  implements DataObject   {
    
    @AuditedField
        private UUID applicationId;
    
    @AuditedField
        private UUID buildId;
    
    @AuditedField
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private OffsetDateTime lastSuccessfulRun;
    
    @AuditedField
        private Boolean success;
    
    @AuditedField
        private String output;
    
    @AuditedField
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "buildOutputId",
            orphanRemoval = false
        )
        
        private List<@Valid Solution> solutions = new ArrayList<>();
    
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
        public BuildOutput() {
        super();
        }
        /**
        * Constructor with only required parameters
        */
        public BuildOutput(UUID buildId, Boolean success, String output) {
                            this.buildId = buildId;
                            this.success = success;
                            this.output = output;
                }
        public BuildOutput applicationId(UUID applicationId) {
            this.applicationId = applicationId;
        return this;
        }
            /**
                * Get applicationId
            * @return applicationId
            */
                @Valid 
                @Schema(name = "applicationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("applicationId")
            public UUID getApplicationId() {
            return applicationId;
            }
            public void setApplicationId(UUID applicationId) {
            this.applicationId = applicationId;
            }
        public BuildOutput buildId(UUID buildId) {
            this.buildId = buildId;
        return this;
        }
            /**
                * Get buildId
            * @return buildId
            */
                @NotNull @Valid 
                @Schema(name = "buildId", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("buildId")
            public UUID getBuildId() {
            return buildId;
            }
            public void setBuildId(UUID buildId) {
            this.buildId = buildId;
            }
        public BuildOutput lastSuccessfulRun(OffsetDateTime lastSuccessfulRun) {
            this.lastSuccessfulRun = lastSuccessfulRun;
        return this;
        }
            /**
                * Get lastSuccessfulRun
            * @return lastSuccessfulRun
            */
                @Valid 
                @Schema(name = "lastSuccessfulRun", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastSuccessfulRun")
            public OffsetDateTime getLastSuccessfulRun() {
            return lastSuccessfulRun;
            }
            public void setLastSuccessfulRun(OffsetDateTime lastSuccessfulRun) {
            this.lastSuccessfulRun = lastSuccessfulRun;
            }
        public BuildOutput success(Boolean success) {
            this.success = success;
        return this;
        }
            /**
                * Get success
            * @return success
            */
                @NotNull 
                @Schema(name = "success", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("success")
            public Boolean getSuccess() {
            return success;
            }
            public void setSuccess(Boolean success) {
            this.success = success;
            }
        public BuildOutput output(String output) {
            this.output = output;
        return this;
        }
            /**
                * Get output
            * @return output
            */
                @NotNull 
                @Schema(name = "output", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("output")
            public String getOutput() {
            return output;
            }
            public void setOutput(String output) {
            this.output = output;
            }
        public BuildOutput solutions(List<@Valid Solution> solutions) {
            this.solutions = solutions;
        return this;
        }
            public BuildOutput addSolutionsItem(Solution solutionsItem) {
                if (this.solutions == null) {
                this.solutions = new ArrayList<>();
                }
                this.solutions.add(solutionsItem);
            return this;
            }
            /**
                * Get solutions
            * @return solutions
            */
                @Valid 
                @Schema(name = "solutions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("solutions")
            public List<@Valid Solution> getSolutions() {
            return solutions;
            }
            public void setSolutions(List<@Valid Solution> solutions) {
            this.solutions = solutions;
            }
        public BuildOutput id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "4c9185d2-b6be-49a9-a6f0-12ac00526ea7", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public BuildOutput ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "5e0a24d4-1d47-4295-a249-cf2d27ebb2d2", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public BuildOutput createdDate(OffsetDateTime createdDate) {
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
        public BuildOutput keyHash(String keyHash) {
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
        public BuildOutput lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "a421ec6a-0fcf-4b60-9c39-536a111f75d3", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public BuildOutput lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public BuildOutput lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "5b8bbd53-7763-4315-8ec0-c6bfb5a4e340", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public BuildOutput lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            BuildOutput buildOutput = (BuildOutput) o;
            return Objects.equals(this.applicationId, buildOutput.applicationId) &&
            Objects.equals(this.buildId, buildOutput.buildId) &&
            Objects.equals(this.lastSuccessfulRun, buildOutput.lastSuccessfulRun) &&
            Objects.equals(this.success, buildOutput.success) &&
            Objects.equals(this.output, buildOutput.output) &&
            Objects.equals(this.solutions, buildOutput.solutions) &&
            Objects.equals(this.id, buildOutput.id) &&
            Objects.equals(this.ownerId, buildOutput.ownerId) &&
            Objects.equals(this.createdDate, buildOutput.createdDate) &&
            Objects.equals(this.keyHash, buildOutput.keyHash) &&
            Objects.equals(this.lastAccessedById, buildOutput.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, buildOutput.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, buildOutput.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, buildOutput.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(applicationId, buildId, lastSuccessfulRun, success, output, solutions, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BuildOutput {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
        sb.append("    lastSuccessfulRun: ").append(toIndentedString(lastSuccessfulRun)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    solutions: ").append(toIndentedString(solutions)).append("\n");
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

