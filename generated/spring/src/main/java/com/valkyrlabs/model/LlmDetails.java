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
* TODO LlmDetails CLASS DESCRIPTION
*/

@Schema(name = "LlmDetails", description = "TODO LlmDetails CLASS DESCRIPTION")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class LlmDetails  implements DataObject   {
    
    @AuditedField
        private String name;
    
    @AuditedField
        private String version;
    
    @AuditedField
        private String notes;
    
              /**
   * the user role to set for the target LLM
   */
  public enum RoleEnum {
    USER("user"),
    
    ASSISTANT("assistant");

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
    
              /**
   * Gets or Sets provider
   */
  public enum ProviderEnum {
    VALKYRAI("valkyrai"),
    
    OPENAI("openai"),
    
    LLAMA("llama"),
    
    PHI("phi"),
    
    GEMMA("gemma"),
    
    MISTRAL("mistral"),
    
    CLAUDE("claude"),
    
    GEMINI("gemini"),
    
    OTHER("other");

    private String value;

    ProviderEnum(String value) {
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
    public static ProviderEnum fromValue(String value) {
      for (ProviderEnum b : ProviderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private ProviderEnum provider;
    
              /**
   * Gets or Sets apiType
   */
  public enum ApiTypeEnum {
    OPENAI("openai"),
    
    OLLAMA("ollama"),
    
    OTHER("other");

    private String value;

    ApiTypeEnum(String value) {
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
    public static ApiTypeEnum fromValue(String value) {
      for (ApiTypeEnum b : ApiTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private ApiTypeEnum apiType;
    
    @AuditedField
        @Column(length = 5000)
        private String initialPrompt;
    
    @AuditedField
        @SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
@Column(length = 3072)
        private String apiKey;
    
    @AuditedField
        @SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String credential;
    
    @AuditedField
        @Column(length = 35)
@SecureField(encryptionType = SecureField.EncryptionType.HASHED, strength = 10)
        private String credentialPassword;
    
    @AuditedField
        private String url;
    
    @AuditedField
        private String requestParameters;
    
    @AuditedField
        private String meta;
    
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
        public LlmDetails name(String name) {
            this.name = name;
        return this;
        }
            /**
                * The name of the LLM
            * @return name
            */
                
                @Schema(name = "name", description = "The name of the LLM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("name")
            public String getName() {
            return name;
            }
            public void setName(String name) {
            this.name = name;
            }
        public LlmDetails version(String version) {
            this.version = version;
        return this;
        }
            /**
                * The vendor-specific version of the LLM
            * @return version
            */
                
                @Schema(name = "version", example = "v3.0.3-B8", description = "The vendor-specific version of the LLM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("version")
            public String getVersion() {
            return version;
            }
            public void setVersion(String version) {
            this.version = version;
            }
        public LlmDetails notes(String notes) {
            this.notes = notes;
        return this;
        }
            /**
                * Notes on the LLM implementation
            * @return notes
            */
                
                @Schema(name = "notes", description = "Notes on the LLM implementation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("notes")
            public String getNotes() {
            return notes;
            }
            public void setNotes(String notes) {
            this.notes = notes;
            }
        public LlmDetails role(RoleEnum role) {
            this.role = role;
        return this;
        }
            /**
                * the user role to set for the target LLM
            * @return role
            */
                
                @Schema(name = "role", description = "the user role to set for the target LLM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("role")
            public RoleEnum getRole() {
            return role;
            }
            public void setRole(RoleEnum role) {
            this.role = role;
            }
        public LlmDetails provider(ProviderEnum provider) {
            this.provider = provider;
        return this;
        }
            /**
                * Get provider
            * @return provider
            */
                
                @Schema(name = "provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("provider")
            public ProviderEnum getProvider() {
            return provider;
            }
            public void setProvider(ProviderEnum provider) {
            this.provider = provider;
            }
        public LlmDetails apiType(ApiTypeEnum apiType) {
            this.apiType = apiType;
        return this;
        }
            /**
                * Get apiType
            * @return apiType
            */
                
                @Schema(name = "apiType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("apiType")
            public ApiTypeEnum getApiType() {
            return apiType;
            }
            public void setApiType(ApiTypeEnum apiType) {
            this.apiType = apiType;
            }
        public LlmDetails initialPrompt(String initialPrompt) {
            this.initialPrompt = initialPrompt;
        return this;
        }
            /**
                * the initial prompt to instruct the LLM how to behave
            * @return initialPrompt
            */
                @Size(min = 64, max = 5000) 
                @Schema(name = "initialPrompt", example = "You are a helpful assistant", description = "the initial prompt to instruct the LLM how to behave", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("initialPrompt")
            public String getInitialPrompt() {
            return initialPrompt;
            }
            public void setInitialPrompt(String initialPrompt) {
            this.initialPrompt = initialPrompt;
            }
        public LlmDetails apiKey(String apiKey) {
            this.apiKey = apiKey;
        return this;
        }
            /**
                * the api-key to access the llm
            * @return apiKey
            */
                @Size(min = 16, max = 1024) 
                @Schema(name = "apiKey", example = "D6ObBZ599Z3xkuohG3/cogxZYwhxdVyLlIAPanlO35I=", description = "the api-key to access the llm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("apiKey")
            public String getApiKey() {
            return apiKey;
            }
            public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
            }
        public LlmDetails credential(String credential) {
            this.credential = credential;
        return this;
        }
            /**
                * the user name to access the LLM
            * @return credential
            */
                
                @Schema(name = "credential", description = "the user name to access the LLM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("credential")
            public String getCredential() {
            return credential;
            }
            public void setCredential(String credential) {
            this.credential = credential;
            }
        public LlmDetails credentialPassword(String credentialPassword) {
            this.credentialPassword = credentialPassword;
        return this;
        }
            /**
                * the password to access the LLM
            * @return credentialPassword
            */
                @Size(min = 8, max = 35) 
                @Schema(name = "credentialPassword", example = "c@nnotBeH@ckd!", description = "the password to access the LLM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("credentialPassword")
            public String getCredentialPassword() {
            return credentialPassword;
            }
            public void setCredentialPassword(String credentialPassword) {
            this.credentialPassword = credentialPassword;
            }
        public LlmDetails url(String url) {
            this.url = url;
        return this;
        }
            /**
                * the URL to connect to the LLM api
            * @return url
            */
                
                @Schema(name = "url", description = "the URL to connect to the LLM api", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("url")
            public String getUrl() {
            return url;
            }
            public void setUrl(String url) {
            this.url = url;
            }
        public LlmDetails requestParameters(String requestParameters) {
            this.requestParameters = requestParameters;
        return this;
        }
            /**
                * request parameters to send to the service
            * @return requestParameters
            */
                
                @Schema(name = "requestParameters", description = "request parameters to send to the service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("requestParameters")
            public String getRequestParameters() {
            return requestParameters;
            }
            public void setRequestParameters(String requestParameters) {
            this.requestParameters = requestParameters;
            }
        public LlmDetails meta(String meta) {
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
        public LlmDetails id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "b3c75132-b3eb-458e-b8e2-9df5ff48c36c", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public LlmDetails ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "2570f2fd-5cf6-4d2e-b53e-49a052eb29b3", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public LlmDetails createdDate(OffsetDateTime createdDate) {
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
        public LlmDetails keyHash(String keyHash) {
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
        public LlmDetails lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "d32122d6-3e7a-409d-acf2-588c797823fc", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public LlmDetails lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public LlmDetails lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "f92f6ca3-0741-47ef-be79-fe4e048e2b75", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public LlmDetails lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            LlmDetails llmDetails = (LlmDetails) o;
            return Objects.equals(this.name, llmDetails.name) &&
            Objects.equals(this.version, llmDetails.version) &&
            Objects.equals(this.notes, llmDetails.notes) &&
            Objects.equals(this.role, llmDetails.role) &&
            Objects.equals(this.provider, llmDetails.provider) &&
            Objects.equals(this.apiType, llmDetails.apiType) &&
            Objects.equals(this.initialPrompt, llmDetails.initialPrompt) &&
            Objects.equals(this.apiKey, llmDetails.apiKey) &&
            Objects.equals(this.credential, llmDetails.credential) &&
            Objects.equals(this.credentialPassword, llmDetails.credentialPassword) &&
            Objects.equals(this.url, llmDetails.url) &&
            Objects.equals(this.requestParameters, llmDetails.requestParameters) &&
            Objects.equals(this.meta, llmDetails.meta) &&
            Objects.equals(this.id, llmDetails.id) &&
            Objects.equals(this.ownerId, llmDetails.ownerId) &&
            Objects.equals(this.createdDate, llmDetails.createdDate) &&
            Objects.equals(this.keyHash, llmDetails.keyHash) &&
            Objects.equals(this.lastAccessedById, llmDetails.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, llmDetails.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, llmDetails.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, llmDetails.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(name, version, notes, role, provider, apiType, initialPrompt, apiKey, credential, credentialPassword, url, requestParameters, meta, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LlmDetails {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    initialPrompt: ").append(toIndentedString(initialPrompt)).append("\n");
        sb.append("    apiKey: ").append("*").append("\n");
        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
        sb.append("    credentialPassword: ").append("*").append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    requestParameters: ").append(toIndentedString(requestParameters)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

