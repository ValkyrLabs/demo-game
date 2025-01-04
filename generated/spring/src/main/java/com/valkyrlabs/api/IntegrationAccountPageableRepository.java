package com.valkyrlabs.api;

import com.valkyrlabs.model.IntegrationAccount;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
public interface IntegrationAccountPageableRepository extends Serializable, PagingAndSortingRepository<IntegrationAccount, UUID> {

    // ThorAPI Generated search methods for each property on IntegrationAccount
    /** Find a IntegrationAccount by execModuleId with pagination
        execModuleId ** | **UUID** |  |  [optional]
        * @param execModuleId UUID  
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByExecModuleId(UUID execModuleId, Pageable pageable);
    /** Find a IntegrationAccount by accountName with pagination
        accountName ** | **String** | account name |  [optional]
        * @param accountName String account name 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByAccountName(String accountName, Pageable pageable);
    /** Find a IntegrationAccount by username with pagination
        username ** | **String** | account username |  [optional]
        * @param username String account username 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByUsername(String username, Pageable pageable);
    /** Find a IntegrationAccount by password with pagination
        password ** | **String** | account password - encrypted |  [optional]
        * @param password String account password - encrypted 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByPassword(String password, Pageable pageable);
    /** Find a IntegrationAccount by accountId with pagination
        accountId ** | **String** |  |  [optional]
        * @param accountId String  
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByAccountId(String accountId, Pageable pageable);
    /** Find a IntegrationAccount by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) | Integration Connection Status |  [optional]
        * @param status StatusEnum Integration Connection Status 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByStatus(IntegrationAccount.StatusEnum status, Pageable pageable);
    /** Find a IntegrationAccount by verified with pagination
        verified ** | **Boolean** |  |  [optional]
        * @param verified Boolean  
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByVerified(Boolean verified, Pageable pageable);
    /** Find a IntegrationAccount by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findById(UUID id, Pageable pageable);
    /** Find a IntegrationAccount by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a IntegrationAccount by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a IntegrationAccount by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a IntegrationAccount by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a IntegrationAccount by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a IntegrationAccount by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a IntegrationAccount by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<IntegrationAccount>
    */
    public Page<IntegrationAccount> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of IntegrationAccount as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of IntegrationAccount instances
     */
    List<IntegrationAccount> findAll();

    /** 
     * Find all instances of IntegrationAccount with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of IntegrationAccount instances
     */
    Page<IntegrationAccount> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<IntegrationAccount> findAll(Example<IntegrationAccount> example, Pageable pageable);

    // end search methods
}
