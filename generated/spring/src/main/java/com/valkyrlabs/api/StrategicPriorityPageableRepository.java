package com.valkyrlabs.api;

import com.valkyrlabs.model.StrategicPriority;

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
public interface StrategicPriorityPageableRepository extends Serializable, PagingAndSortingRepository<StrategicPriority, UUID> {

    // ThorAPI Generated search methods for each property on StrategicPriority
    /** Find a StrategicPriority by name with pagination
        name ** | **String** |  |  [optional]
        * @param name String  
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByName(String name, Pageable pageable);
    /** Find a StrategicPriority by description with pagination
        description ** | **String** | high-level description of the strategic priority |  [optional]
        * @param description String high-level description of the strategic priority 
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByDescription(String description, Pageable pageable);
    /** Find a StrategicPriority by priorityLevel with pagination
        priorityLevel ** | [**PriorityLevelEnum**](#PriorityLevelEnum) |  |  [optional]
        * @param priorityLevel PriorityLevelEnum  
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByPriorityLevel(StrategicPriority.PriorityLevelEnum priorityLevel, Pageable pageable);
    /** Find a StrategicPriority by imageUrl with pagination
        imageUrl ** | **String** | URL for the strategic priority |  [optional]
        * @param imageUrl String URL for the strategic priority 
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByImageUrl(String imageUrl, Pageable pageable);
    /** Find a StrategicPriority by startDate with pagination
        startDate ** | **LocalDate** |  |  [optional]
        * @param startDate LocalDate  
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByStartDate(LocalDate startDate, Pageable pageable);
    /** Find a StrategicPriority by targetDate with pagination
        targetDate ** | **LocalDate** |  |  [optional]
        * @param targetDate LocalDate  
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByTargetDate(LocalDate targetDate, Pageable pageable);
    /** Find a StrategicPriority by goals with pagination
        goals ** | [**List<Goal>**](Goal.md) |  |  [optional]
        * @param goals List&lt;@Valid Goal&gt;  
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByGoals(List<@Valid Goal> goals, Pageable pageable);
    /** Find a StrategicPriority by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) |  |  [optional]
        * @param status StatusEnum  
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByStatus(StrategicPriority.StatusEnum status, Pageable pageable);
    /** Find a StrategicPriority by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findById(UUID id, Pageable pageable);
    /** Find a StrategicPriority by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a StrategicPriority by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a StrategicPriority by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a StrategicPriority by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a StrategicPriority by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a StrategicPriority by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a StrategicPriority by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<StrategicPriority>
    */
    public Page<StrategicPriority> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of StrategicPriority as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of StrategicPriority instances
     */
    List<StrategicPriority> findAll();

    /** 
     * Find all instances of StrategicPriority with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of StrategicPriority instances
     */
    Page<StrategicPriority> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<StrategicPriority> findAll(Example<StrategicPriority> example, Pageable pageable);

    // end search methods
}
