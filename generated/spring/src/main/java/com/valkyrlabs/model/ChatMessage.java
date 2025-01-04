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
* A Chat message sent to a recipient
*/

@Schema(name = "ChatMessage", description = "A Chat message sent to a recipient")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class ChatMessage  implements DataObject   {
    
    @AuditedField
        private String sessionId;
    
    @AuditedField
        private Boolean connected;
    
    @AuditedField
        @Column(length = 3000)
        private String json;
    
              /**
   * type of the message source
   */
  public enum SourceTypeEnum {
    API("api"),
    
    SERVER_LOG("server_log"),
    
    P2P("p2p");

    private String value;

    SourceTypeEnum(String value) {
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
    public static SourceTypeEnum fromValue(String value) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private SourceTypeEnum sourceType;
    
    @AuditedField
        private UUID sourceOwner;
    
              /**
   * Gets or Sets role
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
    
    @AuditedField
        @Column(length = 100000)
        private String content;
    
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
        public ChatMessage sessionId(String sessionId) {
            this.sessionId = sessionId;
        return this;
        }
            /**
                * Get sessionId
            * @return sessionId
            */
                
                @Schema(name = "sessionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("sessionId")
            public String getSessionId() {
            return sessionId;
            }
            public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
            }
        public ChatMessage connected(Boolean connected) {
            this.connected = connected;
        return this;
        }
            /**
                * if this chat message is conencted to a service (ws)
            * @return connected
            */
                
                @Schema(name = "connected", description = "if this chat message is conencted to a service (ws)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("connected")
            public Boolean getConnected() {
            return connected;
            }
            public void setConnected(Boolean connected) {
            this.connected = connected;
            }
        public ChatMessage json(String json) {
            this.json = json;
        return this;
        }
            /**
                * Get json
            * @return json
            */
                @Size(max = 3000) 
                @Schema(name = "json", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("json")
            public String getJson() {
            return json;
            }
            public void setJson(String json) {
            this.json = json;
            }
        public ChatMessage sourceType(SourceTypeEnum sourceType) {
            this.sourceType = sourceType;
        return this;
        }
            /**
                * type of the message source
            * @return sourceType
            */
                
                @Schema(name = "sourceType", description = "type of the message source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("sourceType")
            public SourceTypeEnum getSourceType() {
            return sourceType;
            }
            public void setSourceType(SourceTypeEnum sourceType) {
            this.sourceType = sourceType;
            }
        public ChatMessage sourceOwner(UUID sourceOwner) {
            this.sourceOwner = sourceOwner;
        return this;
        }
            /**
                * Get sourceOwner
            * @return sourceOwner
            */
                @Valid 
                @Schema(name = "sourceOwner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("sourceOwner")
            public UUID getSourceOwner() {
            return sourceOwner;
            }
            public void setSourceOwner(UUID sourceOwner) {
            this.sourceOwner = sourceOwner;
            }
        public ChatMessage role(RoleEnum role) {
            this.role = role;
        return this;
        }
            /**
                * Get role
            * @return role
            */
                
                @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("role")
            public RoleEnum getRole() {
            return role;
            }
            public void setRole(RoleEnum role) {
            this.role = role;
            }
        public ChatMessage content(String content) {
            this.content = content;
        return this;
        }
            /**
                * the message to send to the chat service
            * @return content
            */
                @Size(min = 10, max = 100000) 
                @Schema(name = "content", example = "What is the next step for our adventure?", description = "the message to send to the chat service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("content")
            public String getContent() {
            return content;
            }
            public void setContent(String content) {
            this.content = content;
            }
        public ChatMessage id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "843865cf-aeeb-4e86-87a4-e6e6e4c0fa91", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public ChatMessage ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "48318675-0de4-4cc0-9598-601df73c48b0", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public ChatMessage createdDate(OffsetDateTime createdDate) {
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
        public ChatMessage keyHash(String keyHash) {
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
        public ChatMessage lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "9c13ea7e-7254-47bf-881a-a62740fc8742", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public ChatMessage lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public ChatMessage lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "a448f2ce-98d1-4871-9623-f7fdd6bd49b2", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public ChatMessage lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            ChatMessage chatMessage = (ChatMessage) o;
            return Objects.equals(this.sessionId, chatMessage.sessionId) &&
            Objects.equals(this.connected, chatMessage.connected) &&
            Objects.equals(this.json, chatMessage.json) &&
            Objects.equals(this.sourceType, chatMessage.sourceType) &&
            Objects.equals(this.sourceOwner, chatMessage.sourceOwner) &&
            Objects.equals(this.role, chatMessage.role) &&
            Objects.equals(this.content, chatMessage.content) &&
            Objects.equals(this.id, chatMessage.id) &&
            Objects.equals(this.ownerId, chatMessage.ownerId) &&
            Objects.equals(this.createdDate, chatMessage.createdDate) &&
            Objects.equals(this.keyHash, chatMessage.keyHash) &&
            Objects.equals(this.lastAccessedById, chatMessage.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, chatMessage.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, chatMessage.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, chatMessage.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(sessionId, connected, json, sourceType, sourceOwner, role, content, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ChatMessage {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
        sb.append("    json: ").append(toIndentedString(json)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceOwner: ").append(toIndentedString(sourceOwner)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

