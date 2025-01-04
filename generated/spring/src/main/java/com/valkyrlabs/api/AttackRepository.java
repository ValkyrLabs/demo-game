package com.valkyrlabs.api;

import com.valkyrlabs.model.Attack;

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
import com.valkyrlabs.model.Weapon;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: AttackRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface AttackRepository extends Serializable, JpaRepository<Attack, UUID> {

    // ThorAPI Generated search methods for each property on Attack
    /** Find a Attack by name 
        name ** | **String** | the name of the attack |  [optional]
        * @param name String the name of the attack 
        * @return List<Attack>
    */
    // nullable
    public List<Attack>  findAttackByName (  String name);
    /** Find a Attack by type 
        type ** | [**TypeEnum**](#TypeEnum) |  |  [optional]
        * @param type TypeEnum  
        * @return List<Attack>
    */
    // nullable
    public List<Attack>  findAttackByType ( Attack.TypeEnum type);
    /** Find a Attack by weapon 
        weapon ** | [**Weapon**](Weapon.md) |  |  [optional]
        * @param weapon Weapon  
        * @return List<Attack>
    */
    // nullable
    public List<Attack>  findAttackByWeapon (  Weapon weapon);
    /** Find a Attack by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Attack>
    */
    // nullable
    public List<Attack>  findAttackById (  UUID id);
    /** Find a Attack by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Attack>
    */
    // nullable
    public List<Attack>  findAttackByOwnerId (  UUID ownerId);
    /** Find a Attack by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Attack>
    */
    // nullable
    public List<Attack>  findAttackByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Attack by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Attack>
    */
    // nullable
    public List<Attack>  findAttackByKeyHash (  String keyHash);
    /** Find a Attack by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Attack>
    */
    // nullable
    public List<Attack>  findAttackByLastAccessedById (  UUID lastAccessedById);
    /** Find a Attack by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Attack>
    */
    // nullable
    public List<Attack>  findAttackByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Attack by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Attack>
    */
    // nullable
    public List<Attack>  findAttackByLastModifiedById (  UUID lastModifiedById);
    /** Find a Attack by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Attack>
    */
    // nullable
    public List<Attack>  findAttackByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
