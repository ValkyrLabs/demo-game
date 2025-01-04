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
* An integration account to authenticate workflows with various systems
*/

@Schema(name = "IntegrationAccount", description = "An integration account to authenticate workflows with various systems")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class IntegrationAccount  implements DataObject   {
    
    @AuditedField
        private UUID execModuleId;
    
    @AuditedField
        private String accountName;
    
    @AuditedField
        private String username;
    
    @AuditedField
        private String password;
    
    @AuditedField
        private String accountId;
    
              /**
   * Integration Connection Status
   */
  public enum StatusEnum {
    READY("ready"),
    
    CLOSED("closed"),
    
    EXECUTED("executed"),
    
    ERROR("error");

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
        private Boolean verified = false;
    
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
        public IntegrationAccount execModuleId(UUID execModuleId) {
            this.execModuleId = execModuleId;
        return this;
        }
            /**
                * Get execModuleId
            * @return execModuleId
            */
                @Valid 
                @Schema(name = "execModuleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("execModuleId")
            public UUID getExecModuleId() {
            return execModuleId;
            }
            public void setExecModuleId(UUID execModuleId) {
            this.execModuleId = execModuleId;
            }
        public IntegrationAccount accountName(String accountName) {
            this.accountName = accountName;
        return this;
        }
            /**
                * account name
            * @return accountName
            */
                
                @Schema(name = "accountName", example = "STRIPE, Shopify, Gmail, X.com", description = "account name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("accountName")
            public String getAccountName() {
            return accountName;
            }
            public void setAccountName(String accountName) {
            this.accountName = accountName;
            }
        public IntegrationAccount username(String username) {
            this.username = username;
        return this;
        }
            /**
                * account username
            * @return username
            */
                
                @Schema(name = "username", example = "STRIPE, Shopify, Gmail, X.com", description = "account username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("username")
            public String getUsername() {
            return username;
            }
            public void setUsername(String username) {
            this.username = username;
            }
        public IntegrationAccount password(String password) {
            this.password = password;
        return this;
        }
            /**
                * account password - encrypted
            * @return password
            */
                
                @Schema(name = "password", description = "account password - encrypted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("password")
            public String getPassword() {
            return password;
            }
            public void setPassword(String password) {
            this.password = password;
            }
        public IntegrationAccount accountId(String accountId) {
            this.accountId = accountId;
        return this;
        }
            /**
                * Get accountId
            * @return accountId
            */
                
                @Schema(name = "accountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("accountId")
            public String getAccountId() {
            return accountId;
            }
            public void setAccountId(String accountId) {
            this.accountId = accountId;
            }
        public IntegrationAccount status(StatusEnum status) {
            this.status = status;
        return this;
        }
            /**
                * Integration Connection Status
            * @return status
            */
                
                @Schema(name = "status", description = "Integration Connection Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("status")
            public StatusEnum getStatus() {
            return status;
            }
            public void setStatus(StatusEnum status) {
            this.status = status;
            }
        public IntegrationAccount verified(Boolean verified) {
            this.verified = verified;
        return this;
        }
            /**
                * Get verified
            * @return verified
            */
                
                @Schema(name = "verified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("verified")
            public Boolean getVerified() {
            return verified;
            }
            public void setVerified(Boolean verified) {
            this.verified = verified;
            }
        public IntegrationAccount id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "3aab3b9d-9abd-404d-9967-4be5b2e7f257", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public IntegrationAccount ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "643f7177-ba27-4840-b985-e81832ac9490", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public IntegrationAccount createdDate(OffsetDateTime createdDate) {
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
        public IntegrationAccount keyHash(String keyHash) {
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
        public IntegrationAccount lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "beca4524-9242-42f6-a802-37ec0ec8cf30", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public IntegrationAccount lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public IntegrationAccount lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "e92be91c-82d3-47d6-866a-287ca082f091", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public IntegrationAccount lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            IntegrationAccount integrationAccount = (IntegrationAccount) o;
            return Objects.equals(this.execModuleId, integrationAccount.execModuleId) &&
            Objects.equals(this.accountName, integrationAccount.accountName) &&
            Objects.equals(this.username, integrationAccount.username) &&
            Objects.equals(this.password, integrationAccount.password) &&
            Objects.equals(this.accountId, integrationAccount.accountId) &&
            Objects.equals(this.status, integrationAccount.status) &&
            Objects.equals(this.verified, integrationAccount.verified) &&
            Objects.equals(this.id, integrationAccount.id) &&
            Objects.equals(this.ownerId, integrationAccount.ownerId) &&
            Objects.equals(this.createdDate, integrationAccount.createdDate) &&
            Objects.equals(this.keyHash, integrationAccount.keyHash) &&
            Objects.equals(this.lastAccessedById, integrationAccount.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, integrationAccount.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, integrationAccount.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, integrationAccount.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(execModuleId, accountName, username, password, accountId, status, verified, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class IntegrationAccount {\n");
        sb.append("    execModuleId: ").append(toIndentedString(execModuleId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

