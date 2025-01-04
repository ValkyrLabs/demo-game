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
* link to images, videos, audio, and other content media
*/

@Schema(name = "ContentMediaLink", description = "link to images, videos, audio, and other content media")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class ContentMediaLink  implements DataObject   {
    
    @AuditedField
        private UUID applicationId;
    
    @AuditedField
        private UUID contentDataId;
    
              /**
   * specialized usage for the media object if any
   */
  public enum ContentUseEnum {
    NONE("none"),
    
    SCREENSHOT("screenshot"),
    
    SELFIE("selfie"),
    
    PORTRAIT("portrait"),
    
    PROMOTIONAL("promotional"),
    
    INFORMATIONAL("informational"),
    
    ENTERTAINMENT("entertainment"),
    
    PRODUCT("product"),
    
    SUPPORT("support"),
    
    TRAINING("training");

    private String value;

    ContentUseEnum(String value) {
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
    public static ContentUseEnum fromValue(String value) {
      for (ContentUseEnum b : ContentUseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private ContentUseEnum contentUse;
    
              /**
   * content type of the media object
   */
  public enum ContentTypeEnum {
    IMAGE("image"),
    
    ICON("icon"),
    
    VIDEO("video"),
    
    AUDIO("audio"),
    
    TEXT("text"),
    
    JSON("json"),
    
    YAML("yaml"),
    
    XML("xml"),
    
    MARKDOWN("markdown"),
    
    SPREADSHEET("spreadsheet"),
    
    PDF("pdf");

    private String value;

    ContentTypeEnum(String value) {
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
    public static ContentTypeEnum fromValue(String value) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private ContentTypeEnum contentType;
    
    @AuditedField
        private String mediaUrl;
    
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
        public ContentMediaLink applicationId(UUID applicationId) {
            this.applicationId = applicationId;
        return this;
        }
            /**
                * used when linked to an Application
            * @return applicationId
            */
                @Valid 
                @Schema(name = "applicationId", description = "used when linked to an Application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("applicationId")
            public UUID getApplicationId() {
            return applicationId;
            }
            public void setApplicationId(UUID applicationId) {
            this.applicationId = applicationId;
            }
        public ContentMediaLink contentDataId(UUID contentDataId) {
            this.contentDataId = contentDataId;
        return this;
        }
            /**
                * used when linked to ContentData
            * @return contentDataId
            */
                @Valid 
                @Schema(name = "contentDataId", description = "used when linked to ContentData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("contentDataId")
            public UUID getContentDataId() {
            return contentDataId;
            }
            public void setContentDataId(UUID contentDataId) {
            this.contentDataId = contentDataId;
            }
        public ContentMediaLink contentUse(ContentUseEnum contentUse) {
            this.contentUse = contentUse;
        return this;
        }
            /**
                * specialized usage for the media object if any
            * @return contentUse
            */
                
                @Schema(name = "contentUse", description = "specialized usage for the media object if any", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("contentUse")
            public ContentUseEnum getContentUse() {
            return contentUse;
            }
            public void setContentUse(ContentUseEnum contentUse) {
            this.contentUse = contentUse;
            }
        public ContentMediaLink contentType(ContentTypeEnum contentType) {
            this.contentType = contentType;
        return this;
        }
            /**
                * content type of the media object
            * @return contentType
            */
                
                @Schema(name = "contentType", description = "content type of the media object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("contentType")
            public ContentTypeEnum getContentType() {
            return contentType;
            }
            public void setContentType(ContentTypeEnum contentType) {
            this.contentType = contentType;
            }
        public ContentMediaLink mediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
        return this;
        }
            /**
                * url to the media object
            * @return mediaUrl
            */
                
                @Schema(name = "mediaUrl", description = "url to the media object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("mediaUrl")
            public String getMediaUrl() {
            return mediaUrl;
            }
            public void setMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
            }
        public ContentMediaLink id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "db3b4973-11f0-4789-a296-c612f0c5e4a0", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public ContentMediaLink ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "209291e8-4da1-459c-b369-03cd93b15707", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public ContentMediaLink createdDate(OffsetDateTime createdDate) {
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
        public ContentMediaLink keyHash(String keyHash) {
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
        public ContentMediaLink lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "e37f321d-d34f-4516-907b-f4626e955645", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public ContentMediaLink lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public ContentMediaLink lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "85b9ccff-ee11-4973-bbef-0082a6886e2e", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public ContentMediaLink lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            ContentMediaLink contentMediaLink = (ContentMediaLink) o;
            return Objects.equals(this.applicationId, contentMediaLink.applicationId) &&
            Objects.equals(this.contentDataId, contentMediaLink.contentDataId) &&
            Objects.equals(this.contentUse, contentMediaLink.contentUse) &&
            Objects.equals(this.contentType, contentMediaLink.contentType) &&
            Objects.equals(this.mediaUrl, contentMediaLink.mediaUrl) &&
            Objects.equals(this.id, contentMediaLink.id) &&
            Objects.equals(this.ownerId, contentMediaLink.ownerId) &&
            Objects.equals(this.createdDate, contentMediaLink.createdDate) &&
            Objects.equals(this.keyHash, contentMediaLink.keyHash) &&
            Objects.equals(this.lastAccessedById, contentMediaLink.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, contentMediaLink.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, contentMediaLink.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, contentMediaLink.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(applicationId, contentDataId, contentUse, contentType, mediaUrl, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ContentMediaLink {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    contentDataId: ").append(toIndentedString(contentDataId)).append("\n");
        sb.append("    contentUse: ").append(toIndentedString(contentUse)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
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

