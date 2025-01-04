package com.valkyrlabs.api;

import com.valkyrlabs.model.EventLog;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: EventLogRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface EventLogPageableRepository extends Serializable, PagingAndSortingRepository<EventLog, UUID> {

    // ThorAPI Generated search methods for each property on EventLog
    /** Find a EventLog by eventDetails with pagination
        eventDetails ** | **String** | detailed event description |  [optional]
        * @param eventDetails String detailed event description 
        * @param pageable pagination configuration
        * @return Page<EventLog>
    */
    public Page<EventLog> findByEventDetails(String eventDetails, Pageable pageable);
    /** Find a EventLog by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) | status for event |  [optional]
        * @param status StatusEnum status for event 
        * @param pageable pagination configuration
        * @return Page<EventLog>
    */
    public Page<EventLog> findByStatus(EventLog.StatusEnum status, Pageable pageable);
    /** Find a EventLog by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<EventLog>
    */
    public Page<EventLog> findById(UUID id, Pageable pageable);
    /** Find a EventLog by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<EventLog>
    */
    public Page<EventLog> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a EventLog by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<EventLog>
    */
    public Page<EventLog> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a EventLog by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<EventLog>
    */
    public Page<EventLog> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a EventLog by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<EventLog>
    */
    public Page<EventLog> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a EventLog by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<EventLog>
    */
    public Page<EventLog> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a EventLog by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<EventLog>
    */
    public Page<EventLog> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a EventLog by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<EventLog>
    */
    public Page<EventLog> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of EventLog as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of EventLog instances
     */
    List<EventLog> findAll();

    /** 
     * Find all instances of EventLog with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of EventLog instances
     */
    Page<EventLog> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<EventLog> findAll(Example<EventLog> example, Pageable pageable);

    // end search methods
}
