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
import com.valkyrlabs.model.BuildOutput;
import com.valkyrlabs.model.Depend;
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
public class BuildService {

    @Autowired
    private BuildRepository buildRepository;

    @Autowired
    private BuildPageableRepository buildPageableRepositoryRepository;

    /** 
     * Find all instances of Build with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Build instances
     */
    public Page<Build> findAll(Pageable pageable){
        return buildPageableRepositoryRepository.findAll(pageable);
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
    public Page<Build> findAll(Example<Build> example, Pageable pageable){
        return buildPageableRepositoryRepository.findAll(example, pageable);
    }


    public BuildRepository getRepository(){
        return buildRepository;
    }

    // Create or Update a Build
    public Build saveOrUpdate(Build build) {
        return buildRepository.save( build ); // This method handles both creation and update
        // buildRepository.flush();
        // return ret;
    }

    // Find a Build by ID
    public Optional<Build>  findById(UUID id) {
        return buildRepository.findById(id);
    }

    // Find all Builds
    public Iterable<Build> findAll() {
        return buildRepository.findAll();
    }

    
    /** Find a Build by name 
        
        * @param name String 
        * @return List<Build>
    */

    public List<Build>  findBuildByName(  String  name){
        return buildRepository.findBuildByName( name  );
    }
    /** Find a Build by applicationId 
        
        * @param applicationId UUID  [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildByApplicationId(  UUID  applicationId){
        return buildRepository.findBuildByApplicationId( applicationId  );
    }
    /** Find a Build by status 
        
        * @param status  StatusEnum  StatusEnum) 
        * @return List<Build>
    */

    public List<Build>  findBuildByStatus( Build.StatusEnum status){
        return buildRepository.findBuildByStatus( status  );
    }
    /** Find a Build by projectPath 
        
        * @param projectPath String 
        * @return List<Build>
    */

    public List<Build>  findBuildByProjectPath(  String  projectPath){
        return buildRepository.findBuildByProjectPath( projectPath  );
    }
    /** Find a Build by testEnumCodegen 
        
        * @param testEnumCodegen  TestEnumCodegenEnum  TestEnumCodegenEnum)  [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildByTestEnumCodegen( Build.TestEnumCodegenEnum testEnumCodegen){
        return buildRepository.findBuildByTestEnumCodegen( testEnumCodegen  );
    }
    /** Find a Build by mavenHome 
        
        * @param mavenHome String 
        * @return List<Build>
    */

    public List<Build>  findBuildByMavenHome(  String  mavenHome){
        return buildRepository.findBuildByMavenHome( mavenHome  );
    }
    /** Find a Build by outputs 
        
        * @param outputs [ List <BuildOutput> ](BuildOutput)  [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildByOutputs(  List<@Valid BuildOutput>  outputs){
        return buildRepository.findBuildByOutputs( outputs  );
    }
    /** Find a Build by dependencies 
        
        * @param dependencies [ List <Depend> ](Depend)  [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildByDependencies(  List<@Valid Depend>  dependencies){
        return buildRepository.findBuildByDependencies( dependencies  );
    }
    /** Find a Build by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildById(  UUID  id){
        return buildRepository.findBuildById( id  );
    }
    /** Find a Build by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildByOwnerId(  UUID  ownerId){
        return buildRepository.findBuildByOwnerId( ownerId  );
    }
    /** Find a Build by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildByCreatedDate(  OffsetDateTime  createdDate){
        return buildRepository.findBuildByCreatedDate( createdDate  );
    }
    /** Find a Build by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildByKeyHash(  String  keyHash){
        return buildRepository.findBuildByKeyHash( keyHash  );
    }
    /** Find a Build by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildByLastAccessedById(  UUID  lastAccessedById){
        return buildRepository.findBuildByLastAccessedById( lastAccessedById  );
    }
    /** Find a Build by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return buildRepository.findBuildByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Build by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildByLastModifiedById(  UUID  lastModifiedById){
        return buildRepository.findBuildByLastModifiedById( lastModifiedById  );
    }
    /** Find a Build by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Build>
    */

    public List<Build>  findBuildByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return buildRepository.findBuildByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Build by ID
    public void deleteById(UUID id) {
        buildRepository.deleteById(id);
    }
}
