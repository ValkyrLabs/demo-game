package com.valkyrlabs.api;


import com.valkyrlabs.model.WorkflowStateService;

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

import java.util.UUID;
import com.valkyrlabs.model.WorkflowState;
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
* A delegate to be called by the {@link WorkflowStateApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class WorkflowStateApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(WorkflowStateApiDelegate.class);

    @Autowired
    private WorkflowStateService workflowStateService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /WorkflowState/{id} : Delete a WorkflowState.
            * Deletes a specific WorkflowState.
        *
            * @param id Unique identifier for the WorkflowState. (required)
        * @return WorkflowState deleted successfully. (status code 204)
            *         or WorkflowState not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WorkflowStateApi#deleteWorkflowState
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteWorkflowState(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(workflowStateService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "WorkflowStateApi",  id);

            workflowStateService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /WorkflowState/{id} : Retrieve a single WorkflowState
            * Retrieves a single WorkflowState for a specific uid.
        *
            * @param id Unique identifier for the WorkflowState. (required)
        * @return Successfully retrieved the WorkflowState. (status code 200)
            *         or WorkflowState not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WorkflowStateApi#getWorkflowState
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<WorkflowState>> getWorkflowState(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "WorkflowStateApi",  id);
                            Optional<WorkflowState> ox = workflowStateService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<WorkflowState>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /WorkflowState : Retrieve a list of WorkflowStates
            * Retrieves a list of WorkflowStates.
        *
        * @return Successfully retrieved the list of WorkflowStates. (status code 200)
            *         or No WorkflowStates were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WorkflowStateApi#getWorkflowStateList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<WorkflowState>>> getWorkflowStateList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(workflowStateService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<WorkflowState>)workflowStateService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /WorkflowState : Create a new WorkflowState
            * Creates a new WorkflowState.
        *
            * @param workflowState WorkflowState details. (required)
        * @return WorkflowState created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or WorkflowState not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WorkflowStateApi#postWorkflowState
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<WorkflowState>> postWorkflowState(WorkflowState workflowState) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: workflowState");
                            WorkflowState ox = workflowStateService.saveOrUpdate(workflowState);
                            return new ResponseEntity<WorkflowState>(workflowStateService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /WorkflowState/{id} : Update an existing WorkflowState
            * Updates an existing WorkflowState.
        *
            * @param id Unique identifier for the WorkflowState. (required)
            * @param workflowState Updated WorkflowState details. (required)
        * @return WorkflowState updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or WorkflowState not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WorkflowStateApi#updateWorkflowState
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<WorkflowState>> updateWorkflowState(UUID id,
    WorkflowState workflowState) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + workflowState);
                            if(workflowStateService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            workflowState.setId(id); // guard against a patch with no ID (upserts new objects)
                            WorkflowState ox = workflowStateService.saveOrUpdate(workflowState);
                            return new ResponseEntity<WorkflowState>(workflowStateService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
