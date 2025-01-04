package com.valkyrlabs.api;

import com.valkyrlabs.model.Opportunity;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
public interface OpportunityPageableRepository extends Serializable, PagingAndSortingRepository<Opportunity, UUID> {

    // ThorAPI Generated search methods for each property on Opportunity
    /** Find a Opportunity by customerId with pagination
        customerId ** | **UUID** | The customer associated with the opportunity. | 
        * @param customerId UUID The customer associated with the opportunity. 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByCustomerId(UUID customerId, Pageable pageable);
    /** Find a Opportunity by customer with pagination
        customer ** | [**Customer**](Customer.md) |  |  [optional]
        * @param customer Customer  
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByCustomer(Customer customer, Pageable pageable);
    /** Find a Opportunity by description with pagination
        description ** | **String** | Description of the opportunity. | 
        * @param description String Description of the opportunity. 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByDescription(String description, Pageable pageable);
    /** Find a Opportunity by totalValue with pagination
        totalValue ** | **Double** | Expected total value of the opportunity. |  [optional]
        * @param totalValue Double Expected total value of the opportunity. 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByTotalValue(Double totalValue, Pageable pageable);
    /** Find a Opportunity by currentStatus with pagination
        currentStatus ** | [**CurrentStatusEnum**](#CurrentStatusEnum) | Status of the opportunity. |  [optional]
        * @param currentStatus CurrentStatusEnum Status of the opportunity. 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByCurrentStatus(Opportunity.CurrentStatusEnum currentStatus, Pageable pageable);
    /** Find a Opportunity by estimatedCloseDate with pagination
        estimatedCloseDate ** | **OffsetDateTime** | Estimated closing date for the opportunity. |  [optional]
        * @param estimatedCloseDate OffsetDateTime Estimated closing date for the opportunity. 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByEstimatedCloseDate(OffsetDateTime estimatedCloseDate, Pageable pageable);
    /** Find a Opportunity by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findById(UUID id, Pageable pageable);
    /** Find a Opportunity by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Opportunity by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Opportunity by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Opportunity by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Opportunity by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Opportunity by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Opportunity by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Opportunity>
    */
    public Page<Opportunity> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Opportunity as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Opportunity instances
     */
    List<Opportunity> findAll();

    /** 
     * Find all instances of Opportunity with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Opportunity instances
     */
    Page<Opportunity> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Opportunity> findAll(Example<Opportunity> example, Pageable pageable);

    // end search methods
}
