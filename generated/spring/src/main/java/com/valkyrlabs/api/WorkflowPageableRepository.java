package com.valkyrlabs.api;

import com.valkyrlabs.model.Workflow;

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
public interface WorkflowPageableRepository extends Serializable, PagingAndSortingRepository<Workflow, UUID> {

    // ThorAPI Generated search methods for each property on Workflow
    /** Find a Workflow by name with pagination
        name ** | **String** | short description of this workflow |  [optional]
        * @param name String short description of this workflow 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByName(String name, Pageable pageable);
    /** Find a Workflow by description with pagination
        description ** | **String** | detailed description of this workflow |  [optional]
        * @param description String detailed description of this workflow 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByDescription(String description, Pageable pageable);
    /** Find a Workflow by role with pagination
        role ** | [**RoleEnum**](#RoleEnum) | the role with permissions to execute the workfow as |  [optional]
        * @param role RoleEnum the role with permissions to execute the workfow as 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByRole(Workflow.RoleEnum role, Pageable pageable);
    /** Find a Workflow by schedule with pagination
        schedule ** | **String** | cron string to determine when this runs |  [optional]
        * @param schedule String cron string to determine when this runs 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findBySchedule(String schedule, Pageable pageable);
    /** Find a Workflow by meta with pagination
        meta ** | **String** | metadata in any text format to be used in client code |  [optional]
        * @param meta String metadata in any text format to be used in client code 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByMeta(String meta, Pageable pageable);
    /** Find a Workflow by tasks with pagination
        tasks ** | [**List<Task>**](Task.md) | an array of Tasks to be performed |  [optional]
        * @param tasks List&lt;@Valid Task&gt; an array of Tasks to be performed 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByTasks(List<@Valid Task> tasks, Pageable pageable);
    /** Find a Workflow by state with pagination
        state ** | [**List<WorkflowState>**](WorkflowState.md) | an array stateful objects to be used in the workflow |  [optional]
        * @param state List&lt;@Valid WorkflowState&gt; an array stateful objects to be used in the workflow 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByState(List<@Valid WorkflowState> state, Pageable pageable);
    /** Find a Workflow by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) | last known status of the workflow |  [optional]
        * @param status StatusEnum last known status of the workflow 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByStatus(Workflow.StatusEnum status, Pageable pageable);
    /** Find a Workflow by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findById(UUID id, Pageable pageable);
    /** Find a Workflow by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Workflow by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Workflow by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Workflow by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Workflow by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Workflow by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Workflow by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Workflow>
    */
    public Page<Workflow> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Workflow as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Workflow instances
     */
    List<Workflow> findAll();

    /** 
     * Find all instances of Workflow with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Workflow instances
     */
    Page<Workflow> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Workflow> findAll(Example<Workflow> example, Pageable pageable);

    // end search methods
}
