package com.valkyrlabs.api;

import com.valkyrlabs.model.AclObjectIdentity;

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

    AUTO IMPLEMENTED by Spring as bean: AclObjectIdentityRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface AclObjectIdentityRepository extends Serializable, JpaRepository<AclObjectIdentity, UUID> {

    // ThorAPI Generated search methods for each property on AclObjectIdentity
    /** Find a AclObjectIdentity by objectIdClass 
        objectIdClass ** | **UUID** |  |  [optional]
        * @param objectIdClass UUID  (nullable)
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByObjectIdClass (  JsonNullable<UUID> objectIdClass);
    /** Find a AclObjectIdentity by objectIdIdentity 
        objectIdIdentity ** | **UUID** |  |  [optional]
        * @param objectIdIdentity UUID  (nullable)
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByObjectIdIdentity (  JsonNullable<UUID> objectIdIdentity);
    /** Find a AclObjectIdentity by parentObject 
        parentObject ** | **UUID** |  |  [optional]
        * @param parentObject UUID  (nullable)
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByParentObject (  JsonNullable<UUID> parentObject);
    /** Find a AclObjectIdentity by ownerSid 
        ownerSid ** | **UUID** |  |  [optional]
        * @param ownerSid UUID  (nullable)
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByOwnerSid (  JsonNullable<UUID> ownerSid);
    /** Find a AclObjectIdentity by entriesInheriting 
        entriesInheriting ** | **Integer** |  |  [optional]
        * @param entriesInheriting Integer  (nullable)
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByEntriesInheriting (  JsonNullable<Integer> entriesInheriting);
    /** Find a AclObjectIdentity by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityById (  UUID id);
    /** Find a AclObjectIdentity by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByOwnerId (  UUID ownerId);
    /** Find a AclObjectIdentity by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByCreatedDate (  OffsetDateTime createdDate);
    /** Find a AclObjectIdentity by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByKeyHash (  String keyHash);
    /** Find a AclObjectIdentity by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByLastAccessedById (  UUID lastAccessedById);
    /** Find a AclObjectIdentity by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a AclObjectIdentity by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByLastModifiedById (  UUID lastModifiedById);
    /** Find a AclObjectIdentity by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<AclObjectIdentity>
    */
    // nullable
    public List<AclObjectIdentity>  findAclObjectIdentityByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
