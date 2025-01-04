package com.valkyrlabs.api;

import com.valkyrlabs.model.LlmDetails;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
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
// @Transactional(readOnly=false)
public interface LlmDetailsRepository extends Serializable, JpaRepository<LlmDetails, UUID> {

    // ThorAPI Generated search methods for each property on LlmDetails
    /** Find a LlmDetails by name 
        name ** | **String** | The name of the LLM |  [optional]
        * @param name String The name of the LLM 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByName (  String name);
    /** Find a LlmDetails by version 
        version ** | **String** | The vendor-specific version of the LLM |  [optional]
        * @param version String The vendor-specific version of the LLM 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByVersion (  String version);
    /** Find a LlmDetails by notes 
        notes ** | **String** | Notes on the LLM implementation |  [optional]
        * @param notes String Notes on the LLM implementation 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByNotes (  String notes);
    /** Find a LlmDetails by role 
        role ** | [**RoleEnum**](#RoleEnum) | the user role to set for the target LLM |  [optional]
        * @param role RoleEnum the user role to set for the target LLM 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByRole ( LlmDetails.RoleEnum role);
    /** Find a LlmDetails by provider 
        provider ** | [**ProviderEnum**](#ProviderEnum) |  |  [optional]
        * @param provider ProviderEnum  
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByProvider ( LlmDetails.ProviderEnum provider);
    /** Find a LlmDetails by apiType 
        apiType ** | [**ApiTypeEnum**](#ApiTypeEnum) |  |  [optional]
        * @param apiType ApiTypeEnum  
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByApiType ( LlmDetails.ApiTypeEnum apiType);
    /** Find a LlmDetails by initialPrompt 
        initialPrompt ** | **String** | the initial prompt to instruct the LLM how to behave |  [optional]
        * @param initialPrompt String the initial prompt to instruct the LLM how to behave 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByInitialPrompt (  String initialPrompt);
    /** Find a LlmDetails by apiKey 
        apiKey ** | **String** | the api-key to access the llm |  [optional]
        * @param apiKey String the api-key to access the llm 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByApiKey (  String apiKey);
    /** Find a LlmDetails by credential 
        credential ** | **String** | the user name to access the LLM |  [optional]
        * @param credential String the user name to access the LLM 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByCredential (  String credential);
    /** Find a LlmDetails by credentialPassword 
        credentialPassword ** | **String** | the password to access the LLM |  [optional]
        * @param credentialPassword String the password to access the LLM 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByCredentialPassword (  String credentialPassword);
    /** Find a LlmDetails by url 
        url ** | **String** | the URL to connect to the LLM api |  [optional]
        * @param url String the URL to connect to the LLM api 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByUrl (  String url);
    /** Find a LlmDetails by requestParameters 
        requestParameters ** | **String** | request parameters to send to the service |  [optional]
        * @param requestParameters String request parameters to send to the service 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByRequestParameters (  String requestParameters);
    /** Find a LlmDetails by meta 
        meta ** | **String** | metadata in any text format to be used in client code |  [optional]
        * @param meta String metadata in any text format to be used in client code 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByMeta (  String meta);
    /** Find a LlmDetails by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsById (  UUID id);
    /** Find a LlmDetails by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByOwnerId (  UUID ownerId);
    /** Find a LlmDetails by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByCreatedDate (  OffsetDateTime createdDate);
    /** Find a LlmDetails by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByKeyHash (  String keyHash);
    /** Find a LlmDetails by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByLastAccessedById (  UUID lastAccessedById);
    /** Find a LlmDetails by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a LlmDetails by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByLastModifiedById (  UUID lastModifiedById);
    /** Find a LlmDetails by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<LlmDetails>
    */
    // nullable
    public List<LlmDetails>  findLlmDetailsByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
