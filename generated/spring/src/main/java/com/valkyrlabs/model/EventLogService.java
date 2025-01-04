package com.valkyrlabs.model;

import com.valkyrlabs.api.*;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Example;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/** 
*
*  ThorAPI Service Methods
*
*/
@Service
// @Transactional(readOnly = false)
public class EventLogService {

    @Autowired
    private EventLogRepository eventlogRepository;

    @Autowired
    private EventLogPageableRepository eventlogPageableRepositoryRepository;

    /** 
     * Find all instances of EventLog with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of EventLog instances
     */
    public Page<EventLog> findAll(Pageable pageable){
        return eventlogPageableRepositoryRepository.findAll(pageable);
    }

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    public Page<EventLog> findAll(Example<EventLog> example, Pageable pageable){
        return eventlogPageableRepositoryRepository.findAll(example, pageable);
    }


    public EventLogRepository getRepository(){
        return eventlogRepository;
    }

    // Create or Update a EventLog
    public EventLog saveOrUpdate(EventLog eventlog) {
        return eventlogRepository.save( eventlog ); // This method handles both creation and update
        // eventlogRepository.flush();
        // return ret;
    }

    // Find a EventLog by ID
    public Optional<EventLog>  findById(UUID id) {
        return eventlogRepository.findById(id);
    }

    // Find all EventLogs
    public Iterable<EventLog> findAll() {
        return eventlogRepository.findAll();
    }

    
    /** Find a EventLog by eventDetails 
        
        * @param eventDetails String detailed event description [optional]
        * @return List<EventLog>
    */

    public List<EventLog>  findEventLogByEventDetails(  String  eventDetails){
        return eventlogRepository.findEventLogByEventDetails( eventDetails  );
    }
    /** Find a EventLog by status 
        
        * @param status  StatusEnum  StatusEnum) status for event [optional]
        * @return List<EventLog>
    */

    public List<EventLog>  findEventLogByStatus( EventLog.StatusEnum status){
        return eventlogRepository.findEventLogByStatus( status  );
    }
    /** Find a EventLog by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<EventLog>
    */

    public List<EventLog>  findEventLogById(  UUID  id){
        return eventlogRepository.findEventLogById( id  );
    }
    /** Find a EventLog by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<EventLog>
    */

    public List<EventLog>  findEventLogByOwnerId(  UUID  ownerId){
        return eventlogRepository.findEventLogByOwnerId( ownerId  );
    }
    /** Find a EventLog by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<EventLog>
    */

    public List<EventLog>  findEventLogByCreatedDate(  OffsetDateTime  createdDate){
        return eventlogRepository.findEventLogByCreatedDate( createdDate  );
    }
    /** Find a EventLog by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<EventLog>
    */

    public List<EventLog>  findEventLogByKeyHash(  String  keyHash){
        return eventlogRepository.findEventLogByKeyHash( keyHash  );
    }
    /** Find a EventLog by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<EventLog>
    */

    public List<EventLog>  findEventLogByLastAccessedById(  UUID  lastAccessedById){
        return eventlogRepository.findEventLogByLastAccessedById( lastAccessedById  );
    }
    /** Find a EventLog by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<EventLog>
    */

    public List<EventLog>  findEventLogByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return eventlogRepository.findEventLogByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a EventLog by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<EventLog>
    */

    public List<EventLog>  findEventLogByLastModifiedById(  UUID  lastModifiedById){
        return eventlogRepository.findEventLogByLastModifiedById( lastModifiedById  );
    }
    /** Find a EventLog by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<EventLog>
    */

    public List<EventLog>  findEventLogByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return eventlogRepository.findEventLogByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a EventLog by ID
    public void deleteById(UUID id) {
        eventlogRepository.deleteById(id);
    }
}
