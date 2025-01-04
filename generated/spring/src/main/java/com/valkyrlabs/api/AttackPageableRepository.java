package com.valkyrlabs.api;

import com.valkyrlabs.model.Attack;

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
import com.valkyrlabs.model.Weapon;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: AttackRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface AttackPageableRepository extends Serializable, PagingAndSortingRepository<Attack, UUID> {

    // ThorAPI Generated search methods for each property on Attack
    /** Find a Attack by name with pagination
        name ** | **String** | the name of the attack |  [optional]
        * @param name String the name of the attack 
        * @param pageable pagination configuration
        * @return Page<Attack>
    */
    public Page<Attack> findByName(String name, Pageable pageable);
    /** Find a Attack by type with pagination
        type ** | [**TypeEnum**](#TypeEnum) |  |  [optional]
        * @param type TypeEnum  
        * @param pageable pagination configuration
        * @return Page<Attack>
    */
    public Page<Attack> findByType(Attack.TypeEnum type, Pageable pageable);
    /** Find a Attack by weapon with pagination
        weapon ** | [**Weapon**](Weapon.md) |  |  [optional]
        * @param weapon Weapon  
        * @param pageable pagination configuration
        * @return Page<Attack>
    */
    public Page<Attack> findByWeapon(Weapon weapon, Pageable pageable);
    /** Find a Attack by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Attack>
    */
    public Page<Attack> findById(UUID id, Pageable pageable);
    /** Find a Attack by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Attack>
    */
    public Page<Attack> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Attack by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Attack>
    */
    public Page<Attack> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Attack by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Attack>
    */
    public Page<Attack> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Attack by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Attack>
    */
    public Page<Attack> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Attack by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Attack>
    */
    public Page<Attack> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Attack by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Attack>
    */
    public Page<Attack> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Attack by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Attack>
    */
    public Page<Attack> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Attack as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Attack instances
     */
    List<Attack> findAll();

    /** 
     * Find all instances of Attack with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Attack instances
     */
    Page<Attack> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Attack> findAll(Example<Attack> example, Pageable pageable);

    // end search methods
}
