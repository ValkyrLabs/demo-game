package com.valkyrlabs.model;

import com.valkyrlabs.api.*;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.valkyrlabs.model.GameWeaponIDX;
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
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GamePageableRepository gamePageableRepositoryRepository;

    /** 
     * Find all instances of Game with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Game instances
     */
    public Page<Game> findAll(Pageable pageable){
        return gamePageableRepositoryRepository.findAll(pageable);
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
    public Page<Game> findAll(Example<Game> example, Pageable pageable){
        return gamePageableRepositoryRepository.findAll(example, pageable);
    }


    public GameRepository getRepository(){
        return gameRepository;
    }

    // Create or Update a Game
    public Game saveOrUpdate(Game game) {
        return gameRepository.save( game ); // This method handles both creation and update
        // gameRepository.flush();
        // return ret;
    }

    // Find a Game by ID
    public Optional<Game>  findById(UUID id) {
        return gameRepository.findById(id);
    }

    // Find all Games
    public Iterable<Game> findAll() {
        return gameRepository.findAll();
    }

    
    /** Find a Game by name 
        
        * @param name String the name of the game [optional]
        * @return List<Game>
    */

    public List<Game>  findGameByName(  String  name){
        return gameRepository.findGameByName( name  );
    }
    /** Find a Game by weapons 
        
        * @param weapons [ List <GameWeaponIDX> ](GameWeaponIDX)  [optional]
        * @return List<Game>
    */

    public List<Game>  findGameByWeapons(  List<@Valid GameWeaponIDX>  weapons){
        return gameRepository.findGameByWeapons( weapons  );
    }
    /** Find a Game by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Game>
    */

    public List<Game>  findGameById(  UUID  id){
        return gameRepository.findGameById( id  );
    }
    /** Find a Game by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Game>
    */

    public List<Game>  findGameByOwnerId(  UUID  ownerId){
        return gameRepository.findGameByOwnerId( ownerId  );
    }
    /** Find a Game by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Game>
    */

    public List<Game>  findGameByCreatedDate(  OffsetDateTime  createdDate){
        return gameRepository.findGameByCreatedDate( createdDate  );
    }
    /** Find a Game by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Game>
    */

    public List<Game>  findGameByKeyHash(  String  keyHash){
        return gameRepository.findGameByKeyHash( keyHash  );
    }
    /** Find a Game by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Game>
    */

    public List<Game>  findGameByLastAccessedById(  UUID  lastAccessedById){
        return gameRepository.findGameByLastAccessedById( lastAccessedById  );
    }
    /** Find a Game by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Game>
    */

    public List<Game>  findGameByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return gameRepository.findGameByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Game by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Game>
    */

    public List<Game>  findGameByLastModifiedById(  UUID  lastModifiedById){
        return gameRepository.findGameByLastModifiedById( lastModifiedById  );
    }
    /** Find a Game by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Game>
    */

    public List<Game>  findGameByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return gameRepository.findGameByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Game by ID
    public void deleteById(UUID id) {
        gameRepository.deleteById(id);
    }
}
