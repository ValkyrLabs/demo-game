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
public class AclEntryService {

    @Autowired
    private AclEntryRepository aclentryRepository;

    @Autowired
    private AclEntryPageableRepository aclentryPageableRepositoryRepository;

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    public Page<AclEntry> findAll(Pageable pageable){
        return aclentryPageableRepositoryRepository.findAll(pageable);
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
    public Page<AclEntry> findAll(Example<AclEntry> example, Pageable pageable){
        return aclentryPageableRepositoryRepository.findAll(example, pageable);
    }


    public AclEntryRepository getRepository(){
        return aclentryRepository;
    }

    // Create or Update a AclEntry
    public AclEntry saveOrUpdate(AclEntry aclentry) {
        return aclentryRepository.save( aclentry ); // This method handles both creation and update
        // aclentryRepository.flush();
        // return ret;
    }

    // Find a AclEntry by ID
    public Optional<AclEntry>  findById(UUID id) {
        return aclentryRepository.findById(id);
    }

    // Find all AclEntrys
    public Iterable<AclEntry> findAll() {
        return aclentryRepository.findAll();
    }

    
    /** Find a AclEntry by aclObjectOdentity 
        
        * @param aclObjectOdentity UUID  [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByAclObjectOdentity(  JsonNullable<UUID>  aclObjectOdentity){
        return aclentryRepository.findAclEntryByAclObjectOdentity(  aclObjectOdentity  );
    }
    /** Find a AclEntry by aceOrder 
        
        * @param aceOrder Integer  [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByAceOrder(  JsonNullable<Integer>  aceOrder){
        return aclentryRepository.findAclEntryByAceOrder(  aceOrder  );
    }
    /** Find a AclEntry by sid 
        
        * @param sid UUID  [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryBySid(  JsonNullable<UUID>  sid){
        return aclentryRepository.findAclEntryBySid(  sid  );
    }
    /** Find a AclEntry by mask 
        
        * @param mask Integer  [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByMask(  JsonNullable<Integer>  mask){
        return aclentryRepository.findAclEntryByMask(  mask  );
    }
    /** Find a AclEntry by granting 
        
        * @param granting Integer  [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByGranting(  JsonNullable<Integer>  granting){
        return aclentryRepository.findAclEntryByGranting(  granting  );
    }
    /** Find a AclEntry by auditSuccess 
        
        * @param auditSuccess Integer  [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByAuditSuccess(  JsonNullable<Integer>  auditSuccess){
        return aclentryRepository.findAclEntryByAuditSuccess(  auditSuccess  );
    }
    /** Find a AclEntry by auditFailure 
        
        * @param auditFailure Integer  [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByAuditFailure(  JsonNullable<Integer>  auditFailure){
        return aclentryRepository.findAclEntryByAuditFailure(  auditFailure  );
    }
    /** Find a AclEntry by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryById(  UUID  id){
        return aclentryRepository.findAclEntryById( id  );
    }
    /** Find a AclEntry by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByOwnerId(  UUID  ownerId){
        return aclentryRepository.findAclEntryByOwnerId( ownerId  );
    }
    /** Find a AclEntry by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByCreatedDate(  OffsetDateTime  createdDate){
        return aclentryRepository.findAclEntryByCreatedDate( createdDate  );
    }
    /** Find a AclEntry by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByKeyHash(  String  keyHash){
        return aclentryRepository.findAclEntryByKeyHash( keyHash  );
    }
    /** Find a AclEntry by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByLastAccessedById(  UUID  lastAccessedById){
        return aclentryRepository.findAclEntryByLastAccessedById( lastAccessedById  );
    }
    /** Find a AclEntry by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return aclentryRepository.findAclEntryByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a AclEntry by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByLastModifiedById(  UUID  lastModifiedById){
        return aclentryRepository.findAclEntryByLastModifiedById( lastModifiedById  );
    }
    /** Find a AclEntry by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<AclEntry>
    */

    public List<AclEntry>  findAclEntryByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return aclentryRepository.findAclEntryByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a AclEntry by ID
    public void deleteById(UUID id) {
        aclentryRepository.deleteById(id);
    }
}
