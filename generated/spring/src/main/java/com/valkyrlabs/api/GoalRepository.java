package com.valkyrlabs.api;

import com.valkyrlabs.model.Goal;

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
// @Transactional(readOnly=false)
public interface GoalRepository extends Serializable, JpaRepository<Goal, UUID> {

    // ThorAPI Generated search methods for each property on Goal
    /** Find a Goal by strategicPriorityId 
        strategicPriorityId ** | **UUID** | The strategic priority that this goal supports. |  [optional]
        * @param strategicPriorityId UUID The strategic priority that this goal supports. 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByStrategicPriorityId (  UUID strategicPriorityId);
    /** Find a Goal by name 
        name ** | **String** | the name of the goal |  [optional]
        * @param name String the name of the goal 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByName (  String name);
    /** Find a Goal by description 
        description ** | **String** | the description of the goal |  [optional]
        * @param description String the description of the goal 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByDescription (  String description);
    /** Find a Goal by keyMetrics 
        keyMetrics ** | [**List&lt;KeyMetric&gt;**](KeyMetric.md) | measurements used to track success |  [optional]
        * @param keyMetrics List&lt;@Valid KeyMetric&gt; measurements used to track success 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByKeyMetrics (  List<@Valid KeyMetric> keyMetrics);
    /** Find a Goal by goalDependencies 
        goalDependencies ** | [**List&lt;GoalDependency&gt;**](GoalDependency.md) |  |  [optional]
        * @param goalDependencies List&lt;@Valid GoalDependency&gt;  
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByGoalDependencies (  List<@Valid GoalDependency> goalDependencies);
    /** Find a Goal by expectedOutcome 
        expectedOutcome ** | **String** | the positive expected outcome of the goal |  [optional]
        * @param expectedOutcome String the positive expected outcome of the goal 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByExpectedOutcome (  String expectedOutcome);
    /** Find a Goal by risks 
        risks ** | **String** | description of the risk if the goal is not successful |  [optional]
        * @param risks String description of the risk if the goal is not successful 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByRisks (  String risks);
    /** Find a Goal by timeline 
        timeline ** | **String** |  |  [optional]
        * @param timeline String  
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByTimeline (  String timeline);
    /** Find a Goal by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalById (  UUID id);
    /** Find a Goal by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByOwnerId (  UUID ownerId);
    /** Find a Goal by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Goal by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByKeyHash (  String keyHash);
    /** Find a Goal by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByLastAccessedById (  UUID lastAccessedById);
    /** Find a Goal by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Goal by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByLastModifiedById (  UUID lastModifiedById);
    /** Find a Goal by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Goal>
    */
    // nullable
    public List<Goal>  findGoalByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
