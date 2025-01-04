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
public class AclClassService {

    @Autowired
    private AclClassRepository aclclassRepository;

    @Autowired
    private AclClassPageableRepository aclclassPageableRepositoryRepository;

    /** 
     * Find all instances of AclClass with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of AclClass instances
     */
    public Page<AclClass> findAll(Pageable pageable){
        return aclclassPageableRepositoryRepository.findAll(pageable);
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
    public Page<AclClass> findAll(Example<AclClass> example, Pageable pageable){
        return aclclassPageableRepositoryRepository.findAll(example, pageable);
    }


    public AclClassRepository getRepository(){
        return aclclassRepository;
    }

    // Create or Update a AclClass
    public AclClass saveOrUpdate(AclClass aclclass) {
        return aclclassRepository.save( aclclass ); // This method handles both creation and update
        // aclclassRepository.flush();
        // return ret;
    }

    // Find a AclClass by ID
    public Optional<AclClass>  findById(UUID id) {
        return aclclassRepository.findById(id);
    }

    // Find all AclClasss
    public Iterable<AclClass> findAll() {
        return aclclassRepository.findAll();
    }

    
    /** Find a AclClass by className 
        
        * @param className String  [optional]
        * @return List<AclClass>
    */

    public List<AclClass>  findAclClassByClassName(  JsonNullable<@Size(max = 245) String>  className){
        return aclclassRepository.findAclClassByClassName(  className  );
    }
    /** Find a AclClass by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<AclClass>
    */

    public List<AclClass>  findAclClassById(  UUID  id){
        return aclclassRepository.findAclClassById( id  );
    }
    /** Find a AclClass by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<AclClass>
    */

    public List<AclClass>  findAclClassByOwnerId(  UUID  ownerId){
        return aclclassRepository.findAclClassByOwnerId( ownerId  );
    }
    /** Find a AclClass by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<AclClass>
    */

    public List<AclClass>  findAclClassByCreatedDate(  OffsetDateTime  createdDate){
        return aclclassRepository.findAclClassByCreatedDate( createdDate  );
    }
    /** Find a AclClass by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<AclClass>
    */

    public List<AclClass>  findAclClassByKeyHash(  String  keyHash){
        return aclclassRepository.findAclClassByKeyHash( keyHash  );
    }
    /** Find a AclClass by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<AclClass>
    */

    public List<AclClass>  findAclClassByLastAccessedById(  UUID  lastAccessedById){
        return aclclassRepository.findAclClassByLastAccessedById( lastAccessedById  );
    }
    /** Find a AclClass by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<AclClass>
    */

    public List<AclClass>  findAclClassByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return aclclassRepository.findAclClassByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a AclClass by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<AclClass>
    */

    public List<AclClass>  findAclClassByLastModifiedById(  UUID  lastModifiedById){
        return aclclassRepository.findAclClassByLastModifiedById( lastModifiedById  );
    }
    /** Find a AclClass by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<AclClass>
    */

    public List<AclClass>  findAclClassByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return aclclassRepository.findAclClassByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a AclClass by ID
    public void deleteById(UUID id) {
        aclclassRepository.deleteById(id);
    }
}
