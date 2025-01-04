package com.valkyrlabs.api;

import com.valkyrlabs.model.Opportunity;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.valkyrlabs.model.Customer;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: OpportunityRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface OpportunityRepository extends Serializable, JpaRepository<Opportunity, UUID> {

    // ThorAPI Generated search methods for each property on Opportunity
    /** Find a Opportunity by customerId 
        customerId ** | **UUID** | The customer associated with the opportunity. | 
        * @param customerId UUID The customer associated with the opportunity. 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByCustomerId (  UUID customerId);
    /** Find a Opportunity by customer 
        customer ** | [**Customer**](Customer.md) |  |  [optional]
        * @param customer Customer  
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByCustomer (  Customer customer);
    /** Find a Opportunity by description 
        description ** | **String** | Description of the opportunity. | 
        * @param description String Description of the opportunity. 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByDescription (  String description);
    /** Find a Opportunity by totalValue 
        totalValue ** | **Double** | Expected total value of the opportunity. |  [optional]
        * @param totalValue Double Expected total value of the opportunity. 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByTotalValue (  Double totalValue);
    /** Find a Opportunity by currentStatus 
        currentStatus ** | [**CurrentStatusEnum**](#CurrentStatusEnum) | Status of the opportunity. |  [optional]
        * @param currentStatus CurrentStatusEnum Status of the opportunity. 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByCurrentStatus ( Opportunity.CurrentStatusEnum currentStatus);
    /** Find a Opportunity by estimatedCloseDate 
        estimatedCloseDate ** | **OffsetDateTime** | Estimated closing date for the opportunity. |  [optional]
        * @param estimatedCloseDate OffsetDateTime Estimated closing date for the opportunity. 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByEstimatedCloseDate (  OffsetDateTime estimatedCloseDate);
    /** Find a Opportunity by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityById (  UUID id);
    /** Find a Opportunity by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByOwnerId (  UUID ownerId);
    /** Find a Opportunity by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Opportunity by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByKeyHash (  String keyHash);
    /** Find a Opportunity by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByLastAccessedById (  UUID lastAccessedById);
    /** Find a Opportunity by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Opportunity by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByLastModifiedById (  UUID lastModifiedById);
    /** Find a Opportunity by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Opportunity>
    */
    // nullable
    public List<Opportunity>  findOpportunityByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
