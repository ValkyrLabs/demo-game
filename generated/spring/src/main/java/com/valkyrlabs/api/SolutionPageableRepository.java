package com.valkyrlabs.api;

import com.valkyrlabs.model.Solution;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: SolutionRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface SolutionPageableRepository extends Serializable, PagingAndSortingRepository<Solution, UUID> {

    // ThorAPI Generated search methods for each property on Solution
    /** Find a Solution by buildOutputId with pagination
        buildOutputId ** | **UUID** |  | 
        * @param buildOutputId UUID  
        * @param pageable pagination configuration
        * @return Page<Solution>
    */
    public Page<Solution> findByBuildOutputId(UUID buildOutputId, Pageable pageable);
    /** Find a Solution by description with pagination
        description ** | **String** |  | 
        * @param description String  
        * @param pageable pagination configuration
        * @return Page<Solution>
    */
    public Page<Solution> findByDescription(String description, Pageable pageable);
    /** Find a Solution by appliedFix with pagination
        appliedFix ** | **Boolean** |  | 
        * @param appliedFix Boolean  
        * @param pageable pagination configuration
        * @return Page<Solution>
    */
    public Page<Solution> findByAppliedFix(Boolean appliedFix, Pageable pageable);
    /** Find a Solution by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Solution>
    */
    public Page<Solution> findById(UUID id, Pageable pageable);
    /** Find a Solution by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Solution>
    */
    public Page<Solution> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Solution by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Solution>
    */
    public Page<Solution> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Solution by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Solution>
    */
    public Page<Solution> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Solution by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Solution>
    */
    public Page<Solution> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Solution by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Solution>
    */
    public Page<Solution> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Solution by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Solution>
    */
    public Page<Solution> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Solution by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Solution>
    */
    public Page<Solution> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Solution as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Solution instances
     */
    List<Solution> findAll();

    /** 
     * Find all instances of Solution with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Solution instances
     */
    Page<Solution> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Solution> findAll(Example<Solution> example, Pageable pageable);

    // end search methods
}
