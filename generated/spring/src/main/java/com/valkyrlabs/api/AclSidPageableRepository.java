package com.valkyrlabs.api;

import com.valkyrlabs.model.AclSid;

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

    AUTO IMPLEMENTED by Spring as bean: AclSidRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface AclSidPageableRepository extends Serializable, PagingAndSortingRepository<AclSid, UUID> {

    // ThorAPI Generated search methods for each property on AclSid
    /** Find a AclSid by sid with pagination
        sid ** | **String** |  |  [optional]
        * @param sid String  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclSid>
    */
    public Page<AclSid> findBySid(String sid, Pageable pageable);
    /** Find a AclSid by principal with pagination
        principal ** | **UUID** |  |  [optional]
        * @param principal UUID  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclSid>
    */
    public Page<AclSid> findByPrincipal(UUID principal, Pageable pageable);
    /** Find a AclSid by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<AclSid>
    */
    public Page<AclSid> findById(UUID id, Pageable pageable);
    /** Find a AclSid by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<AclSid>
    */
    public Page<AclSid> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a AclSid by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<AclSid>
    */
    public Page<AclSid> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a AclSid by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<AclSid>
    */
    public Page<AclSid> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a AclSid by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<AclSid>
    */
    public Page<AclSid> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a AclSid by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<AclSid>
    */
    public Page<AclSid> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a AclSid by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<AclSid>
    */
    public Page<AclSid> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a AclSid by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<AclSid>
    */
    public Page<AclSid> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of AclSid as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of AclSid instances
     */
    List<AclSid> findAll();

    /** 
     * Find all instances of AclSid with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of AclSid instances
     */
    Page<AclSid> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<AclSid> findAll(Example<AclSid> example, Pageable pageable);

    // end search methods
}
