package com.valkyrlabs.api;

import com.valkyrlabs.model.Authority;

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

    AUTO IMPLEMENTED by Spring as bean: AuthorityRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface AuthorityRepository extends Serializable, JpaRepository<Authority, UUID> {

    // ThorAPI Generated search methods for each property on Authority
    /** Find a Authority by principalId 
        principalId ** | **UUID** |  |  [optional]
        * @param principalId UUID  
        * @return List<Authority>
    */
    // nullable
    public List<Authority>  findAuthorityByPrincipalId (  UUID principalId);
    /** Find a Authority by username 
        username ** | **String** |  | 
        * @param username String  
        * @return List<Authority>
    */
    // nullable
    public List<Authority>  findAuthorityByUsername (  String username);
    /** Find a Authority by authority 
        authority ** | **String** |  | 
        * @param authority String  
        * @return List<Authority>
    */
    // nullable
    public List<Authority>  findAuthorityByAuthority (  String authority);
    /** Find a Authority by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Authority>
    */
    // nullable
    public List<Authority>  findAuthorityById (  UUID id);
    /** Find a Authority by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Authority>
    */
    // nullable
    public List<Authority>  findAuthorityByOwnerId (  UUID ownerId);
    /** Find a Authority by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Authority>
    */
    // nullable
    public List<Authority>  findAuthorityByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Authority by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Authority>
    */
    // nullable
    public List<Authority>  findAuthorityByKeyHash (  String keyHash);
    /** Find a Authority by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Authority>
    */
    // nullable
    public List<Authority>  findAuthorityByLastAccessedById (  UUID lastAccessedById);
    /** Find a Authority by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Authority>
    */
    // nullable
    public List<Authority>  findAuthorityByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Authority by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Authority>
    */
    // nullable
    public List<Authority>  findAuthorityByLastModifiedById (  UUID lastModifiedById);
    /** Find a Authority by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Authority>
    */
    // nullable
    public List<Authority>  findAuthorityByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
