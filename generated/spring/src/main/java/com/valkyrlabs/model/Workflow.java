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
import com.valkyrlabs.model.Task;
import com.valkyrlabs.model.WorkflowState;
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
* ValkyrAI Workflow object manages execution and state of automation workflows
*/

@Schema(name = "Workflow", description = "ValkyrAI Workflow object manages execution and state of automation workflows")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class Workflow  implements DataObject   {
    
    @AuditedField
        private String name;
    
    @AuditedField
        private String description;
    
              /**
   * the role with permissions to execute the workfow as
   */
  public enum RoleEnum {
    USER("user"),
    
    ASSISTANT("assistant"),
    
    SYSTEM("system");

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
        private String schedule;
    
    @AuditedField
        private String meta;
    
    @AuditedField
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "workflowId",
            orphanRemoval = false
        )
        
        private List<@Valid Task> tasks = new ArrayList<>();
    
    @AuditedField
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "workflowId",
            orphanRemoval = false
        )
        
        private List<@Valid WorkflowState> state = new ArrayList<>();
    
              /**
   * last known status of the workflow
   */
  public enum StatusEnum {
    RUNNING("running"),
    
    STOPPED("stopped"),
    
    READY("ready"),
    
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
        public Workflow name(String name) {
            this.name = name;
        return this;
        }
            /**
                * short description of this workflow
            * @return name
            */
                
                @Schema(name = "name", example = "Customer Email Workflow", description = "short description of this workflow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("name")
            public String getName() {
            return name;
            }
            public void setName(String name) {
            this.name = name;
            }
        public Workflow description(String description) {
            this.description = description;
        return this;
        }
            /**
                * detailed description of this workflow
            * @return description
            */
                
                @Schema(name = "description", example = "this workflow is designed to keep customers in the loop", description = "detailed description of this workflow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("description")
            public String getDescription() {
            return description;
            }
            public void setDescription(String description) {
            this.description = description;
            }
        public Workflow role(RoleEnum role) {
            this.role = role;
        return this;
        }
            /**
                * the role with permissions to execute the workfow as
            * @return role
            */
                
                @Schema(name = "role", description = "the role with permissions to execute the workfow as", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("role")
            public RoleEnum getRole() {
            return role;
            }
            public void setRole(RoleEnum role) {
            this.role = role;
            }
        public Workflow schedule(String schedule) {
            this.schedule = schedule;
        return this;
        }
            /**
                * cron string to determine when this runs
            * @return schedule
            */
                
                @Schema(name = "schedule", example = "*_/20 * * * * ?", description = "cron string to determine when this runs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("schedule")
            public String getSchedule() {
            return schedule;
            }
            public void setSchedule(String schedule) {
            this.schedule = schedule;
            }
        public Workflow meta(String meta) {
            this.meta = meta;
        return this;
        }
            /**
                * metadata in any text format to be used in client code
            * @return meta
            */
                
                @Schema(name = "meta", description = "metadata in any text format to be used in client code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("meta")
            public String getMeta() {
            return meta;
            }
            public void setMeta(String meta) {
            this.meta = meta;
            }
        public Workflow tasks(List<@Valid Task> tasks) {
            this.tasks = tasks;
        return this;
        }
            public Workflow addTasksItem(Task tasksItem) {
                if (this.tasks == null) {
                this.tasks = new ArrayList<>();
                }
                this.tasks.add(tasksItem);
            return this;
            }
            /**
                * an array of Tasks to be performed
            * @return tasks
            */
                @Valid 
                @Schema(name = "tasks", description = "an array of Tasks to be performed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("tasks")
            public List<@Valid Task> getTasks() {
            return tasks;
            }
            public void setTasks(List<@Valid Task> tasks) {
            this.tasks = tasks;
            }
        public Workflow state(List<@Valid WorkflowState> state) {
            this.state = state;
        return this;
        }
            public Workflow addStateItem(WorkflowState stateItem) {
                if (this.state == null) {
                this.state = new ArrayList<>();
                }
                this.state.add(stateItem);
            return this;
            }
            /**
                * an array stateful objects to be used in the workflow
            * @return state
            */
                @Valid 
                @Schema(name = "state", description = "an array stateful objects to be used in the workflow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("state")
            public List<@Valid WorkflowState> getState() {
            return state;
            }
            public void setState(List<@Valid WorkflowState> state) {
            this.state = state;
            }
        public Workflow status(StatusEnum status) {
            this.status = status;
        return this;
        }
            /**
                * last known status of the workflow
            * @return status
            */
                
                @Schema(name = "status", description = "last known status of the workflow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("status")
            public StatusEnum getStatus() {
            return status;
            }
            public void setStatus(StatusEnum status) {
            this.status = status;
            }
        public Workflow id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "bdd61864-f164-4ecd-b92e-3b261527b4d2", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public Workflow ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "e3415238-fa96-480b-9d57-1f41fbd7f5b1", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public Workflow createdDate(OffsetDateTime createdDate) {
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
        public Workflow keyHash(String keyHash) {
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
        public Workflow lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "1ced40ec-8db9-44cd-8b0c-96ff88c95a59", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public Workflow lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public Workflow lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "2dcfeb88-4f40-4efa-8c4b-565e25f3025f", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public Workflow lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            Workflow workflow = (Workflow) o;
            return Objects.equals(this.name, workflow.name) &&
            Objects.equals(this.description, workflow.description) &&
            Objects.equals(this.role, workflow.role) &&
            Objects.equals(this.schedule, workflow.schedule) &&
            Objects.equals(this.meta, workflow.meta) &&
            Objects.equals(this.tasks, workflow.tasks) &&
            Objects.equals(this.state, workflow.state) &&
            Objects.equals(this.status, workflow.status) &&
            Objects.equals(this.id, workflow.id) &&
            Objects.equals(this.ownerId, workflow.ownerId) &&
            Objects.equals(this.createdDate, workflow.createdDate) &&
            Objects.equals(this.keyHash, workflow.keyHash) &&
            Objects.equals(this.lastAccessedById, workflow.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, workflow.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, workflow.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, workflow.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(name, description, role, schedule, meta, tasks, state, status, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Workflow {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

