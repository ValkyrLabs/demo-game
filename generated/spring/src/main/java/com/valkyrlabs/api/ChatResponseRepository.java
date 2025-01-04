package com.valkyrlabs.api;

import com.valkyrlabs.model.ChatResponse;

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

    AUTO IMPLEMENTED by Spring as bean: ChatResponseRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface ChatResponseRepository extends Serializable, JpaRepository<ChatResponse, UUID> {

    // ThorAPI Generated search methods for each property on ChatResponse
    /** Find a ChatResponse by sessionId 
        sessionId ** | **String** |  |  [optional]
        * @param sessionId String  
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseBySessionId (  String sessionId);
    /** Find a ChatResponse by json 
        json ** | **String** |  |  [optional]
        * @param json String  
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseByJson (  String json);
    /** Find a ChatResponse by sourceType 
        sourceType ** | [**SourceTypeEnum**](#SourceTypeEnum) | type of the message source |  [optional]
        * @param sourceType SourceTypeEnum type of the message source 
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseBySourceType ( ChatResponse.SourceTypeEnum sourceType);
    /** Find a ChatResponse by sourceOwner 
        sourceOwner ** | **UUID** |  |  [optional]
        * @param sourceOwner UUID  
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseBySourceOwner (  UUID sourceOwner);
    /** Find a ChatResponse by role 
        role ** | [**RoleEnum**](#RoleEnum) |  |  [optional]
        * @param role RoleEnum  
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseByRole ( ChatResponse.RoleEnum role);
    /** Find a ChatResponse by content 
        content ** | **String** | the response fro the chat service |  [optional]
        * @param content String the response fro the chat service 
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseByContent (  String content);
    /** Find a ChatResponse by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseById (  UUID id);
    /** Find a ChatResponse by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseByOwnerId (  UUID ownerId);
    /** Find a ChatResponse by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseByCreatedDate (  OffsetDateTime createdDate);
    /** Find a ChatResponse by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseByKeyHash (  String keyHash);
    /** Find a ChatResponse by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseByLastAccessedById (  UUID lastAccessedById);
    /** Find a ChatResponse by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a ChatResponse by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseByLastModifiedById (  UUID lastModifiedById);
    /** Find a ChatResponse by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<ChatResponse>
    */
    // nullable
    public List<ChatResponse>  findChatResponseByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
