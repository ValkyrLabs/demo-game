package com.valkyrlabs.api;

import com.valkyrlabs.model.AclClass;

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
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: AclClassRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface AclClassRepository extends Serializable, JpaRepository<AclClass, UUID> {

    // ThorAPI Generated search methods for each property on AclClass
    /** Find a AclClass by className 
        className ** | **String** |  |  [optional]
        * @param className String  (nullable)
        * @return List<AclClass>
    */
    // nullable
    public List<AclClass>  findAclClassByClassName (  JsonNullable<@Size(max = 245) String> className);
    /** Find a AclClass by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<AclClass>
    */
    // nullable
    public List<AclClass>  findAclClassById (  UUID id);
    /** Find a AclClass by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<AclClass>
    */
    // nullable
    public List<AclClass>  findAclClassByOwnerId (  UUID ownerId);
    /** Find a AclClass by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<AclClass>
    */
    // nullable
    public List<AclClass>  findAclClassByCreatedDate (  OffsetDateTime createdDate);
    /** Find a AclClass by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<AclClass>
    */
    // nullable
    public List<AclClass>  findAclClassByKeyHash (  String keyHash);
    /** Find a AclClass by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<AclClass>
    */
    // nullable
    public List<AclClass>  findAclClassByLastAccessedById (  UUID lastAccessedById);
    /** Find a AclClass by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<AclClass>
    */
    // nullable
    public List<AclClass>  findAclClassByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a AclClass by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<AclClass>
    */
    // nullable
    public List<AclClass>  findAclClassByLastModifiedById (  UUID lastModifiedById);
    /** Find a AclClass by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<AclClass>
    */
    // nullable
    public List<AclClass>  findAclClassByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
