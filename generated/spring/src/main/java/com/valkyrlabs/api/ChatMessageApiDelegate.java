package com.valkyrlabs.api;


import com.valkyrlabs.model.ChatMessageService;

// ValkyrLabs Section

import com.valkyrlabs.valkyrai.audit.AuditingField;
import com.valkyrlabs.valkyrai.audit.AuditedClass;
import com.valkyrlabs.valkyrai.service.SecureField;
// End ValkyrLabs Section

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

// End ThorAPI Section

import com.valkyrlabs.model.ChatMessage;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

// import jakarta.annotation.Generated;
import org.springframework.stereotype.Controller;

/**
* A delegate to be called by the {@link ChatMessageApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class ChatMessageApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(ChatMessageApiDelegate.class);

    @Autowired
    private ChatMessageService chatMessageService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /ChatMessage/{id} : Delete a ChatMessage.
            * Deletes a specific ChatMessage.
        *
            * @param id Unique identifier for the ChatMessage. (required)
        * @return ChatMessage deleted successfully. (status code 204)
            *         or ChatMessage not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ChatMessageApi#deleteChatMessage
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteChatMessage(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(chatMessageService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "ChatMessageApi",  id);

            chatMessageService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /ChatMessage/{id} : Retrieve a single ChatMessage
            * Retrieves a single ChatMessage for a specific uid.
        *
            * @param id Unique identifier for the ChatMessage. (required)
        * @return Successfully retrieved the ChatMessage. (status code 200)
            *         or ChatMessage not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ChatMessageApi#getChatMessage
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<ChatMessage>> getChatMessage(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"role\" : \"user\", \"lastAccessedById\" : \"9c13ea7e-7254-47bf-881a-a62740fc8742\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sessionId\" : \"sessionId\", \"sourceOwner\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"48318675-0de4-4cc0-9598-601df73c48b0\", \"content\" : \"What is the next step for our adventure?\", \"connected\" : true, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sourceType\" : \"api\", \"lastModifiedById\" : \"a448f2ce-98d1-4871-9623-f7fdd6bd49b2\", \"json\" : \"json\", \"id\" : \"843865cf-aeeb-4e86-87a4-e6e6e4c0fa91\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "ChatMessageApi",  id);
                            Optional<ChatMessage> ox = chatMessageService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<ChatMessage>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /ChatMessage : Retrieve a list of ChatMessages
            * Retrieves a list of ChatMessages.
        *
        * @return Successfully retrieved the list of ChatMessages. (status code 200)
            *         or No ChatMessages were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ChatMessageApi#getChatMessageList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<ChatMessage>>> getChatMessageList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"role\" : \"user\", \"lastAccessedById\" : \"9c13ea7e-7254-47bf-881a-a62740fc8742\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sessionId\" : \"sessionId\", \"sourceOwner\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"48318675-0de4-4cc0-9598-601df73c48b0\", \"content\" : \"What is the next step for our adventure?\", \"connected\" : true, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sourceType\" : \"api\", \"lastModifiedById\" : \"a448f2ce-98d1-4871-9623-f7fdd6bd49b2\", \"json\" : \"json\", \"id\" : \"843865cf-aeeb-4e86-87a4-e6e6e4c0fa91\" }, { \"role\" : \"user\", \"lastAccessedById\" : \"9c13ea7e-7254-47bf-881a-a62740fc8742\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sessionId\" : \"sessionId\", \"sourceOwner\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"48318675-0de4-4cc0-9598-601df73c48b0\", \"content\" : \"What is the next step for our adventure?\", \"connected\" : true, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sourceType\" : \"api\", \"lastModifiedById\" : \"a448f2ce-98d1-4871-9623-f7fdd6bd49b2\", \"json\" : \"json\", \"id\" : \"843865cf-aeeb-4e86-87a4-e6e6e4c0fa91\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(chatMessageService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<ChatMessage>)chatMessageService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /ChatMessage : Create a new ChatMessage
            * Creates a new ChatMessage.
        *
            * @param chatMessage ChatMessage details. (required)
        * @return ChatMessage created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or ChatMessage not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ChatMessageApi#postChatMessage
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<ChatMessage>> postChatMessage(ChatMessage chatMessage) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"role\" : \"user\", \"lastAccessedById\" : \"9c13ea7e-7254-47bf-881a-a62740fc8742\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sessionId\" : \"sessionId\", \"sourceOwner\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"48318675-0de4-4cc0-9598-601df73c48b0\", \"content\" : \"What is the next step for our adventure?\", \"connected\" : true, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sourceType\" : \"api\", \"lastModifiedById\" : \"a448f2ce-98d1-4871-9623-f7fdd6bd49b2\", \"json\" : \"json\", \"id\" : \"843865cf-aeeb-4e86-87a4-e6e6e4c0fa91\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: chatMessage");
                            ChatMessage ox = chatMessageService.saveOrUpdate(chatMessage);
                            return new ResponseEntity<ChatMessage>(chatMessageService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /ChatMessage/{id} : Update an existing ChatMessage
            * Updates an existing ChatMessage.
        *
            * @param id Unique identifier for the ChatMessage. (required)
            * @param chatMessage Updated ChatMessage details. (required)
        * @return ChatMessage updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or ChatMessage not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ChatMessageApi#updateChatMessage
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<ChatMessage>> updateChatMessage(UUID id,
    ChatMessage chatMessage) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"role\" : \"user\", \"lastAccessedById\" : \"9c13ea7e-7254-47bf-881a-a62740fc8742\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sessionId\" : \"sessionId\", \"sourceOwner\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"48318675-0de4-4cc0-9598-601df73c48b0\", \"content\" : \"What is the next step for our adventure?\", \"connected\" : true, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sourceType\" : \"api\", \"lastModifiedById\" : \"a448f2ce-98d1-4871-9623-f7fdd6bd49b2\", \"json\" : \"json\", \"id\" : \"843865cf-aeeb-4e86-87a4-e6e6e4c0fa91\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + chatMessage);
                            if(chatMessageService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            chatMessage.setId(id); // guard against a patch with no ID (upserts new objects)
                            ChatMessage ox = chatMessageService.saveOrUpdate(chatMessage);
                            return new ResponseEntity<ChatMessage>(chatMessageService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
