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
public class LlmDetailsService {

    @Autowired
    private LlmDetailsRepository llmdetailsRepository;

    @Autowired
    private LlmDetailsPageableRepository llmdetailsPageableRepositoryRepository;

    /** 
     * Find all instances of LlmDetails with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of LlmDetails instances
     */
    public Page<LlmDetails> findAll(Pageable pageable){
        return llmdetailsPageableRepositoryRepository.findAll(pageable);
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
    public Page<LlmDetails> findAll(Example<LlmDetails> example, Pageable pageable){
        return llmdetailsPageableRepositoryRepository.findAll(example, pageable);
    }


    public LlmDetailsRepository getRepository(){
        return llmdetailsRepository;
    }

    // Create or Update a LlmDetails
    public LlmDetails saveOrUpdate(LlmDetails llmdetails) {
        return llmdetailsRepository.save( llmdetails ); // This method handles both creation and update
        // llmdetailsRepository.flush();
        // return ret;
    }

    // Find a LlmDetails by ID
    public Optional<LlmDetails>  findById(UUID id) {
        return llmdetailsRepository.findById(id);
    }

    // Find all LlmDetailss
    public Iterable<LlmDetails> findAll() {
        return llmdetailsRepository.findAll();
    }

    
    /** Find a LlmDetails by name 
        
        * @param name String The name of the LLM [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByName(  String  name){
        return llmdetailsRepository.findLlmDetailsByName( name  );
    }
    /** Find a LlmDetails by version 
        
        * @param version String The vendor-specific version of the LLM [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByVersion(  String  version){
        return llmdetailsRepository.findLlmDetailsByVersion( version  );
    }
    /** Find a LlmDetails by notes 
        
        * @param notes String Notes on the LLM implementation [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByNotes(  String  notes){
        return llmdetailsRepository.findLlmDetailsByNotes( notes  );
    }
    /** Find a LlmDetails by role 
        
        * @param role  RoleEnum  RoleEnum) the user role to set for the target LLM [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByRole( LlmDetails.RoleEnum role){
        return llmdetailsRepository.findLlmDetailsByRole( role  );
    }
    /** Find a LlmDetails by provider 
        
        * @param provider  ProviderEnum  ProviderEnum)  [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByProvider( LlmDetails.ProviderEnum provider){
        return llmdetailsRepository.findLlmDetailsByProvider( provider  );
    }
    /** Find a LlmDetails by apiType 
        
        * @param apiType  ApiTypeEnum  ApiTypeEnum)  [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByApiType( LlmDetails.ApiTypeEnum apiType){
        return llmdetailsRepository.findLlmDetailsByApiType( apiType  );
    }
    /** Find a LlmDetails by initialPrompt 
        
        * @param initialPrompt String the initial prompt to instruct the LLM how to behave [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByInitialPrompt(  String  initialPrompt){
        return llmdetailsRepository.findLlmDetailsByInitialPrompt( initialPrompt  );
    }
    /** Find a LlmDetails by apiKey 
        
        * @param apiKey String the api-key to access the llm [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByApiKey(  String  apiKey){
        return llmdetailsRepository.findLlmDetailsByApiKey( apiKey  );
    }
    /** Find a LlmDetails by credential 
        
        * @param credential String the user name to access the LLM [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByCredential(  String  credential){
        return llmdetailsRepository.findLlmDetailsByCredential( credential  );
    }
    /** Find a LlmDetails by credentialPassword 
        
        * @param credentialPassword String the password to access the LLM [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByCredentialPassword(  String  credentialPassword){
        return llmdetailsRepository.findLlmDetailsByCredentialPassword( credentialPassword  );
    }
    /** Find a LlmDetails by url 
        
        * @param url String the URL to connect to the LLM api [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByUrl(  String  url){
        return llmdetailsRepository.findLlmDetailsByUrl( url  );
    }
    /** Find a LlmDetails by requestParameters 
        
        * @param requestParameters String request parameters to send to the service [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByRequestParameters(  String  requestParameters){
        return llmdetailsRepository.findLlmDetailsByRequestParameters( requestParameters  );
    }
    /** Find a LlmDetails by meta 
        
        * @param meta String metadata in any text format to be used in client code [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByMeta(  String  meta){
        return llmdetailsRepository.findLlmDetailsByMeta( meta  );
    }
    /** Find a LlmDetails by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsById(  UUID  id){
        return llmdetailsRepository.findLlmDetailsById( id  );
    }
    /** Find a LlmDetails by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByOwnerId(  UUID  ownerId){
        return llmdetailsRepository.findLlmDetailsByOwnerId( ownerId  );
    }
    /** Find a LlmDetails by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByCreatedDate(  OffsetDateTime  createdDate){
        return llmdetailsRepository.findLlmDetailsByCreatedDate( createdDate  );
    }
    /** Find a LlmDetails by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByKeyHash(  String  keyHash){
        return llmdetailsRepository.findLlmDetailsByKeyHash( keyHash  );
    }
    /** Find a LlmDetails by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByLastAccessedById(  UUID  lastAccessedById){
        return llmdetailsRepository.findLlmDetailsByLastAccessedById( lastAccessedById  );
    }
    /** Find a LlmDetails by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return llmdetailsRepository.findLlmDetailsByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a LlmDetails by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByLastModifiedById(  UUID  lastModifiedById){
        return llmdetailsRepository.findLlmDetailsByLastModifiedById( lastModifiedById  );
    }
    /** Find a LlmDetails by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<LlmDetails>
    */

    public List<LlmDetails>  findLlmDetailsByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return llmdetailsRepository.findLlmDetailsByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a LlmDetails by ID
    public void deleteById(UUID id) {
        llmdetailsRepository.deleteById(id);
    }
}
