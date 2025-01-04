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
public class PersistentLoginService {

    @Autowired
    private PersistentLoginRepository persistentloginRepository;

    @Autowired
    private PersistentLoginPageableRepository persistentloginPageableRepositoryRepository;

    /** 
     * Find all instances of PersistentLogin with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of PersistentLogin instances
     */
    public Page<PersistentLogin> findAll(Pageable pageable){
        return persistentloginPageableRepositoryRepository.findAll(pageable);
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
    public Page<PersistentLogin> findAll(Example<PersistentLogin> example, Pageable pageable){
        return persistentloginPageableRepositoryRepository.findAll(example, pageable);
    }


    public PersistentLoginRepository getRepository(){
        return persistentloginRepository;
    }

    // Create or Update a PersistentLogin
    public PersistentLogin saveOrUpdate(PersistentLogin persistentlogin) {
        return persistentloginRepository.save( persistentlogin ); // This method handles both creation and update
        // persistentloginRepository.flush();
        // return ret;
    }

    // Find a PersistentLogin by ID
    public Optional<PersistentLogin>  findById(UUID id) {
        return persistentloginRepository.findById(id);
    }

    // Find all PersistentLogins
    public Iterable<PersistentLogin> findAll() {
        return persistentloginRepository.findAll();
    }

    
    /** Find a PersistentLogin by username 
        
        * @param username String 
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginByUsername(  String  username){
        return persistentloginRepository.findPersistentLoginByUsername( username  );
    }
    /** Find a PersistentLogin by series 
        
        * @param series String 
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginBySeries(  String  series){
        return persistentloginRepository.findPersistentLoginBySeries( series  );
    }
    /** Find a PersistentLogin by token 
        
        * @param token String 
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginByToken(  String  token){
        return persistentloginRepository.findPersistentLoginByToken( token  );
    }
    /** Find a PersistentLogin by lastUsed 
        
        * @param lastUsed OffsetDateTime  [optional]
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginByLastUsed(  OffsetDateTime  lastUsed){
        return persistentloginRepository.findPersistentLoginByLastUsed( lastUsed  );
    }
    /** Find a PersistentLogin by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginById(  UUID  id){
        return persistentloginRepository.findPersistentLoginById( id  );
    }
    /** Find a PersistentLogin by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginByOwnerId(  UUID  ownerId){
        return persistentloginRepository.findPersistentLoginByOwnerId( ownerId  );
    }
    /** Find a PersistentLogin by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginByCreatedDate(  OffsetDateTime  createdDate){
        return persistentloginRepository.findPersistentLoginByCreatedDate( createdDate  );
    }
    /** Find a PersistentLogin by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginByKeyHash(  String  keyHash){
        return persistentloginRepository.findPersistentLoginByKeyHash( keyHash  );
    }
    /** Find a PersistentLogin by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginByLastAccessedById(  UUID  lastAccessedById){
        return persistentloginRepository.findPersistentLoginByLastAccessedById( lastAccessedById  );
    }
    /** Find a PersistentLogin by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return persistentloginRepository.findPersistentLoginByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a PersistentLogin by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginByLastModifiedById(  UUID  lastModifiedById){
        return persistentloginRepository.findPersistentLoginByLastModifiedById( lastModifiedById  );
    }
    /** Find a PersistentLogin by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<PersistentLogin>
    */

    public List<PersistentLogin>  findPersistentLoginByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return persistentloginRepository.findPersistentLoginByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a PersistentLogin by ID
    public void deleteById(UUID id) {
        persistentloginRepository.deleteById(id);
    }
}
