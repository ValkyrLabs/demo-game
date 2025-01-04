package com.valkyrlabs.api;


import com.valkyrlabs.model.ContentMediaLinkService;

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

import com.valkyrlabs.model.ContentMediaLink;
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
* A delegate to be called by the {@link ContentMediaLinkApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class ContentMediaLinkApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(ContentMediaLinkApiDelegate.class);

    @Autowired
    private ContentMediaLinkService contentMediaLinkService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /ContentMediaLink/{id} : Delete a ContentMediaLink.
            * Deletes a specific ContentMediaLink.
        *
            * @param id Unique identifier for the ContentMediaLink. (required)
        * @return ContentMediaLink deleted successfully. (status code 204)
            *         or ContentMediaLink not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ContentMediaLinkApi#deleteContentMediaLink
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteContentMediaLink(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(contentMediaLinkService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "ContentMediaLinkApi",  id);

            contentMediaLinkService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /ContentMediaLink/{id} : Retrieve a single ContentMediaLink
            * Retrieves a single ContentMediaLink for a specific uid.
        *
            * @param id Unique identifier for the ContentMediaLink. (required)
        * @return Successfully retrieved the ContentMediaLink. (status code 200)
            *         or ContentMediaLink not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ContentMediaLinkApi#getContentMediaLink
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<ContentMediaLink>> getContentMediaLink(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "ContentMediaLinkApi",  id);
                            Optional<ContentMediaLink> ox = contentMediaLinkService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<ContentMediaLink>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /ContentMediaLink : Retrieve a list of ContentMediaLinks
            * Retrieves a list of ContentMediaLinks.
        *
        * @return Successfully retrieved the list of ContentMediaLinks. (status code 200)
            *         or No ContentMediaLinks were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ContentMediaLinkApi#getContentMediaLinkList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<ContentMediaLink>>> getContentMediaLinkList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" }, { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(contentMediaLinkService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<ContentMediaLink>)contentMediaLinkService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /ContentMediaLink : Create a new ContentMediaLink
            * Creates a new ContentMediaLink.
        *
            * @param contentMediaLink ContentMediaLink details. (required)
        * @return ContentMediaLink created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or ContentMediaLink not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ContentMediaLinkApi#postContentMediaLink
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<ContentMediaLink>> postContentMediaLink(ContentMediaLink contentMediaLink) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: contentMediaLink");
                            ContentMediaLink ox = contentMediaLinkService.saveOrUpdate(contentMediaLink);
                            return new ResponseEntity<ContentMediaLink>(contentMediaLinkService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /ContentMediaLink/{id} : Update an existing ContentMediaLink
            * Updates an existing ContentMediaLink.
        *
            * @param id Unique identifier for the ContentMediaLink. (required)
            * @param contentMediaLink Updated ContentMediaLink details. (required)
        * @return ContentMediaLink updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or ContentMediaLink not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ContentMediaLinkApi#updateContentMediaLink
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<ContentMediaLink>> updateContentMediaLink(UUID id,
    ContentMediaLink contentMediaLink) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + contentMediaLink);
                            if(contentMediaLinkService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            contentMediaLink.setId(id); // guard against a patch with no ID (upserts new objects)
                            ContentMediaLink ox = contentMediaLinkService.saveOrUpdate(contentMediaLink);
                            return new ResponseEntity<ContentMediaLink>(contentMediaLinkService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
