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
import com.valkyrlabs.model.Customer;
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
* Represents a sales opportunity related to a customer.
*/

@Schema(name = "Opportunity", description = "Represents a sales opportunity related to a customer.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class Opportunity  implements DataObject   {
    
    @AuditedField
        private UUID customerId;
    
    @AuditedField
        @OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
        @PrimaryKeyJoinColumn()
        private Customer customer;
    
    @AuditedField
        private String description;
    
    @AuditedField
        private Double totalValue;
    
              /**
   * Status of the opportunity.
   */
  public enum CurrentStatusEnum {
    WON("won"),
    
    OPEN("open"),
    
    LOST("lost"),
    
    INACTIVE("inactive"),
    
    REVIVE("revive"),
    
    LEGAL("legal"),
    
    BLOCKED("blocked");

    private String value;

    CurrentStatusEnum(String value) {
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
    public static CurrentStatusEnum fromValue(String value) {
      for (CurrentStatusEnum b : CurrentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

        private CurrentStatusEnum currentStatus;
    
    @AuditedField
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private OffsetDateTime estimatedCloseDate;
    
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
        public Opportunity() {
        super();
        }
        /**
        * Constructor with only required parameters
        */
        public Opportunity(UUID customerId, String description) {
                            this.customerId = customerId;
                            this.description = description;
                }
        public Opportunity customerId(UUID customerId) {
            this.customerId = customerId;
        return this;
        }
            /**
                * The customer associated with the opportunity.
            * @return customerId
            */
                @NotNull @Valid 
                @Schema(name = "customerId", description = "The customer associated with the opportunity.", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("customerId")
            public UUID getCustomerId() {
            return customerId;
            }
            public void setCustomerId(UUID customerId) {
            this.customerId = customerId;
            }
        public Opportunity customer(Customer customer) {
            this.customer = customer;
        return this;
        }
            /**
                * Get customer
            * @return customer
            */
                @Valid 
                @Schema(name = "customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("customer")
            public Customer getCustomer() {
            return customer;
            }
            public void setCustomer(Customer customer) {
            this.customer = customer;
            }
        public Opportunity description(String description) {
            this.description = description;
        return this;
        }
            /**
                * Description of the opportunity.
            * @return description
            */
                @NotNull 
                @Schema(name = "description", description = "Description of the opportunity.", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("description")
            public String getDescription() {
            return description;
            }
            public void setDescription(String description) {
            this.description = description;
            }
        public Opportunity totalValue(Double totalValue) {
            this.totalValue = totalValue;
        return this;
        }
            /**
                * Expected total value of the opportunity.
            * @return totalValue
            */
                
                @Schema(name = "totalValue", description = "Expected total value of the opportunity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("totalValue")
            public Double getTotalValue() {
            return totalValue;
            }
            public void setTotalValue(Double totalValue) {
            this.totalValue = totalValue;
            }
        public Opportunity currentStatus(CurrentStatusEnum currentStatus) {
            this.currentStatus = currentStatus;
        return this;
        }
            /**
                * Status of the opportunity.
            * @return currentStatus
            */
                
                @Schema(name = "currentStatus", description = "Status of the opportunity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("currentStatus")
            public CurrentStatusEnum getCurrentStatus() {
            return currentStatus;
            }
            public void setCurrentStatus(CurrentStatusEnum currentStatus) {
            this.currentStatus = currentStatus;
            }
        public Opportunity estimatedCloseDate(OffsetDateTime estimatedCloseDate) {
            this.estimatedCloseDate = estimatedCloseDate;
        return this;
        }
            /**
                * Estimated closing date for the opportunity.
            * @return estimatedCloseDate
            */
                @Valid 
                @Schema(name = "estimatedCloseDate", description = "Estimated closing date for the opportunity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("estimatedCloseDate")
            public OffsetDateTime getEstimatedCloseDate() {
            return estimatedCloseDate;
            }
            public void setEstimatedCloseDate(OffsetDateTime estimatedCloseDate) {
            this.estimatedCloseDate = estimatedCloseDate;
            }
        public Opportunity id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "6393da08-9aeb-4a76-bafe-10bd0e4e6f8a", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public Opportunity ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "e315ba20-0dd2-41b1-a12a-f9d29e3ca284", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public Opportunity createdDate(OffsetDateTime createdDate) {
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
        public Opportunity keyHash(String keyHash) {
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
        public Opportunity lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "5f4e99ba-e96c-4457-8a25-dd4512bb102d", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public Opportunity lastAccessedDate(OffsetDateTime lastAccessedDate) {
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
        public Opportunity lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "ce1bf6de-cdbb-4c9d-86b2-6360c734f651", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public Opportunity lastModifiedDate(OffsetDateTime lastModifiedDate) {
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
            Opportunity opportunity = (Opportunity) o;
            return Objects.equals(this.customerId, opportunity.customerId) &&
            Objects.equals(this.customer, opportunity.customer) &&
            Objects.equals(this.description, opportunity.description) &&
            Objects.equals(this.totalValue, opportunity.totalValue) &&
            Objects.equals(this.currentStatus, opportunity.currentStatus) &&
            Objects.equals(this.estimatedCloseDate, opportunity.estimatedCloseDate) &&
            Objects.equals(this.id, opportunity.id) &&
            Objects.equals(this.ownerId, opportunity.ownerId) &&
            Objects.equals(this.createdDate, opportunity.createdDate) &&
            Objects.equals(this.keyHash, opportunity.keyHash) &&
            Objects.equals(this.lastAccessedById, opportunity.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, opportunity.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, opportunity.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, opportunity.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(customerId, customer, description, totalValue, currentStatus, estimatedCloseDate, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Opportunity {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
        sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
        sb.append("    estimatedCloseDate: ").append(toIndentedString(estimatedCloseDate)).append("\n");
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

