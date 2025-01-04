package com.valkyrlabs.api;

import com.valkyrlabs.model.PersistentLogin;

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

    AUTO IMPLEMENTED by Spring as bean: PersistentLoginRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface PersistentLoginRepository extends Serializable, JpaRepository<PersistentLogin, UUID> {

    // ThorAPI Generated search methods for each property on PersistentLogin
    /** Find a PersistentLogin by username 
        username ** | **String** |  | 
        * @param username String  
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginByUsername (  String username);
    /** Find a PersistentLogin by series 
        series ** | **String** |  | 
        * @param series String  
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginBySeries (  String series);
    /** Find a PersistentLogin by token 
        token ** | **String** |  | 
        * @param token String  
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginByToken (  String token);
    /** Find a PersistentLogin by lastUsed 
        lastUsed ** | **OffsetDateTime** |  |  [optional]
        * @param lastUsed OffsetDateTime  
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginByLastUsed (  OffsetDateTime lastUsed);
    /** Find a PersistentLogin by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginById (  UUID id);
    /** Find a PersistentLogin by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginByOwnerId (  UUID ownerId);
    /** Find a PersistentLogin by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginByCreatedDate (  OffsetDateTime createdDate);
    /** Find a PersistentLogin by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginByKeyHash (  String keyHash);
    /** Find a PersistentLogin by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginByLastAccessedById (  UUID lastAccessedById);
    /** Find a PersistentLogin by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a PersistentLogin by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginByLastModifiedById (  UUID lastModifiedById);
    /** Find a PersistentLogin by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<PersistentLogin>
    */
    // nullable
    public List<PersistentLogin>  findPersistentLoginByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
