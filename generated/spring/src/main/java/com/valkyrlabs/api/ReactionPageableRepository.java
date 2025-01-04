package com.valkyrlabs.api;

import com.valkyrlabs.model.Reaction;

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

    AUTO IMPLEMENTED by Spring as bean: ReactionRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface ReactionPageableRepository extends Serializable, PagingAndSortingRepository<Reaction, UUID> {

    // ThorAPI Generated search methods for each property on Reaction
    /** Find a Reaction by targetObject with pagination
        targetObject ** | **UUID** | UUID of the system object |  [optional]
        * @param targetObject UUID UUID of the system object 
        * @param pageable pagination configuration
        * @return Page<Reaction>
    */
    public Page<Reaction> findByTargetObject(UUID targetObject, Pageable pageable);
    /** Find a Reaction by reaction with pagination
        reaction ** | [**ReactionEnum**](#ReactionEnum) | the reaction to the item |  [optional]
        * @param reaction ReactionEnum the reaction to the item 
        * @param pageable pagination configuration
        * @return Page<Reaction>
    */
    public Page<Reaction> findByReaction(Reaction.ReactionEnum reaction, Pageable pageable);
    /** Find a Reaction by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Reaction>
    */
    public Page<Reaction> findById(UUID id, Pageable pageable);
    /** Find a Reaction by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Reaction>
    */
    public Page<Reaction> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Reaction by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Reaction>
    */
    public Page<Reaction> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Reaction by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Reaction>
    */
    public Page<Reaction> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Reaction by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Reaction>
    */
    public Page<Reaction> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Reaction by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Reaction>
    */
    public Page<Reaction> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Reaction by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Reaction>
    */
    public Page<Reaction> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Reaction by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Reaction>
    */
    public Page<Reaction> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Reaction as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Reaction instances
     */
    List<Reaction> findAll();

    /** 
     * Find all instances of Reaction with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Reaction instances
     */
    Page<Reaction> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Reaction> findAll(Example<Reaction> example, Pageable pageable);

    // end search methods
}
