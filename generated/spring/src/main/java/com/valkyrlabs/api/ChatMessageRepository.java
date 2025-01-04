package com.valkyrlabs.api;

import com.valkyrlabs.model.ChatMessage;

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

    AUTO IMPLEMENTED by Spring as bean: ChatMessageRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface ChatMessageRepository extends Serializable, JpaRepository<ChatMessage, UUID> {

    // ThorAPI Generated search methods for each property on ChatMessage
    /** Find a ChatMessage by sessionId 
        sessionId ** | **String** |  |  [optional]
        * @param sessionId String  
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageBySessionId (  String sessionId);
    /** Find a ChatMessage by connected 
        connected ** | **Boolean** | if this chat message is conencted to a service (ws) |  [optional]
        * @param connected Boolean if this chat message is conencted to a service (ws) 
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageByConnected (  Boolean connected);
    /** Find a ChatMessage by json 
        json ** | **String** |  |  [optional]
        * @param json String  
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageByJson (  String json);
    /** Find a ChatMessage by sourceType 
        sourceType ** | [**SourceTypeEnum**](#SourceTypeEnum) | type of the message source |  [optional]
        * @param sourceType SourceTypeEnum type of the message source 
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageBySourceType ( ChatMessage.SourceTypeEnum sourceType);
    /** Find a ChatMessage by sourceOwner 
        sourceOwner ** | **UUID** |  |  [optional]
        * @param sourceOwner UUID  
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageBySourceOwner (  UUID sourceOwner);
    /** Find a ChatMessage by role 
        role ** | [**RoleEnum**](#RoleEnum) |  |  [optional]
        * @param role RoleEnum  
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageByRole ( ChatMessage.RoleEnum role);
    /** Find a ChatMessage by content 
        content ** | **String** | the message to send to the chat service |  [optional]
        * @param content String the message to send to the chat service 
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageByContent (  String content);
    /** Find a ChatMessage by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageById (  UUID id);
    /** Find a ChatMessage by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageByOwnerId (  UUID ownerId);
    /** Find a ChatMessage by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageByCreatedDate (  OffsetDateTime createdDate);
    /** Find a ChatMessage by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageByKeyHash (  String keyHash);
    /** Find a ChatMessage by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageByLastAccessedById (  UUID lastAccessedById);
    /** Find a ChatMessage by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a ChatMessage by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageByLastModifiedById (  UUID lastModifiedById);
    /** Find a ChatMessage by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<ChatMessage>
    */
    // nullable
    public List<ChatMessage>  findChatMessageByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
