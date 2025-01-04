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
import com.valkyrlabs.model.BuildOutput;
import com.valkyrlabs.model.Depend;
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
* Represents a ThorAPI build including success or failure
*/

@Schema(name = "Build", description = "Represents a ThorAPI build including success or failure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class Build  implements DataObject   {
    
    @AuditedField
        private String name;
    
    @AuditedField
        private UUID applicationId;
    
              /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    RUNNING("RUNNING"),
    
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE");

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
        private String projectPath;
    
              /**
   * Gets or Sets testEnumCodegen
   */
  public enum TestEnumCodegenEnum {
    /**
     * zero balance
     */
    broke(0),
    
    /**
     * money for lunch
     */
    poor(10),
    
    /**
     * get on that plane
     */
    rich(1000);

    private Integer value;

    TestEnumCodegenEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TestEnumCodegenEnum fromValue(Integer value) {
      for (TestEnumCodegenEnum b : TestEnumCodegenEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private TestEnumCodegenEnum testEnumCodegen;
    
    @AuditedField
        private String mavenHome;
    
    @AuditedField
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "buildId",
            orphanRemoval = false
        )
        
        private List<@Valid BuildOutput> outputs = new ArrayList<>();
    
    @AuditedField
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "buildId",
            orphanRemoval = false
        )
        
        private List<@Valid Depend> dependencies = new ArrayList<>();
    
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
        public Build() {
        super();
        }
        /**
        * Constructor with only required parameters
        */
        public Build(String name, StatusEnum status, String projectPath, String mavenHome) {
                            this.name = name;
                            this.status = status;
                            this.projectPath = projectPath;
                            this.mavenHome = mavenHome;
                }
        public Build name(String name) {
            this.name = name;
        return this;
        }
            /**
                * Get name
            * @return name
            */
                @NotNull 
                @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("name")
            public String getName() {
            return name;
            }
            public void setName(String name) {
            this.name = name;
            }
        public Build applicationId(UUID applicationId) {
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
        public Build status(StatusEnum status) {
            this.status = status;
        return this;
        }
            /**
                * Get status
            * @return status
            */
                @NotNull 
                @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("status")
            public StatusEnum getStatus() {
            return status;
            }
            public void setStatus(StatusEnum status) {
            this.status = status;
            }
        public Build projectPath(String projectPath) {
            this.projectPath = projectPath;
        return this;
        }
            /**
                * Get projectPath
            * @return projectPath
            */
                @NotNull 
                @Schema(name = "projectPath", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("projectPath")
            public String getProjectPath() {
            return projectPath;
            }
            public void setProjectPath(String projectPath) {
            this.projectPath = projectPath;
            }
        public Build testEnumCodegen(TestEnumCodegenEnum testEnumCodegen) {
            this.testEnumCodegen = testEnumCodegen;
        return this;
        }
            /**
                * Get testEnumCodegen
            * @return testEnumCodegen
            */
                
                @Schema(name = "testEnumCodegen", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("testEnumCodegen")
            public TestEnumCodegenEnum getTestEnumCodegen() {
            return testEnumCodegen;
            }
            public void setTestEnumCodegen(TestEnumCodegenEnum testEnumCodegen) {
            this.testEnumCodegen = testEnumCodegen;
            }
        public Build mavenHome(String mavenHome) {
            this.mavenHome = mavenHome;
        return this;
        }
            /**
                * Get mavenHome
            * @return mavenHome
            */
                @NotNull 
                @Schema(name = "mavenHome", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("mavenHome")
            public String getMavenHome() {
            return mavenHome;
            }
            public void setMavenHome(String mavenHome) {
            this.mavenHome = mavenHome;
            }
        public Build outputs(List<@Valid BuildOutput> outputs) {
            this.outputs = outputs;
        return this;
        }
            public Build addOutputsItem(BuildOutput outputsItem) {
                if (this.outputs == null) {
                this.outputs = new ArrayList<>();
                }
                this.outputs.add(outputsItem);
            return this;
            }
            /**
                * Get outputs
            * @return outputs
            */
                @Valid 
                @Schema(name = "outputs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("outputs")
            public List<@Valid BuildOutput> getOutputs() {
            return outputs;
            }
            public void setOutputs(List<@Valid BuildOutput> outputs) {
            this.outputs = outputs;
            }
        public Build dependencies(List<@Valid Depend> dependencies) {
            this.dependencies = dependencies;
        return this;
        }
            public Build addDependenciesItem(Depend dependenciesItem) {
                if (this.dependencies == null) {
                this.dependencies = new ArrayList<>();
                }
                this.dependencies.add(dependenciesItem);
            return this;
            }
            /**
                * Get dependencies
            * @return dependencies
            */
                @Valid 
                @Schema(name = "dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("dependencies")
            public List<@Valid Depend> getDependencies() {
            return dependencies;
            }
            public void setDependencies(List<@Valid Depend> dependencies) {
            this.dependencies = dependencies;
            }
        public Build id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "bae75923-cf02-4033-aed9-5d39c557a631", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public Build ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "8d2ba375-5f95-4a3b-bde5-f6bd8f814022", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public Build createdDate(OffsetDateTime createdDate) {
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
        public Build keyHash(String keyHash) {
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
        public Build lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "efe380db-ebb5-48ec-a55b-63272c48fbad", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public Build lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public Build lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "7a5a5711-5e84-436f-a944-8332f54748c1", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public Build lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            Build build = (Build) o;
            return Objects.equals(this.name, build.name) &&
            Objects.equals(this.applicationId, build.applicationId) &&
            Objects.equals(this.status, build.status) &&
            Objects.equals(this.projectPath, build.projectPath) &&
            Objects.equals(this.testEnumCodegen, build.testEnumCodegen) &&
            Objects.equals(this.mavenHome, build.mavenHome) &&
            Objects.equals(this.outputs, build.outputs) &&
            Objects.equals(this.dependencies, build.dependencies) &&
            Objects.equals(this.id, build.id) &&
            Objects.equals(this.ownerId, build.ownerId) &&
            Objects.equals(this.createdDate, build.createdDate) &&
            Objects.equals(this.keyHash, build.keyHash) &&
            Objects.equals(this.lastAccessedById, build.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, build.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, build.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, build.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(name, applicationId, status, projectPath, testEnumCodegen, mavenHome, outputs, dependencies, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Build {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectPath: ").append(toIndentedString(projectPath)).append("\n");
        sb.append("    testEnumCodegen: ").append(toIndentedString(testEnumCodegen)).append("\n");
        sb.append("    mavenHome: ").append(toIndentedString(mavenHome)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
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

