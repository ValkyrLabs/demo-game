package com.valkyrlabs.api;

import com.valkyrlabs.model.GameWeaponIDX;

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

    AUTO IMPLEMENTED by Spring as bean: GameWeaponIDXRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface GameWeaponIDXPageableRepository extends Serializable, PagingAndSortingRepository<GameWeaponIDX, UUID> {

    // ThorAPI Generated search methods for each property on GameWeaponIDX
    /** Find a GameWeaponIDX by gameId with pagination
        gameId ** | **UUID** |  |  [optional]
        * @param gameId UUID  
        * @param pageable pagination configuration
        * @return Page<GameWeaponIDX>
    */
    public Page<GameWeaponIDX> findByGameId(UUID gameId, Pageable pageable);
    /** Find a GameWeaponIDX by weaponId with pagination
        weaponId ** | **UUID** |  |  [optional]
        * @param weaponId UUID  
        * @param pageable pagination configuration
        * @return Page<GameWeaponIDX>
    */
    public Page<GameWeaponIDX> findByWeaponId(UUID weaponId, Pageable pageable);
    /** Find a GameWeaponIDX by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<GameWeaponIDX>
    */
    public Page<GameWeaponIDX> findById(UUID id, Pageable pageable);
    /** Find a GameWeaponIDX by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<GameWeaponIDX>
    */
    public Page<GameWeaponIDX> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a GameWeaponIDX by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<GameWeaponIDX>
    */
    public Page<GameWeaponIDX> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a GameWeaponIDX by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<GameWeaponIDX>
    */
    public Page<GameWeaponIDX> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a GameWeaponIDX by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<GameWeaponIDX>
    */
    public Page<GameWeaponIDX> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a GameWeaponIDX by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<GameWeaponIDX>
    */
    public Page<GameWeaponIDX> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a GameWeaponIDX by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<GameWeaponIDX>
    */
    public Page<GameWeaponIDX> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a GameWeaponIDX by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<GameWeaponIDX>
    */
    public Page<GameWeaponIDX> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of GameWeaponIDX as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of GameWeaponIDX instances
     */
    List<GameWeaponIDX> findAll();

    /** 
     * Find all instances of GameWeaponIDX with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of GameWeaponIDX instances
     */
    Page<GameWeaponIDX> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<GameWeaponIDX> findAll(Example<GameWeaponIDX> example, Pageable pageable);

    // end search methods
}
