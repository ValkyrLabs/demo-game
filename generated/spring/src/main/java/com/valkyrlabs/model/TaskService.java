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
import com.valkyrlabs.model.ExecModule;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskPageableRepository taskPageableRepositoryRepository;

    /** 
     * Find all instances of Task with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Task instances
     */
    public Page<Task> findAll(Pageable pageable){
        return taskPageableRepositoryRepository.findAll(pageable);
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
    public Page<Task> findAll(Example<Task> example, Pageable pageable){
        return taskPageableRepositoryRepository.findAll(example, pageable);
    }


    public TaskRepository getRepository(){
        return taskRepository;
    }

    // Create or Update a Task
    public Task saveOrUpdate(Task task) {
        return taskRepository.save( task ); // This method handles both creation and update
        // taskRepository.flush();
        // return ret;
    }

    // Find a Task by ID
    public Optional<Task>  findById(UUID id) {
        return taskRepository.findById(id);
    }

    // Find all Tasks
    public Iterable<Task> findAll() {
        return taskRepository.findAll();
    }

    
    /** Find a Task by description 
        
        * @param description String  [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByDescription(  String  description){
        return taskRepository.findTaskByDescription( description  );
    }
    /** Find a Task by workflowId 
        
        * @param workflowId UUID The workflow this state is participating in [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByWorkflowId(  UUID  workflowId){
        return taskRepository.findTaskByWorkflowId( workflowId  );
    }
    /** Find a Task by role 
        
        * @param role  RoleEnum  RoleEnum) override the workflow role for specific task -login to a system- the role with permissions -temporary user is created [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByRole( Task.RoleEnum role){
        return taskRepository.findTaskByRole( role  );
    }
    /** Find a Task by modules 
        
        * @param modules [ List <ExecModule> ](ExecModule) an array of ExecModules to be processed [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByModules(  List<@Valid ExecModule>  modules){
        return taskRepository.findTaskByModules( modules  );
    }
    /** Find a Task by status 
        
        * @param status  StatusEnum  StatusEnum) last known status of the task [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByStatus( Task.StatusEnum status){
        return taskRepository.findTaskByStatus( status  );
    }
    /** Find a Task by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskById(  UUID  id){
        return taskRepository.findTaskById( id  );
    }
    /** Find a Task by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByOwnerId(  UUID  ownerId){
        return taskRepository.findTaskByOwnerId( ownerId  );
    }
    /** Find a Task by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByCreatedDate(  OffsetDateTime  createdDate){
        return taskRepository.findTaskByCreatedDate( createdDate  );
    }
    /** Find a Task by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByKeyHash(  String  keyHash){
        return taskRepository.findTaskByKeyHash( keyHash  );
    }
    /** Find a Task by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByLastAccessedById(  UUID  lastAccessedById){
        return taskRepository.findTaskByLastAccessedById( lastAccessedById  );
    }
    /** Find a Task by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return taskRepository.findTaskByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Task by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByLastModifiedById(  UUID  lastModifiedById){
        return taskRepository.findTaskByLastModifiedById( lastModifiedById  );
    }
    /** Find a Task by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Task>
    */

    public List<Task>  findTaskByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return taskRepository.findTaskByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Task by ID
    public void deleteById(UUID id) {
        taskRepository.deleteById(id);
    }
}
