package com.valkyrlabs.api;

import com.valkyrlabs.model.Game;

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
import com.valkyrlabs.model.GameWeaponIDX;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: GameRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface GamePageableRepository extends Serializable, PagingAndSortingRepository<Game, UUID> {

    // ThorAPI Generated search methods for each property on Game
    /** Find a Game by name with pagination
        name ** | **String** | the name of the game |  [optional]
        * @param name String the name of the game 
        * @param pageable pagination configuration
        * @return Page<Game>
    */
    public Page<Game> findByName(String name, Pageable pageable);
    /** Find a Game by weapons with pagination
        weapons ** | [**List<GameWeaponIDX>**](GameWeaponIDX.md) |  |  [optional]
        * @param weapons List&lt;@Valid GameWeaponIDX&gt;  
        * @param pageable pagination configuration
        * @return Page<Game>
    */
    public Page<Game> findByWeapons(List<@Valid GameWeaponIDX> weapons, Pageable pageable);
    /** Find a Game by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Game>
    */
    public Page<Game> findById(UUID id, Pageable pageable);
    /** Find a Game by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Game>
    */
    public Page<Game> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Game by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Game>
    */
    public Page<Game> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Game by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Game>
    */
    public Page<Game> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Game by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Game>
    */
    public Page<Game> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Game by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Game>
    */
    public Page<Game> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Game by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Game>
    */
    public Page<Game> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Game by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Game>
    */
    public Page<Game> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Game as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Game instances
     */
    List<Game> findAll();

    /** 
     * Find all instances of Game with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Game instances
     */
    Page<Game> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Game> findAll(Example<Game> example, Pageable pageable);

    // end search methods
}
