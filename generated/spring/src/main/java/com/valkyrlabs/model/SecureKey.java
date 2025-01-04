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
* SecureKey is the KMS for the SecureField keys
*/

@Schema(name = "SecureKey", description = "SecureKey is the KMS for the SecureField keys")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class SecureKey  implements DataObject   {
    
    @AuditedField
        @Column(length = 1000)
        private String notes;
    
    @AuditedField
        private String algorithm;
    
    @AuditedField
        private String version;
    
    @AuditedField
        private String keyHash;
    
    @AuditedField
        private Integer cipherWorkCost;
    
    @AuditedField
        private String keyValue;
    
              /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    /**
     * Key is actively used
     */
    keyActive("ACTIVE"),
    
    /**
     * Key is the default to use when no specif key is provided
     */
    keyDefault("DEFAULT"),
    
    /**
     * Key is not being used but still valid
     */
    keyArchived("ARCHIVED"),
    
    /**
     * Key is revoked and MUST NOT be used
     */
    keyRevoked("REVOKED"),
    
    /**
     * Key is invalid and will not work
     */
    keyInvalid("INVALID");

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
        public SecureKey() {
        super();
        }
        /**
        * Constructor with only required parameters
        */
        public SecureKey(String algorithm, String version, String keyValue, StatusEnum status) {
                            this.algorithm = algorithm;
                            this.version = version;
                            this.keyValue = keyValue;
                            this.status = status;
                }
        public SecureKey notes(String notes) {
            this.notes = notes;
        return this;
        }
            /**
                * any notes about the key
            * @return notes
            */
                @Size(max = 1000) 
                @Schema(name = "notes", example = "This key was generated by the system", description = "any notes about the key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("notes")
            public String getNotes() {
            return notes;
            }
            public void setNotes(String notes) {
            this.notes = notes;
            }
        public SecureKey algorithm(String algorithm) {
            this.algorithm = algorithm;
        return this;
        }
            /**
                * the algorithm used for encryption/decryption
            * @return algorithm
            */
                @NotNull 
                @Schema(name = "algorithm", description = "the algorithm used for encryption/decryption", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("algorithm")
            public String getAlgorithm() {
            return algorithm;
            }
            public void setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            }
        public SecureKey version(String version) {
            this.version = version;
        return this;
        }
            /**
                * the version of this key
            * @return version
            */
                @NotNull 
                @Schema(name = "version", description = "the version of this key", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("version")
            public String getVersion() {
            return version;
            }
            public void setVersion(String version) {
            this.version = version;
            }
        public SecureKey keyHash(String keyHash) {
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
        public SecureKey cipherWorkCost(Integer cipherWorkCost) {
            this.cipherWorkCost = cipherWorkCost;
        return this;
        }
            /**
                * the exponential strength of the BCrypt hashing used by the Hashing cipher
                * minimum: 10
                * maximum: 35
            * @return cipherWorkCost
            */
                @Min(10) @Max(35) 
                @Schema(name = "cipherWorkCost", example = "12", description = "the exponential strength of the BCrypt hashing used by the Hashing cipher", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("cipherWorkCost")
            public Integer getCipherWorkCost() {
            return cipherWorkCost;
            }
            public void setCipherWorkCost(Integer cipherWorkCost) {
            this.cipherWorkCost = cipherWorkCost;
            }
        public SecureKey keyValue(String keyValue) {
            this.keyValue = keyValue;
        return this;
        }
            /**
                * the key itself
            * @return keyValue
            */
                @NotNull @Size(min = 10) 
                @Schema(name = "keyValue", description = "the key itself", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("keyValue")
            public String getKeyValue() {
            return keyValue;
            }
            public void setKeyValue(String keyValue) {
            this.keyValue = keyValue;
            }
        public SecureKey status(StatusEnum status) {
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
        public SecureKey id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "da141499-59df-46d2-96b1-7db9f839ae52", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public SecureKey ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "9e896486-f5f7-41a8-bff4-e51ce437b503", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public SecureKey createdDate(OffsetDateTime createdDate) {
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
        public SecureKey lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "44bcd118-6595-439a-a9bd-1b99d0841763", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public SecureKey lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public SecureKey lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "5332563e-860f-4475-910d-ef5ffa0077d3", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public SecureKey lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            SecureKey secureKey = (SecureKey) o;
            return Objects.equals(this.notes, secureKey.notes) &&
            Objects.equals(this.algorithm, secureKey.algorithm) &&
            Objects.equals(this.version, secureKey.version) &&
            Objects.equals(this.keyHash, secureKey.keyHash) &&
            Objects.equals(this.cipherWorkCost, secureKey.cipherWorkCost) &&
            Objects.equals(this.keyValue, secureKey.keyValue) &&
            Objects.equals(this.status, secureKey.status) &&
            Objects.equals(this.id, secureKey.id) &&
            Objects.equals(this.ownerId, secureKey.ownerId) &&
            Objects.equals(this.createdDate, secureKey.createdDate) &&
            Objects.equals(this.lastAccessedById, secureKey.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, secureKey.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, secureKey.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, secureKey.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(notes, algorithm, version, keyHash, cipherWorkCost, keyValue, status, id, ownerId, createdDate, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SecureKey {\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    keyHash: ").append(toIndentedString(keyHash)).append("\n");
        sb.append("    cipherWorkCost: ").append(toIndentedString(cipherWorkCost)).append("\n");
        sb.append("    keyValue: ").append(toIndentedString(keyValue)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

