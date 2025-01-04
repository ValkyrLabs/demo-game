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
import com.valkyrlabs.model.Weapon;
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
* DEMO attack of various type
*/

@Schema(name = "Attack", description = "DEMO attack of various type")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class Attack  implements DataObject   {
    
    @AuditedField
        private String name;
    
              /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FRONTAL("FRONTAL"),
    
    SNEAK("SNEAK"),
    
    FROM_ABOVE("FROM_ABOVE"),
    
    FROM_BELOW("FROM_BELOW"),
    
    WATER("WATER"),
    
    LAND("LAND"),
    
    AIR("AIR");

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
    
    @AuditedField
        @OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
        @PrimaryKeyJoinColumn()
        private Weapon weapon;
    
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
        public Attack name(String name) {
            this.name = name;
        return this;
        }
            /**
                * the name of the attack
            * @return name
            */
                
                @Schema(name = "name", description = "the name of the attack", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("name")
            public String getName() {
            return name;
            }
            public void setName(String name) {
            this.name = name;
            }
        public Attack type(TypeEnum type) {
            this.type = type;
        return this;
        }
            /**
                * Get type
            * @return type
            */
                
                @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("type")
            public TypeEnum getType() {
            return type;
            }
            public void setType(TypeEnum type) {
            this.type = type;
            }
        public Attack weapon(Weapon weapon) {
            this.weapon = weapon;
        return this;
        }
            /**
                * Get weapon
            * @return weapon
            */
                @Valid 
                @Schema(name = "weapon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("weapon")
            public Weapon getWeapon() {
            return weapon;
            }
            public void setWeapon(Weapon weapon) {
            this.weapon = weapon;
            }
        public Attack id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "eb84046e-e66f-4cf1-bcca-a7fe1e9bd457", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public Attack ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "fb8355a4-16ac-4853-b869-bf4f9c2f9c63", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public Attack createdDate(OffsetDateTime createdDate) {
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
        public Attack keyHash(String keyHash) {
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
        public Attack lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "69ed1b31-0da5-49b3-aaa7-2436283e93d6", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public Attack lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public Attack lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "20886e51-82db-4d42-acf4-b165f8eaf2a2", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public Attack lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            Attack attack = (Attack) o;
            return Objects.equals(this.name, attack.name) &&
            Objects.equals(this.type, attack.type) &&
            Objects.equals(this.weapon, attack.weapon) &&
            Objects.equals(this.id, attack.id) &&
            Objects.equals(this.ownerId, attack.ownerId) &&
            Objects.equals(this.createdDate, attack.createdDate) &&
            Objects.equals(this.keyHash, attack.keyHash) &&
            Objects.equals(this.lastAccessedById, attack.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, attack.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, attack.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, attack.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(name, type, weapon, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Attack {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    weapon: ").append(toIndentedString(weapon)).append("\n");
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

