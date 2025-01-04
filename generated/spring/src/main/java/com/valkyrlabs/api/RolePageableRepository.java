package com.valkyrlabs.api;

import com.valkyrlabs.model.Role;

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

    AUTO IMPLEMENTED by Spring as bean: RoleRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface RolePageableRepository extends Serializable, PagingAndSortingRepository<Role, UUID> {

    // ThorAPI Generated search methods for each property on Role
    /** Find a Role by principalId with pagination
        principalId ** | **UUID** |  |  [optional]
        * @param principalId UUID  
        * @param pageable pagination configuration
        * @return Page<Role>
    */
    public Page<Role> findByPrincipalId(UUID principalId, Pageable pageable);
    /** Find a Role by roleName with pagination
        roleName ** | [**RoleNameEnum**](#RoleNameEnum) | the role |  [optional]
        * @param roleName RoleNameEnum the role 
        * @param pageable pagination configuration
        * @return Page<Role>
    */
    public Page<Role> findByRoleName(Role.RoleNameEnum roleName, Pageable pageable);
    /** Find a Role by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Role>
    */
    public Page<Role> findById(UUID id, Pageable pageable);
    /** Find a Role by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Role>
    */
    public Page<Role> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Role by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Role>
    */
    public Page<Role> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Role by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Role>
    */
    public Page<Role> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Role by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Role>
    */
    public Page<Role> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Role by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Role>
    */
    public Page<Role> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Role by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Role>
    */
    public Page<Role> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Role by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Role>
    */
    public Page<Role> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Role as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Role instances
     */
    List<Role> findAll();

    /** 
     * Find all instances of Role with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Role instances
     */
    Page<Role> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Role> findAll(Example<Role> example, Pageable pageable);

    // end search methods
}
