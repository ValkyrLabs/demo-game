package com.valkyrlabs.api;

import com.valkyrlabs.model.KeyMetric;

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

    AUTO IMPLEMENTED by Spring as bean: KeyMetricRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface KeyMetricRepository extends Serializable, JpaRepository<KeyMetric, UUID> {

    // ThorAPI Generated search methods for each property on KeyMetric
    /** Find a KeyMetric by goalId 
        goalId ** | **UUID** |  |  [optional]
        * @param goalId UUID  
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricByGoalId (  UUID goalId);
    /** Find a KeyMetric by metricName 
        metricName ** | **String** |  |  [optional]
        * @param metricName String  
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricByMetricName (  String metricName);
    /** Find a KeyMetric by metricValue 
        metricValue ** | **Float** | actual value of the metric |  [optional]
        * @param metricValue Float actual value of the metric 
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricByMetricValue (  Float metricValue);
    /** Find a KeyMetric by targetValue 
        targetValue ** | **Float** | expected value of the metric |  [optional]
        * @param targetValue Float expected value of the metric 
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricByTargetValue (  Float targetValue);
    /** Find a KeyMetric by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricById (  UUID id);
    /** Find a KeyMetric by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricByOwnerId (  UUID ownerId);
    /** Find a KeyMetric by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricByCreatedDate (  OffsetDateTime createdDate);
    /** Find a KeyMetric by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricByKeyHash (  String keyHash);
    /** Find a KeyMetric by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricByLastAccessedById (  UUID lastAccessedById);
    /** Find a KeyMetric by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a KeyMetric by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricByLastModifiedById (  UUID lastModifiedById);
    /** Find a KeyMetric by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<KeyMetric>
    */
    // nullable
    public List<KeyMetric>  findKeyMetricByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
