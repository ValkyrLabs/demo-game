package com.valkyrlabs.api;

import com.valkyrlabs.model.Logout;

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

    AUTO IMPLEMENTED by Spring as bean: LogoutRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface LogoutPageableRepository extends Serializable, PagingAndSortingRepository<Logout, UUID> {

    // ThorAPI Generated search methods for each property on Logout
    /** Find a Logout by description with pagination
        description ** | **String** |  |  [optional]
        * @param description String  
        * @param pageable pagination configuration
        * @return Page<Logout>
    */
    public Page<Logout> findByDescription(String description, Pageable pageable);
    /** Find a Logout by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Logout>
    */
    public Page<Logout> findById(UUID id, Pageable pageable);
    /** Find a Logout by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Logout>
    */
    public Page<Logout> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Logout by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Logout>
    */
    public Page<Logout> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Logout by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Logout>
    */
    public Page<Logout> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Logout by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Logout>
    */
    public Page<Logout> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Logout by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Logout>
    */
    public Page<Logout> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Logout by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Logout>
    */
    public Page<Logout> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Logout by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Logout>
    */
    public Page<Logout> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Logout as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Logout instances
     */
    List<Logout> findAll();

    /** 
     * Find all instances of Logout with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Logout instances
     */
    Page<Logout> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Logout> findAll(Example<Logout> example, Pageable pageable);

    // end search methods
}
