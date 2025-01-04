package com.valkyrlabs.api;

import com.valkyrlabs.model.WorkflowState;

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
public interface WorkflowStatePageableRepository extends Serializable, PagingAndSortingRepository<WorkflowState, UUID> {

    // ThorAPI Generated search methods for each property on WorkflowState
    /** Find a WorkflowState by workflowId with pagination
        workflowId ** | **UUID** | The workflow this state is participating in |  [optional]
        * @param workflowId UUID The workflow this state is participating in 
        * @param pageable pagination configuration
        * @return Page<WorkflowState>
    */
    public Page<WorkflowState> findByWorkflowId(UUID workflowId, Pageable pageable);
    /** Find a WorkflowState by name with pagination
        name ** | **String** | name of the property that holds the value |  [optional]
        * @param name String name of the property that holds the value 
        * @param pageable pagination configuration
        * @return Page<WorkflowState>
    */
    public Page<WorkflowState> findByName(String name, Pageable pageable);
    /** Find a WorkflowState by value with pagination
        value ** | **List<DataObject>** | value of the property |  [optional]
        * @param value List&lt;DataObject&gt; value of the property 
        * @param pageable pagination configuration
        * @return Page<WorkflowState>
    */
    public Page<WorkflowState> findByValue(List<DataObject> value, Pageable pageable);
    /** Find a WorkflowState by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<WorkflowState>
    */
    public Page<WorkflowState> findById(UUID id, Pageable pageable);
    /** Find a WorkflowState by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<WorkflowState>
    */
    public Page<WorkflowState> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a WorkflowState by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<WorkflowState>
    */
    public Page<WorkflowState> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a WorkflowState by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<WorkflowState>
    */
    public Page<WorkflowState> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a WorkflowState by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<WorkflowState>
    */
    public Page<WorkflowState> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a WorkflowState by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<WorkflowState>
    */
    public Page<WorkflowState> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a WorkflowState by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<WorkflowState>
    */
    public Page<WorkflowState> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a WorkflowState by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<WorkflowState>
    */
    public Page<WorkflowState> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of WorkflowState as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of WorkflowState instances
     */
    List<WorkflowState> findAll();

    /** 
     * Find all instances of WorkflowState with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of WorkflowState instances
     */
    Page<WorkflowState> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<WorkflowState> findAll(Example<WorkflowState> example, Pageable pageable);

    // end search methods
}
