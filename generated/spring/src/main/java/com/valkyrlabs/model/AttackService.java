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
import com.valkyrlabs.model.Weapon;
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
public class AttackService {

    @Autowired
    private AttackRepository attackRepository;

    @Autowired
    private AttackPageableRepository attackPageableRepositoryRepository;

    /** 
     * Find all instances of Attack with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Attack instances
     */
    public Page<Attack> findAll(Pageable pageable){
        return attackPageableRepositoryRepository.findAll(pageable);
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
    public Page<Attack> findAll(Example<Attack> example, Pageable pageable){
        return attackPageableRepositoryRepository.findAll(example, pageable);
    }


    public AttackRepository getRepository(){
        return attackRepository;
    }

    // Create or Update a Attack
    public Attack saveOrUpdate(Attack attack) {
        return attackRepository.save( attack ); // This method handles both creation and update
        // attackRepository.flush();
        // return ret;
    }

    // Find a Attack by ID
    public Optional<Attack>  findById(UUID id) {
        return attackRepository.findById(id);
    }

    // Find all Attacks
    public Iterable<Attack> findAll() {
        return attackRepository.findAll();
    }

    
    /** Find a Attack by name 
        
        * @param name String the name of the attack [optional]
        * @return List<Attack>
    */

    public List<Attack>  findAttackByName(  String  name){
        return attackRepository.findAttackByName( name  );
    }
    /** Find a Attack by type 
        
        * @param type  TypeEnum  TypeEnum)  [optional]
        * @return List<Attack>
    */

    public List<Attack>  findAttackByType( Attack.TypeEnum type){
        return attackRepository.findAttackByType( type  );
    }
    /** Find a Attack by weapon 
        
        * @param weapon [Weapon](Weapon.md)  [optional]
        * @return List<Attack>
    */

    public List<Attack>  findAttackByWeapon(  Weapon  weapon){
        return attackRepository.findAttackByWeapon( weapon  );
    }
    /** Find a Attack by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Attack>
    */

    public List<Attack>  findAttackById(  UUID  id){
        return attackRepository.findAttackById( id  );
    }
    /** Find a Attack by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Attack>
    */

    public List<Attack>  findAttackByOwnerId(  UUID  ownerId){
        return attackRepository.findAttackByOwnerId( ownerId  );
    }
    /** Find a Attack by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Attack>
    */

    public List<Attack>  findAttackByCreatedDate(  OffsetDateTime  createdDate){
        return attackRepository.findAttackByCreatedDate( createdDate  );
    }
    /** Find a Attack by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Attack>
    */

    public List<Attack>  findAttackByKeyHash(  String  keyHash){
        return attackRepository.findAttackByKeyHash( keyHash  );
    }
    /** Find a Attack by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Attack>
    */

    public List<Attack>  findAttackByLastAccessedById(  UUID  lastAccessedById){
        return attackRepository.findAttackByLastAccessedById( lastAccessedById  );
    }
    /** Find a Attack by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Attack>
    */

    public List<Attack>  findAttackByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return attackRepository.findAttackByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Attack by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Attack>
    */

    public List<Attack>  findAttackByLastModifiedById(  UUID  lastModifiedById){
        return attackRepository.findAttackByLastModifiedById( lastModifiedById  );
    }
    /** Find a Attack by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Attack>
    */

    public List<Attack>  findAttackByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return attackRepository.findAttackByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Attack by ID
    public void deleteById(UUID id) {
        attackRepository.deleteById(id);
    }
}
