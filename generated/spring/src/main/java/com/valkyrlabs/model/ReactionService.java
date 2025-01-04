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
public class ReactionService {

    @Autowired
    private ReactionRepository reactionRepository;

    @Autowired
    private ReactionPageableRepository reactionPageableRepositoryRepository;

    /** 
     * Find all instances of Reaction with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Reaction instances
     */
    public Page<Reaction> findAll(Pageable pageable){
        return reactionPageableRepositoryRepository.findAll(pageable);
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
    public Page<Reaction> findAll(Example<Reaction> example, Pageable pageable){
        return reactionPageableRepositoryRepository.findAll(example, pageable);
    }


    public ReactionRepository getRepository(){
        return reactionRepository;
    }

    // Create or Update a Reaction
    public Reaction saveOrUpdate(Reaction reaction) {
        return reactionRepository.save( reaction ); // This method handles both creation and update
        // reactionRepository.flush();
        // return ret;
    }

    // Find a Reaction by ID
    public Optional<Reaction>  findById(UUID id) {
        return reactionRepository.findById(id);
    }

    // Find all Reactions
    public Iterable<Reaction> findAll() {
        return reactionRepository.findAll();
    }

    
    /** Find a Reaction by targetObject 
        
        * @param targetObject UUID UUID of the system object [optional]
        * @return List<Reaction>
    */

    public List<Reaction>  findReactionByTargetObject(  UUID  targetObject){
        return reactionRepository.findReactionByTargetObject( targetObject  );
    }
    /** Find a Reaction by reaction 
        
        * @param reaction  ReactionEnum  ReactionEnum) the reaction to the item [optional]
        * @return List<Reaction>
    */

    public List<Reaction>  findReactionByReaction( Reaction.ReactionEnum reaction){
        return reactionRepository.findReactionByReaction( reaction  );
    }
    /** Find a Reaction by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Reaction>
    */

    public List<Reaction>  findReactionById(  UUID  id){
        return reactionRepository.findReactionById( id  );
    }
    /** Find a Reaction by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Reaction>
    */

    public List<Reaction>  findReactionByOwnerId(  UUID  ownerId){
        return reactionRepository.findReactionByOwnerId( ownerId  );
    }
    /** Find a Reaction by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Reaction>
    */

    public List<Reaction>  findReactionByCreatedDate(  OffsetDateTime  createdDate){
        return reactionRepository.findReactionByCreatedDate( createdDate  );
    }
    /** Find a Reaction by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Reaction>
    */

    public List<Reaction>  findReactionByKeyHash(  String  keyHash){
        return reactionRepository.findReactionByKeyHash( keyHash  );
    }
    /** Find a Reaction by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Reaction>
    */

    public List<Reaction>  findReactionByLastAccessedById(  UUID  lastAccessedById){
        return reactionRepository.findReactionByLastAccessedById( lastAccessedById  );
    }
    /** Find a Reaction by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Reaction>
    */

    public List<Reaction>  findReactionByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return reactionRepository.findReactionByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Reaction by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Reaction>
    */

    public List<Reaction>  findReactionByLastModifiedById(  UUID  lastModifiedById){
        return reactionRepository.findReactionByLastModifiedById( lastModifiedById  );
    }
    /** Find a Reaction by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Reaction>
    */

    public List<Reaction>  findReactionByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return reactionRepository.findReactionByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Reaction by ID
    public void deleteById(UUID id) {
        reactionRepository.deleteById(id);
    }
}
