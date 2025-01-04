package com.valkyrlabs.api;

import com.valkyrlabs.model.SecureKey;

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

    AUTO IMPLEMENTED by Spring as bean: SecureKeyRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface SecureKeyPageableRepository extends Serializable, PagingAndSortingRepository<SecureKey, UUID> {

    // ThorAPI Generated search methods for each property on SecureKey
    /** Find a SecureKey by notes with pagination
        notes ** | **String** | any notes about the key |  [optional]
        * @param notes String any notes about the key 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByNotes(String notes, Pageable pageable);
    /** Find a SecureKey by algorithm with pagination
        algorithm ** | **String** | the algorithm used for encryption/decryption | 
        * @param algorithm String the algorithm used for encryption/decryption 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByAlgorithm(String algorithm, Pageable pageable);
    /** Find a SecureKey by version with pagination
        version ** | **String** | the version of this key | 
        * @param version String the version of this key 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByVersion(String version, Pageable pageable);
    /** Find a SecureKey by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a SecureKey by cipherWorkCost with pagination
        cipherWorkCost ** | **Integer** | the exponential strength of the BCrypt hashing used by the Hashing cipher |  [optional]
        * @param cipherWorkCost Integer the exponential strength of the BCrypt hashing used by the Hashing cipher 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByCipherWorkCost(Integer cipherWorkCost, Pageable pageable);
    /** Find a SecureKey by keyValue with pagination
        keyValue ** | **String** | the key itself | 
        * @param keyValue String the key itself 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByKeyValue(String keyValue, Pageable pageable);
    /** Find a SecureKey by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) |  | 
        * @param status StatusEnum  
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByStatus(SecureKey.StatusEnum status, Pageable pageable);
    /** Find a SecureKey by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findById(UUID id, Pageable pageable);
    /** Find a SecureKey by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a SecureKey by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a SecureKey by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a SecureKey by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a SecureKey by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a SecureKey by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<SecureKey>
    */
    public Page<SecureKey> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of SecureKey as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of SecureKey instances
     */
    List<SecureKey> findAll();

    /** 
     * Find all instances of SecureKey with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of SecureKey instances
     */
    Page<SecureKey> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<SecureKey> findAll(Example<SecureKey> example, Pageable pageable);

    // end search methods
}
