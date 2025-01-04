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
public class LevelService {

    @Autowired
    private LevelRepository levelRepository;

    @Autowired
    private LevelPageableRepository levelPageableRepositoryRepository;

    /** 
     * Find all instances of Level with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Level instances
     */
    public Page<Level> findAll(Pageable pageable){
        return levelPageableRepositoryRepository.findAll(pageable);
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
    public Page<Level> findAll(Example<Level> example, Pageable pageable){
        return levelPageableRepositoryRepository.findAll(example, pageable);
    }


    public LevelRepository getRepository(){
        return levelRepository;
    }

    // Create or Update a Level
    public Level saveOrUpdate(Level level) {
        return levelRepository.save( level ); // This method handles both creation and update
        // levelRepository.flush();
        // return ret;
    }

    // Find a Level by ID
    public Optional<Level>  findById(UUID id) {
        return levelRepository.findById(id);
    }

    // Find all Levels
    public Iterable<Level> findAll() {
        return levelRepository.findAll();
    }

    
    /** Find a Level by name 
        
        * @param name String the name of level [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByName(  String  name){
        return levelRepository.findLevelByName( name  );
    }
    /** Find a Level by level 
        
        * @param level Integer the sequential level index (if applicable) [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByLevel(  Integer  level){
        return levelRepository.findLevelByLevel( level  );
    }
    /** Find a Level by scoreMultiplier 
        
        * @param scoreMultiplier Integer use to increment extra points for harder levels [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByScoreMultiplier(  Integer  scoreMultiplier){
        return levelRepository.findLevelByScoreMultiplier( scoreMultiplier  );
    }
    /** Find a Level by color 
        
        * @param color  ColorEnum  ColorEnum)  [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByColor( Level.ColorEnum color){
        return levelRepository.findLevelByColor( color  );
    }
    /** Find a Level by levelType 
        
        * @param levelType  LevelTypeEnum  LevelTypeEnum) the type of the level [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByLevelType( Level.LevelTypeEnum levelType){
        return levelRepository.findLevelByLevelType( levelType  );
    }
    /** Find a Level by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelById(  UUID  id){
        return levelRepository.findLevelById( id  );
    }
    /** Find a Level by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByOwnerId(  UUID  ownerId){
        return levelRepository.findLevelByOwnerId( ownerId  );
    }
    /** Find a Level by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByCreatedDate(  OffsetDateTime  createdDate){
        return levelRepository.findLevelByCreatedDate( createdDate  );
    }
    /** Find a Level by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByKeyHash(  String  keyHash){
        return levelRepository.findLevelByKeyHash( keyHash  );
    }
    /** Find a Level by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByLastAccessedById(  UUID  lastAccessedById){
        return levelRepository.findLevelByLastAccessedById( lastAccessedById  );
    }
    /** Find a Level by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return levelRepository.findLevelByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Level by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByLastModifiedById(  UUID  lastModifiedById){
        return levelRepository.findLevelByLastModifiedById( lastModifiedById  );
    }
    /** Find a Level by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Level>
    */

    public List<Level>  findLevelByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return levelRepository.findLevelByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Level by ID
    public void deleteById(UUID id) {
        levelRepository.deleteById(id);
    }
}
