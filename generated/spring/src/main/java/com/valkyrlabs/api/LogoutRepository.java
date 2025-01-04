package com.valkyrlabs.api;

import com.valkyrlabs.model.Logout;

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

    AUTO IMPLEMENTED by Spring as bean: LogoutRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface LogoutRepository extends Serializable, JpaRepository<Logout, UUID> {

    // ThorAPI Generated search methods for each property on Logout
    /** Find a Logout by description 
        description ** | **String** |  |  [optional]
        * @param description String  
        * @return List<Logout>
    */
    // nullable
    public List<Logout>  findLogoutByDescription (  String description);
    /** Find a Logout by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Logout>
    */
    // nullable
    public List<Logout>  findLogoutById (  UUID id);
    /** Find a Logout by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Logout>
    */
    // nullable
    public List<Logout>  findLogoutByOwnerId (  UUID ownerId);
    /** Find a Logout by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Logout>
    */
    // nullable
    public List<Logout>  findLogoutByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Logout by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Logout>
    */
    // nullable
    public List<Logout>  findLogoutByKeyHash (  String keyHash);
    /** Find a Logout by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Logout>
    */
    // nullable
    public List<Logout>  findLogoutByLastAccessedById (  UUID lastAccessedById);
    /** Find a Logout by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Logout>
    */
    // nullable
    public List<Logout>  findLogoutByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Logout by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Logout>
    */
    // nullable
    public List<Logout>  findLogoutByLastModifiedById (  UUID lastModifiedById);
    /** Find a Logout by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Logout>
    */
    // nullable
    public List<Logout>  findLogoutByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
