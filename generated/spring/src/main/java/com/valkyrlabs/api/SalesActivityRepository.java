package com.valkyrlabs.api;

import com.valkyrlabs.model.SalesActivity;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: SalesActivityRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface SalesActivityRepository extends Serializable, JpaRepository<SalesActivity, UUID> {

    // ThorAPI Generated search methods for each property on SalesActivity
    /** Find a SalesActivity by opportunityId 
        opportunityId ** | **UUID** | The associated opportunity. | 
        * @param opportunityId UUID The associated opportunity. 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByOpportunityId (  UUID opportunityId);
    /** Find a SalesActivity by type 
        type ** | [**TypeEnum**](#TypeEnum) | Type of the sales activity. | 
        * @param type TypeEnum Type of the sales activity. 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByType ( SalesActivity.TypeEnum type);
    /** Find a SalesActivity by details 
        details ** | **String** | Details about the activity. |  [optional]
        * @param details String Details about the activity. 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByDetails (  String details);
    /** Find a SalesActivity by activityDate 
        activityDate ** | **OffsetDateTime** | Date and time of the activity. | 
        * @param activityDate OffsetDateTime Date and time of the activity. 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByActivityDate (  OffsetDateTime activityDate);
    /** Find a SalesActivity by performedBy 
        performedBy ** | **UUID** | The user who performed the activity. | 
        * @param performedBy UUID The user who performed the activity. 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByPerformedBy (  UUID performedBy);
    /** Find a SalesActivity by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityById (  UUID id);
    /** Find a SalesActivity by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByOwnerId (  UUID ownerId);
    /** Find a SalesActivity by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByCreatedDate (  OffsetDateTime createdDate);
    /** Find a SalesActivity by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByKeyHash (  String keyHash);
    /** Find a SalesActivity by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByLastAccessedById (  UUID lastAccessedById);
    /** Find a SalesActivity by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a SalesActivity by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByLastModifiedById (  UUID lastModifiedById);
    /** Find a SalesActivity by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<SalesActivity>
    */
    // nullable
    public List<SalesActivity>  findSalesActivityByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
