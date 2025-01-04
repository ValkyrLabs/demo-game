package com.valkyrlabs.api;

import com.valkyrlabs.model.AclEntry;

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

    AUTO IMPLEMENTED by Spring as bean: AclEntryRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface AclEntryPageableRepository extends Serializable, PagingAndSortingRepository<AclEntry, UUID> {

    // ThorAPI Generated search methods for each property on AclEntry
    /** Find a AclEntry by aclObjectOdentity with pagination
        aclObjectOdentity ** | **UUID** |  |  [optional]
        * @param aclObjectOdentity UUID  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByAclObjectOdentity(UUID aclObjectOdentity, Pageable pageable);
    /** Find a AclEntry by aceOrder with pagination
        aceOrder ** | **Integer** |  |  [optional]
        * @param aceOrder Integer  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByAceOrder(Integer aceOrder, Pageable pageable);
    /** Find a AclEntry by sid with pagination
        sid ** | **UUID** |  |  [optional]
        * @param sid UUID  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findBySid(UUID sid, Pageable pageable);
    /** Find a AclEntry by mask with pagination
        mask ** | **Integer** |  |  [optional]
        * @param mask Integer  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByMask(Integer mask, Pageable pageable);
    /** Find a AclEntry by granting with pagination
        granting ** | **Integer** |  |  [optional]
        * @param granting Integer  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByGranting(Integer granting, Pageable pageable);
    /** Find a AclEntry by auditSuccess with pagination
        auditSuccess ** | **Integer** |  |  [optional]
        * @param auditSuccess Integer  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByAuditSuccess(Integer auditSuccess, Pageable pageable);
    /** Find a AclEntry by auditFailure with pagination
        auditFailure ** | **Integer** |  |  [optional]
        * @param auditFailure Integer  (nullable)
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByAuditFailure(Integer auditFailure, Pageable pageable);
    /** Find a AclEntry by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findById(UUID id, Pageable pageable);
    /** Find a AclEntry by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a AclEntry by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a AclEntry by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a AclEntry by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a AclEntry by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a AclEntry by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a AclEntry by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<AclEntry>
    */
    public Page<AclEntry> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of AclEntry as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of AclEntry instances
     */
    List<AclEntry> findAll();

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<AclEntry> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<AclEntry> findAll(Example<AclEntry> example, Pageable pageable);

    // end search methods
}
