package com.valkyrlabs.api;

import com.valkyrlabs.model.WorkflowState;

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
import com.valkyrlabs.model.DataObject;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: WorkflowStateRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface WorkflowStateRepository extends Serializable, JpaRepository<WorkflowState, UUID> {

    // ThorAPI Generated search methods for each property on WorkflowState
    /** Find a WorkflowState by workflowId 
        workflowId ** | **UUID** | The workflow this state is participating in |  [optional]
        * @param workflowId UUID The workflow this state is participating in 
        * @return List<WorkflowState>
    */
    // nullable
    public List<WorkflowState>  findWorkflowStateByWorkflowId (  UUID workflowId);
    /** Find a WorkflowState by name 
        name ** | **String** | name of the property that holds the value |  [optional]
        * @param name String name of the property that holds the value 
        * @return List<WorkflowState>
    */
    // nullable
    public List<WorkflowState>  findWorkflowStateByName (  String name);
    /** Find a WorkflowState by value 
        value ** | **List&lt;DataObject&gt;** | value of the property |  [optional]
        * @param value List&lt;DataObject&gt; value of the property 
        * @return List<WorkflowState>
    */
    // nullable
    public List<WorkflowState>  findWorkflowStateByValue (  List<DataObject> value);
    /** Find a WorkflowState by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<WorkflowState>
    */
    // nullable
    public List<WorkflowState>  findWorkflowStateById (  UUID id);
    /** Find a WorkflowState by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<WorkflowState>
    */
    // nullable
    public List<WorkflowState>  findWorkflowStateByOwnerId (  UUID ownerId);
    /** Find a WorkflowState by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<WorkflowState>
    */
    // nullable
    public List<WorkflowState>  findWorkflowStateByCreatedDate (  OffsetDateTime createdDate);
    /** Find a WorkflowState by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<WorkflowState>
    */
    // nullable
    public List<WorkflowState>  findWorkflowStateByKeyHash (  String keyHash);
    /** Find a WorkflowState by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<WorkflowState>
    */
    // nullable
    public List<WorkflowState>  findWorkflowStateByLastAccessedById (  UUID lastAccessedById);
    /** Find a WorkflowState by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<WorkflowState>
    */
    // nullable
    public List<WorkflowState>  findWorkflowStateByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a WorkflowState by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<WorkflowState>
    */
    // nullable
    public List<WorkflowState>  findWorkflowStateByLastModifiedById (  UUID lastModifiedById);
    /** Find a WorkflowState by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<WorkflowState>
    */
    // nullable
    public List<WorkflowState>  findWorkflowStateByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
