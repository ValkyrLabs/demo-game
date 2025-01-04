package com.valkyrlabs.api;

import com.valkyrlabs.model.Depend;

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

    AUTO IMPLEMENTED by Spring as bean: DependRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface DependPageableRepository extends Serializable, PagingAndSortingRepository<Depend, UUID> {

    // ThorAPI Generated search methods for each property on Depend
    /** Find a Depend by groupId with pagination
        groupId ** | **String** |  | 
        * @param groupId String  
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByGroupId(String groupId, Pageable pageable);
    /** Find a Depend by artifactId with pagination
        artifactId ** | **String** |  | 
        * @param artifactId String  
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByArtifactId(String artifactId, Pageable pageable);
    /** Find a Depend by version with pagination
        version ** | **String** |  | 
        * @param version String  
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByVersion(String version, Pageable pageable);
    /** Find a Depend by scope with pagination
        scope ** | **String** |  |  [optional]
        * @param scope String  
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByScope(String scope, Pageable pageable);
    /** Find a Depend by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) |  |  [optional]
        * @param status StatusEnum  
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByStatus(Depend.StatusEnum status, Pageable pageable);
    /** Find a Depend by buildId with pagination
        buildId ** | **UUID** |  |  [optional]
        * @param buildId UUID  
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByBuildId(UUID buildId, Pageable pageable);
    /** Find a Depend by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findById(UUID id, Pageable pageable);
    /** Find a Depend by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Depend by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Depend by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Depend by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Depend by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Depend by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Depend by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Depend>
    */
    public Page<Depend> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Depend as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Depend instances
     */
    List<Depend> findAll();

    /** 
     * Find all instances of Depend with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Depend instances
     */
    Page<Depend> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Depend> findAll(Example<Depend> example, Pageable pageable);

    // end search methods
}
