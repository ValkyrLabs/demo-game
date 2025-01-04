package com.valkyrlabs.api;

import com.valkyrlabs.model.LlmDetails;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: LlmDetailsRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface LlmDetailsPageableRepository extends Serializable, PagingAndSortingRepository<LlmDetails, UUID> {

    // ThorAPI Generated search methods for each property on LlmDetails
    /** Find a LlmDetails by name with pagination
        name ** | **String** | The name of the LLM |  [optional]
        * @param name String The name of the LLM 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByName(String name, Pageable pageable);
    /** Find a LlmDetails by version with pagination
        version ** | **String** | The vendor-specific version of the LLM |  [optional]
        * @param version String The vendor-specific version of the LLM 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByVersion(String version, Pageable pageable);
    /** Find a LlmDetails by notes with pagination
        notes ** | **String** | Notes on the LLM implementation |  [optional]
        * @param notes String Notes on the LLM implementation 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByNotes(String notes, Pageable pageable);
    /** Find a LlmDetails by role with pagination
        role ** | [**RoleEnum**](#RoleEnum) | the user role to set for the target LLM |  [optional]
        * @param role RoleEnum the user role to set for the target LLM 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByRole(LlmDetails.RoleEnum role, Pageable pageable);
    /** Find a LlmDetails by provider with pagination
        provider ** | [**ProviderEnum**](#ProviderEnum) |  |  [optional]
        * @param provider ProviderEnum  
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByProvider(LlmDetails.ProviderEnum provider, Pageable pageable);
    /** Find a LlmDetails by apiType with pagination
        apiType ** | [**ApiTypeEnum**](#ApiTypeEnum) |  |  [optional]
        * @param apiType ApiTypeEnum  
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByApiType(LlmDetails.ApiTypeEnum apiType, Pageable pageable);
    /** Find a LlmDetails by initialPrompt with pagination
        initialPrompt ** | **String** | the initial prompt to instruct the LLM how to behave |  [optional]
        * @param initialPrompt String the initial prompt to instruct the LLM how to behave 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByInitialPrompt(String initialPrompt, Pageable pageable);
    /** Find a LlmDetails by apiKey with pagination
        apiKey ** | **String** | the api-key to access the llm |  [optional]
        * @param apiKey String the api-key to access the llm 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByApiKey(String apiKey, Pageable pageable);
    /** Find a LlmDetails by credential with pagination
        credential ** | **String** | the user name to access the LLM |  [optional]
        * @param credential String the user name to access the LLM 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByCredential(String credential, Pageable pageable);
    /** Find a LlmDetails by credentialPassword with pagination
        credentialPassword ** | **String** | the password to access the LLM |  [optional]
        * @param credentialPassword String the password to access the LLM 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByCredentialPassword(String credentialPassword, Pageable pageable);
    /** Find a LlmDetails by url with pagination
        url ** | **String** | the URL to connect to the LLM api |  [optional]
        * @param url String the URL to connect to the LLM api 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByUrl(String url, Pageable pageable);
    /** Find a LlmDetails by requestParameters with pagination
        requestParameters ** | **String** | request parameters to send to the service |  [optional]
        * @param requestParameters String request parameters to send to the service 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByRequestParameters(String requestParameters, Pageable pageable);
    /** Find a LlmDetails by meta with pagination
        meta ** | **String** | metadata in any text format to be used in client code |  [optional]
        * @param meta String metadata in any text format to be used in client code 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByMeta(String meta, Pageable pageable);
    /** Find a LlmDetails by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findById(UUID id, Pageable pageable);
    /** Find a LlmDetails by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a LlmDetails by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a LlmDetails by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a LlmDetails by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a LlmDetails by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a LlmDetails by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a LlmDetails by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<LlmDetails>
    */
    public Page<LlmDetails> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of LlmDetails as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of LlmDetails instances
     */
    List<LlmDetails> findAll();

    /** 
     * Find all instances of LlmDetails with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of LlmDetails instances
     */
    Page<LlmDetails> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<LlmDetails> findAll(Example<LlmDetails> example, Pageable pageable);

    // end search methods
}
