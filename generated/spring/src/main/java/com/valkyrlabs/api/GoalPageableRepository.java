package com.valkyrlabs.api;

import com.valkyrlabs.model.Goal;

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
import com.valkyrlabs.model.GoalDependency;
import com.valkyrlabs.model.KeyMetric;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: GoalRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface GoalPageableRepository extends Serializable, PagingAndSortingRepository<Goal, UUID> {

    // ThorAPI Generated search methods for each property on Goal
    /** Find a Goal by strategicPriorityId with pagination
        strategicPriorityId ** | **UUID** | The strategic priority that this goal supports. |  [optional]
        * @param strategicPriorityId UUID The strategic priority that this goal supports. 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByStrategicPriorityId(UUID strategicPriorityId, Pageable pageable);
    /** Find a Goal by name with pagination
        name ** | **String** | the name of the goal |  [optional]
        * @param name String the name of the goal 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByName(String name, Pageable pageable);
    /** Find a Goal by description with pagination
        description ** | **String** | the description of the goal |  [optional]
        * @param description String the description of the goal 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByDescription(String description, Pageable pageable);
    /** Find a Goal by keyMetrics with pagination
        keyMetrics ** | [**List<KeyMetric>**](KeyMetric.md) | measurements used to track success |  [optional]
        * @param keyMetrics List&lt;@Valid KeyMetric&gt; measurements used to track success 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByKeyMetrics(List<@Valid KeyMetric> keyMetrics, Pageable pageable);
    /** Find a Goal by goalDependencies with pagination
        goalDependencies ** | [**List<GoalDependency>**](GoalDependency.md) |  |  [optional]
        * @param goalDependencies List&lt;@Valid GoalDependency&gt;  
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByGoalDependencies(List<@Valid GoalDependency> goalDependencies, Pageable pageable);
    /** Find a Goal by expectedOutcome with pagination
        expectedOutcome ** | **String** | the positive expected outcome of the goal |  [optional]
        * @param expectedOutcome String the positive expected outcome of the goal 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByExpectedOutcome(String expectedOutcome, Pageable pageable);
    /** Find a Goal by risks with pagination
        risks ** | **String** | description of the risk if the goal is not successful |  [optional]
        * @param risks String description of the risk if the goal is not successful 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByRisks(String risks, Pageable pageable);
    /** Find a Goal by timeline with pagination
        timeline ** | **String** |  |  [optional]
        * @param timeline String  
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByTimeline(String timeline, Pageable pageable);
    /** Find a Goal by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findById(UUID id, Pageable pageable);
    /** Find a Goal by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Goal by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Goal by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Goal by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Goal by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Goal by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Goal by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Goal>
    */
    public Page<Goal> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Goal as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Goal instances
     */
    List<Goal> findAll();

    /** 
     * Find all instances of Goal with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Goal instances
     */
    Page<Goal> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Goal> findAll(Example<Goal> example, Pageable pageable);

    // end search methods
}
