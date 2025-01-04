package com.valkyrlabs.api;


import com.valkyrlabs.model.ChatResponseService;

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

import com.valkyrlabs.model.ChatResponse;
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
* A delegate to be called by the {@link ChatResponseApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class ChatResponseApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(ChatResponseApiDelegate.class);

    @Autowired
    private ChatResponseService chatResponseService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /ChatResponse/{id} : Delete a ChatResponse.
            * Deletes a specific ChatResponse.
        *
            * @param id Unique identifier for the ChatResponse. (required)
        * @return ChatResponse deleted successfully. (status code 204)
            *         or ChatResponse not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ChatResponseApi#deleteChatResponse
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteChatResponse(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(chatResponseService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "ChatResponseApi",  id);

            chatResponseService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /ChatResponse/{id} : Retrieve a single ChatResponse
            * Retrieves a single ChatResponse for a specific uid.
        *
            * @param id Unique identifier for the ChatResponse. (required)
        * @return Successfully retrieved the ChatResponse. (status code 200)
            *         or ChatResponse not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ChatResponseApi#getChatResponse
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<ChatResponse>> getChatResponse(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"role\" : \"user\", \"lastAccessedById\" : \"a88dc9eb-ad87-4247-903e-5a2ad302929c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sessionId\" : \"sessionId\", \"sourceOwner\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"37b8c8b9-b206-47c3-941b-752eb23a706c\", \"content\" : \"We must cross the mighty Mississippi\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sourceType\" : \"api\", \"lastModifiedById\" : \"ac846de8-26e9-42f8-9da9-36db6b0b5b47\", \"json\" : \"json\", \"id\" : \"ff6c8d64-d659-4099-8cbd-8841811d1320\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "ChatResponseApi",  id);
                            Optional<ChatResponse> ox = chatResponseService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<ChatResponse>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /ChatResponse : Retrieve a list of ChatResponses
            * Retrieves a list of ChatResponses.
        *
        * @return Successfully retrieved the list of ChatResponses. (status code 200)
            *         or No ChatResponses were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ChatResponseApi#getChatResponseList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<ChatResponse>>> getChatResponseList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"role\" : \"user\", \"lastAccessedById\" : \"a88dc9eb-ad87-4247-903e-5a2ad302929c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sessionId\" : \"sessionId\", \"sourceOwner\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"37b8c8b9-b206-47c3-941b-752eb23a706c\", \"content\" : \"We must cross the mighty Mississippi\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sourceType\" : \"api\", \"lastModifiedById\" : \"ac846de8-26e9-42f8-9da9-36db6b0b5b47\", \"json\" : \"json\", \"id\" : \"ff6c8d64-d659-4099-8cbd-8841811d1320\" }, { \"role\" : \"user\", \"lastAccessedById\" : \"a88dc9eb-ad87-4247-903e-5a2ad302929c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sessionId\" : \"sessionId\", \"sourceOwner\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"37b8c8b9-b206-47c3-941b-752eb23a706c\", \"content\" : \"We must cross the mighty Mississippi\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sourceType\" : \"api\", \"lastModifiedById\" : \"ac846de8-26e9-42f8-9da9-36db6b0b5b47\", \"json\" : \"json\", \"id\" : \"ff6c8d64-d659-4099-8cbd-8841811d1320\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(chatResponseService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<ChatResponse>)chatResponseService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /ChatResponse : Create a new ChatResponse
            * Creates a new ChatResponse.
        *
            * @param chatResponse ChatResponse details. (required)
        * @return ChatResponse created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or ChatResponse not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ChatResponseApi#postChatResponse
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<ChatResponse>> postChatResponse(ChatResponse chatResponse) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"role\" : \"user\", \"lastAccessedById\" : \"a88dc9eb-ad87-4247-903e-5a2ad302929c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sessionId\" : \"sessionId\", \"sourceOwner\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"37b8c8b9-b206-47c3-941b-752eb23a706c\", \"content\" : \"We must cross the mighty Mississippi\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sourceType\" : \"api\", \"lastModifiedById\" : \"ac846de8-26e9-42f8-9da9-36db6b0b5b47\", \"json\" : \"json\", \"id\" : \"ff6c8d64-d659-4099-8cbd-8841811d1320\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: chatResponse");
                            ChatResponse ox = chatResponseService.saveOrUpdate(chatResponse);
                            return new ResponseEntity<ChatResponse>(chatResponseService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /ChatResponse/{id} : Update an existing ChatResponse
            * Updates an existing ChatResponse.
        *
            * @param id Unique identifier for the ChatResponse. (required)
            * @param chatResponse Updated ChatResponse details. (required)
        * @return ChatResponse updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or ChatResponse not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ChatResponseApi#updateChatResponse
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<ChatResponse>> updateChatResponse(UUID id,
    ChatResponse chatResponse) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"role\" : \"user\", \"lastAccessedById\" : \"a88dc9eb-ad87-4247-903e-5a2ad302929c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sessionId\" : \"sessionId\", \"sourceOwner\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"37b8c8b9-b206-47c3-941b-752eb23a706c\", \"content\" : \"We must cross the mighty Mississippi\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sourceType\" : \"api\", \"lastModifiedById\" : \"ac846de8-26e9-42f8-9da9-36db6b0b5b47\", \"json\" : \"json\", \"id\" : \"ff6c8d64-d659-4099-8cbd-8841811d1320\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + chatResponse);
                            if(chatResponseService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            chatResponse.setId(id); // guard against a patch with no ID (upserts new objects)
                            ChatResponse ox = chatResponseService.saveOrUpdate(chatResponse);
                            return new ResponseEntity<ChatResponse>(chatResponseService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
