package com.valkyrlabs.api;

import com.valkyrlabs.model.Authority;

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

    AUTO IMPLEMENTED by Spring as bean: AuthorityRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface AuthorityPageableRepository extends Serializable, PagingAndSortingRepository<Authority, UUID> {

    // ThorAPI Generated search methods for each property on Authority
    /** Find a Authority by principalId with pagination
        principalId ** | **UUID** |  |  [optional]
        * @param principalId UUID  
        * @param pageable pagination configuration
        * @return Page<Authority>
    */
    public Page<Authority> findByPrincipalId(UUID principalId, Pageable pageable);
    /** Find a Authority by username with pagination
        username ** | **String** |  | 
        * @param username String  
        * @param pageable pagination configuration
        * @return Page<Authority>
    */
    public Page<Authority> findByUsername(String username, Pageable pageable);
    /** Find a Authority by authority with pagination
        authority ** | **String** |  | 
        * @param authority String  
        * @param pageable pagination configuration
        * @return Page<Authority>
    */
    public Page<Authority> findByAuthority(String authority, Pageable pageable);
    /** Find a Authority by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Authority>
    */
    public Page<Authority> findById(UUID id, Pageable pageable);
    /** Find a Authority by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Authority>
    */
    public Page<Authority> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Authority by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Authority>
    */
    public Page<Authority> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Authority by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Authority>
    */
    public Page<Authority> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Authority by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Authority>
    */
    public Page<Authority> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Authority by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Authority>
    */
    public Page<Authority> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Authority by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Authority>
    */
    public Page<Authority> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Authority by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Authority>
    */
    public Page<Authority> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Authority as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Authority instances
     */
    List<Authority> findAll();

    /** 
     * Find all instances of Authority with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Authority instances
     */
    Page<Authority> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Authority> findAll(Example<Authority> example, Pageable pageable);

    // end search methods
}
