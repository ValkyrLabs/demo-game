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
import com.valkyrlabs.model.IntegrationAccount;
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
* ExecModule is the execution unit of the ValkyrAI Workflow Engine
*/

@Schema(name = "ExecModule", description = "ExecModule is the execution unit of the ValkyrAI Workflow Engine")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class ExecModule  implements DataObject   {
    
    @AuditedField
        private UUID systemId;
    
    @AuditedField
        private UUID taskId;
    
              /**
   * the RBAC role to use in mutating/reading any system object
   */
  public enum RoleEnum {
    ANONYMOUS("anonymous"),
    
    USER("user"),
    
    ADMIN("admin");

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private RoleEnum role;
    
    @AuditedField
        private String name;
    
    @AuditedField
        private String notes;
    
    @AuditedField
        @OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
        @PrimaryKeyJoinColumn()
        private IntegrationAccount integrationAccount;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="pick~getAvailableVmodules")
        private String className;
    
              /**
   * the type of module
   */
  public enum ModuleTypeEnum {
    BROADCAST("broadcast"),
    
    IO("io"),
    
    READER("reader"),
    
    WRITER("writer"),
    
    TRANSFORMER("transformer");

    private String value;

    ModuleTypeEnum(String value) {
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
    public static ModuleTypeEnum fromValue(String value) {
      for (ModuleTypeEnum b : ModuleTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private ModuleTypeEnum moduleType;
    
    @AuditedField
        @Column(length = 3000)
        private String moduleData;
    
              /**
   * last known status of the module
   */
  public enum StatusEnum {
    RUNNING("running"),
    
    STOPPED("stopped"),
    
    READY("ready"),
    
    GOOD("good"),
    
    WARNING("warning"),
    
    ERROR("error"),
    
    DISABLED("disabled");

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
        public ExecModule systemId(UUID systemId) {
            this.systemId = systemId;
        return this;
        }
            /**
                * UUID of the system object being mutated/read (if any)
            * @return systemId
            */
                @Valid 
                @Schema(name = "systemId", description = "UUID of the system object being mutated/read (if any)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("systemId")
            public UUID getSystemId() {
            return systemId;
            }
            public void setSystemId(UUID systemId) {
            this.systemId = systemId;
            }
        public ExecModule taskId(UUID taskId) {
            this.taskId = taskId;
        return this;
        }
            /**
                * The task this module is executing in
            * @return taskId
            */
                @Valid 
                @Schema(name = "taskId", description = "The task this module is executing in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("taskId")
            public UUID getTaskId() {
            return taskId;
            }
            public void setTaskId(UUID taskId) {
            this.taskId = taskId;
            }
        public ExecModule role(RoleEnum role) {
            this.role = role;
        return this;
        }
            /**
                * the RBAC role to use in mutating/reading any system object
            * @return role
            */
                
                @Schema(name = "role", description = "the RBAC role to use in mutating/reading any system object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("role")
            public RoleEnum getRole() {
            return role;
            }
            public void setRole(RoleEnum role) {
            this.role = role;
            }
        public ExecModule name(String name) {
            this.name = name;
        return this;
        }
            /**
                * the name of the module
            * @return name
            */
                
                @Schema(name = "name", example = "EmailSendModule, OpenApiSpecImportModule", description = "the name of the module", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("name")
            public String getName() {
            return name;
            }
            public void setName(String name) {
            this.name = name;
            }
        public ExecModule notes(String notes) {
            this.notes = notes;
        return this;
        }
            /**
                * notes about the module
            * @return notes
            */
                
                @Schema(name = "notes", description = "notes about the module", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("notes")
            public String getNotes() {
            return notes;
            }
            public void setNotes(String notes) {
            this.notes = notes;
            }
        public ExecModule integrationAccount(IntegrationAccount integrationAccount) {
            this.integrationAccount = integrationAccount;
        return this;
        }
            /**
                * Get integrationAccount
            * @return integrationAccount
            */
                @Valid 
                @Schema(name = "integrationAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("integrationAccount")
            public IntegrationAccount getIntegrationAccount() {
            return integrationAccount;
            }
            public void setIntegrationAccount(IntegrationAccount integrationAccount) {
            this.integrationAccount = integrationAccount;
            }
        public ExecModule className(String className) {
            this.className = className;
        return this;
        }
            /**
                * the name of the implementation class for this module
            * @return className
            */
                
                @Schema(name = "className", example = "EmailModule, PipelineModule, RestApiModule", description = "the name of the implementation class for this module", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("className")
            public String getClassName() {
            return className;
            }
            public void setClassName(String className) {
            this.className = className;
            }
        public ExecModule moduleType(ModuleTypeEnum moduleType) {
            this.moduleType = moduleType;
        return this;
        }
            /**
                * the type of module
            * @return moduleType
            */
                
                @Schema(name = "moduleType", description = "the type of module", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("moduleType")
            public ModuleTypeEnum getModuleType() {
            return moduleType;
            }
            public void setModuleType(ModuleTypeEnum moduleType) {
            this.moduleType = moduleType;
            }
        public ExecModule moduleData(String moduleData) {
            this.moduleData = moduleData;
        return this;
        }
            /**
                * json for configuring the module
            * @return moduleData
            */
                @Size(max = 3000) 
                @Schema(name = "moduleData", description = "json for configuring the module", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("moduleData")
            public String getModuleData() {
            return moduleData;
            }
            public void setModuleData(String moduleData) {
            this.moduleData = moduleData;
            }
        public ExecModule status(StatusEnum status) {
            this.status = status;
        return this;
        }
            /**
                * last known status of the module
            * @return status
            */
                
                @Schema(name = "status", description = "last known status of the module", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("status")
            public StatusEnum getStatus() {
            return status;
            }
            public void setStatus(StatusEnum status) {
            this.status = status;
            }
        public ExecModule id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "21019af6-6e83-4148-b290-0fe61e5d1e30", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public ExecModule ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "0ae05055-3e5a-43ce-92b2-6e8e1595f7ae", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public ExecModule createdDate(OffsetDateTime createdDate) {
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
        public ExecModule keyHash(String keyHash) {
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
        public ExecModule lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "ba9273f4-5fad-45f6-9430-15bcdd7794f7", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public ExecModule lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public ExecModule lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "6be1f028-58a4-496e-a9ff-67964eb7dc6a", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public ExecModule lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            ExecModule execModule = (ExecModule) o;
            return Objects.equals(this.systemId, execModule.systemId) &&
            Objects.equals(this.taskId, execModule.taskId) &&
            Objects.equals(this.role, execModule.role) &&
            Objects.equals(this.name, execModule.name) &&
            Objects.equals(this.notes, execModule.notes) &&
            Objects.equals(this.integrationAccount, execModule.integrationAccount) &&
            Objects.equals(this.className, execModule.className) &&
            Objects.equals(this.moduleType, execModule.moduleType) &&
            Objects.equals(this.moduleData, execModule.moduleData) &&
            Objects.equals(this.status, execModule.status) &&
            Objects.equals(this.id, execModule.id) &&
            Objects.equals(this.ownerId, execModule.ownerId) &&
            Objects.equals(this.createdDate, execModule.createdDate) &&
            Objects.equals(this.keyHash, execModule.keyHash) &&
            Objects.equals(this.lastAccessedById, execModule.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, execModule.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, execModule.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, execModule.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(systemId, taskId, role, name, notes, integrationAccount, className, moduleType, moduleData, status, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ExecModule {\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    integrationAccount: ").append(toIndentedString(integrationAccount)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
        sb.append("    moduleData: ").append(toIndentedString(moduleData)).append("\n");
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

