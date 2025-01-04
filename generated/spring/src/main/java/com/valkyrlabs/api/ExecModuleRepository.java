package com.valkyrlabs.api;

import com.valkyrlabs.model.ExecModule;

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
import com.valkyrlabs.model.IntegrationAccount;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: ExecModuleRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface ExecModuleRepository extends Serializable, JpaRepository<ExecModule, UUID> {

    // ThorAPI Generated search methods for each property on ExecModule
    /** Find a ExecModule by systemId 
        systemId ** | **UUID** | UUID of the system object being mutated/read (if any) |  [optional]
        * @param systemId UUID UUID of the system object being mutated/read (if any) 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleBySystemId (  UUID systemId);
    /** Find a ExecModule by taskId 
        taskId ** | **UUID** | The task this module is executing in |  [optional]
        * @param taskId UUID The task this module is executing in 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByTaskId (  UUID taskId);
    /** Find a ExecModule by role 
        role ** | [**RoleEnum**](#RoleEnum) | the RBAC role to use in mutating/reading any system object |  [optional]
        * @param role RoleEnum the RBAC role to use in mutating/reading any system object 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByRole ( ExecModule.RoleEnum role);
    /** Find a ExecModule by name 
        name ** | **String** | the name of the module |  [optional]
        * @param name String the name of the module 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByName (  String name);
    /** Find a ExecModule by notes 
        notes ** | **String** | notes about the module |  [optional]
        * @param notes String notes about the module 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByNotes (  String notes);
    /** Find a ExecModule by integrationAccount 
        integrationAccount ** | [**IntegrationAccount**](IntegrationAccount.md) |  |  [optional]
        * @param integrationAccount IntegrationAccount  
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByIntegrationAccount (  IntegrationAccount integrationAccount);
    /** Find a ExecModule by className 
        className ** | **String** | the name of the implementation class for this module |  [optional]
        * @param className String the name of the implementation class for this module 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByClassName (  String className);
    /** Find a ExecModule by moduleType 
        moduleType ** | [**ModuleTypeEnum**](#ModuleTypeEnum) | the type of module |  [optional]
        * @param moduleType ModuleTypeEnum the type of module 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByModuleType ( ExecModule.ModuleTypeEnum moduleType);
    /** Find a ExecModule by moduleData 
        moduleData ** | **String** | json for configuring the module |  [optional]
        * @param moduleData String json for configuring the module 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByModuleData (  String moduleData);
    /** Find a ExecModule by status 
        status ** | [**StatusEnum**](#StatusEnum) | last known status of the module |  [optional]
        * @param status StatusEnum last known status of the module 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByStatus ( ExecModule.StatusEnum status);
    /** Find a ExecModule by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleById (  UUID id);
    /** Find a ExecModule by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByOwnerId (  UUID ownerId);
    /** Find a ExecModule by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByCreatedDate (  OffsetDateTime createdDate);
    /** Find a ExecModule by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByKeyHash (  String keyHash);
    /** Find a ExecModule by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByLastAccessedById (  UUID lastAccessedById);
    /** Find a ExecModule by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a ExecModule by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByLastModifiedById (  UUID lastModifiedById);
    /** Find a ExecModule by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<ExecModule>
    */
    // nullable
    public List<ExecModule>  findExecModuleByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
