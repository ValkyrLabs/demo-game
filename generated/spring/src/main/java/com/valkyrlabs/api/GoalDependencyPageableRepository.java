package com.valkyrlabs.api;

import com.valkyrlabs.model.GoalDependency;

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

    AUTO IMPLEMENTED by Spring as bean: GoalDependencyRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface GoalDependencyPageableRepository extends Serializable, PagingAndSortingRepository<GoalDependency, UUID> {

    // ThorAPI Generated search methods for each property on GoalDependency
    /** Find a GoalDependency by goalId with pagination
        goalId ** | **UUID** |  |  [optional]
        * @param goalId UUID  
        * @param pageable pagination configuration
        * @return Page<GoalDependency>
    */
    public Page<GoalDependency> findByGoalId(UUID goalId, Pageable pageable);
    /** Find a GoalDependency by dependencyOrder with pagination
        dependencyOrder ** | **Integer** | the order in which this dependency exists |  [optional]
        * @param dependencyOrder Integer the order in which this dependency exists 
        * @param pageable pagination configuration
        * @return Page<GoalDependency>
    */
    public Page<GoalDependency> findByDependencyOrder(Integer dependencyOrder, Pageable pageable);
    /** Find a GoalDependency by dependencyName with pagination
        dependencyName ** | **String** | the name of the dependency |  [optional]
        * @param dependencyName String the name of the dependency 
        * @param pageable pagination configuration
        * @return Page<GoalDependency>
    */
    public Page<GoalDependency> findByDependencyName(String dependencyName, Pageable pageable);
    /** Find a GoalDependency by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<GoalDependency>
    */
    public Page<GoalDependency> findById(UUID id, Pageable pageable);
    /** Find a GoalDependency by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<GoalDependency>
    */
    public Page<GoalDependency> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a GoalDependency by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<GoalDependency>
    */
    public Page<GoalDependency> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a GoalDependency by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<GoalDependency>
    */
    public Page<GoalDependency> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a GoalDependency by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<GoalDependency>
    */
    public Page<GoalDependency> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a GoalDependency by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<GoalDependency>
    */
    public Page<GoalDependency> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a GoalDependency by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<GoalDependency>
    */
    public Page<GoalDependency> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a GoalDependency by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<GoalDependency>
    */
    public Page<GoalDependency> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of GoalDependency as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of GoalDependency instances
     */
    List<GoalDependency> findAll();

    /** 
     * Find all instances of GoalDependency with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of GoalDependency instances
     */
    Page<GoalDependency> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<GoalDependency> findAll(Example<GoalDependency> example, Pageable pageable);

    // end search methods
}
