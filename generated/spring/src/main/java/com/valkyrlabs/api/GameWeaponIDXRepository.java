package com.valkyrlabs.api;

import com.valkyrlabs.model.GameWeaponIDX;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: GameWeaponIDXRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface GameWeaponIDXRepository extends Serializable, JpaRepository<GameWeaponIDX, UUID> {

    // ThorAPI Generated search methods for each property on GameWeaponIDX
    /** Find a GameWeaponIDX by gameId 
        gameId ** | **UUID** |  |  [optional]
        * @param gameId UUID  
        * @return List<GameWeaponIDX>
    */
    // nullable
    public List<GameWeaponIDX>  findGameWeaponIDXByGameId (  UUID gameId);
    /** Find a GameWeaponIDX by weaponId 
        weaponId ** | **UUID** |  |  [optional]
        * @param weaponId UUID  
        * @return List<GameWeaponIDX>
    */
    // nullable
    public List<GameWeaponIDX>  findGameWeaponIDXByWeaponId (  UUID weaponId);
    /** Find a GameWeaponIDX by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<GameWeaponIDX>
    */
    // nullable
    public List<GameWeaponIDX>  findGameWeaponIDXById (  UUID id);
    /** Find a GameWeaponIDX by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<GameWeaponIDX>
    */
    // nullable
    public List<GameWeaponIDX>  findGameWeaponIDXByOwnerId (  UUID ownerId);
    /** Find a GameWeaponIDX by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<GameWeaponIDX>
    */
    // nullable
    public List<GameWeaponIDX>  findGameWeaponIDXByCreatedDate (  OffsetDateTime createdDate);
    /** Find a GameWeaponIDX by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<GameWeaponIDX>
    */
    // nullable
    public List<GameWeaponIDX>  findGameWeaponIDXByKeyHash (  String keyHash);
    /** Find a GameWeaponIDX by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<GameWeaponIDX>
    */
    // nullable
    public List<GameWeaponIDX>  findGameWeaponIDXByLastAccessedById (  UUID lastAccessedById);
    /** Find a GameWeaponIDX by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<GameWeaponIDX>
    */
    // nullable
    public List<GameWeaponIDX>  findGameWeaponIDXByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a GameWeaponIDX by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<GameWeaponIDX>
    */
    // nullable
    public List<GameWeaponIDX>  findGameWeaponIDXByLastModifiedById (  UUID lastModifiedById);
    /** Find a GameWeaponIDX by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<GameWeaponIDX>
    */
    // nullable
    public List<GameWeaponIDX>  findGameWeaponIDXByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
