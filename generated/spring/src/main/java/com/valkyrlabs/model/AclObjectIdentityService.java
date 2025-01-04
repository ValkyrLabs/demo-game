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
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;

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
public class AclObjectIdentityService {

    @Autowired
    private AclObjectIdentityRepository aclobjectidentityRepository;

    @Autowired
    private AclObjectIdentityPageableRepository aclobjectidentityPageableRepositoryRepository;

    /** 
     * Find all instances of AclObjectIdentity with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of AclObjectIdentity instances
     */
    public Page<AclObjectIdentity> findAll(Pageable pageable){
        return aclobjectidentityPageableRepositoryRepository.findAll(pageable);
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
    public Page<AclObjectIdentity> findAll(Example<AclObjectIdentity> example, Pageable pageable){
        return aclobjectidentityPageableRepositoryRepository.findAll(example, pageable);
    }


    public AclObjectIdentityRepository getRepository(){
        return aclobjectidentityRepository;
    }

    // Create or Update a AclObjectIdentity
    public AclObjectIdentity saveOrUpdate(AclObjectIdentity aclobjectidentity) {
        return aclobjectidentityRepository.save( aclobjectidentity ); // This method handles both creation and update
        // aclobjectidentityRepository.flush();
        // return ret;
    }

    // Find a AclObjectIdentity by ID
    public Optional<AclObjectIdentity>  findById(UUID id) {
        return aclobjectidentityRepository.findById(id);
    }

    // Find all AclObjectIdentitys
    public Iterable<AclObjectIdentity> findAll() {
        return aclobjectidentityRepository.findAll();
    }

    
    /** Find a AclObjectIdentity by objectIdClass 
        
        * @param objectIdClass UUID  [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByObjectIdClass(  JsonNullable<UUID>  objectIdClass){
        return aclobjectidentityRepository.findAclObjectIdentityByObjectIdClass(  objectIdClass  );
    }
    /** Find a AclObjectIdentity by objectIdIdentity 
        
        * @param objectIdIdentity UUID  [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByObjectIdIdentity(  JsonNullable<UUID>  objectIdIdentity){
        return aclobjectidentityRepository.findAclObjectIdentityByObjectIdIdentity(  objectIdIdentity  );
    }
    /** Find a AclObjectIdentity by parentObject 
        
        * @param parentObject UUID  [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByParentObject(  JsonNullable<UUID>  parentObject){
        return aclobjectidentityRepository.findAclObjectIdentityByParentObject(  parentObject  );
    }
    /** Find a AclObjectIdentity by ownerSid 
        
        * @param ownerSid UUID  [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByOwnerSid(  JsonNullable<UUID>  ownerSid){
        return aclobjectidentityRepository.findAclObjectIdentityByOwnerSid(  ownerSid  );
    }
    /** Find a AclObjectIdentity by entriesInheriting 
        
        * @param entriesInheriting Integer  [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByEntriesInheriting(  JsonNullable<Integer>  entriesInheriting){
        return aclobjectidentityRepository.findAclObjectIdentityByEntriesInheriting(  entriesInheriting  );
    }
    /** Find a AclObjectIdentity by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityById(  UUID  id){
        return aclobjectidentityRepository.findAclObjectIdentityById( id  );
    }
    /** Find a AclObjectIdentity by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByOwnerId(  UUID  ownerId){
        return aclobjectidentityRepository.findAclObjectIdentityByOwnerId( ownerId  );
    }
    /** Find a AclObjectIdentity by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByCreatedDate(  OffsetDateTime  createdDate){
        return aclobjectidentityRepository.findAclObjectIdentityByCreatedDate( createdDate  );
    }
    /** Find a AclObjectIdentity by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByKeyHash(  String  keyHash){
        return aclobjectidentityRepository.findAclObjectIdentityByKeyHash( keyHash  );
    }
    /** Find a AclObjectIdentity by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByLastAccessedById(  UUID  lastAccessedById){
        return aclobjectidentityRepository.findAclObjectIdentityByLastAccessedById( lastAccessedById  );
    }
    /** Find a AclObjectIdentity by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return aclobjectidentityRepository.findAclObjectIdentityByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a AclObjectIdentity by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByLastModifiedById(  UUID  lastModifiedById){
        return aclobjectidentityRepository.findAclObjectIdentityByLastModifiedById( lastModifiedById  );
    }
    /** Find a AclObjectIdentity by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<AclObjectIdentity>
    */

    public List<AclObjectIdentity>  findAclObjectIdentityByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return aclobjectidentityRepository.findAclObjectIdentityByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a AclObjectIdentity by ID
    public void deleteById(UUID id) {
        aclobjectidentityRepository.deleteById(id);
    }
}
