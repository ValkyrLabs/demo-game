package com.valkyrlabs.api;

import com.valkyrlabs.model.Login;

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

    AUTO IMPLEMENTED by Spring as bean: LoginRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface LoginRepository extends Serializable, JpaRepository<Login, UUID> {

    // ThorAPI Generated search methods for each property on Login
    /** Find a Login by username 
        username ** | **String** |  |  [optional]
        * @param username String  
        * @return List<Login>
    */
    // nullable
    public List<Login>  findLoginByUsername (  String username);
    /** Find a Login by password 
        password ** | **String** |  |  [optional]
        * @param password String  
        * @return List<Login>
    */
    // nullable
    public List<Login>  findLoginByPassword (  String password);
    /** Find a Login by description 
        description ** | **String** |  |  [optional]
        * @param description String  
        * @return List<Login>
    */
    // nullable
    public List<Login>  findLoginByDescription (  String description);
    /** Find a Login by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Login>
    */
    // nullable
    public List<Login>  findLoginById (  UUID id);
    /** Find a Login by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Login>
    */
    // nullable
    public List<Login>  findLoginByOwnerId (  UUID ownerId);
    /** Find a Login by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Login>
    */
    // nullable
    public List<Login>  findLoginByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Login by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Login>
    */
    // nullable
    public List<Login>  findLoginByKeyHash (  String keyHash);
    /** Find a Login by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Login>
    */
    // nullable
    public List<Login>  findLoginByLastAccessedById (  UUID lastAccessedById);
    /** Find a Login by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Login>
    */
    // nullable
    public List<Login>  findLoginByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Login by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Login>
    */
    // nullable
    public List<Login>  findLoginByLastModifiedById (  UUID lastModifiedById);
    /** Find a Login by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Login>
    */
    // nullable
    public List<Login>  findLoginByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
