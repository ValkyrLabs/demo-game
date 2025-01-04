package com.valkyrlabs.api;

import com.valkyrlabs.model.EventLog;

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

    AUTO IMPLEMENTED by Spring as bean: EventLogRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface EventLogRepository extends Serializable, JpaRepository<EventLog, UUID> {

    // ThorAPI Generated search methods for each property on EventLog
    /** Find a EventLog by eventDetails 
        eventDetails ** | **String** | detailed event description |  [optional]
        * @param eventDetails String detailed event description 
        * @return List<EventLog>
    */
    // nullable
    public List<EventLog>  findEventLogByEventDetails (  String eventDetails);
    /** Find a EventLog by status 
        status ** | [**StatusEnum**](#StatusEnum) | status for event |  [optional]
        * @param status StatusEnum status for event 
        * @return List<EventLog>
    */
    // nullable
    public List<EventLog>  findEventLogByStatus ( EventLog.StatusEnum status);
    /** Find a EventLog by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<EventLog>
    */
    // nullable
    public List<EventLog>  findEventLogById (  UUID id);
    /** Find a EventLog by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<EventLog>
    */
    // nullable
    public List<EventLog>  findEventLogByOwnerId (  UUID ownerId);
    /** Find a EventLog by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<EventLog>
    */
    // nullable
    public List<EventLog>  findEventLogByCreatedDate (  OffsetDateTime createdDate);
    /** Find a EventLog by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<EventLog>
    */
    // nullable
    public List<EventLog>  findEventLogByKeyHash (  String keyHash);
    /** Find a EventLog by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<EventLog>
    */
    // nullable
    public List<EventLog>  findEventLogByLastAccessedById (  UUID lastAccessedById);
    /** Find a EventLog by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<EventLog>
    */
    // nullable
    public List<EventLog>  findEventLogByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a EventLog by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<EventLog>
    */
    // nullable
    public List<EventLog>  findEventLogByLastModifiedById (  UUID lastModifiedById);
    /** Find a EventLog by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<EventLog>
    */
    // nullable
    public List<EventLog>  findEventLogByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
