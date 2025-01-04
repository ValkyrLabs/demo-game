package com.valkyrlabs.api;

import com.valkyrlabs.model.Level;

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

    AUTO IMPLEMENTED by Spring as bean: LevelRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface LevelPageableRepository extends Serializable, PagingAndSortingRepository<Level, UUID> {

    // ThorAPI Generated search methods for each property on Level
    /** Find a Level by name with pagination
        name ** | **String** | the name of level |  [optional]
        * @param name String the name of level 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByName(String name, Pageable pageable);
    /** Find a Level by level with pagination
        level ** | **Integer** | the sequential level index (if applicable) |  [optional]
        * @param level Integer the sequential level index (if applicable) 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByLevel(Integer level, Pageable pageable);
    /** Find a Level by scoreMultiplier with pagination
        scoreMultiplier ** | **Integer** | use to increment extra points for harder levels |  [optional]
        * @param scoreMultiplier Integer use to increment extra points for harder levels 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByScoreMultiplier(Integer scoreMultiplier, Pageable pageable);
    /** Find a Level by color with pagination
        color ** | [**ColorEnum**](#ColorEnum) |  |  [optional]
        * @param color ColorEnum  
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByColor(Level.ColorEnum color, Pageable pageable);
    /** Find a Level by levelType with pagination
        levelType ** | [**LevelTypeEnum**](#LevelTypeEnum) | the type of the level |  [optional]
        * @param levelType LevelTypeEnum the type of the level 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByLevelType(Level.LevelTypeEnum levelType, Pageable pageable);
    /** Find a Level by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findById(UUID id, Pageable pageable);
    /** Find a Level by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Level by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Level by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Level by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Level by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Level by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Level by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Level>
    */
    public Page<Level> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Level as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Level instances
     */
    List<Level> findAll();

    /** 
     * Find all instances of Level with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Level instances
     */
    Page<Level> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Level> findAll(Example<Level> example, Pageable pageable);

    // end search methods
}
