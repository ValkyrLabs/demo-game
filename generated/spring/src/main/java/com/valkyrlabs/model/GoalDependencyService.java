package com.valkyrlabs.model;

import com.valkyrlabs.api.*;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
public class GoalDependencyService {

    @Autowired
    private GoalDependencyRepository goaldependencyRepository;

    @Autowired
    private GoalDependencyPageableRepository goaldependencyPageableRepositoryRepository;

    /** 
     * Find all instances of GoalDependency with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of GoalDependency instances
     */
    public Page<GoalDependency> findAll(Pageable pageable){
        return goaldependencyPageableRepositoryRepository.findAll(pageable);
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
    public Page<GoalDependency> findAll(Example<GoalDependency> example, Pageable pageable){
        return goaldependencyPageableRepositoryRepository.findAll(example, pageable);
    }


    public GoalDependencyRepository getRepository(){
        return goaldependencyRepository;
    }

    // Create or Update a GoalDependency
    public GoalDependency saveOrUpdate(GoalDependency goaldependency) {
        return goaldependencyRepository.save( goaldependency ); // This method handles both creation and update
        // goaldependencyRepository.flush();
        // return ret;
    }

    // Find a GoalDependency by ID
    public Optional<GoalDependency>  findById(UUID id) {
        return goaldependencyRepository.findById(id);
    }

    // Find all GoalDependencys
    public Iterable<GoalDependency> findAll() {
        return goaldependencyRepository.findAll();
    }

    
    /** Find a GoalDependency by goalId 
        
        * @param goalId UUID  [optional]
        * @return List<GoalDependency>
    */

    public List<GoalDependency>  findGoalDependencyByGoalId(  UUID  goalId){
        return goaldependencyRepository.findGoalDependencyByGoalId( goalId  );
    }
    /** Find a GoalDependency by dependencyOrder 
        
        * @param dependencyOrder Integer the order in which this dependency exists [optional]
        * @return List<GoalDependency>
    */

    public List<GoalDependency>  findGoalDependencyByDependencyOrder(  Integer  dependencyOrder){
        return goaldependencyRepository.findGoalDependencyByDependencyOrder( dependencyOrder  );
    }
    /** Find a GoalDependency by dependencyName 
        
        * @param dependencyName String the name of the dependency [optional]
        * @return List<GoalDependency>
    */

    public List<GoalDependency>  findGoalDependencyByDependencyName(  String  dependencyName){
        return goaldependencyRepository.findGoalDependencyByDependencyName( dependencyName  );
    }
    /** Find a GoalDependency by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<GoalDependency>
    */

    public List<GoalDependency>  findGoalDependencyById(  UUID  id){
        return goaldependencyRepository.findGoalDependencyById( id  );
    }
    /** Find a GoalDependency by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<GoalDependency>
    */

    public List<GoalDependency>  findGoalDependencyByOwnerId(  UUID  ownerId){
        return goaldependencyRepository.findGoalDependencyByOwnerId( ownerId  );
    }
    /** Find a GoalDependency by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<GoalDependency>
    */

    public List<GoalDependency>  findGoalDependencyByCreatedDate(  OffsetDateTime  createdDate){
        return goaldependencyRepository.findGoalDependencyByCreatedDate( createdDate  );
    }
    /** Find a GoalDependency by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<GoalDependency>
    */

    public List<GoalDependency>  findGoalDependencyByKeyHash(  String  keyHash){
        return goaldependencyRepository.findGoalDependencyByKeyHash( keyHash  );
    }
    /** Find a GoalDependency by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<GoalDependency>
    */

    public List<GoalDependency>  findGoalDependencyByLastAccessedById(  UUID  lastAccessedById){
        return goaldependencyRepository.findGoalDependencyByLastAccessedById( lastAccessedById  );
    }
    /** Find a GoalDependency by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<GoalDependency>
    */

    public List<GoalDependency>  findGoalDependencyByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return goaldependencyRepository.findGoalDependencyByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a GoalDependency by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<GoalDependency>
    */

    public List<GoalDependency>  findGoalDependencyByLastModifiedById(  UUID  lastModifiedById){
        return goaldependencyRepository.findGoalDependencyByLastModifiedById( lastModifiedById  );
    }
    /** Find a GoalDependency by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<GoalDependency>
    */

    public List<GoalDependency>  findGoalDependencyByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return goaldependencyRepository.findGoalDependencyByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a GoalDependency by ID
    public void deleteById(UUID id) {
        goaldependencyRepository.deleteById(id);
    }
}
