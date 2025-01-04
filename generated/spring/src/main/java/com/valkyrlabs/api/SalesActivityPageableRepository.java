package com.valkyrlabs.api;

import com.valkyrlabs.model.SalesActivity;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: SalesActivityRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface SalesActivityPageableRepository extends Serializable, PagingAndSortingRepository<SalesActivity, UUID> {

    // ThorAPI Generated search methods for each property on SalesActivity
    /** Find a SalesActivity by opportunityId with pagination
        opportunityId ** | **UUID** | The associated opportunity. | 
        * @param opportunityId UUID The associated opportunity. 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByOpportunityId(UUID opportunityId, Pageable pageable);
    /** Find a SalesActivity by type with pagination
        type ** | [**TypeEnum**](#TypeEnum) | Type of the sales activity. | 
        * @param type TypeEnum Type of the sales activity. 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByType(SalesActivity.TypeEnum type, Pageable pageable);
    /** Find a SalesActivity by details with pagination
        details ** | **String** | Details about the activity. |  [optional]
        * @param details String Details about the activity. 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByDetails(String details, Pageable pageable);
    /** Find a SalesActivity by activityDate with pagination
        activityDate ** | **OffsetDateTime** | Date and time of the activity. | 
        * @param activityDate OffsetDateTime Date and time of the activity. 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByActivityDate(OffsetDateTime activityDate, Pageable pageable);
    /** Find a SalesActivity by performedBy with pagination
        performedBy ** | **UUID** | The user who performed the activity. | 
        * @param performedBy UUID The user who performed the activity. 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByPerformedBy(UUID performedBy, Pageable pageable);
    /** Find a SalesActivity by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findById(UUID id, Pageable pageable);
    /** Find a SalesActivity by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a SalesActivity by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a SalesActivity by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a SalesActivity by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a SalesActivity by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a SalesActivity by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a SalesActivity by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<SalesActivity>
    */
    public Page<SalesActivity> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of SalesActivity as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of SalesActivity instances
     */
    List<SalesActivity> findAll();

    /** 
     * Find all instances of SalesActivity with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of SalesActivity instances
     */
    Page<SalesActivity> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<SalesActivity> findAll(Example<SalesActivity> example, Pageable pageable);

    // end search methods
}
