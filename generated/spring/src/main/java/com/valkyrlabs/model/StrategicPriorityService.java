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
import com.valkyrlabs.model.Goal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class StrategicPriorityService {

    @Autowired
    private StrategicPriorityRepository strategicpriorityRepository;

    @Autowired
    private StrategicPriorityPageableRepository strategicpriorityPageableRepositoryRepository;

    /** 
     * Find all instances of StrategicPriority with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of StrategicPriority instances
     */
    public Page<StrategicPriority> findAll(Pageable pageable){
        return strategicpriorityPageableRepositoryRepository.findAll(pageable);
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
    public Page<StrategicPriority> findAll(Example<StrategicPriority> example, Pageable pageable){
        return strategicpriorityPageableRepositoryRepository.findAll(example, pageable);
    }


    public StrategicPriorityRepository getRepository(){
        return strategicpriorityRepository;
    }

    // Create or Update a StrategicPriority
    public StrategicPriority saveOrUpdate(StrategicPriority strategicpriority) {
        return strategicpriorityRepository.save( strategicpriority ); // This method handles both creation and update
        // strategicpriorityRepository.flush();
        // return ret;
    }

    // Find a StrategicPriority by ID
    public Optional<StrategicPriority>  findById(UUID id) {
        return strategicpriorityRepository.findById(id);
    }

    // Find all StrategicPrioritys
    public Iterable<StrategicPriority> findAll() {
        return strategicpriorityRepository.findAll();
    }

    
    /** Find a StrategicPriority by name 
        
        * @param name String  [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByName(  String  name){
        return strategicpriorityRepository.findStrategicPriorityByName( name  );
    }
    /** Find a StrategicPriority by description 
        
        * @param description String high-level description of the strategic priority [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByDescription(  String  description){
        return strategicpriorityRepository.findStrategicPriorityByDescription( description  );
    }
    /** Find a StrategicPriority by priorityLevel 
        
        * @param priorityLevel  PriorityLevelEnum  PriorityLevelEnum)  [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByPriorityLevel( StrategicPriority.PriorityLevelEnum priorityLevel){
        return strategicpriorityRepository.findStrategicPriorityByPriorityLevel( priorityLevel  );
    }
    /** Find a StrategicPriority by imageUrl 
        
        * @param imageUrl String URL for the strategic priority [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByImageUrl(  String  imageUrl){
        return strategicpriorityRepository.findStrategicPriorityByImageUrl( imageUrl  );
    }
    /** Find a StrategicPriority by startDate 
        
        * @param startDate LocalDate  [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByStartDate(  LocalDate  startDate){
        return strategicpriorityRepository.findStrategicPriorityByStartDate( startDate  );
    }
    /** Find a StrategicPriority by targetDate 
        
        * @param targetDate LocalDate  [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByTargetDate(  LocalDate  targetDate){
        return strategicpriorityRepository.findStrategicPriorityByTargetDate( targetDate  );
    }
    /** Find a StrategicPriority by goals 
        
        * @param goals [ List <Goal> ](Goal)  [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByGoals(  List<@Valid Goal>  goals){
        return strategicpriorityRepository.findStrategicPriorityByGoals( goals  );
    }
    /** Find a StrategicPriority by status 
        
        * @param status  StatusEnum  StatusEnum)  [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByStatus( StrategicPriority.StatusEnum status){
        return strategicpriorityRepository.findStrategicPriorityByStatus( status  );
    }
    /** Find a StrategicPriority by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityById(  UUID  id){
        return strategicpriorityRepository.findStrategicPriorityById( id  );
    }
    /** Find a StrategicPriority by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByOwnerId(  UUID  ownerId){
        return strategicpriorityRepository.findStrategicPriorityByOwnerId( ownerId  );
    }
    /** Find a StrategicPriority by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByCreatedDate(  OffsetDateTime  createdDate){
        return strategicpriorityRepository.findStrategicPriorityByCreatedDate( createdDate  );
    }
    /** Find a StrategicPriority by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByKeyHash(  String  keyHash){
        return strategicpriorityRepository.findStrategicPriorityByKeyHash( keyHash  );
    }
    /** Find a StrategicPriority by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByLastAccessedById(  UUID  lastAccessedById){
        return strategicpriorityRepository.findStrategicPriorityByLastAccessedById( lastAccessedById  );
    }
    /** Find a StrategicPriority by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return strategicpriorityRepository.findStrategicPriorityByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a StrategicPriority by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByLastModifiedById(  UUID  lastModifiedById){
        return strategicpriorityRepository.findStrategicPriorityByLastModifiedById( lastModifiedById  );
    }
    /** Find a StrategicPriority by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<StrategicPriority>
    */

    public List<StrategicPriority>  findStrategicPriorityByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return strategicpriorityRepository.findStrategicPriorityByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a StrategicPriority by ID
    public void deleteById(UUID id) {
        strategicpriorityRepository.deleteById(id);
    }
}
