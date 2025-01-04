package com.valkyrlabs.api;

import com.valkyrlabs.model.IntegrationAccount;

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

    AUTO IMPLEMENTED by Spring as bean: IntegrationAccountRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface IntegrationAccountRepository extends Serializable, JpaRepository<IntegrationAccount, UUID> {

    // ThorAPI Generated search methods for each property on IntegrationAccount
    /** Find a IntegrationAccount by execModuleId 
        execModuleId ** | **UUID** |  |  [optional]
        * @param execModuleId UUID  
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByExecModuleId (  UUID execModuleId);
    /** Find a IntegrationAccount by accountName 
        accountName ** | **String** | account name |  [optional]
        * @param accountName String account name 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByAccountName (  String accountName);
    /** Find a IntegrationAccount by username 
        username ** | **String** | account username |  [optional]
        * @param username String account username 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByUsername (  String username);
    /** Find a IntegrationAccount by password 
        password ** | **String** | account password - encrypted |  [optional]
        * @param password String account password - encrypted 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByPassword (  String password);
    /** Find a IntegrationAccount by accountId 
        accountId ** | **String** |  |  [optional]
        * @param accountId String  
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByAccountId (  String accountId);
    /** Find a IntegrationAccount by status 
        status ** | [**StatusEnum**](#StatusEnum) | Integration Connection Status |  [optional]
        * @param status StatusEnum Integration Connection Status 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByStatus ( IntegrationAccount.StatusEnum status);
    /** Find a IntegrationAccount by verified 
        verified ** | **Boolean** |  |  [optional]
        * @param verified Boolean  
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByVerified (  Boolean verified);
    /** Find a IntegrationAccount by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountById (  UUID id);
    /** Find a IntegrationAccount by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByOwnerId (  UUID ownerId);
    /** Find a IntegrationAccount by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByCreatedDate (  OffsetDateTime createdDate);
    /** Find a IntegrationAccount by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByKeyHash (  String keyHash);
    /** Find a IntegrationAccount by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByLastAccessedById (  UUID lastAccessedById);
    /** Find a IntegrationAccount by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a IntegrationAccount by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByLastModifiedById (  UUID lastModifiedById);
    /** Find a IntegrationAccount by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<IntegrationAccount>
    */
    // nullable
    public List<IntegrationAccount>  findIntegrationAccountByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
