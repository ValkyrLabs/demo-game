package com.valkyrlabs.api;

import com.valkyrlabs.model.AclObjectIdentity;

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

    AUTO IMPLEMENTED by Spring as bean: AclObjectIdentityRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface AclObjectIdentityPageableRepository extends Serializable, PagingAndSortingRepository<AclObjectIdentity, UUID> {

    // ThorAPI Generated search methods for each property on AclObjectIdentity
    /** Find a AclObjectIdentity by objectIdClass with pagination
        objectIdClass ** | **UUID** |  |  [optional]
        * @param objectIdClass UUID  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByObjectIdClass(UUID objectIdClass, Pageable pageable);
    /** Find a AclObjectIdentity by objectIdIdentity with pagination
        objectIdIdentity ** | **UUID** |  |  [optional]
        * @param objectIdIdentity UUID  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByObjectIdIdentity(UUID objectIdIdentity, Pageable pageable);
    /** Find a AclObjectIdentity by parentObject with pagination
        parentObject ** | **UUID** |  |  [optional]
        * @param parentObject UUID  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByParentObject(UUID parentObject, Pageable pageable);
    /** Find a AclObjectIdentity by ownerSid with pagination
        ownerSid ** | **UUID** |  |  [optional]
        * @param ownerSid UUID  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByOwnerSid(UUID ownerSid, Pageable pageable);
    /** Find a AclObjectIdentity by entriesInheriting with pagination
        entriesInheriting ** | **Integer** |  |  [optional]
        * @param entriesInheriting Integer  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByEntriesInheriting(Integer entriesInheriting, Pageable pageable);
    /** Find a AclObjectIdentity by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findById(UUID id, Pageable pageable);
    /** Find a AclObjectIdentity by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a AclObjectIdentity by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a AclObjectIdentity by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a AclObjectIdentity by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a AclObjectIdentity by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a AclObjectIdentity by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a AclObjectIdentity by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<AclObjectIdentity>
    */
    public Page<AclObjectIdentity> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of AclObjectIdentity as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of AclObjectIdentity instances
     */
    List<AclObjectIdentity> findAll();

    /** 
     * Find all instances of AclObjectIdentity with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of AclObjectIdentity instances
     */
    Page<AclObjectIdentity> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<AclObjectIdentity> findAll(Example<AclObjectIdentity> example, Pageable pageable);

    // end search methods
}
