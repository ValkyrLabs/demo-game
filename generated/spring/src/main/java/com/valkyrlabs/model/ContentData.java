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
import com.valkyrlabs.model.Principal;
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
* TODO ContentData CLASS DESCRIPTION
*/

@Schema(name = "ContentData", description = "TODO ContentData CLASS DESCRIPTION")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class ContentData  implements DataObject   {
    
    @AuditedField
        private String authorName;
    
    @AuditedField
        private String title;
    
    @AuditedField
        private String subtitle;
    
    @AuditedField
        @Column(length = 500)
        private String contentUrl;
    
    @AuditedField
        @Column(length = 500000)
        private String contentData;
    
              /**
   * Gets or Sets contentType
   */
  public enum ContentTypeEnum {
    PLAINTEXT("plaintext"),
    
    MARKDOWN("markdown"),
    
    JSON("json"),
    
    YAML("yaml"),
    
    AUDIO("audio"),
    
    VIDEO("video"),
    
    URL("url"),
    
    BINARY("binary");

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
        private String thumbnailImage;
    
    @AuditedField
        private String largeImage;
    
              /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    CODEGEN("CodeGen"),
    
    DOCS("DOCS"),
    
    BLOG("BLOG"),
    
    PRODUCT("Product"),
    
    SECURITY("SECURITY"),
    
    EVENT("Event");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private CategoryEnum category;
    
              /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    HOLDING("holding"),
    
    EDITING("editing"),
    
    PUBLISHED("published");

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
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private OffsetDateTime releaseDate;
    
    @AuditedField
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "contentDataId",
            orphanRemoval = false
        )
        
        private List<@Valid ContentMediaLink> contentMedia = new ArrayList<>();
    
    @AuditedField
        private UUID principalId;
    
    @AuditedField
        @OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
        @PrimaryKeyJoinColumn()
        private Principal principal;
    
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
        public ContentData authorName(String authorName) {
            this.authorName = authorName;
        return this;
        }
            /**
                * Get authorName
            * @return authorName
            */
                
                @Schema(name = "authorName", example = "Jimjam McYoyo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("authorName")
            public String getAuthorName() {
            return authorName;
            }
            public void setAuthorName(String authorName) {
            this.authorName = authorName;
            }
        public ContentData title(String title) {
            this.title = title;
        return this;
        }
            /**
                * Get title
            * @return title
            */
                
                @Schema(name = "title", example = "Amazing Things Happened", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("title")
            public String getTitle() {
            return title;
            }
            public void setTitle(String title) {
            this.title = title;
            }
        public ContentData subtitle(String subtitle) {
            this.subtitle = subtitle;
        return this;
        }
            /**
                * Get subtitle
            * @return subtitle
            */
                
                @Schema(name = "subtitle", example = "Many detailed things about all the things that hapened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("subtitle")
            public String getSubtitle() {
            return subtitle;
            }
            public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
            }
        public ContentData contentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
        return this;
        }
            /**
                * Get contentUrl
            * @return contentUrl
            */
                @Size(min = 8, max = 500) 
                @Schema(name = "contentUrl", example = "The url to the location of the full content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("contentUrl")
            public String getContentUrl() {
            return contentUrl;
            }
            public void setContentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
            }
        public ContentData contentData(String contentData) {
            this.contentData = contentData;
        return this;
        }
            /**
                * Get contentData
            * @return contentData
            */
                @Size(min = 1, max = 500000) 
                @Schema(name = "contentData", example = "The full content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("contentData")
            public String getContentData() {
            return contentData;
            }
            public void setContentData(String contentData) {
            this.contentData = contentData;
            }
        public ContentData contentType(ContentTypeEnum contentType) {
            this.contentType = contentType;
        return this;
        }
            /**
                * Get contentType
            * @return contentType
            */
                
                @Schema(name = "contentType", example = "CodeGen", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("contentType")
            public ContentTypeEnum getContentType() {
            return contentType;
            }
            public void setContentType(ContentTypeEnum contentType) {
            this.contentType = contentType;
            }
        public ContentData thumbnailImage(String thumbnailImage) {
            this.thumbnailImage = thumbnailImage;
        return this;
        }
            /**
                * The large image (optional) for your content
            * @return thumbnailImage
            */
                
                @Schema(name = "thumbnailImage", example = "https://valkyrlabs.com/assets/VALKYR_LABS_INC_LOGO-BKV9JIdt.png", description = "The large image (optional) for your content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("thumbnailImage")
            public String getThumbnailImage() {
            return thumbnailImage;
            }
            public void setThumbnailImage(String thumbnailImage) {
            this.thumbnailImage = thumbnailImage;
            }
        public ContentData largeImage(String largeImage) {
            this.largeImage = largeImage;
        return this;
        }
            /**
                * The large image (optional) for your content
            * @return largeImage
            */
                
                @Schema(name = "largeImage", example = "https://valkyrlabs.com/assets/VALKYR_LABS_INC_LOGO-BKV9JIdt.png", description = "The large image (optional) for your content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("largeImage")
            public String getLargeImage() {
            return largeImage;
            }
            public void setLargeImage(String largeImage) {
            this.largeImage = largeImage;
            }
        public ContentData category(CategoryEnum category) {
            this.category = category;
        return this;
        }
            /**
                * Get category
            * @return category
            */
                
                @Schema(name = "category", example = "CodeGen", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("category")
            public CategoryEnum getCategory() {
            return category;
            }
            public void setCategory(CategoryEnum category) {
            this.category = category;
            }
        public ContentData status(StatusEnum status) {
            this.status = status;
        return this;
        }
            /**
                * Get status
            * @return status
            */
                
                @Schema(name = "status", example = "editing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("status")
            public StatusEnum getStatus() {
            return status;
            }
            public void setStatus(StatusEnum status) {
            this.status = status;
            }
        public ContentData releaseDate(OffsetDateTime releaseDate) {
            this.releaseDate = releaseDate;
        return this;
        }
            /**
                * the release date (used to automate publishing)
            * @return releaseDate
            */
                @Valid 
                @Schema(name = "releaseDate", description = "the release date (used to automate publishing)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("releaseDate")
            public OffsetDateTime getReleaseDate() {
            return releaseDate;
            }
            public void setReleaseDate(OffsetDateTime releaseDate) {
            this.releaseDate = releaseDate;
            }
        public ContentData contentMedia(List<@Valid ContentMediaLink> contentMedia) {
            this.contentMedia = contentMedia;
        return this;
        }
            public ContentData addContentMediaItem(ContentMediaLink contentMediaItem) {
                if (this.contentMedia == null) {
                this.contentMedia = new ArrayList<>();
                }
                this.contentMedia.add(contentMediaItem);
            return this;
            }
            /**
                * media contained in or referenced by the content
            * @return contentMedia
            */
                @Valid 
                @Schema(name = "contentMedia", description = "media contained in or referenced by the content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("contentMedia")
            public List<@Valid ContentMediaLink> getContentMedia() {
            return contentMedia;
            }
            public void setContentMedia(List<@Valid ContentMediaLink> contentMedia) {
            this.contentMedia = contentMedia;
            }
        public ContentData principalId(UUID principalId) {
            this.principalId = principalId;
        return this;
        }
            /**
                * the author or attibuted entity
            * @return principalId
            */
                @Valid 
                @Schema(name = "principalId", description = "the author or attibuted entity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("principalId")
            public UUID getPrincipalId() {
            return principalId;
            }
            public void setPrincipalId(UUID principalId) {
            this.principalId = principalId;
            }
        public ContentData principal(Principal principal) {
            this.principal = principal;
        return this;
        }
            /**
                * Get principal
            * @return principal
            */
                @Valid 
                @Schema(name = "principal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("principal")
            public Principal getPrincipal() {
            return principal;
            }
            public void setPrincipal(Principal principal) {
            this.principal = principal;
            }
        public ContentData id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "dc734ea0-5fa6-4147-b867-fba9849ce127", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public ContentData ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "bbf5fafc-2e00-4167-ad99-3abce968f129", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public ContentData createdDate(OffsetDateTime createdDate) {
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
        public ContentData keyHash(String keyHash) {
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
        public ContentData lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "9dda17f7-3dad-4e27-af12-c2fc49cf31e1", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public ContentData lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public ContentData lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "12d1e1b5-56db-42ea-9c02-e21facea7544", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public ContentData lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            ContentData contentData = (ContentData) o;
            return Objects.equals(this.authorName, contentData.authorName) &&
            Objects.equals(this.title, contentData.title) &&
            Objects.equals(this.subtitle, contentData.subtitle) &&
            Objects.equals(this.contentUrl, contentData.contentUrl) &&
            Objects.equals(this.contentData, contentData.contentData) &&
            Objects.equals(this.contentType, contentData.contentType) &&
            Objects.equals(this.thumbnailImage, contentData.thumbnailImage) &&
            Objects.equals(this.largeImage, contentData.largeImage) &&
            Objects.equals(this.category, contentData.category) &&
            Objects.equals(this.status, contentData.status) &&
            Objects.equals(this.releaseDate, contentData.releaseDate) &&
            Objects.equals(this.contentMedia, contentData.contentMedia) &&
            Objects.equals(this.principalId, contentData.principalId) &&
            Objects.equals(this.principal, contentData.principal) &&
            Objects.equals(this.id, contentData.id) &&
            Objects.equals(this.ownerId, contentData.ownerId) &&
            Objects.equals(this.createdDate, contentData.createdDate) &&
            Objects.equals(this.keyHash, contentData.keyHash) &&
            Objects.equals(this.lastAccessedById, contentData.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, contentData.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, contentData.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, contentData.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(authorName, title, subtitle, contentUrl, contentData, contentType, thumbnailImage, largeImage, category, status, releaseDate, contentMedia, principalId, principal, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ContentData {\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
        sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
        sb.append("    contentData: ").append(toIndentedString(contentData)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    thumbnailImage: ").append(toIndentedString(thumbnailImage)).append("\n");
        sb.append("    largeImage: ").append(toIndentedString(largeImage)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
        sb.append("    contentMedia: ").append(toIndentedString(contentMedia)).append("\n");
        sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
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

