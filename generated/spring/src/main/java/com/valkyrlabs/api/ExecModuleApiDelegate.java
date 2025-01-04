package com.valkyrlabs.api;


import com.valkyrlabs.model.ExecModuleService;

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

import com.valkyrlabs.model.ExecModule;
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
* A delegate to be called by the {@link ExecModuleApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class ExecModuleApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(ExecModuleApiDelegate.class);

    @Autowired
    private ExecModuleService execModuleService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /ExecModule/{id} : Delete a ExecModule.
            * Deletes a specific ExecModule.
        *
            * @param id Unique identifier for the ExecModule. (required)
        * @return ExecModule deleted successfully. (status code 204)
            *         or ExecModule not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ExecModuleApi#deleteExecModule
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteExecModule(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(execModuleService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "ExecModuleApi",  id);

            execModuleService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /ExecModule/{id} : Retrieve a single ExecModule
            * Retrieves a single ExecModule for a specific uid.
        *
            * @param id Unique identifier for the ExecModule. (required)
        * @return Successfully retrieved the ExecModule. (status code 200)
            *         or ExecModule not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ExecModuleApi#getExecModule
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<ExecModule>> getExecModule(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "ExecModuleApi",  id);
                            Optional<ExecModule> ox = execModuleService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<ExecModule>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /ExecModule : Retrieve a list of ExecModules
            * Retrieves a list of ExecModules.
        *
        * @return Successfully retrieved the list of ExecModules. (status code 200)
            *         or No ExecModules were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ExecModuleApi#getExecModuleList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<ExecModule>>> getExecModuleList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(execModuleService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<ExecModule>)execModuleService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /ExecModule : Create a new ExecModule
            * Creates a new ExecModule.
        *
            * @param execModule ExecModule details. (required)
        * @return ExecModule created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or ExecModule not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ExecModuleApi#postExecModule
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<ExecModule>> postExecModule(ExecModule execModule) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: execModule");
                            ExecModule ox = execModuleService.saveOrUpdate(execModule);
                            return new ResponseEntity<ExecModule>(execModuleService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /ExecModule/{id} : Update an existing ExecModule
            * Updates an existing ExecModule.
        *
            * @param id Unique identifier for the ExecModule. (required)
            * @param execModule Updated ExecModule details. (required)
        * @return ExecModule updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or ExecModule not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see ExecModuleApi#updateExecModule
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<ExecModule>> updateExecModule(UUID id,
    ExecModule execModule) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + execModule);
                            if(execModuleService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            execModule.setId(id); // guard against a patch with no ID (upserts new objects)
                            ExecModule ox = execModuleService.saveOrUpdate(execModule);
                            return new ResponseEntity<ExecModule>(execModuleService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
