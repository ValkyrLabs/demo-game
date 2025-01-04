package com.valkyrlabs.model;

import com.valkyrlabs.api.*;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.valkyrlabs.model.DataObject;
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
public class WorkflowStateService {

    @Autowired
    private WorkflowStateRepository workflowstateRepository;

    @Autowired
    private WorkflowStatePageableRepository workflowstatePageableRepositoryRepository;

    /** 
     * Find all instances of WorkflowState with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of WorkflowState instances
     */
    public Page<WorkflowState> findAll(Pageable pageable){
        return workflowstatePageableRepositoryRepository.findAll(pageable);
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
    public Page<WorkflowState> findAll(Example<WorkflowState> example, Pageable pageable){
        return workflowstatePageableRepositoryRepository.findAll(example, pageable);
    }


    public WorkflowStateRepository getRepository(){
        return workflowstateRepository;
    }

    // Create or Update a WorkflowState
    public WorkflowState saveOrUpdate(WorkflowState workflowstate) {
        return workflowstateRepository.save( workflowstate ); // This method handles both creation and update
        // workflowstateRepository.flush();
        // return ret;
    }

    // Find a WorkflowState by ID
    public Optional<WorkflowState>  findById(UUID id) {
        return workflowstateRepository.findById(id);
    }

    // Find all WorkflowStates
    public Iterable<WorkflowState> findAll() {
        return workflowstateRepository.findAll();
    }

    
    /** Find a WorkflowState by workflowId 
        
        * @param workflowId UUID The workflow this state is participating in [optional]
        * @return List<WorkflowState>
    */

    public List<WorkflowState>  findWorkflowStateByWorkflowId(  UUID  workflowId){
        return workflowstateRepository.findWorkflowStateByWorkflowId( workflowId  );
    }
    /** Find a WorkflowState by name 
        
        * @param name String name of the property that holds the value [optional]
        * @return List<WorkflowState>
    */

    public List<WorkflowState>  findWorkflowStateByName(  String  name){
        return workflowstateRepository.findWorkflowStateByName( name  );
    }
    /** Find a WorkflowState by value 
        
        * @param value  List <DataObject>  value of the property [optional]
        * @return List<WorkflowState>
    */

    public List<WorkflowState>  findWorkflowStateByValue(  List<DataObject>  value){
        return workflowstateRepository.findWorkflowStateByValue( value  );
    }
    /** Find a WorkflowState by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<WorkflowState>
    */

    public List<WorkflowState>  findWorkflowStateById(  UUID  id){
        return workflowstateRepository.findWorkflowStateById( id  );
    }
    /** Find a WorkflowState by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<WorkflowState>
    */

    public List<WorkflowState>  findWorkflowStateByOwnerId(  UUID  ownerId){
        return workflowstateRepository.findWorkflowStateByOwnerId( ownerId  );
    }
    /** Find a WorkflowState by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<WorkflowState>
    */

    public List<WorkflowState>  findWorkflowStateByCreatedDate(  OffsetDateTime  createdDate){
        return workflowstateRepository.findWorkflowStateByCreatedDate( createdDate  );
    }
    /** Find a WorkflowState by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<WorkflowState>
    */

    public List<WorkflowState>  findWorkflowStateByKeyHash(  String  keyHash){
        return workflowstateRepository.findWorkflowStateByKeyHash( keyHash  );
    }
    /** Find a WorkflowState by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<WorkflowState>
    */

    public List<WorkflowState>  findWorkflowStateByLastAccessedById(  UUID  lastAccessedById){
        return workflowstateRepository.findWorkflowStateByLastAccessedById( lastAccessedById  );
    }
    /** Find a WorkflowState by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<WorkflowState>
    */

    public List<WorkflowState>  findWorkflowStateByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return workflowstateRepository.findWorkflowStateByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a WorkflowState by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<WorkflowState>
    */

    public List<WorkflowState>  findWorkflowStateByLastModifiedById(  UUID  lastModifiedById){
        return workflowstateRepository.findWorkflowStateByLastModifiedById( lastModifiedById  );
    }
    /** Find a WorkflowState by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<WorkflowState>
    */

    public List<WorkflowState>  findWorkflowStateByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return workflowstateRepository.findWorkflowStateByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a WorkflowState by ID
    public void deleteById(UUID id) {
        workflowstateRepository.deleteById(id);
    }
}
