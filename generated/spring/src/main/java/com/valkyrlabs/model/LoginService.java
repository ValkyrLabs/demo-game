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
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private LoginPageableRepository loginPageableRepositoryRepository;

    /** 
     * Find all instances of Login with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Login instances
     */
    public Page<Login> findAll(Pageable pageable){
        return loginPageableRepositoryRepository.findAll(pageable);
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
    public Page<Login> findAll(Example<Login> example, Pageable pageable){
        return loginPageableRepositoryRepository.findAll(example, pageable);
    }


    public LoginRepository getRepository(){
        return loginRepository;
    }

    // Create or Update a Login
    public Login saveOrUpdate(Login login) {
        return loginRepository.save( login ); // This method handles both creation and update
        // loginRepository.flush();
        // return ret;
    }

    // Find a Login by ID
    public Optional<Login>  findById(UUID id) {
        return loginRepository.findById(id);
    }

    // Find all Logins
    public Iterable<Login> findAll() {
        return loginRepository.findAll();
    }

    
    /** Find a Login by username 
        
        * @param username String  [optional]
        * @return List<Login>
    */

    public List<Login>  findLoginByUsername(  String  username){
        return loginRepository.findLoginByUsername( username  );
    }
    /** Find a Login by password 
        
        * @param password String  [optional]
        * @return List<Login>
    */

    public List<Login>  findLoginByPassword(  String  password){
        return loginRepository.findLoginByPassword( password  );
    }
    /** Find a Login by description 
        
        * @param description String  [optional]
        * @return List<Login>
    */

    public List<Login>  findLoginByDescription(  String  description){
        return loginRepository.findLoginByDescription( description  );
    }
    /** Find a Login by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Login>
    */

    public List<Login>  findLoginById(  UUID  id){
        return loginRepository.findLoginById( id  );
    }
    /** Find a Login by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Login>
    */

    public List<Login>  findLoginByOwnerId(  UUID  ownerId){
        return loginRepository.findLoginByOwnerId( ownerId  );
    }
    /** Find a Login by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Login>
    */

    public List<Login>  findLoginByCreatedDate(  OffsetDateTime  createdDate){
        return loginRepository.findLoginByCreatedDate( createdDate  );
    }
    /** Find a Login by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Login>
    */

    public List<Login>  findLoginByKeyHash(  String  keyHash){
        return loginRepository.findLoginByKeyHash( keyHash  );
    }
    /** Find a Login by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Login>
    */

    public List<Login>  findLoginByLastAccessedById(  UUID  lastAccessedById){
        return loginRepository.findLoginByLastAccessedById( lastAccessedById  );
    }
    /** Find a Login by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Login>
    */

    public List<Login>  findLoginByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return loginRepository.findLoginByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Login by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Login>
    */

    public List<Login>  findLoginByLastModifiedById(  UUID  lastModifiedById){
        return loginRepository.findLoginByLastModifiedById( lastModifiedById  );
    }
    /** Find a Login by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Login>
    */

    public List<Login>  findLoginByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return loginRepository.findLoginByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Login by ID
    public void deleteById(UUID id) {
        loginRepository.deleteById(id);
    }
}
