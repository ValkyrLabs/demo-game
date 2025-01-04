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
public class LogoutService {

    @Autowired
    private LogoutRepository logoutRepository;

    @Autowired
    private LogoutPageableRepository logoutPageableRepositoryRepository;

    /** 
     * Find all instances of Logout with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Logout instances
     */
    public Page<Logout> findAll(Pageable pageable){
        return logoutPageableRepositoryRepository.findAll(pageable);
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
    public Page<Logout> findAll(Example<Logout> example, Pageable pageable){
        return logoutPageableRepositoryRepository.findAll(example, pageable);
    }


    public LogoutRepository getRepository(){
        return logoutRepository;
    }

    // Create or Update a Logout
    public Logout saveOrUpdate(Logout logout) {
        return logoutRepository.save( logout ); // This method handles both creation and update
        // logoutRepository.flush();
        // return ret;
    }

    // Find a Logout by ID
    public Optional<Logout>  findById(UUID id) {
        return logoutRepository.findById(id);
    }

    // Find all Logouts
    public Iterable<Logout> findAll() {
        return logoutRepository.findAll();
    }

    
    /** Find a Logout by description 
        
        * @param description String  [optional]
        * @return List<Logout>
    */

    public List<Logout>  findLogoutByDescription(  String  description){
        return logoutRepository.findLogoutByDescription( description  );
    }
    /** Find a Logout by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Logout>
    */

    public List<Logout>  findLogoutById(  UUID  id){
        return logoutRepository.findLogoutById( id  );
    }
    /** Find a Logout by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Logout>
    */

    public List<Logout>  findLogoutByOwnerId(  UUID  ownerId){
        return logoutRepository.findLogoutByOwnerId( ownerId  );
    }
    /** Find a Logout by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Logout>
    */

    public List<Logout>  findLogoutByCreatedDate(  OffsetDateTime  createdDate){
        return logoutRepository.findLogoutByCreatedDate( createdDate  );
    }
    /** Find a Logout by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Logout>
    */

    public List<Logout>  findLogoutByKeyHash(  String  keyHash){
        return logoutRepository.findLogoutByKeyHash( keyHash  );
    }
    /** Find a Logout by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Logout>
    */

    public List<Logout>  findLogoutByLastAccessedById(  UUID  lastAccessedById){
        return logoutRepository.findLogoutByLastAccessedById( lastAccessedById  );
    }
    /** Find a Logout by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Logout>
    */

    public List<Logout>  findLogoutByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return logoutRepository.findLogoutByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Logout by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Logout>
    */

    public List<Logout>  findLogoutByLastModifiedById(  UUID  lastModifiedById){
        return logoutRepository.findLogoutByLastModifiedById( lastModifiedById  );
    }
    /** Find a Logout by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Logout>
    */

    public List<Logout>  findLogoutByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return logoutRepository.findLogoutByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Logout by ID
    public void deleteById(UUID id) {
        logoutRepository.deleteById(id);
    }
}
