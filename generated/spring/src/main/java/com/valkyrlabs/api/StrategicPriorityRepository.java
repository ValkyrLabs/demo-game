package com.valkyrlabs.api;

import com.valkyrlabs.model.StrategicPriority;

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
import com.valkyrlabs.model.Goal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: StrategicPriorityRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface StrategicPriorityRepository extends Serializable, JpaRepository<StrategicPriority, UUID> {

    // ThorAPI Generated search methods for each property on StrategicPriority
    /** Find a StrategicPriority by name 
        name ** | **String** |  |  [optional]
        * @param name String  
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByName (  String name);
    /** Find a StrategicPriority by description 
        description ** | **String** | high-level description of the strategic priority |  [optional]
        * @param description String high-level description of the strategic priority 
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByDescription (  String description);
    /** Find a StrategicPriority by priorityLevel 
        priorityLevel ** | [**PriorityLevelEnum**](#PriorityLevelEnum) |  |  [optional]
        * @param priorityLevel PriorityLevelEnum  
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByPriorityLevel ( StrategicPriority.PriorityLevelEnum priorityLevel);
    /** Find a StrategicPriority by imageUrl 
        imageUrl ** | **String** | URL for the strategic priority |  [optional]
        * @param imageUrl String URL for the strategic priority 
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByImageUrl (  String imageUrl);
    /** Find a StrategicPriority by startDate 
        startDate ** | **LocalDate** |  |  [optional]
        * @param startDate LocalDate  
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByStartDate (  LocalDate startDate);
    /** Find a StrategicPriority by targetDate 
        targetDate ** | **LocalDate** |  |  [optional]
        * @param targetDate LocalDate  
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByTargetDate (  LocalDate targetDate);
    /** Find a StrategicPriority by goals 
        goals ** | [**List&lt;Goal&gt;**](Goal.md) |  |  [optional]
        * @param goals List&lt;@Valid Goal&gt;  
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByGoals (  List<@Valid Goal> goals);
    /** Find a StrategicPriority by status 
        status ** | [**StatusEnum**](#StatusEnum) |  |  [optional]
        * @param status StatusEnum  
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByStatus ( StrategicPriority.StatusEnum status);
    /** Find a StrategicPriority by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityById (  UUID id);
    /** Find a StrategicPriority by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByOwnerId (  UUID ownerId);
    /** Find a StrategicPriority by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByCreatedDate (  OffsetDateTime createdDate);
    /** Find a StrategicPriority by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByKeyHash (  String keyHash);
    /** Find a StrategicPriority by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByLastAccessedById (  UUID lastAccessedById);
    /** Find a StrategicPriority by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a StrategicPriority by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByLastModifiedById (  UUID lastModifiedById);
    /** Find a StrategicPriority by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<StrategicPriority>
    */
    // nullable
    public List<StrategicPriority>  findStrategicPriorityByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
