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
import com.valkyrlabs.model.ContentMediaLink;
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
* Application represents a logical system
*/

@Schema(name = "Application", description = "Application represents a logical system")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class Application  implements DataObject   {
    
    @AuditedField
        private String name;
    
    @AuditedField
        private String description;
    
    @AuditedField
        private Boolean isTemplate;
    
              /**
   * type of application
   */
  public enum TypeEnum {
    FULL_STACK("full-stack"),
    
    AUTOMATION("automation"),
    
    AGENT("agent"),
    
    SERVICE("service"),
    
    FRONT_END("front-end"),
    
    MOBILE("mobile"),
    
    CI_CD("ci-cd"),
    
    LAMBDA("lambda");

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
   * status for event
   */
  public enum StatusEnum {
    READY("ready"),
    
    DEPLOYED("deployed"),
    
    STAGING("staging"),
    
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
        private String entrypointUrl;
    
    @AuditedField
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "applicationId",
            orphanRemoval = false
        )
        
        private List<@Valid ContentMediaLink> contentMedia = new ArrayList<>();
    
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
        public Application name(String name) {
            this.name = name;
        return this;
        }
            /**
                * name of the application
            * @return name
            */
                
                @Schema(name = "name", description = "name of the application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("name")
            public String getName() {
            return name;
            }
            public void setName(String name) {
            this.name = name;
            }
        public Application description(String description) {
            this.description = description;
        return this;
        }
            /**
                * detailed description of the application
            * @return description
            */
                
                @Schema(name = "description", description = "detailed description of the application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("description")
            public String getDescription() {
            return description;
            }
            public void setDescription(String description) {
            this.description = description;
            }
        public Application isTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
        return this;
        }
            /**
                * whether this Application is a Template
            * @return isTemplate
            */
                
                @Schema(name = "isTemplate", description = "whether this Application is a Template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("isTemplate")
            public Boolean getIsTemplate() {
            return isTemplate;
            }
            public void setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            }
        public Application type(TypeEnum type) {
            this.type = type;
        return this;
        }
            /**
                * type of application
            * @return type
            */
                
                @Schema(name = "type", description = "type of application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("type")
            public TypeEnum getType() {
            return type;
            }
            public void setType(TypeEnum type) {
            this.type = type;
            }
        public Application status(StatusEnum status) {
            this.status = status;
        return this;
        }
            /**
                * status for event
            * @return status
            */
                
                @Schema(name = "status", description = "status for event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("status")
            public StatusEnum getStatus() {
            return status;
            }
            public void setStatus(StatusEnum status) {
            this.status = status;
            }
        public Application entrypointUrl(String entrypointUrl) {
            this.entrypointUrl = entrypointUrl;
        return this;
        }
            /**
                * the url to the 'homepage' or service endpoint
            * @return entrypointUrl
            */
                
                @Schema(name = "entrypointUrl", description = "the url to the 'homepage' or service endpoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("entrypointUrl")
            public String getEntrypointUrl() {
            return entrypointUrl;
            }
            public void setEntrypointUrl(String entrypointUrl) {
            this.entrypointUrl = entrypointUrl;
            }
        public Application contentMedia(List<@Valid ContentMediaLink> contentMedia) {
            this.contentMedia = contentMedia;
        return this;
        }
            public Application addContentMediaItem(ContentMediaLink contentMediaItem) {
                if (this.contentMedia == null) {
                this.contentMedia = new ArrayList<>();
                }
                this.contentMedia.add(contentMediaItem);
            return this;
            }
            /**
                * Get contentMedia
            * @return contentMedia
            */
                @Valid 
                @Schema(name = "contentMedia", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("contentMedia")
            public List<@Valid ContentMediaLink> getContentMedia() {
            return contentMedia;
            }
            public void setContentMedia(List<@Valid ContentMediaLink> contentMedia) {
            this.contentMedia = contentMedia;
            }
        public Application id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "9744cc06-1817-4d43-a25c-6940c3795aa1", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public Application ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "be82da4e-c266-424b-b040-56dd0df0dd77", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public Application createdDate(OffsetDateTime createdDate) {
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
        public Application keyHash(String keyHash) {
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
        public Application lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "4a87751a-c2ed-42e2-b6fd-aeb730717a3c", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public Application lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public Application lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "08099e6f-4156-4ca9-aeb0-2a0a04a66b59", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public Application lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            Application application = (Application) o;
            return Objects.equals(this.name, application.name) &&
            Objects.equals(this.description, application.description) &&
            Objects.equals(this.isTemplate, application.isTemplate) &&
            Objects.equals(this.type, application.type) &&
            Objects.equals(this.status, application.status) &&
            Objects.equals(this.entrypointUrl, application.entrypointUrl) &&
            Objects.equals(this.contentMedia, application.contentMedia) &&
            Objects.equals(this.id, application.id) &&
            Objects.equals(this.ownerId, application.ownerId) &&
            Objects.equals(this.createdDate, application.createdDate) &&
            Objects.equals(this.keyHash, application.keyHash) &&
            Objects.equals(this.lastAccessedById, application.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, application.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, application.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, application.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(name, description, isTemplate, type, status, entrypointUrl, contentMedia, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Application {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    entrypointUrl: ").append(toIndentedString(entrypointUrl)).append("\n");
        sb.append("    contentMedia: ").append(toIndentedString(contentMedia)).append("\n");
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

