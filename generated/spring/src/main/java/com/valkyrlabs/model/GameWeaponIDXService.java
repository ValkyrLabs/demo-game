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
public class GameWeaponIDXService {

    @Autowired
    private GameWeaponIDXRepository gameweaponidxRepository;

    @Autowired
    private GameWeaponIDXPageableRepository gameweaponidxPageableRepositoryRepository;

    /** 
     * Find all instances of GameWeaponIDX with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of GameWeaponIDX instances
     */
    public Page<GameWeaponIDX> findAll(Pageable pageable){
        return gameweaponidxPageableRepositoryRepository.findAll(pageable);
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
    public Page<GameWeaponIDX> findAll(Example<GameWeaponIDX> example, Pageable pageable){
        return gameweaponidxPageableRepositoryRepository.findAll(example, pageable);
    }


    public GameWeaponIDXRepository getRepository(){
        return gameweaponidxRepository;
    }

    // Create or Update a GameWeaponIDX
    public GameWeaponIDX saveOrUpdate(GameWeaponIDX gameweaponidx) {
        return gameweaponidxRepository.save( gameweaponidx ); // This method handles both creation and update
        // gameweaponidxRepository.flush();
        // return ret;
    }

    // Find a GameWeaponIDX by ID
    public Optional<GameWeaponIDX>  findById(UUID id) {
        return gameweaponidxRepository.findById(id);
    }

    // Find all GameWeaponIDXs
    public Iterable<GameWeaponIDX> findAll() {
        return gameweaponidxRepository.findAll();
    }

    
    /** Find a GameWeaponIDX by gameId 
        
        * @param gameId UUID  [optional]
        * @return List<GameWeaponIDX>
    */

    public List<GameWeaponIDX>  findGameWeaponIDXByGameId(  UUID  gameId){
        return gameweaponidxRepository.findGameWeaponIDXByGameId( gameId  );
    }
    /** Find a GameWeaponIDX by weaponId 
        
        * @param weaponId UUID  [optional]
        * @return List<GameWeaponIDX>
    */

    public List<GameWeaponIDX>  findGameWeaponIDXByWeaponId(  UUID  weaponId){
        return gameweaponidxRepository.findGameWeaponIDXByWeaponId( weaponId  );
    }
    /** Find a GameWeaponIDX by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<GameWeaponIDX>
    */

    public List<GameWeaponIDX>  findGameWeaponIDXById(  UUID  id){
        return gameweaponidxRepository.findGameWeaponIDXById( id  );
    }
    /** Find a GameWeaponIDX by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<GameWeaponIDX>
    */

    public List<GameWeaponIDX>  findGameWeaponIDXByOwnerId(  UUID  ownerId){
        return gameweaponidxRepository.findGameWeaponIDXByOwnerId( ownerId  );
    }
    /** Find a GameWeaponIDX by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<GameWeaponIDX>
    */

    public List<GameWeaponIDX>  findGameWeaponIDXByCreatedDate(  OffsetDateTime  createdDate){
        return gameweaponidxRepository.findGameWeaponIDXByCreatedDate( createdDate  );
    }
    /** Find a GameWeaponIDX by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<GameWeaponIDX>
    */

    public List<GameWeaponIDX>  findGameWeaponIDXByKeyHash(  String  keyHash){
        return gameweaponidxRepository.findGameWeaponIDXByKeyHash( keyHash  );
    }
    /** Find a GameWeaponIDX by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<GameWeaponIDX>
    */

    public List<GameWeaponIDX>  findGameWeaponIDXByLastAccessedById(  UUID  lastAccessedById){
        return gameweaponidxRepository.findGameWeaponIDXByLastAccessedById( lastAccessedById  );
    }
    /** Find a GameWeaponIDX by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<GameWeaponIDX>
    */

    public List<GameWeaponIDX>  findGameWeaponIDXByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return gameweaponidxRepository.findGameWeaponIDXByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a GameWeaponIDX by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<GameWeaponIDX>
    */

    public List<GameWeaponIDX>  findGameWeaponIDXByLastModifiedById(  UUID  lastModifiedById){
        return gameweaponidxRepository.findGameWeaponIDXByLastModifiedById( lastModifiedById  );
    }
    /** Find a GameWeaponIDX by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<GameWeaponIDX>
    */

    public List<GameWeaponIDX>  findGameWeaponIDXByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return gameweaponidxRepository.findGameWeaponIDXByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a GameWeaponIDX by ID
    public void deleteById(UUID id) {
        gameweaponidxRepository.deleteById(id);
    }
}
