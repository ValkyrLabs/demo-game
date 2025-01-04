package com.valkyrlabs.api;

import com.valkyrlabs.model.BackupConfig;

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

    AUTO IMPLEMENTED by Spring as bean: BackupConfigRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface BackupConfigRepository extends Serializable, JpaRepository<BackupConfig, UUID> {

    // ThorAPI Generated search methods for each property on BackupConfig
    /** Find a BackupConfig by name 
        name ** | **String** |  |  [optional]
        * @param name String  
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByName (  String name);
    /** Find a BackupConfig by description 
        description ** | **String** | source code only backup of test workspace |  [optional]
        * @param description String source code only backup of test workspace 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByDescription (  String description);
    /** Find a BackupConfig by remoteConfigUrl 
        remoteConfigUrl ** | **String** | basically a callback url |  [optional]
        * @param remoteConfigUrl String basically a callback url 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByRemoteConfigUrl (  String remoteConfigUrl);
    /** Find a BackupConfig by runNumber 
        runNumber ** | **Integer** | the number of times this has been run before |  [optional]
        * @param runNumber Integer the number of times this has been run before 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByRunNumber (  Integer runNumber);
    /** Find a BackupConfig by percentComplete 
        percentComplete ** | **Integer** | 0-100 percentage of compleion of this backup if known |  [optional]
        * @param percentComplete Integer 0-100 percentage of compleion of this backup if known 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByPercentComplete (  Integer percentComplete);
    /** Find a BackupConfig by type 
        type ** | [**TypeEnum**](#TypeEnum) | the type of backup ie Workstation or Server |  [optional]
        * @param type TypeEnum the type of backup ie Workstation or Server 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByType ( BackupConfig.TypeEnum type);
    /** Find a BackupConfig by priorityLevel 
        priorityLevel ** | [**PriorityLevelEnum**](#PriorityLevelEnum) |  |  [optional]
        * @param priorityLevel PriorityLevelEnum  
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByPriorityLevel ( BackupConfig.PriorityLevelEnum priorityLevel);
    /** Find a BackupConfig by backupDir 
        backupDir ** | **String** | path to the folder that will be backed up |  [optional]
        * @param backupDir String path to the folder that will be backed up 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByBackupDir (  String backupDir);
    /** Find a BackupConfig by workingDir 
        workingDir ** | **String** | path to the folder that will be backed up |  [optional]
        * @param workingDir String path to the folder that will be backed up 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByWorkingDir (  String workingDir);
    /** Find a BackupConfig by skiplist 
        skiplist ** | **String** | a json string describing the items to skip in the backup set |  [optional]
        * @param skiplist String a json string describing the items to skip in the backup set 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigBySkiplist (  String skiplist);
    /** Find a BackupConfig by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigById (  UUID id);
    /** Find a BackupConfig by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByOwnerId (  UUID ownerId);
    /** Find a BackupConfig by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByCreatedDate (  OffsetDateTime createdDate);
    /** Find a BackupConfig by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByKeyHash (  String keyHash);
    /** Find a BackupConfig by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByLastAccessedById (  UUID lastAccessedById);
    /** Find a BackupConfig by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a BackupConfig by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByLastModifiedById (  UUID lastModifiedById);
    /** Find a BackupConfig by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<BackupConfig>
    */
    // nullable
    public List<BackupConfig>  findBackupConfigByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
