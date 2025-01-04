package com.valkyrlabs.api;

import com.valkyrlabs.model.AclSid;

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

    AUTO IMPLEMENTED by Spring as bean: AclSidRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface AclSidRepository extends Serializable, JpaRepository<AclSid, UUID> {

    // ThorAPI Generated search methods for each property on AclSid
    /** Find a AclSid by sid 
        sid ** | **String** |  |  [optional]
        * @param sid String  (nullable)
        * @return List<AclSid>
    */
    // nullable
    public List<AclSid>  findAclSidBySid (  JsonNullable<@Size(max = 245) String> sid);
    /** Find a AclSid by principal 
        principal ** | **UUID** |  |  [optional]
        * @param principal UUID  (nullable)
        * @return List<AclSid>
    */
    // nullable
    public List<AclSid>  findAclSidByPrincipal (  JsonNullable<UUID> principal);
    /** Find a AclSid by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<AclSid>
    */
    // nullable
    public List<AclSid>  findAclSidById (  UUID id);
    /** Find a AclSid by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<AclSid>
    */
    // nullable
    public List<AclSid>  findAclSidByOwnerId (  UUID ownerId);
    /** Find a AclSid by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<AclSid>
    */
    // nullable
    public List<AclSid>  findAclSidByCreatedDate (  OffsetDateTime createdDate);
    /** Find a AclSid by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<AclSid>
    */
    // nullable
    public List<AclSid>  findAclSidByKeyHash (  String keyHash);
    /** Find a AclSid by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<AclSid>
    */
    // nullable
    public List<AclSid>  findAclSidByLastAccessedById (  UUID lastAccessedById);
    /** Find a AclSid by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<AclSid>
    */
    // nullable
    public List<AclSid>  findAclSidByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a AclSid by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<AclSid>
    */
    // nullable
    public List<AclSid>  findAclSidByLastModifiedById (  UUID lastModifiedById);
    /** Find a AclSid by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<AclSid>
    */
    // nullable
    public List<AclSid>  findAclSidByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
