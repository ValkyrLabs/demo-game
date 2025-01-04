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
public class DependService {

    @Autowired
    private DependRepository dependRepository;

    @Autowired
    private DependPageableRepository dependPageableRepositoryRepository;

    /** 
     * Find all instances of Depend with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Depend instances
     */
    public Page<Depend> findAll(Pageable pageable){
        return dependPageableRepositoryRepository.findAll(pageable);
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
    public Page<Depend> findAll(Example<Depend> example, Pageable pageable){
        return dependPageableRepositoryRepository.findAll(example, pageable);
    }


    public DependRepository getRepository(){
        return dependRepository;
    }

    // Create or Update a Depend
    public Depend saveOrUpdate(Depend depend) {
        return dependRepository.save( depend ); // This method handles both creation and update
        // dependRepository.flush();
        // return ret;
    }

    // Find a Depend by ID
    public Optional<Depend>  findById(UUID id) {
        return dependRepository.findById(id);
    }

    // Find all Depends
    public Iterable<Depend> findAll() {
        return dependRepository.findAll();
    }

    
    /** Find a Depend by groupId 
        
        * @param groupId String 
        * @return List<Depend>
    */

    public List<Depend>  findDependByGroupId(  String  groupId){
        return dependRepository.findDependByGroupId( groupId  );
    }
    /** Find a Depend by artifactId 
        
        * @param artifactId String 
        * @return List<Depend>
    */

    public List<Depend>  findDependByArtifactId(  String  artifactId){
        return dependRepository.findDependByArtifactId( artifactId  );
    }
    /** Find a Depend by version 
        
        * @param version String 
        * @return List<Depend>
    */

    public List<Depend>  findDependByVersion(  String  version){
        return dependRepository.findDependByVersion( version  );
    }
    /** Find a Depend by scope 
        
        * @param scope String  [optional]
        * @return List<Depend>
    */

    public List<Depend>  findDependByScope(  String  scope){
        return dependRepository.findDependByScope( scope  );
    }
    /** Find a Depend by status 
        
        * @param status  StatusEnum  StatusEnum)  [optional]
        * @return List<Depend>
    */

    public List<Depend>  findDependByStatus( Depend.StatusEnum status){
        return dependRepository.findDependByStatus( status  );
    }
    /** Find a Depend by buildId 
        
        * @param buildId UUID  [optional]
        * @return List<Depend>
    */

    public List<Depend>  findDependByBuildId(  UUID  buildId){
        return dependRepository.findDependByBuildId( buildId  );
    }
    /** Find a Depend by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Depend>
    */

    public List<Depend>  findDependById(  UUID  id){
        return dependRepository.findDependById( id  );
    }
    /** Find a Depend by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Depend>
    */

    public List<Depend>  findDependByOwnerId(  UUID  ownerId){
        return dependRepository.findDependByOwnerId( ownerId  );
    }
    /** Find a Depend by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Depend>
    */

    public List<Depend>  findDependByCreatedDate(  OffsetDateTime  createdDate){
        return dependRepository.findDependByCreatedDate( createdDate  );
    }
    /** Find a Depend by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Depend>
    */

    public List<Depend>  findDependByKeyHash(  String  keyHash){
        return dependRepository.findDependByKeyHash( keyHash  );
    }
    /** Find a Depend by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Depend>
    */

    public List<Depend>  findDependByLastAccessedById(  UUID  lastAccessedById){
        return dependRepository.findDependByLastAccessedById( lastAccessedById  );
    }
    /** Find a Depend by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Depend>
    */

    public List<Depend>  findDependByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return dependRepository.findDependByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Depend by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Depend>
    */

    public List<Depend>  findDependByLastModifiedById(  UUID  lastModifiedById){
        return dependRepository.findDependByLastModifiedById( lastModifiedById  );
    }
    /** Find a Depend by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Depend>
    */

    public List<Depend>  findDependByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return dependRepository.findDependByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Depend by ID
    public void deleteById(UUID id) {
        dependRepository.deleteById(id);
    }
}
