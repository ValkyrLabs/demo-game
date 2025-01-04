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
import com.valkyrlabs.model.GameWeaponIDX;
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
* DEMO weapon that can be used for the game
*/

@Schema(name = "Weapon", description = "DEMO weapon that can be used for the game")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class Weapon  implements DataObject   {
    
    @AuditedField
        private UUID attackId;
    
    @AuditedField
        private String name;
    
    @AuditedField
        @OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
        @PrimaryKeyJoinColumn()
        private GameWeaponIDX game;
    
    @AuditedField
        private Integer harmLevel;
    
    @AuditedField
        private Integer weight;
    
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
   * the type of the weapon
   */
  public enum WeaponTypeEnum {
    BALLISTIC("BALLISTiC"),
    
    PROJECTILE("PROJECTILE"),
    
    FIRE("FIRE"),
    
    KINETIC("KINETIC"),
    
    NUCLEAR("NUCLEAR"),
    
    MUNITIONS("MUNITIONS"),
    
    MELEE("MELEE"),
    
    AIRCRAFT("AIRCRAFT"),
    
    VESSELS("VESSELS"),
    
    BOWS("BOWS"),
    
    SLINGS("SLINGS");

    private String value;

    WeaponTypeEnum(String value) {
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
    public static WeaponTypeEnum fromValue(String value) {
      for (WeaponTypeEnum b : WeaponTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private WeaponTypeEnum weaponType;
    
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
        public Weapon attackId(UUID attackId) {
            this.attackId = attackId;
        return this;
        }
            /**
                * Get attackId
            * @return attackId
            */
                @Valid 
                @Schema(name = "attackId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("attackId")
            public UUID getAttackId() {
            return attackId;
            }
            public void setAttackId(UUID attackId) {
            this.attackId = attackId;
            }
        public Weapon name(String name) {
            this.name = name;
        return this;
        }
            /**
                * the name of the weapon
            * @return name
            */
                
                @Schema(name = "name", description = "the name of the weapon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("name")
            public String getName() {
            return name;
            }
            public void setName(String name) {
            this.name = name;
            }
        public Weapon game(GameWeaponIDX game) {
            this.game = game;
        return this;
        }
            /**
                * Get game
            * @return game
            */
                @Valid 
                @Schema(name = "game", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("game")
            public GameWeaponIDX getGame() {
            return game;
            }
            public void setGame(GameWeaponIDX game) {
            this.game = game;
            }
        public Weapon harmLevel(Integer harmLevel) {
            this.harmLevel = harmLevel;
        return this;
        }
            /**
                * the the damage output level the weapon can have
                * minimum: 0
                * maximum: 100
            * @return harmLevel
            */
                @Min(0) @Max(100) 
                @Schema(name = "harmLevel", description = "the the damage output level the weapon can have", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("harmLevel")
            public Integer getHarmLevel() {
            return harmLevel;
            }
            public void setHarmLevel(Integer harmLevel) {
            this.harmLevel = harmLevel;
            }
        public Weapon weight(Integer weight) {
            this.weight = weight;
        return this;
        }
            /**
                * how much one of these weapons weighs in lbs
            * @return weight
            */
                
                @Schema(name = "weight", description = "how much one of these weapons weighs in lbs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("weight")
            public Integer getWeight() {
            return weight;
            }
            public void setWeight(Integer weight) {
            this.weight = weight;
            }
        public Weapon color(ColorEnum color) {
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
        public Weapon weaponType(WeaponTypeEnum weaponType) {
            this.weaponType = weaponType;
        return this;
        }
            /**
                * the type of the weapon
            * @return weaponType
            */
                
                @Schema(name = "weaponType", description = "the type of the weapon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("weaponType")
            public WeaponTypeEnum getWeaponType() {
            return weaponType;
            }
            public void setWeaponType(WeaponTypeEnum weaponType) {
            this.weaponType = weaponType;
            }
        public Weapon id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "b20b611b-53a5-49c5-82ba-fd9c6a8f9f1a", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public Weapon ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "b672d035-114a-4f68-b21f-2dc8aed6c332", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public Weapon createdDate(OffsetDateTime createdDate) {
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
        public Weapon keyHash(String keyHash) {
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
        public Weapon lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "53488ab9-0365-4c42-a033-e7396b4df88e", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public Weapon lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public Weapon lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "dd456faa-efaf-41d9-a3fe-661cc04564c5", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public Weapon lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            Weapon weapon = (Weapon) o;
            return Objects.equals(this.attackId, weapon.attackId) &&
            Objects.equals(this.name, weapon.name) &&
            Objects.equals(this.game, weapon.game) &&
            Objects.equals(this.harmLevel, weapon.harmLevel) &&
            Objects.equals(this.weight, weapon.weight) &&
            Objects.equals(this.color, weapon.color) &&
            Objects.equals(this.weaponType, weapon.weaponType) &&
            Objects.equals(this.id, weapon.id) &&
            Objects.equals(this.ownerId, weapon.ownerId) &&
            Objects.equals(this.createdDate, weapon.createdDate) &&
            Objects.equals(this.keyHash, weapon.keyHash) &&
            Objects.equals(this.lastAccessedById, weapon.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, weapon.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, weapon.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, weapon.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(attackId, name, game, harmLevel, weight, color, weaponType, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Weapon {\n");
        sb.append("    attackId: ").append(toIndentedString(attackId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    game: ").append(toIndentedString(game)).append("\n");
        sb.append("    harmLevel: ").append(toIndentedString(harmLevel)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    weaponType: ").append(toIndentedString(weaponType)).append("\n");
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

