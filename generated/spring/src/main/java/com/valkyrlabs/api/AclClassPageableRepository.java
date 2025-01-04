package com.valkyrlabs.api;

import com.valkyrlabs.model.AclClass;

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
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: AclClassRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface AclClassPageableRepository extends Serializable, PagingAndSortingRepository<AclClass, UUID> {

    // ThorAPI Generated search methods for each property on AclClass
    /** Find a AclClass by className with pagination
        className ** | **String** |  |  [optional]
        * @param className String  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclClass>
    */
    public Page<AclClass> findByClassName(String className, Pageable pageable);
    /** Find a AclClass by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<AclClass>
    */
    public Page<AclClass> findById(UUID id, Pageable pageable);
    /** Find a AclClass by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<AclClass>
    */
    public Page<AclClass> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a AclClass by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<AclClass>
    */
    public Page<AclClass> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a AclClass by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<AclClass>
    */
    public Page<AclClass> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a AclClass by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<AclClass>
    */
    public Page<AclClass> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a AclClass by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<AclClass>
    */
    public Page<AclClass> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a AclClass by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<AclClass>
    */
    public Page<AclClass> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a AclClass by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<AclClass>
    */
    public Page<AclClass> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of AclClass as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of AclClass instances
     */
    List<AclClass> findAll();

    /** 
     * Find all instances of AclClass with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of AclClass instances
     */
    Page<AclClass> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<AclClass> findAll(Example<AclClass> example, Pageable pageable);

    // end search methods
}
