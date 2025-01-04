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
* TODO Address CLASS DESCRIPTION
*/

@Schema(name = "Address", description = "TODO Address CLASS DESCRIPTION")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class Address  implements DataObject   {
    
    @AuditedField
        private Boolean hasWifi;
    
    @AuditedField
        private UUID principalId;
    
              /**
   * The type of address
   */
  public enum AddressTypeEnum {
    HOME("home"),
    
    MAIL("mail"),
    
    WORK("work"),
    
    SCHOOL("school"),
    
    OTHER("other");

    private String value;

    AddressTypeEnum(String value) {
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
    public static AddressTypeEnum fromValue(String value) {
      for (AddressTypeEnum b : AddressTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private AddressTypeEnum addressType;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true")
@SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String name;
    
    @AuditedField
        private String street1;
    
    @AuditedField
        private String street2;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true")
@SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String city;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true")
@SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String state;
    
    @AuditedField
        @Column(length = 3)
        private String country;
    
    @AuditedField
        @Column(length = 10)
        private String postalCode;
    
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
        public Address() {
        super();
        }
        /**
        * Constructor with only required parameters
        */
        public Address(String name, String street1, String city, String state, String postalCode) {
                            this.name = name;
                            this.street1 = street1;
                            this.city = city;
                            this.state = state;
                            this.postalCode = postalCode;
                }
        public Address hasWifi(Boolean hasWifi) {
            this.hasWifi = hasWifi;
        return this;
        }
            /**
                * Get hasWifi
            * @return hasWifi
            */
                
                @Schema(name = "hasWifi", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("hasWifi")
            public Boolean getHasWifi() {
            return hasWifi;
            }
            public void setHasWifi(Boolean hasWifi) {
            this.hasWifi = hasWifi;
            }
        public Address principalId(UUID principalId) {
            this.principalId = principalId;
        return this;
        }
            /**
                * Get principalId
            * @return principalId
            */
                @Valid 
                @Schema(name = "principalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("principalId")
            public UUID getPrincipalId() {
            return principalId;
            }
            public void setPrincipalId(UUID principalId) {
            this.principalId = principalId;
            }
        public Address addressType(AddressTypeEnum addressType) {
            this.addressType = addressType;
        return this;
        }
            /**
                * The type of address
            * @return addressType
            */
                
                @Schema(name = "addressType", example = "home", description = "The type of address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("addressType")
            public AddressTypeEnum getAddressType() {
            return addressType;
            }
            public void setAddressType(AddressTypeEnum addressType) {
            this.addressType = addressType;
            }
        public Address name(String name) {
            this.name = name;
        return this;
        }
            /**
                * full name of addressee
            * @return name
            */
                @NotNull 
                @Schema(name = "name", example = "Henry Johnson", description = "full name of addressee", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("name")
            public String getName() {
            return name;
            }
            public void setName(String name) {
            this.name = name;
            }
        public Address street1(String street1) {
            this.street1 = street1;
        return this;
        }
            /**
                * street address line 1
            * @return street1
            */
                @NotNull 
                @Schema(name = "street1", example = "123 Daydream Blvd.", description = "street address line 1", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("street1")
            public String getStreet1() {
            return street1;
            }
            public void setStreet1(String street1) {
            this.street1 = street1;
            }
        public Address street2(String street2) {
            this.street2 = street2;
        return this;
        }
            /**
                * street address line 2
            * @return street2
            */
                
                @Schema(name = "street2", example = "Apt. 7", description = "street address line 2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("street2")
            public String getStreet2() {
            return street2;
            }
            public void setStreet2(String street2) {
            this.street2 = street2;
            }
        public Address city(String city) {
            this.city = city;
        return this;
        }
            /**
                * full name of city
            * @return city
            */
                @NotNull 
                @Schema(name = "city", example = "San Francisco", description = "full name of city", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("city")
            public String getCity() {
            return city;
            }
            public void setCity(String city) {
            this.city = city;
            }
        public Address state(String state) {
            this.state = state;
        return this;
        }
            /**
                * State of residence 2-character code (USA)
            * @return state
            */
                @NotNull @Size(min = 2) 
                @Schema(name = "state", example = "CA", description = "State of residence 2-character code (USA)", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("state")
            public String getState() {
            return state;
            }
            public void setState(String state) {
            this.state = state;
            }
        public Address country(String country) {
            this.country = country;
        return this;
        }
            /**
                * 3 character country code (upper case)
            * @return country
            */
                @Size(min = 3, max = 3) 
                @Schema(name = "country", example = "USA", description = "3 character country code (upper case)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("country")
            public String getCountry() {
            return country;
            }
            public void setCountry(String country) {
            this.country = country;
            }
        public Address postalCode(String postalCode) {
            this.postalCode = postalCode;
        return this;
        }
            /**
                * 5+4 digit zip code
            * @return postalCode
            */
                @NotNull @Pattern(regexp = "^\\d{5}-\\d{4}$") @Size(min = 10, max = 10) 
                @Schema(name = "postal_code", example = "94210-0000", description = "5+4 digit zip code", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("postal_code")
            public String getPostalCode() {
            return postalCode;
            }
            public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            }
        public Address id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "3773d666-dea1-4d02-b430-11ca52e266a8", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public Address ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "5297b19d-fd2a-4007-9aef-f0b7264cd539", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public Address createdDate(OffsetDateTime createdDate) {
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
        public Address keyHash(String keyHash) {
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
        public Address lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "ef297a29-e742-4535-82c6-6ef6211bca12", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public Address lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public Address lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "ba749007-a05a-4505-a434-d92c7cf9712d", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public Address lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            Address address = (Address) o;
            return Objects.equals(this.hasWifi, address.hasWifi) &&
            Objects.equals(this.principalId, address.principalId) &&
            Objects.equals(this.addressType, address.addressType) &&
            Objects.equals(this.name, address.name) &&
            Objects.equals(this.street1, address.street1) &&
            Objects.equals(this.street2, address.street2) &&
            Objects.equals(this.city, address.city) &&
            Objects.equals(this.state, address.state) &&
            Objects.equals(this.country, address.country) &&
            Objects.equals(this.postalCode, address.postalCode) &&
            Objects.equals(this.id, address.id) &&
            Objects.equals(this.ownerId, address.ownerId) &&
            Objects.equals(this.createdDate, address.createdDate) &&
            Objects.equals(this.keyHash, address.keyHash) &&
            Objects.equals(this.lastAccessedById, address.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, address.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, address.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, address.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(hasWifi, principalId, addressType, name, street1, street2, city, state, country, postalCode, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Address {\n");
        sb.append("    hasWifi: ").append(toIndentedString(hasWifi)).append("\n");
        sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
        sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

