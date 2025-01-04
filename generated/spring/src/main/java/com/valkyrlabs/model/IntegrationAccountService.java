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
public class IntegrationAccountService {

    @Autowired
    private IntegrationAccountRepository integrationaccountRepository;

    @Autowired
    private IntegrationAccountPageableRepository integrationaccountPageableRepositoryRepository;

    /** 
     * Find all instances of IntegrationAccount with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of IntegrationAccount instances
     */
    public Page<IntegrationAccount> findAll(Pageable pageable){
        return integrationaccountPageableRepositoryRepository.findAll(pageable);
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
    public Page<IntegrationAccount> findAll(Example<IntegrationAccount> example, Pageable pageable){
        return integrationaccountPageableRepositoryRepository.findAll(example, pageable);
    }


    public IntegrationAccountRepository getRepository(){
        return integrationaccountRepository;
    }

    // Create or Update a IntegrationAccount
    public IntegrationAccount saveOrUpdate(IntegrationAccount integrationaccount) {
        return integrationaccountRepository.save( integrationaccount ); // This method handles both creation and update
        // integrationaccountRepository.flush();
        // return ret;
    }

    // Find a IntegrationAccount by ID
    public Optional<IntegrationAccount>  findById(UUID id) {
        return integrationaccountRepository.findById(id);
    }

    // Find all IntegrationAccounts
    public Iterable<IntegrationAccount> findAll() {
        return integrationaccountRepository.findAll();
    }

    
    /** Find a IntegrationAccount by execModuleId 
        
        * @param execModuleId UUID  [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByExecModuleId(  UUID  execModuleId){
        return integrationaccountRepository.findIntegrationAccountByExecModuleId( execModuleId  );
    }
    /** Find a IntegrationAccount by accountName 
        
        * @param accountName String account name [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByAccountName(  String  accountName){
        return integrationaccountRepository.findIntegrationAccountByAccountName( accountName  );
    }
    /** Find a IntegrationAccount by username 
        
        * @param username String account username [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByUsername(  String  username){
        return integrationaccountRepository.findIntegrationAccountByUsername( username  );
    }
    /** Find a IntegrationAccount by password 
        
        * @param password String account password - encrypted [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByPassword(  String  password){
        return integrationaccountRepository.findIntegrationAccountByPassword( password  );
    }
    /** Find a IntegrationAccount by accountId 
        
        * @param accountId String  [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByAccountId(  String  accountId){
        return integrationaccountRepository.findIntegrationAccountByAccountId( accountId  );
    }
    /** Find a IntegrationAccount by status 
        
        * @param status  StatusEnum  StatusEnum) Integration Connection Status [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByStatus( IntegrationAccount.StatusEnum status){
        return integrationaccountRepository.findIntegrationAccountByStatus( status  );
    }
    /** Find a IntegrationAccount by verified 
        
        * @param verified Boolean  [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByVerified(  Boolean  verified){
        return integrationaccountRepository.findIntegrationAccountByVerified( verified  );
    }
    /** Find a IntegrationAccount by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountById(  UUID  id){
        return integrationaccountRepository.findIntegrationAccountById( id  );
    }
    /** Find a IntegrationAccount by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByOwnerId(  UUID  ownerId){
        return integrationaccountRepository.findIntegrationAccountByOwnerId( ownerId  );
    }
    /** Find a IntegrationAccount by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByCreatedDate(  OffsetDateTime  createdDate){
        return integrationaccountRepository.findIntegrationAccountByCreatedDate( createdDate  );
    }
    /** Find a IntegrationAccount by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByKeyHash(  String  keyHash){
        return integrationaccountRepository.findIntegrationAccountByKeyHash( keyHash  );
    }
    /** Find a IntegrationAccount by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByLastAccessedById(  UUID  lastAccessedById){
        return integrationaccountRepository.findIntegrationAccountByLastAccessedById( lastAccessedById  );
    }
    /** Find a IntegrationAccount by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return integrationaccountRepository.findIntegrationAccountByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a IntegrationAccount by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByLastModifiedById(  UUID  lastModifiedById){
        return integrationaccountRepository.findIntegrationAccountByLastModifiedById( lastModifiedById  );
    }
    /** Find a IntegrationAccount by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<IntegrationAccount>
    */

    public List<IntegrationAccount>  findIntegrationAccountByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return integrationaccountRepository.findIntegrationAccountByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a IntegrationAccount by ID
    public void deleteById(UUID id) {
        integrationaccountRepository.deleteById(id);
    }
}
