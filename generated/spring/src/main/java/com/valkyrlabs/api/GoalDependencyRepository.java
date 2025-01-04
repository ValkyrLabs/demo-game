package com.valkyrlabs.api;

import com.valkyrlabs.model.GoalDependency;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: GoalDependencyRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface GoalDependencyRepository extends Serializable, JpaRepository<GoalDependency, UUID> {

    // ThorAPI Generated search methods for each property on GoalDependency
    /** Find a GoalDependency by goalId 
        goalId ** | **UUID** |  |  [optional]
        * @param goalId UUID  
        * @return List<GoalDependency>
    */
    // nullable
    public List<GoalDependency>  findGoalDependencyByGoalId (  UUID goalId);
    /** Find a GoalDependency by dependencyOrder 
        dependencyOrder ** | **Integer** | the order in which this dependency exists |  [optional]
        * @param dependencyOrder Integer the order in which this dependency exists 
        * @return List<GoalDependency>
    */
    // nullable
    public List<GoalDependency>  findGoalDependencyByDependencyOrder (  Integer dependencyOrder);
    /** Find a GoalDependency by dependencyName 
        dependencyName ** | **String** | the name of the dependency |  [optional]
        * @param dependencyName String the name of the dependency 
        * @return List<GoalDependency>
    */
    // nullable
    public List<GoalDependency>  findGoalDependencyByDependencyName (  String dependencyName);
    /** Find a GoalDependency by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<GoalDependency>
    */
    // nullable
    public List<GoalDependency>  findGoalDependencyById (  UUID id);
    /** Find a GoalDependency by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<GoalDependency>
    */
    // nullable
    public List<GoalDependency>  findGoalDependencyByOwnerId (  UUID ownerId);
    /** Find a GoalDependency by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<GoalDependency>
    */
    // nullable
    public List<GoalDependency>  findGoalDependencyByCreatedDate (  OffsetDateTime createdDate);
    /** Find a GoalDependency by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<GoalDependency>
    */
    // nullable
    public List<GoalDependency>  findGoalDependencyByKeyHash (  String keyHash);
    /** Find a GoalDependency by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<GoalDependency>
    */
    // nullable
    public List<GoalDependency>  findGoalDependencyByLastAccessedById (  UUID lastAccessedById);
    /** Find a GoalDependency by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<GoalDependency>
    */
    // nullable
    public List<GoalDependency>  findGoalDependencyByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a GoalDependency by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<GoalDependency>
    */
    // nullable
    public List<GoalDependency>  findGoalDependencyByLastModifiedById (  UUID lastModifiedById);
    /** Find a GoalDependency by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<GoalDependency>
    */
    // nullable
    public List<GoalDependency>  findGoalDependencyByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
