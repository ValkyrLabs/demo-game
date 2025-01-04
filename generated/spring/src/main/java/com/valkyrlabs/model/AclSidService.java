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
public class AclSidService {

    @Autowired
    private AclSidRepository aclsidRepository;

    @Autowired
    private AclSidPageableRepository aclsidPageableRepositoryRepository;

    /** 
     * Find all instances of AclSid with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of AclSid instances
     */
    public Page<AclSid> findAll(Pageable pageable){
        return aclsidPageableRepositoryRepository.findAll(pageable);
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
    public Page<AclSid> findAll(Example<AclSid> example, Pageable pageable){
        return aclsidPageableRepositoryRepository.findAll(example, pageable);
    }


    public AclSidRepository getRepository(){
        return aclsidRepository;
    }

    // Create or Update a AclSid
    public AclSid saveOrUpdate(AclSid aclsid) {
        return aclsidRepository.save( aclsid ); // This method handles both creation and update
        // aclsidRepository.flush();
        // return ret;
    }

    // Find a AclSid by ID
    public Optional<AclSid>  findById(UUID id) {
        return aclsidRepository.findById(id);
    }

    // Find all AclSids
    public Iterable<AclSid> findAll() {
        return aclsidRepository.findAll();
    }

    
    /** Find a AclSid by sid 
        
        * @param sid String  [optional]
        * @return List<AclSid>
    */

    public List<AclSid>  findAclSidBySid(  JsonNullable<@Size(max = 245) String>  sid){
        return aclsidRepository.findAclSidBySid(  sid  );
    }
    /** Find a AclSid by principal 
        
        * @param principal UUID  [optional]
        * @return List<AclSid>
    */

    public List<AclSid>  findAclSidByPrincipal(  JsonNullable<UUID>  principal){
        return aclsidRepository.findAclSidByPrincipal(  principal  );
    }
    /** Find a AclSid by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<AclSid>
    */

    public List<AclSid>  findAclSidById(  UUID  id){
        return aclsidRepository.findAclSidById( id  );
    }
    /** Find a AclSid by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<AclSid>
    */

    public List<AclSid>  findAclSidByOwnerId(  UUID  ownerId){
        return aclsidRepository.findAclSidByOwnerId( ownerId  );
    }
    /** Find a AclSid by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<AclSid>
    */

    public List<AclSid>  findAclSidByCreatedDate(  OffsetDateTime  createdDate){
        return aclsidRepository.findAclSidByCreatedDate( createdDate  );
    }
    /** Find a AclSid by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<AclSid>
    */

    public List<AclSid>  findAclSidByKeyHash(  String  keyHash){
        return aclsidRepository.findAclSidByKeyHash( keyHash  );
    }
    /** Find a AclSid by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<AclSid>
    */

    public List<AclSid>  findAclSidByLastAccessedById(  UUID  lastAccessedById){
        return aclsidRepository.findAclSidByLastAccessedById( lastAccessedById  );
    }
    /** Find a AclSid by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<AclSid>
    */

    public List<AclSid>  findAclSidByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return aclsidRepository.findAclSidByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a AclSid by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<AclSid>
    */

    public List<AclSid>  findAclSidByLastModifiedById(  UUID  lastModifiedById){
        return aclsidRepository.findAclSidByLastModifiedById( lastModifiedById  );
    }
    /** Find a AclSid by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<AclSid>
    */

    public List<AclSid>  findAclSidByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return aclsidRepository.findAclSidByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a AclSid by ID
    public void deleteById(UUID id) {
        aclsidRepository.deleteById(id);
    }
}
