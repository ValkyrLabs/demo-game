package com.valkyrlabs.api;

import com.valkyrlabs.model.ChatResponse;

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

    AUTO IMPLEMENTED by Spring as bean: ChatResponseRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface ChatResponsePageableRepository extends Serializable, PagingAndSortingRepository<ChatResponse, UUID> {

    // ThorAPI Generated search methods for each property on ChatResponse
    /** Find a ChatResponse by sessionId with pagination
        sessionId ** | **String** |  |  [optional]
        * @param sessionId String  
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findBySessionId(String sessionId, Pageable pageable);
    /** Find a ChatResponse by json with pagination
        json ** | **String** |  |  [optional]
        * @param json String  
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findByJson(String json, Pageable pageable);
    /** Find a ChatResponse by sourceType with pagination
        sourceType ** | [**SourceTypeEnum**](#SourceTypeEnum) | type of the message source |  [optional]
        * @param sourceType SourceTypeEnum type of the message source 
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findBySourceType(ChatResponse.SourceTypeEnum sourceType, Pageable pageable);
    /** Find a ChatResponse by sourceOwner with pagination
        sourceOwner ** | **UUID** |  |  [optional]
        * @param sourceOwner UUID  
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findBySourceOwner(UUID sourceOwner, Pageable pageable);
    /** Find a ChatResponse by role with pagination
        role ** | [**RoleEnum**](#RoleEnum) |  |  [optional]
        * @param role RoleEnum  
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findByRole(ChatResponse.RoleEnum role, Pageable pageable);
    /** Find a ChatResponse by content with pagination
        content ** | **String** | the response fro the chat service |  [optional]
        * @param content String the response fro the chat service 
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findByContent(String content, Pageable pageable);
    /** Find a ChatResponse by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findById(UUID id, Pageable pageable);
    /** Find a ChatResponse by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a ChatResponse by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a ChatResponse by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a ChatResponse by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a ChatResponse by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a ChatResponse by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a ChatResponse by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<ChatResponse>
    */
    public Page<ChatResponse> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of ChatResponse as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of ChatResponse instances
     */
    List<ChatResponse> findAll();

    /** 
     * Find all instances of ChatResponse with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of ChatResponse instances
     */
    Page<ChatResponse> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<ChatResponse> findAll(Example<ChatResponse> example, Pageable pageable);

    // end search methods
}
