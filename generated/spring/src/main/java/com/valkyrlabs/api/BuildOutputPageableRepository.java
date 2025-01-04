package com.valkyrlabs.api;

import com.valkyrlabs.model.BuildOutput;

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
import com.valkyrlabs.model.Solution;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: BuildOutputRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface BuildOutputPageableRepository extends Serializable, PagingAndSortingRepository<BuildOutput, UUID> {

    // ThorAPI Generated search methods for each property on BuildOutput
    /** Find a BuildOutput by applicationId with pagination
        applicationId ** | **UUID** |  |  [optional]
        * @param applicationId UUID  
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findByApplicationId(UUID applicationId, Pageable pageable);
    /** Find a BuildOutput by buildId with pagination
        buildId ** | **UUID** |  | 
        * @param buildId UUID  
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findByBuildId(UUID buildId, Pageable pageable);
    /** Find a BuildOutput by lastSuccessfulRun with pagination
        lastSuccessfulRun ** | **OffsetDateTime** |  |  [optional]
        * @param lastSuccessfulRun OffsetDateTime  
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findByLastSuccessfulRun(OffsetDateTime lastSuccessfulRun, Pageable pageable);
    /** Find a BuildOutput by success with pagination
        success ** | **Boolean** |  | 
        * @param success Boolean  
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findBySuccess(Boolean success, Pageable pageable);
    /** Find a BuildOutput by output with pagination
        output ** | **String** |  | 
        * @param output String  
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findByOutput(String output, Pageable pageable);
    /** Find a BuildOutput by solutions with pagination
        solutions ** | [**List<Solution>**](Solution.md) |  |  [optional]
        * @param solutions List&lt;@Valid Solution&gt;  
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findBySolutions(List<@Valid Solution> solutions, Pageable pageable);
    /** Find a BuildOutput by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findById(UUID id, Pageable pageable);
    /** Find a BuildOutput by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a BuildOutput by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a BuildOutput by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a BuildOutput by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a BuildOutput by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a BuildOutput by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a BuildOutput by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<BuildOutput>
    */
    public Page<BuildOutput> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of BuildOutput as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of BuildOutput instances
     */
    List<BuildOutput> findAll();

    /** 
     * Find all instances of BuildOutput with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of BuildOutput instances
     */
    Page<BuildOutput> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<BuildOutput> findAll(Example<BuildOutput> example, Pageable pageable);

    // end search methods
}
