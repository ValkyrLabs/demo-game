package com.valkyrlabs.api;


import com.valkyrlabs.model.ApplicationService;

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

import com.valkyrlabs.model.Application;
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
* A delegate to be called by the {@link ApplicationApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class ApplicationApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(ApplicationApiDelegate.class);

    @Autowired
    private ApplicationService applicationService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Application/{id} : Delete a Application.
            * Deletes a specific Application.
        *
            * @param id Unique identifier for the Application. (required)
        * @return Application deleted successfully. (status code 204)
            *         or Application not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ApplicationApi#deleteApplication
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteApplication(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(applicationService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "ApplicationApi",  id);

            applicationService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Application/{id} : Retrieve a single Application
            * Retrieves a single Application for a specific uid.
        *
            * @param id Unique identifier for the Application. (required)
        * @return Successfully retrieved the Application. (status code 200)
            *         or Application not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ApplicationApi#getApplication
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Application>> getApplication(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"lastAccessedById\" : \"4a87751a-c2ed-42e2-b6fd-aeb730717a3c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"type\" : \"full-stack\", \"ownerId\" : \"be82da4e-c266-424b-b040-56dd0df0dd77\", \"entrypointUrl\" : \"http://example.com/aeiou\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"isTemplate\" : true, \"lastModifiedById\" : \"08099e6f-4156-4ca9-aeb0-2a0a04a66b59\", \"name\" : \"name\", \"contentMedia\" : [ { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" }, { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" } ], \"id\" : \"9744cc06-1817-4d43-a25c-6940c3795aa1\", \"status\" : \"ready\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "ApplicationApi",  id);
                            Optional<Application> ox = applicationService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Application>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Application : Retrieve a list of Applications
            * Retrieves a list of Applications.
        *
        * @return Successfully retrieved the list of Applications. (status code 200)
            *         or No Applications were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ApplicationApi#getApplicationList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Application>>> getApplicationList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"lastAccessedById\" : \"4a87751a-c2ed-42e2-b6fd-aeb730717a3c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"type\" : \"full-stack\", \"ownerId\" : \"be82da4e-c266-424b-b040-56dd0df0dd77\", \"entrypointUrl\" : \"http://example.com/aeiou\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"isTemplate\" : true, \"lastModifiedById\" : \"08099e6f-4156-4ca9-aeb0-2a0a04a66b59\", \"name\" : \"name\", \"contentMedia\" : [ { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" }, { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" } ], \"id\" : \"9744cc06-1817-4d43-a25c-6940c3795aa1\", \"status\" : \"ready\" }, { \"lastAccessedById\" : \"4a87751a-c2ed-42e2-b6fd-aeb730717a3c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"type\" : \"full-stack\", \"ownerId\" : \"be82da4e-c266-424b-b040-56dd0df0dd77\", \"entrypointUrl\" : \"http://example.com/aeiou\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"isTemplate\" : true, \"lastModifiedById\" : \"08099e6f-4156-4ca9-aeb0-2a0a04a66b59\", \"name\" : \"name\", \"contentMedia\" : [ { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" }, { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" } ], \"id\" : \"9744cc06-1817-4d43-a25c-6940c3795aa1\", \"status\" : \"ready\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(applicationService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Application>)applicationService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /Application : Create a new Application
            * Creates a new Application.
        *
            * @param application Application details. (required)
        * @return Application created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or Application not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ApplicationApi#postApplication
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Application>> postApplication(Application application) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"lastAccessedById\" : \"4a87751a-c2ed-42e2-b6fd-aeb730717a3c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"type\" : \"full-stack\", \"ownerId\" : \"be82da4e-c266-424b-b040-56dd0df0dd77\", \"entrypointUrl\" : \"http://example.com/aeiou\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"isTemplate\" : true, \"lastModifiedById\" : \"08099e6f-4156-4ca9-aeb0-2a0a04a66b59\", \"name\" : \"name\", \"contentMedia\" : [ { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" }, { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" } ], \"id\" : \"9744cc06-1817-4d43-a25c-6940c3795aa1\", \"status\" : \"ready\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: application");
                            Application ox = applicationService.saveOrUpdate(application);
                            return new ResponseEntity<Application>(applicationService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /Application/{id} : Update an existing Application
            * Updates an existing Application.
        *
            * @param id Unique identifier for the Application. (required)
            * @param application Updated Application details. (required)
        * @return Application updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or Application not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ApplicationApi#updateApplication
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Application>> updateApplication(UUID id,
    Application application) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"lastAccessedById\" : \"4a87751a-c2ed-42e2-b6fd-aeb730717a3c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"type\" : \"full-stack\", \"ownerId\" : \"be82da4e-c266-424b-b040-56dd0df0dd77\", \"entrypointUrl\" : \"http://example.com/aeiou\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"isTemplate\" : true, \"lastModifiedById\" : \"08099e6f-4156-4ca9-aeb0-2a0a04a66b59\", \"name\" : \"name\", \"contentMedia\" : [ { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" }, { \"mediaUrl\" : \"http://example.com/aeiou\", \"lastAccessedById\" : \"e37f321d-d34f-4516-907b-f4626e955645\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentUse\" : \"none\", \"ownerId\" : \"209291e8-4da1-459c-b369-03cd93b15707\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentDataId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastModifiedById\" : \"85b9ccff-ee11-4973-bbef-0082a6886e2e\", \"id\" : \"db3b4973-11f0-4789-a296-c612f0c5e4a0\", \"applicationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"contentType\" : \"image\" } ], \"id\" : \"9744cc06-1817-4d43-a25c-6940c3795aa1\", \"status\" : \"ready\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + application);
                            if(applicationService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            application.setId(id); // guard against a patch with no ID (upserts new objects)
                            Application ox = applicationService.saveOrUpdate(application);
                            return new ResponseEntity<Application>(applicationService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
