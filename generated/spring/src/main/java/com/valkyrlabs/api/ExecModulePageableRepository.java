package com.valkyrlabs.api;

import com.valkyrlabs.model.ExecModule;

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
import com.valkyrlabs.model.IntegrationAccount;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: ExecModuleRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface ExecModulePageableRepository extends Serializable, PagingAndSortingRepository<ExecModule, UUID> {

    // ThorAPI Generated search methods for each property on ExecModule
    /** Find a ExecModule by systemId with pagination
        systemId ** | **UUID** | UUID of the system object being mutated/read (if any) |  [optional]
        * @param systemId UUID UUID of the system object being mutated/read (if any) 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findBySystemId(UUID systemId, Pageable pageable);
    /** Find a ExecModule by taskId with pagination
        taskId ** | **UUID** | The task this module is executing in |  [optional]
        * @param taskId UUID The task this module is executing in 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByTaskId(UUID taskId, Pageable pageable);
    /** Find a ExecModule by role with pagination
        role ** | [**RoleEnum**](#RoleEnum) | the RBAC role to use in mutating/reading any system object |  [optional]
        * @param role RoleEnum the RBAC role to use in mutating/reading any system object 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByRole(ExecModule.RoleEnum role, Pageable pageable);
    /** Find a ExecModule by name with pagination
        name ** | **String** | the name of the module |  [optional]
        * @param name String the name of the module 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByName(String name, Pageable pageable);
    /** Find a ExecModule by notes with pagination
        notes ** | **String** | notes about the module |  [optional]
        * @param notes String notes about the module 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByNotes(String notes, Pageable pageable);
    /** Find a ExecModule by integrationAccount with pagination
        integrationAccount ** | [**IntegrationAccount**](IntegrationAccount.md) |  |  [optional]
        * @param integrationAccount IntegrationAccount  
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByIntegrationAccount(IntegrationAccount integrationAccount, Pageable pageable);
    /** Find a ExecModule by className with pagination
        className ** | **String** | the name of the implementation class for this module |  [optional]
        * @param className String the name of the implementation class for this module 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByClassName(String className, Pageable pageable);
    /** Find a ExecModule by moduleType with pagination
        moduleType ** | [**ModuleTypeEnum**](#ModuleTypeEnum) | the type of module |  [optional]
        * @param moduleType ModuleTypeEnum the type of module 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByModuleType(ExecModule.ModuleTypeEnum moduleType, Pageable pageable);
    /** Find a ExecModule by moduleData with pagination
        moduleData ** | **String** | json for configuring the module |  [optional]
        * @param moduleData String json for configuring the module 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByModuleData(String moduleData, Pageable pageable);
    /** Find a ExecModule by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) | last known status of the module |  [optional]
        * @param status StatusEnum last known status of the module 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByStatus(ExecModule.StatusEnum status, Pageable pageable);
    /** Find a ExecModule by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findById(UUID id, Pageable pageable);
    /** Find a ExecModule by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a ExecModule by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a ExecModule by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a ExecModule by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a ExecModule by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a ExecModule by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a ExecModule by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<ExecModule>
    */
    public Page<ExecModule> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of ExecModule as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of ExecModule instances
     */
    List<ExecModule> findAll();

    /** 
     * Find all instances of ExecModule with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of ExecModule instances
     */
    Page<ExecModule> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<ExecModule> findAll(Example<ExecModule> example, Pageable pageable);

    // end search methods
}
