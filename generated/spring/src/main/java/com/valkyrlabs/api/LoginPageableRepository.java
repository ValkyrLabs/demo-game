package com.valkyrlabs.api;

import com.valkyrlabs.model.Login;

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

    AUTO IMPLEMENTED by Spring as bean: LoginRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface LoginPageableRepository extends Serializable, PagingAndSortingRepository<Login, UUID> {

    // ThorAPI Generated search methods for each property on Login
    /** Find a Login by username with pagination
        username ** | **String** |  |  [optional]
        * @param username String  
        * @param pageable pagination configuration
        * @return Page<Login>
    */
    public Page<Login> findByUsername(String username, Pageable pageable);
    /** Find a Login by password with pagination
        password ** | **String** |  |  [optional]
        * @param password String  
        * @param pageable pagination configuration
        * @return Page<Login>
    */
    public Page<Login> findByPassword(String password, Pageable pageable);
    /** Find a Login by description with pagination
        description ** | **String** |  |  [optional]
        * @param description String  
        * @param pageable pagination configuration
        * @return Page<Login>
    */
    public Page<Login> findByDescription(String description, Pageable pageable);
    /** Find a Login by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Login>
    */
    public Page<Login> findById(UUID id, Pageable pageable);
    /** Find a Login by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Login>
    */
    public Page<Login> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Login by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Login>
    */
    public Page<Login> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Login by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Login>
    */
    public Page<Login> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Login by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Login>
    */
    public Page<Login> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Login by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Login>
    */
    public Page<Login> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Login by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Login>
    */
    public Page<Login> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Login by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Login>
    */
    public Page<Login> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Login as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Login instances
     */
    List<Login> findAll();

    /** 
     * Find all instances of Login with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Login instances
     */
    Page<Login> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Login> findAll(Example<Login> example, Pageable pageable);

    // end search methods
}
