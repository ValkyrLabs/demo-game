package com.valkyrlabs.model;

import com.valkyrlabs.api.*;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Example;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/** 
*
*  ThorAPI Service Methods
*
*/
@Service
// @Transactional(readOnly = false)
public class BackupConfigService {

    @Autowired
    private BackupConfigRepository backupconfigRepository;

    @Autowired
    private BackupConfigPageableRepository backupconfigPageableRepositoryRepository;

    /** 
     * Find all instances of BackupConfig with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of BackupConfig instances
     */
    public Page<BackupConfig> findAll(Pageable pageable){
        return backupconfigPageableRepositoryRepository.findAll(pageable);
    }

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    public Page<BackupConfig> findAll(Example<BackupConfig> example, Pageable pageable){
        return backupconfigPageableRepositoryRepository.findAll(example, pageable);
    }


    public BackupConfigRepository getRepository(){
        return backupconfigRepository;
    }

    // Create or Update a BackupConfig
    public BackupConfig saveOrUpdate(BackupConfig backupconfig) {
        return backupconfigRepository.save( backupconfig ); // This method handles both creation and update
        // backupconfigRepository.flush();
        // return ret;
    }

    // Find a BackupConfig by ID
    public Optional<BackupConfig>  findById(UUID id) {
        return backupconfigRepository.findById(id);
    }

    // Find all BackupConfigs
    public Iterable<BackupConfig> findAll() {
        return backupconfigRepository.findAll();
    }

    
    /** Find a BackupConfig by name 
        
        * @param name String  [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByName(  String  name){
        return backupconfigRepository.findBackupConfigByName( name  );
    }
    /** Find a BackupConfig by description 
        
        * @param description String source code only backup of test workspace [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByDescription(  String  description){
        return backupconfigRepository.findBackupConfigByDescription( description  );
    }
    /** Find a BackupConfig by remoteConfigUrl 
        
        * @param remoteConfigUrl String basically a callback url [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByRemoteConfigUrl(  String  remoteConfigUrl){
        return backupconfigRepository.findBackupConfigByRemoteConfigUrl( remoteConfigUrl  );
    }
    /** Find a BackupConfig by runNumber 
        
        * @param runNumber Integer the number of times this has been run before [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByRunNumber(  Integer  runNumber){
        return backupconfigRepository.findBackupConfigByRunNumber( runNumber  );
    }
    /** Find a BackupConfig by percentComplete 
        
        * @param percentComplete Integer 0-100 percentage of compleion of this backup if known [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByPercentComplete(  Integer  percentComplete){
        return backupconfigRepository.findBackupConfigByPercentComplete( percentComplete  );
    }
    /** Find a BackupConfig by type 
        
        * @param type  TypeEnum  TypeEnum) the type of backup ie Workstation or Server [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByType( BackupConfig.TypeEnum type){
        return backupconfigRepository.findBackupConfigByType( type  );
    }
    /** Find a BackupConfig by priorityLevel 
        
        * @param priorityLevel  PriorityLevelEnum  PriorityLevelEnum)  [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByPriorityLevel( BackupConfig.PriorityLevelEnum priorityLevel){
        return backupconfigRepository.findBackupConfigByPriorityLevel( priorityLevel  );
    }
    /** Find a BackupConfig by backupDir 
        
        * @param backupDir String path to the folder that will be backed up [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByBackupDir(  String  backupDir){
        return backupconfigRepository.findBackupConfigByBackupDir( backupDir  );
    }
    /** Find a BackupConfig by workingDir 
        
        * @param workingDir String path to the folder that will be backed up [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByWorkingDir(  String  workingDir){
        return backupconfigRepository.findBackupConfigByWorkingDir( workingDir  );
    }
    /** Find a BackupConfig by skiplist 
        
        * @param skiplist String a json string describing the items to skip in the backup set [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigBySkiplist(  String  skiplist){
        return backupconfigRepository.findBackupConfigBySkiplist( skiplist  );
    }
    /** Find a BackupConfig by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigById(  UUID  id){
        return backupconfigRepository.findBackupConfigById( id  );
    }
    /** Find a BackupConfig by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByOwnerId(  UUID  ownerId){
        return backupconfigRepository.findBackupConfigByOwnerId( ownerId  );
    }
    /** Find a BackupConfig by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByCreatedDate(  OffsetDateTime  createdDate){
        return backupconfigRepository.findBackupConfigByCreatedDate( createdDate  );
    }
    /** Find a BackupConfig by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByKeyHash(  String  keyHash){
        return backupconfigRepository.findBackupConfigByKeyHash( keyHash  );
    }
    /** Find a BackupConfig by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByLastAccessedById(  UUID  lastAccessedById){
        return backupconfigRepository.findBackupConfigByLastAccessedById( lastAccessedById  );
    }
    /** Find a BackupConfig by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return backupconfigRepository.findBackupConfigByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a BackupConfig by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByLastModifiedById(  UUID  lastModifiedById){
        return backupconfigRepository.findBackupConfigByLastModifiedById( lastModifiedById  );
    }
    /** Find a BackupConfig by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<BackupConfig>
    */

    public List<BackupConfig>  findBackupConfigByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return backupconfigRepository.findBackupConfigByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a BackupConfig by ID
    public void deleteById(UUID id) {
        backupconfigRepository.deleteById(id);
    }
}
