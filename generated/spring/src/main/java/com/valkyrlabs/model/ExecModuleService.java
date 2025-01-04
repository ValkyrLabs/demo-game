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
import com.valkyrlabs.model.IntegrationAccount;
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
public class ExecModuleService {

    @Autowired
    private ExecModuleRepository execmoduleRepository;

    @Autowired
    private ExecModulePageableRepository execmodulePageableRepositoryRepository;

    /** 
     * Find all instances of ExecModule with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of ExecModule instances
     */
    public Page<ExecModule> findAll(Pageable pageable){
        return execmodulePageableRepositoryRepository.findAll(pageable);
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
    public Page<ExecModule> findAll(Example<ExecModule> example, Pageable pageable){
        return execmodulePageableRepositoryRepository.findAll(example, pageable);
    }


    public ExecModuleRepository getRepository(){
        return execmoduleRepository;
    }

    // Create or Update a ExecModule
    public ExecModule saveOrUpdate(ExecModule execmodule) {
        return execmoduleRepository.save( execmodule ); // This method handles both creation and update
        // execmoduleRepository.flush();
        // return ret;
    }

    // Find a ExecModule by ID
    public Optional<ExecModule>  findById(UUID id) {
        return execmoduleRepository.findById(id);
    }

    // Find all ExecModules
    public Iterable<ExecModule> findAll() {
        return execmoduleRepository.findAll();
    }

    
    /** Find a ExecModule by systemId 
        
        * @param systemId UUID UUID of the system object being mutated/read (if any) [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleBySystemId(  UUID  systemId){
        return execmoduleRepository.findExecModuleBySystemId( systemId  );
    }
    /** Find a ExecModule by taskId 
        
        * @param taskId UUID The task this module is executing in [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByTaskId(  UUID  taskId){
        return execmoduleRepository.findExecModuleByTaskId( taskId  );
    }
    /** Find a ExecModule by role 
        
        * @param role  RoleEnum  RoleEnum) the RBAC role to use in mutating/reading any system object [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByRole( ExecModule.RoleEnum role){
        return execmoduleRepository.findExecModuleByRole( role  );
    }
    /** Find a ExecModule by name 
        
        * @param name String the name of the module [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByName(  String  name){
        return execmoduleRepository.findExecModuleByName( name  );
    }
    /** Find a ExecModule by notes 
        
        * @param notes String notes about the module [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByNotes(  String  notes){
        return execmoduleRepository.findExecModuleByNotes( notes  );
    }
    /** Find a ExecModule by integrationAccount 
        
        * @param integrationAccount [IntegrationAccount](IntegrationAccount.md)  [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByIntegrationAccount(  IntegrationAccount  integrationAccount){
        return execmoduleRepository.findExecModuleByIntegrationAccount( integrationAccount  );
    }
    /** Find a ExecModule by className 
        
        * @param className String the name of the implementation class for this module [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByClassName(  String  className){
        return execmoduleRepository.findExecModuleByClassName( className  );
    }
    /** Find a ExecModule by moduleType 
        
        * @param moduleType  ModuleTypeEnum  ModuleTypeEnum) the type of module [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByModuleType( ExecModule.ModuleTypeEnum moduleType){
        return execmoduleRepository.findExecModuleByModuleType( moduleType  );
    }
    /** Find a ExecModule by moduleData 
        
        * @param moduleData String json for configuring the module [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByModuleData(  String  moduleData){
        return execmoduleRepository.findExecModuleByModuleData( moduleData  );
    }
    /** Find a ExecModule by status 
        
        * @param status  StatusEnum  StatusEnum) last known status of the module [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByStatus( ExecModule.StatusEnum status){
        return execmoduleRepository.findExecModuleByStatus( status  );
    }
    /** Find a ExecModule by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleById(  UUID  id){
        return execmoduleRepository.findExecModuleById( id  );
    }
    /** Find a ExecModule by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByOwnerId(  UUID  ownerId){
        return execmoduleRepository.findExecModuleByOwnerId( ownerId  );
    }
    /** Find a ExecModule by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByCreatedDate(  OffsetDateTime  createdDate){
        return execmoduleRepository.findExecModuleByCreatedDate( createdDate  );
    }
    /** Find a ExecModule by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByKeyHash(  String  keyHash){
        return execmoduleRepository.findExecModuleByKeyHash( keyHash  );
    }
    /** Find a ExecModule by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByLastAccessedById(  UUID  lastAccessedById){
        return execmoduleRepository.findExecModuleByLastAccessedById( lastAccessedById  );
    }
    /** Find a ExecModule by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return execmoduleRepository.findExecModuleByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a ExecModule by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByLastModifiedById(  UUID  lastModifiedById){
        return execmoduleRepository.findExecModuleByLastModifiedById( lastModifiedById  );
    }
    /** Find a ExecModule by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<ExecModule>
    */

    public List<ExecModule>  findExecModuleByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return execmoduleRepository.findExecModuleByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a ExecModule by ID
    public void deleteById(UUID id) {
        execmoduleRepository.deleteById(id);
    }
}
