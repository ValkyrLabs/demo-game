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
* a game level
*/

@Schema(name = "Level", description = "a game level")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class Level  implements DataObject   {
    
    @AuditedField
        private String name;
    
    @AuditedField
        private Integer level;
    
    @AuditedField
        private Integer scoreMultiplier;
    
              /**
   * Gets or Sets color
   */
  public enum ColorEnum {
    BLACK("BLACK"),
    
    CAMO_AIRFORCE("CAMO-AIRFORCE"),
    
    CAMO_MARINE("CAMO-MARINE"),
    
    CAMO_NAVY("CAMO-NAVY"),
    
    CAMO_ARMY("CAMO-ARMY"),
    
    GRAY("GRAY"),
    
    OLIVE("OLIVE"),
    
    SILVER("SILVER"),
    
    GOLD("GOLD"),
    
    EXOTIC("EXOTIC");

    private String value;

    ColorEnum(String value) {
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
    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private ColorEnum color;
    
              /**
   * the type of the level
   */
  public enum LevelTypeEnum {
    MAP("MAP"),
    
    ACHIEVEMENT("ACHIEVEMENT"),
    
    BATTLE("BATTLE"),
    
    CINEMATIC("CINEMATIC");

    private String value;

    LevelTypeEnum(String value) {
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
    public static LevelTypeEnum fromValue(String value) {
      for (LevelTypeEnum b : LevelTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private LevelTypeEnum levelType;
    
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
        public Level name(String name) {
            this.name = name;
        return this;
        }
            /**
                * the name of level
            * @return name
            */
                
                @Schema(name = "name", description = "the name of level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("name")
            public String getName() {
            return name;
            }
            public void setName(String name) {
            this.name = name;
            }
        public Level level(Integer level) {
            this.level = level;
        return this;
        }
            /**
                * the sequential level index (if applicable)
                * minimum: 0
            * @return level
            */
                @Min(0) 
                @Schema(name = "level", description = "the sequential level index (if applicable)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("level")
            public Integer getLevel() {
            return level;
            }
            public void setLevel(Integer level) {
            this.level = level;
            }
        public Level scoreMultiplier(Integer scoreMultiplier) {
            this.scoreMultiplier = scoreMultiplier;
        return this;
        }
            /**
                * use to increment extra points for harder levels
            * @return scoreMultiplier
            */
                
                @Schema(name = "scoreMultiplier", description = "use to increment extra points for harder levels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("scoreMultiplier")
            public Integer getScoreMultiplier() {
            return scoreMultiplier;
            }
            public void setScoreMultiplier(Integer scoreMultiplier) {
            this.scoreMultiplier = scoreMultiplier;
            }
        public Level color(ColorEnum color) {
            this.color = color;
        return this;
        }
            /**
                * Get color
            * @return color
            */
                
                @Schema(name = "color", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("color")
            public ColorEnum getColor() {
            return color;
            }
            public void setColor(ColorEnum color) {
            this.color = color;
            }
        public Level levelType(LevelTypeEnum levelType) {
            this.levelType = levelType;
        return this;
        }
            /**
                * the type of the level
            * @return levelType
            */
                
                @Schema(name = "levelType", description = "the type of the level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("levelType")
            public LevelTypeEnum getLevelType() {
            return levelType;
            }
            public void setLevelType(LevelTypeEnum levelType) {
            this.levelType = levelType;
            }
        public Level id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "ffef594f-a40e-43c3-a913-fb4294f8a897", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public Level ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "fdbb825b-0db1-43bf-ab1f-485c482df862", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public Level createdDate(OffsetDateTime createdDate) {
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
        public Level keyHash(String keyHash) {
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
        public Level lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "e13d1a53-bdf7-4ef8-9ce5-5d2c4bad654f", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public Level lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public Level lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "941a62d0-68f0-42f6-a883-70bd5b776b58", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public Level lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            Level level = (Level) o;
            return Objects.equals(this.name, level.name) &&
            Objects.equals(this.level, level.level) &&
            Objects.equals(this.scoreMultiplier, level.scoreMultiplier) &&
            Objects.equals(this.color, level.color) &&
            Objects.equals(this.levelType, level.levelType) &&
            Objects.equals(this.id, level.id) &&
            Objects.equals(this.ownerId, level.ownerId) &&
            Objects.equals(this.createdDate, level.createdDate) &&
            Objects.equals(this.keyHash, level.keyHash) &&
            Objects.equals(this.lastAccessedById, level.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, level.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, level.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, level.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(name, level, scoreMultiplier, color, levelType, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Level {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    scoreMultiplier: ").append(toIndentedString(scoreMultiplier)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    levelType: ").append(toIndentedString(levelType)).append("\n");
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

