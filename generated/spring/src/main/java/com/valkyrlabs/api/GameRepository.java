package com.valkyrlabs.api;

import com.valkyrlabs.model.Game;

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
// @Transactional(readOnly=false)
public interface GameRepository extends Serializable, JpaRepository<Game, UUID> {

    // ThorAPI Generated search methods for each property on Game
    /** Find a Game by name 
        name ** | **String** | the name of the game |  [optional]
        * @param name String the name of the game 
        * @return List<Game>
    */
    // nullable
    public List<Game>  findGameByName (  String name);
    /** Find a Game by weapons 
        weapons ** | [**List&lt;GameWeaponIDX&gt;**](GameWeaponIDX.md) |  |  [optional]
        * @param weapons List&lt;@Valid GameWeaponIDX&gt;  
        * @return List<Game>
    */
    // nullable
    public List<Game>  findGameByWeapons (  List<@Valid GameWeaponIDX> weapons);
    /** Find a Game by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Game>
    */
    // nullable
    public List<Game>  findGameById (  UUID id);
    /** Find a Game by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Game>
    */
    // nullable
    public List<Game>  findGameByOwnerId (  UUID ownerId);
    /** Find a Game by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Game>
    */
    // nullable
    public List<Game>  findGameByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Game by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Game>
    */
    // nullable
    public List<Game>  findGameByKeyHash (  String keyHash);
    /** Find a Game by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Game>
    */
    // nullable
    public List<Game>  findGameByLastAccessedById (  UUID lastAccessedById);
    /** Find a Game by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Game>
    */
    // nullable
    public List<Game>  findGameByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Game by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Game>
    */
    // nullable
    public List<Game>  findGameByLastModifiedById (  UUID lastModifiedById);
    /** Find a Game by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Game>
    */
    // nullable
    public List<Game>  findGameByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
