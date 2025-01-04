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
import com.valkyrlabs.model.GameWeaponIDX;
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
public class WeaponService {

    @Autowired
    private WeaponRepository weaponRepository;

    @Autowired
    private WeaponPageableRepository weaponPageableRepositoryRepository;

    /** 
     * Find all instances of Weapon with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Weapon instances
     */
    public Page<Weapon> findAll(Pageable pageable){
        return weaponPageableRepositoryRepository.findAll(pageable);
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
    public Page<Weapon> findAll(Example<Weapon> example, Pageable pageable){
        return weaponPageableRepositoryRepository.findAll(example, pageable);
    }


    public WeaponRepository getRepository(){
        return weaponRepository;
    }

    // Create or Update a Weapon
    public Weapon saveOrUpdate(Weapon weapon) {
        return weaponRepository.save( weapon ); // This method handles both creation and update
        // weaponRepository.flush();
        // return ret;
    }

    // Find a Weapon by ID
    public Optional<Weapon>  findById(UUID id) {
        return weaponRepository.findById(id);
    }

    // Find all Weapons
    public Iterable<Weapon> findAll() {
        return weaponRepository.findAll();
    }

    
    /** Find a Weapon by attackId 
        
        * @param attackId UUID  [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByAttackId(  UUID  attackId){
        return weaponRepository.findWeaponByAttackId( attackId  );
    }
    /** Find a Weapon by name 
        
        * @param name String the name of the weapon [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByName(  String  name){
        return weaponRepository.findWeaponByName( name  );
    }
    /** Find a Weapon by game 
        
        * @param game [GameWeaponIDX](GameWeaponIDX.md)  [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByGame(  GameWeaponIDX  game){
        return weaponRepository.findWeaponByGame( game  );
    }
    /** Find a Weapon by harmLevel 
        
        * @param harmLevel Integer the the damage output level the weapon can have [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByHarmLevel(  Integer  harmLevel){
        return weaponRepository.findWeaponByHarmLevel( harmLevel  );
    }
    /** Find a Weapon by weight 
        
        * @param weight Integer how much one of these weapons weighs in lbs [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByWeight(  Integer  weight){
        return weaponRepository.findWeaponByWeight( weight  );
    }
    /** Find a Weapon by color 
        
        * @param color  ColorEnum  ColorEnum)  [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByColor( Weapon.ColorEnum color){
        return weaponRepository.findWeaponByColor( color  );
    }
    /** Find a Weapon by weaponType 
        
        * @param weaponType  WeaponTypeEnum  WeaponTypeEnum) the type of the weapon [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByWeaponType( Weapon.WeaponTypeEnum weaponType){
        return weaponRepository.findWeaponByWeaponType( weaponType  );
    }
    /** Find a Weapon by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponById(  UUID  id){
        return weaponRepository.findWeaponById( id  );
    }
    /** Find a Weapon by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByOwnerId(  UUID  ownerId){
        return weaponRepository.findWeaponByOwnerId( ownerId  );
    }
    /** Find a Weapon by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByCreatedDate(  OffsetDateTime  createdDate){
        return weaponRepository.findWeaponByCreatedDate( createdDate  );
    }
    /** Find a Weapon by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByKeyHash(  String  keyHash){
        return weaponRepository.findWeaponByKeyHash( keyHash  );
    }
    /** Find a Weapon by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByLastAccessedById(  UUID  lastAccessedById){
        return weaponRepository.findWeaponByLastAccessedById( lastAccessedById  );
    }
    /** Find a Weapon by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return weaponRepository.findWeaponByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Weapon by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByLastModifiedById(  UUID  lastModifiedById){
        return weaponRepository.findWeaponByLastModifiedById( lastModifiedById  );
    }
    /** Find a Weapon by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Weapon>
    */

    public List<Weapon>  findWeaponByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return weaponRepository.findWeaponByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Weapon by ID
    public void deleteById(UUID id) {
        weaponRepository.deleteById(id);
    }
}
