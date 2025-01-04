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
import com.valkyrlabs.model.Task;
import com.valkyrlabs.model.WorkflowState;
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
public class WorkflowService {

    @Autowired
    private WorkflowRepository workflowRepository;

    @Autowired
    private WorkflowPageableRepository workflowPageableRepositoryRepository;

    /** 
     * Find all instances of Workflow with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Workflow instances
     */
    public Page<Workflow> findAll(Pageable pageable){
        return workflowPageableRepositoryRepository.findAll(pageable);
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
    public Page<Workflow> findAll(Example<Workflow> example, Pageable pageable){
        return workflowPageableRepositoryRepository.findAll(example, pageable);
    }


    public WorkflowRepository getRepository(){
        return workflowRepository;
    }

    // Create or Update a Workflow
    public Workflow saveOrUpdate(Workflow workflow) {
        return workflowRepository.save( workflow ); // This method handles both creation and update
        // workflowRepository.flush();
        // return ret;
    }

    // Find a Workflow by ID
    public Optional<Workflow>  findById(UUID id) {
        return workflowRepository.findById(id);
    }

    // Find all Workflows
    public Iterable<Workflow> findAll() {
        return workflowRepository.findAll();
    }

    
    /** Find a Workflow by name 
        
        * @param name String short description of this workflow [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByName(  String  name){
        return workflowRepository.findWorkflowByName( name  );
    }
    /** Find a Workflow by description 
        
        * @param description String detailed description of this workflow [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByDescription(  String  description){
        return workflowRepository.findWorkflowByDescription( description  );
    }
    /** Find a Workflow by role 
        
        * @param role  RoleEnum  RoleEnum) the role with permissions to execute the workfow as [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByRole( Workflow.RoleEnum role){
        return workflowRepository.findWorkflowByRole( role  );
    }
    /** Find a Workflow by schedule 
        
        * @param schedule String cron string to determine when this runs [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowBySchedule(  String  schedule){
        return workflowRepository.findWorkflowBySchedule( schedule  );
    }
    /** Find a Workflow by meta 
        
        * @param meta String metadata in any text format to be used in client code [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByMeta(  String  meta){
        return workflowRepository.findWorkflowByMeta( meta  );
    }
    /** Find a Workflow by tasks 
        
        * @param tasks [ List <Task> ](Task) an array of Tasks to be performed [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByTasks(  List<@Valid Task>  tasks){
        return workflowRepository.findWorkflowByTasks( tasks  );
    }
    /** Find a Workflow by state 
        
        * @param state [ List <WorkflowState> ](WorkflowState) an array stateful objects to be used in the workflow [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByState(  List<@Valid WorkflowState>  state){
        return workflowRepository.findWorkflowByState( state  );
    }
    /** Find a Workflow by status 
        
        * @param status  StatusEnum  StatusEnum) last known status of the workflow [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByStatus( Workflow.StatusEnum status){
        return workflowRepository.findWorkflowByStatus( status  );
    }
    /** Find a Workflow by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowById(  UUID  id){
        return workflowRepository.findWorkflowById( id  );
    }
    /** Find a Workflow by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByOwnerId(  UUID  ownerId){
        return workflowRepository.findWorkflowByOwnerId( ownerId  );
    }
    /** Find a Workflow by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByCreatedDate(  OffsetDateTime  createdDate){
        return workflowRepository.findWorkflowByCreatedDate( createdDate  );
    }
    /** Find a Workflow by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByKeyHash(  String  keyHash){
        return workflowRepository.findWorkflowByKeyHash( keyHash  );
    }
    /** Find a Workflow by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByLastAccessedById(  UUID  lastAccessedById){
        return workflowRepository.findWorkflowByLastAccessedById( lastAccessedById  );
    }
    /** Find a Workflow by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return workflowRepository.findWorkflowByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Workflow by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByLastModifiedById(  UUID  lastModifiedById){
        return workflowRepository.findWorkflowByLastModifiedById( lastModifiedById  );
    }
    /** Find a Workflow by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Workflow>
    */

    public List<Workflow>  findWorkflowByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return workflowRepository.findWorkflowByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Workflow by ID
    public void deleteById(UUID id) {
        workflowRepository.deleteById(id);
    }
}
