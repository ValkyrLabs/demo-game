package com.valkyrlabs.api;

import com.valkyrlabs.model.AclEntry;

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

    AUTO IMPLEMENTED by Spring as bean: AclEntryRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface AclEntryRepository extends Serializable, JpaRepository<AclEntry, UUID> {

    // ThorAPI Generated search methods for each property on AclEntry
    /** Find a AclEntry by aclObjectOdentity 
        aclObjectOdentity ** | **UUID** |  |  [optional]
        * @param aclObjectOdentity UUID  (nullable)
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByAclObjectOdentity (  JsonNullable<UUID> aclObjectOdentity);
    /** Find a AclEntry by aceOrder 
        aceOrder ** | **Integer** |  |  [optional]
        * @param aceOrder Integer  (nullable)
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByAceOrder (  JsonNullable<Integer> aceOrder);
    /** Find a AclEntry by sid 
        sid ** | **UUID** |  |  [optional]
        * @param sid UUID  (nullable)
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryBySid (  JsonNullable<UUID> sid);
    /** Find a AclEntry by mask 
        mask ** | **Integer** |  |  [optional]
        * @param mask Integer  (nullable)
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByMask (  JsonNullable<Integer> mask);
    /** Find a AclEntry by granting 
        granting ** | **Integer** |  |  [optional]
        * @param granting Integer  (nullable)
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByGranting (  JsonNullable<Integer> granting);
    /** Find a AclEntry by auditSuccess 
        auditSuccess ** | **Integer** |  |  [optional]
        * @param auditSuccess Integer  (nullable)
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByAuditSuccess (  JsonNullable<Integer> auditSuccess);
    /** Find a AclEntry by auditFailure 
        auditFailure ** | **Integer** |  |  [optional]
        * @param auditFailure Integer  (nullable)
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByAuditFailure (  JsonNullable<Integer> auditFailure);
    /** Find a AclEntry by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryById (  UUID id);
    /** Find a AclEntry by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByOwnerId (  UUID ownerId);
    /** Find a AclEntry by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByCreatedDate (  OffsetDateTime createdDate);
    /** Find a AclEntry by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByKeyHash (  String keyHash);
    /** Find a AclEntry by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByLastAccessedById (  UUID lastAccessedById);
    /** Find a AclEntry by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a AclEntry by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByLastModifiedById (  UUID lastModifiedById);
    /** Find a AclEntry by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<AclEntry>
    */
    // nullable
    public List<AclEntry>  findAclEntryByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
