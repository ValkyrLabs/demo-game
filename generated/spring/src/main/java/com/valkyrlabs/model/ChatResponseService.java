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
public class ChatResponseService {

    @Autowired
    private ChatResponseRepository chatresponseRepository;

    @Autowired
    private ChatResponsePageableRepository chatresponsePageableRepositoryRepository;

    /** 
     * Find all instances of ChatResponse with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of ChatResponse instances
     */
    public Page<ChatResponse> findAll(Pageable pageable){
        return chatresponsePageableRepositoryRepository.findAll(pageable);
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
    public Page<ChatResponse> findAll(Example<ChatResponse> example, Pageable pageable){
        return chatresponsePageableRepositoryRepository.findAll(example, pageable);
    }


    public ChatResponseRepository getRepository(){
        return chatresponseRepository;
    }

    // Create or Update a ChatResponse
    public ChatResponse saveOrUpdate(ChatResponse chatresponse) {
        return chatresponseRepository.save( chatresponse ); // This method handles both creation and update
        // chatresponseRepository.flush();
        // return ret;
    }

    // Find a ChatResponse by ID
    public Optional<ChatResponse>  findById(UUID id) {
        return chatresponseRepository.findById(id);
    }

    // Find all ChatResponses
    public Iterable<ChatResponse> findAll() {
        return chatresponseRepository.findAll();
    }

    
    /** Find a ChatResponse by sessionId 
        
        * @param sessionId String  [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseBySessionId(  String  sessionId){
        return chatresponseRepository.findChatResponseBySessionId( sessionId  );
    }
    /** Find a ChatResponse by json 
        
        * @param json String  [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseByJson(  String  json){
        return chatresponseRepository.findChatResponseByJson( json  );
    }
    /** Find a ChatResponse by sourceType 
        
        * @param sourceType  SourceTypeEnum  SourceTypeEnum) type of the message source [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseBySourceType( ChatResponse.SourceTypeEnum sourceType){
        return chatresponseRepository.findChatResponseBySourceType( sourceType  );
    }
    /** Find a ChatResponse by sourceOwner 
        
        * @param sourceOwner UUID  [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseBySourceOwner(  UUID  sourceOwner){
        return chatresponseRepository.findChatResponseBySourceOwner( sourceOwner  );
    }
    /** Find a ChatResponse by role 
        
        * @param role  RoleEnum  RoleEnum)  [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseByRole( ChatResponse.RoleEnum role){
        return chatresponseRepository.findChatResponseByRole( role  );
    }
    /** Find a ChatResponse by content 
        
        * @param content String the response fro the chat service [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseByContent(  String  content){
        return chatresponseRepository.findChatResponseByContent( content  );
    }
    /** Find a ChatResponse by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseById(  UUID  id){
        return chatresponseRepository.findChatResponseById( id  );
    }
    /** Find a ChatResponse by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseByOwnerId(  UUID  ownerId){
        return chatresponseRepository.findChatResponseByOwnerId( ownerId  );
    }
    /** Find a ChatResponse by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseByCreatedDate(  OffsetDateTime  createdDate){
        return chatresponseRepository.findChatResponseByCreatedDate( createdDate  );
    }
    /** Find a ChatResponse by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseByKeyHash(  String  keyHash){
        return chatresponseRepository.findChatResponseByKeyHash( keyHash  );
    }
    /** Find a ChatResponse by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseByLastAccessedById(  UUID  lastAccessedById){
        return chatresponseRepository.findChatResponseByLastAccessedById( lastAccessedById  );
    }
    /** Find a ChatResponse by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return chatresponseRepository.findChatResponseByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a ChatResponse by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseByLastModifiedById(  UUID  lastModifiedById){
        return chatresponseRepository.findChatResponseByLastModifiedById( lastModifiedById  );
    }
    /** Find a ChatResponse by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<ChatResponse>
    */

    public List<ChatResponse>  findChatResponseByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return chatresponseRepository.findChatResponseByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a ChatResponse by ID
    public void deleteById(UUID id) {
        chatresponseRepository.deleteById(id);
    }
}
