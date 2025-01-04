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
public class SalesActivityService {

    @Autowired
    private SalesActivityRepository salesactivityRepository;

    @Autowired
    private SalesActivityPageableRepository salesactivityPageableRepositoryRepository;

    /** 
     * Find all instances of SalesActivity with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of SalesActivity instances
     */
    public Page<SalesActivity> findAll(Pageable pageable){
        return salesactivityPageableRepositoryRepository.findAll(pageable);
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
    public Page<SalesActivity> findAll(Example<SalesActivity> example, Pageable pageable){
        return salesactivityPageableRepositoryRepository.findAll(example, pageable);
    }


    public SalesActivityRepository getRepository(){
        return salesactivityRepository;
    }

    // Create or Update a SalesActivity
    public SalesActivity saveOrUpdate(SalesActivity salesactivity) {
        return salesactivityRepository.save( salesactivity ); // This method handles both creation and update
        // salesactivityRepository.flush();
        // return ret;
    }

    // Find a SalesActivity by ID
    public Optional<SalesActivity>  findById(UUID id) {
        return salesactivityRepository.findById(id);
    }

    // Find all SalesActivitys
    public Iterable<SalesActivity> findAll() {
        return salesactivityRepository.findAll();
    }

    
    /** Find a SalesActivity by opportunityId 
        
        * @param opportunityId UUID The associated opportunity.
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByOpportunityId(  UUID  opportunityId){
        return salesactivityRepository.findSalesActivityByOpportunityId( opportunityId  );
    }
    /** Find a SalesActivity by type 
        
        * @param type  TypeEnum  TypeEnum) Type of the sales activity.
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByType( SalesActivity.TypeEnum type){
        return salesactivityRepository.findSalesActivityByType( type  );
    }
    /** Find a SalesActivity by details 
        
        * @param details String Details about the activity. [optional]
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByDetails(  String  details){
        return salesactivityRepository.findSalesActivityByDetails( details  );
    }
    /** Find a SalesActivity by activityDate 
        
        * @param activityDate OffsetDateTime Date and time of the activity.
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByActivityDate(  OffsetDateTime  activityDate){
        return salesactivityRepository.findSalesActivityByActivityDate( activityDate  );
    }
    /** Find a SalesActivity by performedBy 
        
        * @param performedBy UUID The user who performed the activity.
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByPerformedBy(  UUID  performedBy){
        return salesactivityRepository.findSalesActivityByPerformedBy( performedBy  );
    }
    /** Find a SalesActivity by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityById(  UUID  id){
        return salesactivityRepository.findSalesActivityById( id  );
    }
    /** Find a SalesActivity by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByOwnerId(  UUID  ownerId){
        return salesactivityRepository.findSalesActivityByOwnerId( ownerId  );
    }
    /** Find a SalesActivity by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByCreatedDate(  OffsetDateTime  createdDate){
        return salesactivityRepository.findSalesActivityByCreatedDate( createdDate  );
    }
    /** Find a SalesActivity by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByKeyHash(  String  keyHash){
        return salesactivityRepository.findSalesActivityByKeyHash( keyHash  );
    }
    /** Find a SalesActivity by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByLastAccessedById(  UUID  lastAccessedById){
        return salesactivityRepository.findSalesActivityByLastAccessedById( lastAccessedById  );
    }
    /** Find a SalesActivity by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return salesactivityRepository.findSalesActivityByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a SalesActivity by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByLastModifiedById(  UUID  lastModifiedById){
        return salesactivityRepository.findSalesActivityByLastModifiedById( lastModifiedById  );
    }
    /** Find a SalesActivity by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<SalesActivity>
    */

    public List<SalesActivity>  findSalesActivityByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return salesactivityRepository.findSalesActivityByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a SalesActivity by ID
    public void deleteById(UUID id) {
        salesactivityRepository.deleteById(id);
    }
}
