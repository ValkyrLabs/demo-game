package com.valkyrlabs.api;

import com.valkyrlabs.model.Task;

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
import com.valkyrlabs.model.ExecModule;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: TaskRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface TaskPageableRepository extends Serializable, PagingAndSortingRepository<Task, UUID> {

    // ThorAPI Generated search methods for each property on Task
    /** Find a Task by description with pagination
        description ** | **String** |  |  [optional]
        * @param description String  
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByDescription(String description, Pageable pageable);
    /** Find a Task by workflowId with pagination
        workflowId ** | **UUID** | The workflow this state is participating in |  [optional]
        * @param workflowId UUID The workflow this state is participating in 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByWorkflowId(UUID workflowId, Pageable pageable);
    /** Find a Task by role with pagination
        role ** | [**RoleEnum**](#RoleEnum) | override the workflow role for specific task -login to a system- the role with permissions -temporary user is created |  [optional]
        * @param role RoleEnum override the workflow role for specific task -login to a system- the role with permissions -temporary user is created 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByRole(Task.RoleEnum role, Pageable pageable);
    /** Find a Task by modules with pagination
        modules ** | [**List<ExecModule>**](ExecModule.md) | an array of ExecModules to be processed |  [optional]
        * @param modules List&lt;@Valid ExecModule&gt; an array of ExecModules to be processed 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByModules(List<@Valid ExecModule> modules, Pageable pageable);
    /** Find a Task by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) | last known status of the task |  [optional]
        * @param status StatusEnum last known status of the task 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByStatus(Task.StatusEnum status, Pageable pageable);
    /** Find a Task by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findById(UUID id, Pageable pageable);
    /** Find a Task by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Task by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Task by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Task by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Task by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Task by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Task by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Task>
    */
    public Page<Task> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Task as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Task instances
     */
    List<Task> findAll();

    /** 
     * Find all instances of Task with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Task instances
     */
    Page<Task> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Task> findAll(Example<Task> example, Pageable pageable);

    // end search methods
}
