package com.valkyrlabs.model;

import com.valkyrlabs.api.*;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.valkyrlabs.model.Solution;
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
public class BuildOutputService {

    @Autowired
    private BuildOutputRepository buildoutputRepository;

    @Autowired
    private BuildOutputPageableRepository buildoutputPageableRepositoryRepository;

    /** 
     * Find all instances of BuildOutput with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of BuildOutput instances
     */
    public Page<BuildOutput> findAll(Pageable pageable){
        return buildoutputPageableRepositoryRepository.findAll(pageable);
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
    public Page<BuildOutput> findAll(Example<BuildOutput> example, Pageable pageable){
        return buildoutputPageableRepositoryRepository.findAll(example, pageable);
    }


    public BuildOutputRepository getRepository(){
        return buildoutputRepository;
    }

    // Create or Update a BuildOutput
    public BuildOutput saveOrUpdate(BuildOutput buildoutput) {
        return buildoutputRepository.save( buildoutput ); // This method handles both creation and update
        // buildoutputRepository.flush();
        // return ret;
    }

    // Find a BuildOutput by ID
    public Optional<BuildOutput>  findById(UUID id) {
        return buildoutputRepository.findById(id);
    }

    // Find all BuildOutputs
    public Iterable<BuildOutput> findAll() {
        return buildoutputRepository.findAll();
    }

    
    /** Find a BuildOutput by applicationId 
        
        * @param applicationId UUID  [optional]
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputByApplicationId(  UUID  applicationId){
        return buildoutputRepository.findBuildOutputByApplicationId( applicationId  );
    }
    /** Find a BuildOutput by buildId 
        
        * @param buildId UUID 
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputByBuildId(  UUID  buildId){
        return buildoutputRepository.findBuildOutputByBuildId( buildId  );
    }
    /** Find a BuildOutput by lastSuccessfulRun 
        
        * @param lastSuccessfulRun OffsetDateTime  [optional]
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputByLastSuccessfulRun(  OffsetDateTime  lastSuccessfulRun){
        return buildoutputRepository.findBuildOutputByLastSuccessfulRun( lastSuccessfulRun  );
    }
    /** Find a BuildOutput by success 
        
        * @param success Boolean 
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputBySuccess(  Boolean  success){
        return buildoutputRepository.findBuildOutputBySuccess( success  );
    }
    /** Find a BuildOutput by output 
        
        * @param output String 
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputByOutput(  String  output){
        return buildoutputRepository.findBuildOutputByOutput( output  );
    }
    /** Find a BuildOutput by solutions 
        
        * @param solutions [ List <Solution> ](Solution)  [optional]
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputBySolutions(  List<@Valid Solution>  solutions){
        return buildoutputRepository.findBuildOutputBySolutions( solutions  );
    }
    /** Find a BuildOutput by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputById(  UUID  id){
        return buildoutputRepository.findBuildOutputById( id  );
    }
    /** Find a BuildOutput by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputByOwnerId(  UUID  ownerId){
        return buildoutputRepository.findBuildOutputByOwnerId( ownerId  );
    }
    /** Find a BuildOutput by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputByCreatedDate(  OffsetDateTime  createdDate){
        return buildoutputRepository.findBuildOutputByCreatedDate( createdDate  );
    }
    /** Find a BuildOutput by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputByKeyHash(  String  keyHash){
        return buildoutputRepository.findBuildOutputByKeyHash( keyHash  );
    }
    /** Find a BuildOutput by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputByLastAccessedById(  UUID  lastAccessedById){
        return buildoutputRepository.findBuildOutputByLastAccessedById( lastAccessedById  );
    }
    /** Find a BuildOutput by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return buildoutputRepository.findBuildOutputByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a BuildOutput by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputByLastModifiedById(  UUID  lastModifiedById){
        return buildoutputRepository.findBuildOutputByLastModifiedById( lastModifiedById  );
    }
    /** Find a BuildOutput by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<BuildOutput>
    */

    public List<BuildOutput>  findBuildOutputByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return buildoutputRepository.findBuildOutputByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a BuildOutput by ID
    public void deleteById(UUID id) {
        buildoutputRepository.deleteById(id);
    }
}
