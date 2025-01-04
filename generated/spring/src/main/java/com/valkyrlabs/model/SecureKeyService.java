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
public class SecureKeyService {

    @Autowired
    private SecureKeyRepository securekeyRepository;

    @Autowired
    private SecureKeyPageableRepository securekeyPageableRepositoryRepository;

    /** 
     * Find all instances of SecureKey with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of SecureKey instances
     */
    public Page<SecureKey> findAll(Pageable pageable){
        return securekeyPageableRepositoryRepository.findAll(pageable);
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
    public Page<SecureKey> findAll(Example<SecureKey> example, Pageable pageable){
        return securekeyPageableRepositoryRepository.findAll(example, pageable);
    }


    public SecureKeyRepository getRepository(){
        return securekeyRepository;
    }

    // Create or Update a SecureKey
    public SecureKey saveOrUpdate(SecureKey securekey) {
        return securekeyRepository.save( securekey ); // This method handles both creation and update
        // securekeyRepository.flush();
        // return ret;
    }

    // Find a SecureKey by ID
    public Optional<SecureKey>  findById(UUID id) {
        return securekeyRepository.findById(id);
    }

    // Find all SecureKeys
    public Iterable<SecureKey> findAll() {
        return securekeyRepository.findAll();
    }

    
    /** Find a SecureKey by notes 
        
        * @param notes String any notes about the key [optional]
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByNotes(  String  notes){
        return securekeyRepository.findSecureKeyByNotes( notes  );
    }
    /** Find a SecureKey by algorithm 
        
        * @param algorithm String the algorithm used for encryption/decryption
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByAlgorithm(  String  algorithm){
        return securekeyRepository.findSecureKeyByAlgorithm( algorithm  );
    }
    /** Find a SecureKey by version 
        
        * @param version String the version of this key
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByVersion(  String  version){
        return securekeyRepository.findSecureKeyByVersion( version  );
    }
    /** Find a SecureKey by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByKeyHash(  String  keyHash){
        return securekeyRepository.findSecureKeyByKeyHash( keyHash  );
    }
    /** Find a SecureKey by cipherWorkCost 
        
        * @param cipherWorkCost Integer the exponential strength of the BCrypt hashing used by the Hashing cipher [optional]
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByCipherWorkCost(  Integer  cipherWorkCost){
        return securekeyRepository.findSecureKeyByCipherWorkCost( cipherWorkCost  );
    }
    /** Find a SecureKey by keyValue 
        
        * @param keyValue String the key itself
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByKeyValue(  String  keyValue){
        return securekeyRepository.findSecureKeyByKeyValue( keyValue  );
    }
    /** Find a SecureKey by status 
        
        * @param status  StatusEnum  StatusEnum) 
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByStatus( SecureKey.StatusEnum status){
        return securekeyRepository.findSecureKeyByStatus( status  );
    }
    /** Find a SecureKey by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyById(  UUID  id){
        return securekeyRepository.findSecureKeyById( id  );
    }
    /** Find a SecureKey by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByOwnerId(  UUID  ownerId){
        return securekeyRepository.findSecureKeyByOwnerId( ownerId  );
    }
    /** Find a SecureKey by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByCreatedDate(  OffsetDateTime  createdDate){
        return securekeyRepository.findSecureKeyByCreatedDate( createdDate  );
    }
    /** Find a SecureKey by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByLastAccessedById(  UUID  lastAccessedById){
        return securekeyRepository.findSecureKeyByLastAccessedById( lastAccessedById  );
    }
    /** Find a SecureKey by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return securekeyRepository.findSecureKeyByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a SecureKey by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByLastModifiedById(  UUID  lastModifiedById){
        return securekeyRepository.findSecureKeyByLastModifiedById( lastModifiedById  );
    }
    /** Find a SecureKey by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<SecureKey>
    */

    public List<SecureKey>  findSecureKeyByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return securekeyRepository.findSecureKeyByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a SecureKey by ID
    public void deleteById(UUID id) {
        securekeyRepository.deleteById(id);
    }
}
