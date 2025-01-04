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
public class SolutionService {

    @Autowired
    private SolutionRepository solutionRepository;

    @Autowired
    private SolutionPageableRepository solutionPageableRepositoryRepository;

    /** 
     * Find all instances of Solution with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Solution instances
     */
    public Page<Solution> findAll(Pageable pageable){
        return solutionPageableRepositoryRepository.findAll(pageable);
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
    public Page<Solution> findAll(Example<Solution> example, Pageable pageable){
        return solutionPageableRepositoryRepository.findAll(example, pageable);
    }


    public SolutionRepository getRepository(){
        return solutionRepository;
    }

    // Create or Update a Solution
    public Solution saveOrUpdate(Solution solution) {
        return solutionRepository.save( solution ); // This method handles both creation and update
        // solutionRepository.flush();
        // return ret;
    }

    // Find a Solution by ID
    public Optional<Solution>  findById(UUID id) {
        return solutionRepository.findById(id);
    }

    // Find all Solutions
    public Iterable<Solution> findAll() {
        return solutionRepository.findAll();
    }

    
    /** Find a Solution by buildOutputId 
        
        * @param buildOutputId UUID 
        * @return List<Solution>
    */

    public List<Solution>  findSolutionByBuildOutputId(  UUID  buildOutputId){
        return solutionRepository.findSolutionByBuildOutputId( buildOutputId  );
    }
    /** Find a Solution by description 
        
        * @param description String 
        * @return List<Solution>
    */

    public List<Solution>  findSolutionByDescription(  String  description){
        return solutionRepository.findSolutionByDescription( description  );
    }
    /** Find a Solution by appliedFix 
        
        * @param appliedFix Boolean 
        * @return List<Solution>
    */

    public List<Solution>  findSolutionByAppliedFix(  Boolean  appliedFix){
        return solutionRepository.findSolutionByAppliedFix( appliedFix  );
    }
    /** Find a Solution by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Solution>
    */

    public List<Solution>  findSolutionById(  UUID  id){
        return solutionRepository.findSolutionById( id  );
    }
    /** Find a Solution by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Solution>
    */

    public List<Solution>  findSolutionByOwnerId(  UUID  ownerId){
        return solutionRepository.findSolutionByOwnerId( ownerId  );
    }
    /** Find a Solution by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Solution>
    */

    public List<Solution>  findSolutionByCreatedDate(  OffsetDateTime  createdDate){
        return solutionRepository.findSolutionByCreatedDate( createdDate  );
    }
    /** Find a Solution by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Solution>
    */

    public List<Solution>  findSolutionByKeyHash(  String  keyHash){
        return solutionRepository.findSolutionByKeyHash( keyHash  );
    }
    /** Find a Solution by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Solution>
    */

    public List<Solution>  findSolutionByLastAccessedById(  UUID  lastAccessedById){
        return solutionRepository.findSolutionByLastAccessedById( lastAccessedById  );
    }
    /** Find a Solution by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Solution>
    */

    public List<Solution>  findSolutionByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return solutionRepository.findSolutionByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Solution by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Solution>
    */

    public List<Solution>  findSolutionByLastModifiedById(  UUID  lastModifiedById){
        return solutionRepository.findSolutionByLastModifiedById( lastModifiedById  );
    }
    /** Find a Solution by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Solution>
    */

    public List<Solution>  findSolutionByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return solutionRepository.findSolutionByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Solution by ID
    public void deleteById(UUID id) {
        solutionRepository.deleteById(id);
    }
}
