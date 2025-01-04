package com.valkyrlabs.api;

import com.valkyrlabs.model.Weapon;

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
import com.valkyrlabs.model.GameWeaponIDX;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: WeaponRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface WeaponPageableRepository extends Serializable, PagingAndSortingRepository<Weapon, UUID> {

    // ThorAPI Generated search methods for each property on Weapon
    /** Find a Weapon by attackId with pagination
        attackId ** | **UUID** |  |  [optional]
        * @param attackId UUID  
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByAttackId(UUID attackId, Pageable pageable);
    /** Find a Weapon by name with pagination
        name ** | **String** | the name of the weapon |  [optional]
        * @param name String the name of the weapon 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByName(String name, Pageable pageable);
    /** Find a Weapon by game with pagination
        game ** | [**GameWeaponIDX**](GameWeaponIDX.md) |  |  [optional]
        * @param game GameWeaponIDX  
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByGame(GameWeaponIDX game, Pageable pageable);
    /** Find a Weapon by harmLevel with pagination
        harmLevel ** | **Integer** | the the damage output level the weapon can have |  [optional]
        * @param harmLevel Integer the the damage output level the weapon can have 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByHarmLevel(Integer harmLevel, Pageable pageable);
    /** Find a Weapon by weight with pagination
        weight ** | **Integer** | how much one of these weapons weighs in lbs |  [optional]
        * @param weight Integer how much one of these weapons weighs in lbs 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByWeight(Integer weight, Pageable pageable);
    /** Find a Weapon by color with pagination
        color ** | [**ColorEnum**](#ColorEnum) |  |  [optional]
        * @param color ColorEnum  
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByColor(Weapon.ColorEnum color, Pageable pageable);
    /** Find a Weapon by weaponType with pagination
        weaponType ** | [**WeaponTypeEnum**](#WeaponTypeEnum) | the type of the weapon |  [optional]
        * @param weaponType WeaponTypeEnum the type of the weapon 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByWeaponType(Weapon.WeaponTypeEnum weaponType, Pageable pageable);
    /** Find a Weapon by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findById(UUID id, Pageable pageable);
    /** Find a Weapon by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Weapon by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Weapon by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Weapon by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Weapon by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Weapon by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Weapon by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Weapon>
    */
    public Page<Weapon> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Weapon as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Weapon instances
     */
    List<Weapon> findAll();

    /** 
     * Find all instances of Weapon with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Weapon instances
     */
    Page<Weapon> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Weapon> findAll(Example<Weapon> example, Pageable pageable);

    // end search methods
}
