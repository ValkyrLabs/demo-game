package com.valkyrlabs.api;

import com.valkyrlabs.model.Workflow;

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
import com.valkyrlabs.model.Task;
import com.valkyrlabs.model.WorkflowState;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: WorkflowRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface WorkflowRepository extends Serializable, JpaRepository<Workflow, UUID> {

    // ThorAPI Generated search methods for each property on Workflow
    /** Find a Workflow by name 
        name ** | **String** | short description of this workflow |  [optional]
        * @param name String short description of this workflow 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByName (  String name);
    /** Find a Workflow by description 
        description ** | **String** | detailed description of this workflow |  [optional]
        * @param description String detailed description of this workflow 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByDescription (  String description);
    /** Find a Workflow by role 
        role ** | [**RoleEnum**](#RoleEnum) | the role with permissions to execute the workfow as |  [optional]
        * @param role RoleEnum the role with permissions to execute the workfow as 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByRole ( Workflow.RoleEnum role);
    /** Find a Workflow by schedule 
        schedule ** | **String** | cron string to determine when this runs |  [optional]
        * @param schedule String cron string to determine when this runs 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowBySchedule (  String schedule);
    /** Find a Workflow by meta 
        meta ** | **String** | metadata in any text format to be used in client code |  [optional]
        * @param meta String metadata in any text format to be used in client code 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByMeta (  String meta);
    /** Find a Workflow by tasks 
        tasks ** | [**List&lt;Task&gt;**](Task.md) | an array of Tasks to be performed |  [optional]
        * @param tasks List&lt;@Valid Task&gt; an array of Tasks to be performed 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByTasks (  List<@Valid Task> tasks);
    /** Find a Workflow by state 
        state ** | [**List&lt;WorkflowState&gt;**](WorkflowState.md) | an array stateful objects to be used in the workflow |  [optional]
        * @param state List&lt;@Valid WorkflowState&gt; an array stateful objects to be used in the workflow 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByState (  List<@Valid WorkflowState> state);
    /** Find a Workflow by status 
        status ** | [**StatusEnum**](#StatusEnum) | last known status of the workflow |  [optional]
        * @param status StatusEnum last known status of the workflow 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByStatus ( Workflow.StatusEnum status);
    /** Find a Workflow by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowById (  UUID id);
    /** Find a Workflow by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByOwnerId (  UUID ownerId);
    /** Find a Workflow by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Workflow by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByKeyHash (  String keyHash);
    /** Find a Workflow by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByLastAccessedById (  UUID lastAccessedById);
    /** Find a Workflow by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Workflow by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByLastModifiedById (  UUID lastModifiedById);
    /** Find a Workflow by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Workflow>
    */
    // nullable
    public List<Workflow>  findWorkflowByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
