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
public class AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;

    @Autowired
    private AuthorityPageableRepository authorityPageableRepositoryRepository;

    /** 
     * Find all instances of Authority with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Authority instances
     */
    public Page<Authority> findAll(Pageable pageable){
        return authorityPageableRepositoryRepository.findAll(pageable);
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
    public Page<Authority> findAll(Example<Authority> example, Pageable pageable){
        return authorityPageableRepositoryRepository.findAll(example, pageable);
    }


    public AuthorityRepository getRepository(){
        return authorityRepository;
    }

    // Create or Update a Authority
    public Authority saveOrUpdate(Authority authority) {
        return authorityRepository.save( authority ); // This method handles both creation and update
        // authorityRepository.flush();
        // return ret;
    }

    // Find a Authority by ID
    public Optional<Authority>  findById(UUID id) {
        return authorityRepository.findById(id);
    }

    // Find all Authoritys
    public Iterable<Authority> findAll() {
        return authorityRepository.findAll();
    }

    
    /** Find a Authority by principalId 
        
        * @param principalId UUID  [optional]
        * @return List<Authority>
    */

    public List<Authority>  findAuthorityByPrincipalId(  UUID  principalId){
        return authorityRepository.findAuthorityByPrincipalId( principalId  );
    }
    /** Find a Authority by username 
        
        * @param username String 
        * @return List<Authority>
    */

    public List<Authority>  findAuthorityByUsername(  String  username){
        return authorityRepository.findAuthorityByUsername( username  );
    }
    /** Find a Authority by authority 
        
        * @param authority String 
        * @return List<Authority>
    */

    public List<Authority>  findAuthorityByAuthority(  String  authority){
        return authorityRepository.findAuthorityByAuthority( authority  );
    }
    /** Find a Authority by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Authority>
    */

    public List<Authority>  findAuthorityById(  UUID  id){
        return authorityRepository.findAuthorityById( id  );
    }
    /** Find a Authority by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Authority>
    */

    public List<Authority>  findAuthorityByOwnerId(  UUID  ownerId){
        return authorityRepository.findAuthorityByOwnerId( ownerId  );
    }
    /** Find a Authority by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Authority>
    */

    public List<Authority>  findAuthorityByCreatedDate(  OffsetDateTime  createdDate){
        return authorityRepository.findAuthorityByCreatedDate( createdDate  );
    }
    /** Find a Authority by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Authority>
    */

    public List<Authority>  findAuthorityByKeyHash(  String  keyHash){
        return authorityRepository.findAuthorityByKeyHash( keyHash  );
    }
    /** Find a Authority by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Authority>
    */

    public List<Authority>  findAuthorityByLastAccessedById(  UUID  lastAccessedById){
        return authorityRepository.findAuthorityByLastAccessedById( lastAccessedById  );
    }
    /** Find a Authority by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Authority>
    */

    public List<Authority>  findAuthorityByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return authorityRepository.findAuthorityByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Authority by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Authority>
    */

    public List<Authority>  findAuthorityByLastModifiedById(  UUID  lastModifiedById){
        return authorityRepository.findAuthorityByLastModifiedById( lastModifiedById  );
    }
    /** Find a Authority by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Authority>
    */

    public List<Authority>  findAuthorityByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return authorityRepository.findAuthorityByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Authority by ID
    public void deleteById(UUID id) {
        authorityRepository.deleteById(id);
    }
}
