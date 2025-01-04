package com.valkyrlabs.api;

import com.valkyrlabs.model.Weapon;

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
import com.valkyrlabs.model.GameWeaponIDX;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: WeaponRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface WeaponRepository extends Serializable, JpaRepository<Weapon, UUID> {

    // ThorAPI Generated search methods for each property on Weapon
    /** Find a Weapon by attackId 
        attackId ** | **UUID** |  |  [optional]
        * @param attackId UUID  
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByAttackId (  UUID attackId);
    /** Find a Weapon by name 
        name ** | **String** | the name of the weapon |  [optional]
        * @param name String the name of the weapon 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByName (  String name);
    /** Find a Weapon by game 
        game ** | [**GameWeaponIDX**](GameWeaponIDX.md) |  |  [optional]
        * @param game GameWeaponIDX  
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByGame (  GameWeaponIDX game);
    /** Find a Weapon by harmLevel 
        harmLevel ** | **Integer** | the the damage output level the weapon can have |  [optional]
        * @param harmLevel Integer the the damage output level the weapon can have 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByHarmLevel (  Integer harmLevel);
    /** Find a Weapon by weight 
        weight ** | **Integer** | how much one of these weapons weighs in lbs |  [optional]
        * @param weight Integer how much one of these weapons weighs in lbs 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByWeight (  Integer weight);
    /** Find a Weapon by color 
        color ** | [**ColorEnum**](#ColorEnum) |  |  [optional]
        * @param color ColorEnum  
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByColor ( Weapon.ColorEnum color);
    /** Find a Weapon by weaponType 
        weaponType ** | [**WeaponTypeEnum**](#WeaponTypeEnum) | the type of the weapon |  [optional]
        * @param weaponType WeaponTypeEnum the type of the weapon 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByWeaponType ( Weapon.WeaponTypeEnum weaponType);
    /** Find a Weapon by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponById (  UUID id);
    /** Find a Weapon by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByOwnerId (  UUID ownerId);
    /** Find a Weapon by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Weapon by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByKeyHash (  String keyHash);
    /** Find a Weapon by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByLastAccessedById (  UUID lastAccessedById);
    /** Find a Weapon by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Weapon by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByLastModifiedById (  UUID lastModifiedById);
    /** Find a Weapon by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Weapon>
    */
    // nullable
    public List<Weapon>  findWeaponByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
