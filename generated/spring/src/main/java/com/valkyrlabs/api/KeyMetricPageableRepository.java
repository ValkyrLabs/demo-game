package com.valkyrlabs.api;

import com.valkyrlabs.model.KeyMetric;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: KeyMetricRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface KeyMetricPageableRepository extends Serializable, PagingAndSortingRepository<KeyMetric, UUID> {

    // ThorAPI Generated search methods for each property on KeyMetric
    /** Find a KeyMetric by goalId with pagination
        goalId ** | **UUID** |  |  [optional]
        * @param goalId UUID  
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findByGoalId(UUID goalId, Pageable pageable);
    /** Find a KeyMetric by metricName with pagination
        metricName ** | **String** |  |  [optional]
        * @param metricName String  
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findByMetricName(String metricName, Pageable pageable);
    /** Find a KeyMetric by metricValue with pagination
        metricValue ** | **Float** | actual value of the metric |  [optional]
        * @param metricValue Float actual value of the metric 
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findByMetricValue(Float metricValue, Pageable pageable);
    /** Find a KeyMetric by targetValue with pagination
        targetValue ** | **Float** | expected value of the metric |  [optional]
        * @param targetValue Float expected value of the metric 
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findByTargetValue(Float targetValue, Pageable pageable);
    /** Find a KeyMetric by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findById(UUID id, Pageable pageable);
    /** Find a KeyMetric by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a KeyMetric by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a KeyMetric by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a KeyMetric by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a KeyMetric by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a KeyMetric by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a KeyMetric by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<KeyMetric>
    */
    public Page<KeyMetric> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of KeyMetric as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of KeyMetric instances
     */
    List<KeyMetric> findAll();

    /** 
     * Find all instances of KeyMetric with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of KeyMetric instances
     */
    Page<KeyMetric> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<KeyMetric> findAll(Example<KeyMetric> example, Pageable pageable);

    // end search methods
}
