package com.valkyrlabs.api;

import com.valkyrlabs.model.SecureKey;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: SecureKeyRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface SecureKeyRepository extends Serializable, JpaRepository<SecureKey, UUID> {

    // ThorAPI Generated search methods for each property on SecureKey
    /** Find a SecureKey by notes 
        notes ** | **String** | any notes about the key |  [optional]
        * @param notes String any notes about the key 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByNotes (  String notes);
    /** Find a SecureKey by algorithm 
        algorithm ** | **String** | the algorithm used for encryption/decryption | 
        * @param algorithm String the algorithm used for encryption/decryption 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByAlgorithm (  String algorithm);
    /** Find a SecureKey by version 
        version ** | **String** | the version of this key | 
        * @param version String the version of this key 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByVersion (  String version);
    /** Find a SecureKey by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByKeyHash (  String keyHash);
    /** Find a SecureKey by cipherWorkCost 
        cipherWorkCost ** | **Integer** | the exponential strength of the BCrypt hashing used by the Hashing cipher |  [optional]
        * @param cipherWorkCost Integer the exponential strength of the BCrypt hashing used by the Hashing cipher 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByCipherWorkCost (  Integer cipherWorkCost);
    /** Find a SecureKey by keyValue 
        keyValue ** | **String** | the key itself | 
        * @param keyValue String the key itself 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByKeyValue (  String keyValue);
    /** Find a SecureKey by status 
        status ** | [**StatusEnum**](#StatusEnum) |  | 
        * @param status StatusEnum  
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByStatus ( SecureKey.StatusEnum status);
    /** Find a SecureKey by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyById (  UUID id);
    /** Find a SecureKey by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByOwnerId (  UUID ownerId);
    /** Find a SecureKey by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByCreatedDate (  OffsetDateTime createdDate);
    /** Find a SecureKey by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByLastAccessedById (  UUID lastAccessedById);
    /** Find a SecureKey by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a SecureKey by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByLastModifiedById (  UUID lastModifiedById);
    /** Find a SecureKey by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<SecureKey>
    */
    // nullable
    public List<SecureKey>  findSecureKeyByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
