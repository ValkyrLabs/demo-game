package com.valkyrlabs.api;

import com.valkyrlabs.model.BackupConfig;

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

    AUTO IMPLEMENTED by Spring as bean: BackupConfigRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface BackupConfigPageableRepository extends Serializable, PagingAndSortingRepository<BackupConfig, UUID> {

    // ThorAPI Generated search methods for each property on BackupConfig
    /** Find a BackupConfig by name with pagination
        name ** | **String** |  |  [optional]
        * @param name String  
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByName(String name, Pageable pageable);
    /** Find a BackupConfig by description with pagination
        description ** | **String** | source code only backup of test workspace |  [optional]
        * @param description String source code only backup of test workspace 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByDescription(String description, Pageable pageable);
    /** Find a BackupConfig by remoteConfigUrl with pagination
        remoteConfigUrl ** | **String** | basically a callback url |  [optional]
        * @param remoteConfigUrl String basically a callback url 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByRemoteConfigUrl(String remoteConfigUrl, Pageable pageable);
    /** Find a BackupConfig by runNumber with pagination
        runNumber ** | **Integer** | the number of times this has been run before |  [optional]
        * @param runNumber Integer the number of times this has been run before 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByRunNumber(Integer runNumber, Pageable pageable);
    /** Find a BackupConfig by percentComplete with pagination
        percentComplete ** | **Integer** | 0-100 percentage of compleion of this backup if known |  [optional]
        * @param percentComplete Integer 0-100 percentage of compleion of this backup if known 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByPercentComplete(Integer percentComplete, Pageable pageable);
    /** Find a BackupConfig by type with pagination
        type ** | [**TypeEnum**](#TypeEnum) | the type of backup ie Workstation or Server |  [optional]
        * @param type TypeEnum the type of backup ie Workstation or Server 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByType(BackupConfig.TypeEnum type, Pageable pageable);
    /** Find a BackupConfig by priorityLevel with pagination
        priorityLevel ** | [**PriorityLevelEnum**](#PriorityLevelEnum) |  |  [optional]
        * @param priorityLevel PriorityLevelEnum  
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByPriorityLevel(BackupConfig.PriorityLevelEnum priorityLevel, Pageable pageable);
    /** Find a BackupConfig by backupDir with pagination
        backupDir ** | **String** | path to the folder that will be backed up |  [optional]
        * @param backupDir String path to the folder that will be backed up 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByBackupDir(String backupDir, Pageable pageable);
    /** Find a BackupConfig by workingDir with pagination
        workingDir ** | **String** | path to the folder that will be backed up |  [optional]
        * @param workingDir String path to the folder that will be backed up 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByWorkingDir(String workingDir, Pageable pageable);
    /** Find a BackupConfig by skiplist with pagination
        skiplist ** | **String** | a json string describing the items to skip in the backup set |  [optional]
        * @param skiplist String a json string describing the items to skip in the backup set 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findBySkiplist(String skiplist, Pageable pageable);
    /** Find a BackupConfig by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findById(UUID id, Pageable pageable);
    /** Find a BackupConfig by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a BackupConfig by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a BackupConfig by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a BackupConfig by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a BackupConfig by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a BackupConfig by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a BackupConfig by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<BackupConfig>
    */
    public Page<BackupConfig> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of BackupConfig as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of BackupConfig instances
     */
    List<BackupConfig> findAll();

    /** 
     * Find all instances of BackupConfig with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of BackupConfig instances
     */
    Page<BackupConfig> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<BackupConfig> findAll(Example<BackupConfig> example, Pageable pageable);

    // end search methods
}
