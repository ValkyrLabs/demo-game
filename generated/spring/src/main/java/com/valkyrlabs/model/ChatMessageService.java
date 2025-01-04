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
public class ChatMessageService {

    @Autowired
    private ChatMessageRepository chatmessageRepository;

    @Autowired
    private ChatMessagePageableRepository chatmessagePageableRepositoryRepository;

    /** 
     * Find all instances of ChatMessage with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of ChatMessage instances
     */
    public Page<ChatMessage> findAll(Pageable pageable){
        return chatmessagePageableRepositoryRepository.findAll(pageable);
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
    public Page<ChatMessage> findAll(Example<ChatMessage> example, Pageable pageable){
        return chatmessagePageableRepositoryRepository.findAll(example, pageable);
    }


    public ChatMessageRepository getRepository(){
        return chatmessageRepository;
    }

    // Create or Update a ChatMessage
    public ChatMessage saveOrUpdate(ChatMessage chatmessage) {
        return chatmessageRepository.save( chatmessage ); // This method handles both creation and update
        // chatmessageRepository.flush();
        // return ret;
    }

    // Find a ChatMessage by ID
    public Optional<ChatMessage>  findById(UUID id) {
        return chatmessageRepository.findById(id);
    }

    // Find all ChatMessages
    public Iterable<ChatMessage> findAll() {
        return chatmessageRepository.findAll();
    }

    
    /** Find a ChatMessage by sessionId 
        
        * @param sessionId String  [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageBySessionId(  String  sessionId){
        return chatmessageRepository.findChatMessageBySessionId( sessionId  );
    }
    /** Find a ChatMessage by connected 
        
        * @param connected Boolean if this chat message is conencted to a service (ws) [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageByConnected(  Boolean  connected){
        return chatmessageRepository.findChatMessageByConnected( connected  );
    }
    /** Find a ChatMessage by json 
        
        * @param json String  [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageByJson(  String  json){
        return chatmessageRepository.findChatMessageByJson( json  );
    }
    /** Find a ChatMessage by sourceType 
        
        * @param sourceType  SourceTypeEnum  SourceTypeEnum) type of the message source [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageBySourceType( ChatMessage.SourceTypeEnum sourceType){
        return chatmessageRepository.findChatMessageBySourceType( sourceType  );
    }
    /** Find a ChatMessage by sourceOwner 
        
        * @param sourceOwner UUID  [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageBySourceOwner(  UUID  sourceOwner){
        return chatmessageRepository.findChatMessageBySourceOwner( sourceOwner  );
    }
    /** Find a ChatMessage by role 
        
        * @param role  RoleEnum  RoleEnum)  [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageByRole( ChatMessage.RoleEnum role){
        return chatmessageRepository.findChatMessageByRole( role  );
    }
    /** Find a ChatMessage by content 
        
        * @param content String the message to send to the chat service [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageByContent(  String  content){
        return chatmessageRepository.findChatMessageByContent( content  );
    }
    /** Find a ChatMessage by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageById(  UUID  id){
        return chatmessageRepository.findChatMessageById( id  );
    }
    /** Find a ChatMessage by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageByOwnerId(  UUID  ownerId){
        return chatmessageRepository.findChatMessageByOwnerId( ownerId  );
    }
    /** Find a ChatMessage by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageByCreatedDate(  OffsetDateTime  createdDate){
        return chatmessageRepository.findChatMessageByCreatedDate( createdDate  );
    }
    /** Find a ChatMessage by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageByKeyHash(  String  keyHash){
        return chatmessageRepository.findChatMessageByKeyHash( keyHash  );
    }
    /** Find a ChatMessage by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageByLastAccessedById(  UUID  lastAccessedById){
        return chatmessageRepository.findChatMessageByLastAccessedById( lastAccessedById  );
    }
    /** Find a ChatMessage by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return chatmessageRepository.findChatMessageByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a ChatMessage by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageByLastModifiedById(  UUID  lastModifiedById){
        return chatmessageRepository.findChatMessageByLastModifiedById( lastModifiedById  );
    }
    /** Find a ChatMessage by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<ChatMessage>
    */

    public List<ChatMessage>  findChatMessageByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return chatmessageRepository.findChatMessageByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a ChatMessage by ID
    public void deleteById(UUID id) {
        chatmessageRepository.deleteById(id);
    }
}
