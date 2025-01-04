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
* System backup configuration for backup jobs workstation and server
*/

@Schema(name = "BackupConfig", description = "System backup configuration for backup jobs workstation and server")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class BackupConfig  implements DataObject   {
    
    @AuditedField
        private String name;
    
    @AuditedField
        private String description;
    
    @AuditedField
        private String remoteConfigUrl;
    
    @AuditedField
        private Integer runNumber;
    
    @AuditedField
        private Integer percentComplete;
    
              /**
   * the type of backup ie Workstation or Server
   */
  public enum TypeEnum {
    WORKSTATION("workstation"),
    
    SERVER("server"),
    
    DESKTOP("desktop"),
    
    LAPTOP("laptop"),
    
    DEVICE("device");

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
        private String backupDir;
    
    @AuditedField
        private String workingDir;
    
    @AuditedField
        private String skiplist;
    
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
        public BackupConfig name(String name) {
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
        public BackupConfig description(String description) {
            this.description = description;
        return this;
        }
            /**
                * source code only backup of test workspace
            * @return description
            */
                
                @Schema(name = "description", description = "source code only backup of test workspace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("description")
            public String getDescription() {
            return description;
            }
            public void setDescription(String description) {
            this.description = description;
            }
        public BackupConfig remoteConfigUrl(String remoteConfigUrl) {
            this.remoteConfigUrl = remoteConfigUrl;
        return this;
        }
            /**
                * basically a callback url
            * @return remoteConfigUrl
            */
                
                @Schema(name = "remoteConfigUrl", description = "basically a callback url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("remoteConfigUrl")
            public String getRemoteConfigUrl() {
            return remoteConfigUrl;
            }
            public void setRemoteConfigUrl(String remoteConfigUrl) {
            this.remoteConfigUrl = remoteConfigUrl;
            }
        public BackupConfig runNumber(Integer runNumber) {
            this.runNumber = runNumber;
        return this;
        }
            /**
                * the number of times this has been run before
            * @return runNumber
            */
                
                @Schema(name = "runNumber", description = "the number of times this has been run before", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("runNumber")
            public Integer getRunNumber() {
            return runNumber;
            }
            public void setRunNumber(Integer runNumber) {
            this.runNumber = runNumber;
            }
        public BackupConfig percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
        return this;
        }
            /**
                * 0-100 percentage of compleion of this backup if known
            * @return percentComplete
            */
                
                @Schema(name = "percentComplete", description = "0-100 percentage of compleion of this backup if known", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("percentComplete")
            public Integer getPercentComplete() {
            return percentComplete;
            }
            public void setPercentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            }
        public BackupConfig type(TypeEnum type) {
            this.type = type;
        return this;
        }
            /**
                * the type of backup ie Workstation or Server
            * @return type
            */
                
                @Schema(name = "type", description = "the type of backup ie Workstation or Server", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("type")
            public TypeEnum getType() {
            return type;
            }
            public void setType(TypeEnum type) {
            this.type = type;
            }
        public BackupConfig priorityLevel(PriorityLevelEnum priorityLevel) {
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
        public BackupConfig backupDir(String backupDir) {
            this.backupDir = backupDir;
        return this;
        }
            /**
                * path to the folder that will be backed up
            * @return backupDir
            */
                
                @Schema(name = "backupDir", example = "/users/jax/project-one", description = "path to the folder that will be backed up", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("backupDir")
            public String getBackupDir() {
            return backupDir;
            }
            public void setBackupDir(String backupDir) {
            this.backupDir = backupDir;
            }
        public BackupConfig workingDir(String workingDir) {
            this.workingDir = workingDir;
        return this;
        }
            /**
                * path to the folder that will be backed up
            * @return workingDir
            */
                
                @Schema(name = "workingDir", example = "/users/jax/project-one", description = "path to the folder that will be backed up", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("workingDir")
            public String getWorkingDir() {
            return workingDir;
            }
            public void setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            }
        public BackupConfig skiplist(String skiplist) {
            this.skiplist = skiplist;
        return this;
        }
            /**
                * a json string describing the items to skip in the backup set
            * @return skiplist
            */
                
                @Schema(name = "skiplist", example = "node_modules, etc.", description = "a json string describing the items to skip in the backup set", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("skiplist")
            public String getSkiplist() {
            return skiplist;
            }
            public void setSkiplist(String skiplist) {
            this.skiplist = skiplist;
            }
        public BackupConfig id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "aaf87104-04a1-4239-844e-247cb6105969", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public BackupConfig ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "f7755a99-2287-4b08-b10e-1b8c6da6c118", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public BackupConfig createdDate(OffsetDateTime createdDate) {
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
        public BackupConfig keyHash(String keyHash) {
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
        public BackupConfig lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "7ec04911-c235-4381-959d-f05e556a4881", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public BackupConfig lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public BackupConfig lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "9b4774b7-2e2b-4f4e-b6d2-55d2f80c88de", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public BackupConfig lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            BackupConfig backupConfig = (BackupConfig) o;
            return Objects.equals(this.name, backupConfig.name) &&
            Objects.equals(this.description, backupConfig.description) &&
            Objects.equals(this.remoteConfigUrl, backupConfig.remoteConfigUrl) &&
            Objects.equals(this.runNumber, backupConfig.runNumber) &&
            Objects.equals(this.percentComplete, backupConfig.percentComplete) &&
            Objects.equals(this.type, backupConfig.type) &&
            Objects.equals(this.priorityLevel, backupConfig.priorityLevel) &&
            Objects.equals(this.backupDir, backupConfig.backupDir) &&
            Objects.equals(this.workingDir, backupConfig.workingDir) &&
            Objects.equals(this.skiplist, backupConfig.skiplist) &&
            Objects.equals(this.id, backupConfig.id) &&
            Objects.equals(this.ownerId, backupConfig.ownerId) &&
            Objects.equals(this.createdDate, backupConfig.createdDate) &&
            Objects.equals(this.keyHash, backupConfig.keyHash) &&
            Objects.equals(this.lastAccessedById, backupConfig.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, backupConfig.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, backupConfig.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, backupConfig.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(name, description, remoteConfigUrl, runNumber, percentComplete, type, priorityLevel, backupDir, workingDir, skiplist, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BackupConfig {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    remoteConfigUrl: ").append(toIndentedString(remoteConfigUrl)).append("\n");
        sb.append("    runNumber: ").append(toIndentedString(runNumber)).append("\n");
        sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    priorityLevel: ").append(toIndentedString(priorityLevel)).append("\n");
        sb.append("    backupDir: ").append(toIndentedString(backupDir)).append("\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
        sb.append("    skiplist: ").append(toIndentedString(skiplist)).append("\n");
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

