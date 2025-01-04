package com.valkyrlabs.api;

import com.valkyrlabs.model.SalesPipeline;

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

    AUTO IMPLEMENTED by Spring as bean: SalesPipelineRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface SalesPipelinePageableRepository extends Serializable, PagingAndSortingRepository<SalesPipeline, UUID> {

    // ThorAPI Generated search methods for each property on SalesPipeline
    /** Find a SalesPipeline by name with pagination
        name ** | [**NameEnum**](#NameEnum) | Name of the sales stage (e.g., Lead, Qualification, Proposal, Negotiation, Closed). | 
        * @param name NameEnum Name of the sales stage (e.g., Lead, Qualification, Proposal, Negotiation, Closed). 
        * @param pageable pagination configuration
        * @return Page<SalesPipeline>
    */
    public Page<SalesPipeline> findByName(SalesPipeline.NameEnum name, Pageable pageable);
    /** Find a SalesPipeline by sequenceOrder with pagination
        sequenceOrder ** | **Integer** | The order in which the stages are followed in the sales process. |  [optional]
        * @param sequenceOrder Integer The order in which the stages are followed in the sales process. 
        * @param pageable pagination configuration
        * @return Page<SalesPipeline>
    */
    public Page<SalesPipeline> findBySequenceOrder(Integer sequenceOrder, Pageable pageable);
    /** Find a SalesPipeline by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<SalesPipeline>
    */
    public Page<SalesPipeline> findById(UUID id, Pageable pageable);
    /** Find a SalesPipeline by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<SalesPipeline>
    */
    public Page<SalesPipeline> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a SalesPipeline by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<SalesPipeline>
    */
    public Page<SalesPipeline> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a SalesPipeline by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<SalesPipeline>
    */
    public Page<SalesPipeline> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a SalesPipeline by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<SalesPipeline>
    */
    public Page<SalesPipeline> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a SalesPipeline by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<SalesPipeline>
    */
    public Page<SalesPipeline> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a SalesPipeline by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<SalesPipeline>
    */
    public Page<SalesPipeline> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a SalesPipeline by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<SalesPipeline>
    */
    public Page<SalesPipeline> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of SalesPipeline as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of SalesPipeline instances
     */
    List<SalesPipeline> findAll();

    /** 
     * Find all instances of SalesPipeline with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of SalesPipeline instances
     */
    Page<SalesPipeline> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<SalesPipeline> findAll(Example<SalesPipeline> example, Pageable pageable);

    // end search methods
}
