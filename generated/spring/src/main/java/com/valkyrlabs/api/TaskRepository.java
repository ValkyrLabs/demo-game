package com.valkyrlabs.api;

import com.valkyrlabs.model.Task;

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
// @Transactional(readOnly=false)
public interface TaskRepository extends Serializable, JpaRepository<Task, UUID> {

    // ThorAPI Generated search methods for each property on Task
    /** Find a Task by description 
        description ** | **String** |  |  [optional]
        * @param description String  
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByDescription (  String description);
    /** Find a Task by workflowId 
        workflowId ** | **UUID** | The workflow this state is participating in |  [optional]
        * @param workflowId UUID The workflow this state is participating in 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByWorkflowId (  UUID workflowId);
    /** Find a Task by role 
        role ** | [**RoleEnum**](#RoleEnum) | override the workflow role for specific task -login to a system- the role with permissions -temporary user is created |  [optional]
        * @param role RoleEnum override the workflow role for specific task -login to a system- the role with permissions -temporary user is created 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByRole ( Task.RoleEnum role);
    /** Find a Task by modules 
        modules ** | [**List&lt;ExecModule&gt;**](ExecModule.md) | an array of ExecModules to be processed |  [optional]
        * @param modules List&lt;@Valid ExecModule&gt; an array of ExecModules to be processed 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByModules (  List<@Valid ExecModule> modules);
    /** Find a Task by status 
        status ** | [**StatusEnum**](#StatusEnum) | last known status of the task |  [optional]
        * @param status StatusEnum last known status of the task 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByStatus ( Task.StatusEnum status);
    /** Find a Task by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskById (  UUID id);
    /** Find a Task by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByOwnerId (  UUID ownerId);
    /** Find a Task by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Task by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByKeyHash (  String keyHash);
    /** Find a Task by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByLastAccessedById (  UUID lastAccessedById);
    /** Find a Task by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Task by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByLastModifiedById (  UUID lastModifiedById);
    /** Find a Task by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Task>
    */
    // nullable
    public List<Task>  findTaskByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
