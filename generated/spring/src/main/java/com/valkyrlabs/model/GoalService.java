package com.valkyrlabs.model;

import com.valkyrlabs.api.*;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.valkyrlabs.model.GoalDependency;
import com.valkyrlabs.model.KeyMetric;
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
public class GoalService {

    @Autowired
    private GoalRepository goalRepository;

    @Autowired
    private GoalPageableRepository goalPageableRepositoryRepository;

    /** 
     * Find all instances of Goal with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Goal instances
     */
    public Page<Goal> findAll(Pageable pageable){
        return goalPageableRepositoryRepository.findAll(pageable);
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
    public Page<Goal> findAll(Example<Goal> example, Pageable pageable){
        return goalPageableRepositoryRepository.findAll(example, pageable);
    }


    public GoalRepository getRepository(){
        return goalRepository;
    }

    // Create or Update a Goal
    public Goal saveOrUpdate(Goal goal) {
        return goalRepository.save( goal ); // This method handles both creation and update
        // goalRepository.flush();
        // return ret;
    }

    // Find a Goal by ID
    public Optional<Goal>  findById(UUID id) {
        return goalRepository.findById(id);
    }

    // Find all Goals
    public Iterable<Goal> findAll() {
        return goalRepository.findAll();
    }

    
    /** Find a Goal by strategicPriorityId 
        
        * @param strategicPriorityId UUID The strategic priority that this goal supports. [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByStrategicPriorityId(  UUID  strategicPriorityId){
        return goalRepository.findGoalByStrategicPriorityId( strategicPriorityId  );
    }
    /** Find a Goal by name 
        
        * @param name String the name of the goal [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByName(  String  name){
        return goalRepository.findGoalByName( name  );
    }
    /** Find a Goal by description 
        
        * @param description String the description of the goal [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByDescription(  String  description){
        return goalRepository.findGoalByDescription( description  );
    }
    /** Find a Goal by keyMetrics 
        
        * @param keyMetrics [ List <KeyMetric> ](KeyMetric) measurements used to track success [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByKeyMetrics(  List<@Valid KeyMetric>  keyMetrics){
        return goalRepository.findGoalByKeyMetrics( keyMetrics  );
    }
    /** Find a Goal by goalDependencies 
        
        * @param goalDependencies [ List <GoalDependency> ](GoalDependency)  [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByGoalDependencies(  List<@Valid GoalDependency>  goalDependencies){
        return goalRepository.findGoalByGoalDependencies( goalDependencies  );
    }
    /** Find a Goal by expectedOutcome 
        
        * @param expectedOutcome String the positive expected outcome of the goal [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByExpectedOutcome(  String  expectedOutcome){
        return goalRepository.findGoalByExpectedOutcome( expectedOutcome  );
    }
    /** Find a Goal by risks 
        
        * @param risks String description of the risk if the goal is not successful [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByRisks(  String  risks){
        return goalRepository.findGoalByRisks( risks  );
    }
    /** Find a Goal by timeline 
        
        * @param timeline String  [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByTimeline(  String  timeline){
        return goalRepository.findGoalByTimeline( timeline  );
    }
    /** Find a Goal by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalById(  UUID  id){
        return goalRepository.findGoalById( id  );
    }
    /** Find a Goal by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByOwnerId(  UUID  ownerId){
        return goalRepository.findGoalByOwnerId( ownerId  );
    }
    /** Find a Goal by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByCreatedDate(  OffsetDateTime  createdDate){
        return goalRepository.findGoalByCreatedDate( createdDate  );
    }
    /** Find a Goal by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByKeyHash(  String  keyHash){
        return goalRepository.findGoalByKeyHash( keyHash  );
    }
    /** Find a Goal by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByLastAccessedById(  UUID  lastAccessedById){
        return goalRepository.findGoalByLastAccessedById( lastAccessedById  );
    }
    /** Find a Goal by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return goalRepository.findGoalByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Goal by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByLastModifiedById(  UUID  lastModifiedById){
        return goalRepository.findGoalByLastModifiedById( lastModifiedById  );
    }
    /** Find a Goal by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Goal>
    */

    public List<Goal>  findGoalByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return goalRepository.findGoalByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Goal by ID
    public void deleteById(UUID id) {
        goalRepository.deleteById(id);
    }
}
