package com.valkyrlabs.api;

import com.valkyrlabs.model.Level;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
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
// @Transactional(readOnly=false)
public interface LevelRepository extends Serializable, JpaRepository<Level, UUID> {

    // ThorAPI Generated search methods for each property on Level
    /** Find a Level by name 
        name ** | **String** | the name of level |  [optional]
        * @param name String the name of level 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByName (  String name);
    /** Find a Level by level 
        level ** | **Integer** | the sequential level index (if applicable) |  [optional]
        * @param level Integer the sequential level index (if applicable) 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByLevel (  Integer level);
    /** Find a Level by scoreMultiplier 
        scoreMultiplier ** | **Integer** | use to increment extra points for harder levels |  [optional]
        * @param scoreMultiplier Integer use to increment extra points for harder levels 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByScoreMultiplier (  Integer scoreMultiplier);
    /** Find a Level by color 
        color ** | [**ColorEnum**](#ColorEnum) |  |  [optional]
        * @param color ColorEnum  
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByColor ( Level.ColorEnum color);
    /** Find a Level by levelType 
        levelType ** | [**LevelTypeEnum**](#LevelTypeEnum) | the type of the level |  [optional]
        * @param levelType LevelTypeEnum the type of the level 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByLevelType ( Level.LevelTypeEnum levelType);
    /** Find a Level by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelById (  UUID id);
    /** Find a Level by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByOwnerId (  UUID ownerId);
    /** Find a Level by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Level by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByKeyHash (  String keyHash);
    /** Find a Level by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByLastAccessedById (  UUID lastAccessedById);
    /** Find a Level by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Level by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByLastModifiedById (  UUID lastModifiedById);
    /** Find a Level by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Level>
    */
    // nullable
    public List<Level>  findLevelByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
