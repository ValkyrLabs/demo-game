package com.valkyrlabs.api;

import com.valkyrlabs.model.PersistentLogin;

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

    AUTO IMPLEMENTED by Spring as bean: PersistentLoginRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface PersistentLoginPageableRepository extends Serializable, PagingAndSortingRepository<PersistentLogin, UUID> {

    // ThorAPI Generated search methods for each property on PersistentLogin
    /** Find a PersistentLogin by username with pagination
        username ** | **String** |  | 
        * @param username String  
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findByUsername(String username, Pageable pageable);
    /** Find a PersistentLogin by series with pagination
        series ** | **String** |  | 
        * @param series String  
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findBySeries(String series, Pageable pageable);
    /** Find a PersistentLogin by token with pagination
        token ** | **String** |  | 
        * @param token String  
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findByToken(String token, Pageable pageable);
    /** Find a PersistentLogin by lastUsed with pagination
        lastUsed ** | **OffsetDateTime** |  |  [optional]
        * @param lastUsed OffsetDateTime  
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findByLastUsed(OffsetDateTime lastUsed, Pageable pageable);
    /** Find a PersistentLogin by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findById(UUID id, Pageable pageable);
    /** Find a PersistentLogin by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a PersistentLogin by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a PersistentLogin by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a PersistentLogin by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a PersistentLogin by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a PersistentLogin by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a PersistentLogin by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<PersistentLogin>
    */
    public Page<PersistentLogin> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of PersistentLogin as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of PersistentLogin instances
     */
    List<PersistentLogin> findAll();

    /** 
     * Find all instances of PersistentLogin with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of PersistentLogin instances
     */
    Page<PersistentLogin> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<PersistentLogin> findAll(Example<PersistentLogin> example, Pageable pageable);

    // end search methods
}
