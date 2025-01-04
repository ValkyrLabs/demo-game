package com.valkyrlabs.api;


import com.valkyrlabs.model.WorkflowService;

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
import com.valkyrlabs.model.Workflow;
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
* A delegate to be called by the {@link WorkflowApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class WorkflowApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(WorkflowApiDelegate.class);

    @Autowired
    private WorkflowService workflowService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Workflow/{id} : Delete a Workflow.
            * Deletes a specific Workflow.
        *
            * @param id Unique identifier for the Workflow. (required)
        * @return Workflow deleted successfully. (status code 204)
            *         or Workflow not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WorkflowApi#deleteWorkflow
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteWorkflow(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(workflowService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "WorkflowApi",  id);

            workflowService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Workflow/{id} : Retrieve a single Workflow
            * Retrieves a single Workflow for a specific uid.
        *
            * @param id Unique identifier for the Workflow. (required)
        * @return Successfully retrieved the Workflow. (status code 200)
            *         or Workflow not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WorkflowApi#getWorkflow
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Workflow>> getWorkflow(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"role\" : \"user\", \"lastAccessedById\" : \"1ced40ec-8db9-44cd-8b0c-96ff88c95a59\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"this workflow is designed to keep customers in the loop\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"e3415238-fa96-480b-9d57-1f41fbd7f5b1\", \"schedule\" : \"*/20 * * * * ?\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"meta\" : \"meta\", \"lastModifiedById\" : \"2dcfeb88-4f40-4efa-8c4b-565e25f3025f\", \"name\" : \"Customer Email Workflow\", \"state\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"id\" : \"bdd61864-f164-4ecd-b92e-3b261527b4d2\", \"tasks\" : [ { \"role\" : \"user\", \"lastAccessedById\" : \"74a8eb08-53ba-403c-9e52-40cc195f4ac0\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"9fcb308d-2d5d-4ad6-a2a7-406e6e00b3a4\", \"modules\" : [ { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e4ed1f11-eed0-44e9-8d3a-9e0f1a2c700f\", \"id\" : \"0306f180-dd9f-4365-8509-e6ae000ee95e\", \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"role\" : \"user\", \"lastAccessedById\" : \"74a8eb08-53ba-403c-9e52-40cc195f4ac0\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"9fcb308d-2d5d-4ad6-a2a7-406e6e00b3a4\", \"modules\" : [ { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e4ed1f11-eed0-44e9-8d3a-9e0f1a2c700f\", \"id\" : \"0306f180-dd9f-4365-8509-e6ae000ee95e\", \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"status\" : \"running\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "WorkflowApi",  id);
                            Optional<Workflow> ox = workflowService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Workflow>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Workflow : Retrieve a list of Workflows
            * Retrieves a list of Workflows.
        *
        * @return Successfully retrieved the list of Workflows. (status code 200)
            *         or No Workflows were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WorkflowApi#getWorkflowList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Workflow>>> getWorkflowList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"role\" : \"user\", \"lastAccessedById\" : \"1ced40ec-8db9-44cd-8b0c-96ff88c95a59\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"this workflow is designed to keep customers in the loop\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"e3415238-fa96-480b-9d57-1f41fbd7f5b1\", \"schedule\" : \"*/20 * * * * ?\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"meta\" : \"meta\", \"lastModifiedById\" : \"2dcfeb88-4f40-4efa-8c4b-565e25f3025f\", \"name\" : \"Customer Email Workflow\", \"state\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"id\" : \"bdd61864-f164-4ecd-b92e-3b261527b4d2\", \"tasks\" : [ { \"role\" : \"user\", \"lastAccessedById\" : \"74a8eb08-53ba-403c-9e52-40cc195f4ac0\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"9fcb308d-2d5d-4ad6-a2a7-406e6e00b3a4\", \"modules\" : [ { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e4ed1f11-eed0-44e9-8d3a-9e0f1a2c700f\", \"id\" : \"0306f180-dd9f-4365-8509-e6ae000ee95e\", \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"role\" : \"user\", \"lastAccessedById\" : \"74a8eb08-53ba-403c-9e52-40cc195f4ac0\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"9fcb308d-2d5d-4ad6-a2a7-406e6e00b3a4\", \"modules\" : [ { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e4ed1f11-eed0-44e9-8d3a-9e0f1a2c700f\", \"id\" : \"0306f180-dd9f-4365-8509-e6ae000ee95e\", \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"status\" : \"running\" }, { \"role\" : \"user\", \"lastAccessedById\" : \"1ced40ec-8db9-44cd-8b0c-96ff88c95a59\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"this workflow is designed to keep customers in the loop\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"e3415238-fa96-480b-9d57-1f41fbd7f5b1\", \"schedule\" : \"*/20 * * * * ?\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"meta\" : \"meta\", \"lastModifiedById\" : \"2dcfeb88-4f40-4efa-8c4b-565e25f3025f\", \"name\" : \"Customer Email Workflow\", \"state\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"id\" : \"bdd61864-f164-4ecd-b92e-3b261527b4d2\", \"tasks\" : [ { \"role\" : \"user\", \"lastAccessedById\" : \"74a8eb08-53ba-403c-9e52-40cc195f4ac0\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"9fcb308d-2d5d-4ad6-a2a7-406e6e00b3a4\", \"modules\" : [ { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e4ed1f11-eed0-44e9-8d3a-9e0f1a2c700f\", \"id\" : \"0306f180-dd9f-4365-8509-e6ae000ee95e\", \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"role\" : \"user\", \"lastAccessedById\" : \"74a8eb08-53ba-403c-9e52-40cc195f4ac0\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"9fcb308d-2d5d-4ad6-a2a7-406e6e00b3a4\", \"modules\" : [ { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e4ed1f11-eed0-44e9-8d3a-9e0f1a2c700f\", \"id\" : \"0306f180-dd9f-4365-8509-e6ae000ee95e\", \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"status\" : \"running\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(workflowService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Workflow>)workflowService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /Workflow : Create a new Workflow
            * Creates a new Workflow.
        *
            * @param workflow Workflow details. (required)
        * @return Workflow created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or Workflow not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WorkflowApi#postWorkflow
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Workflow>> postWorkflow(Workflow workflow) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"role\" : \"user\", \"lastAccessedById\" : \"1ced40ec-8db9-44cd-8b0c-96ff88c95a59\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"this workflow is designed to keep customers in the loop\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"e3415238-fa96-480b-9d57-1f41fbd7f5b1\", \"schedule\" : \"*/20 * * * * ?\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"meta\" : \"meta\", \"lastModifiedById\" : \"2dcfeb88-4f40-4efa-8c4b-565e25f3025f\", \"name\" : \"Customer Email Workflow\", \"state\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"id\" : \"bdd61864-f164-4ecd-b92e-3b261527b4d2\", \"tasks\" : [ { \"role\" : \"user\", \"lastAccessedById\" : \"74a8eb08-53ba-403c-9e52-40cc195f4ac0\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"9fcb308d-2d5d-4ad6-a2a7-406e6e00b3a4\", \"modules\" : [ { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e4ed1f11-eed0-44e9-8d3a-9e0f1a2c700f\", \"id\" : \"0306f180-dd9f-4365-8509-e6ae000ee95e\", \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"role\" : \"user\", \"lastAccessedById\" : \"74a8eb08-53ba-403c-9e52-40cc195f4ac0\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"9fcb308d-2d5d-4ad6-a2a7-406e6e00b3a4\", \"modules\" : [ { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e4ed1f11-eed0-44e9-8d3a-9e0f1a2c700f\", \"id\" : \"0306f180-dd9f-4365-8509-e6ae000ee95e\", \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"status\" : \"running\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: workflow");
                            Workflow ox = workflowService.saveOrUpdate(workflow);
                            return new ResponseEntity<Workflow>(workflowService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /Workflow/{id} : Update an existing Workflow
            * Updates an existing Workflow.
        *
            * @param id Unique identifier for the Workflow. (required)
            * @param workflow Updated Workflow details. (required)
        * @return Workflow updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or Workflow not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WorkflowApi#updateWorkflow
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Workflow>> updateWorkflow(UUID id,
    Workflow workflow) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"role\" : \"user\", \"lastAccessedById\" : \"1ced40ec-8db9-44cd-8b0c-96ff88c95a59\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"this workflow is designed to keep customers in the loop\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"e3415238-fa96-480b-9d57-1f41fbd7f5b1\", \"schedule\" : \"*/20 * * * * ?\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"meta\" : \"meta\", \"lastModifiedById\" : \"2dcfeb88-4f40-4efa-8c4b-565e25f3025f\", \"name\" : \"Customer Email Workflow\", \"state\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"4d5b0148-a2e5-4237-87c2-6ed656c9ef5e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"c04a3ea4-8fbd-4615-937e-fb4cb5fb09a0\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"5dc825b4-cb9e-4393-9efc-132cdb42d7dc\", \"ownerId\" : \"bbcb7dff-ec66-4653-bdd6-70e85be7418e\", \"value\" : [ \"\", \"\" ], \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"id\" : \"bdd61864-f164-4ecd-b92e-3b261527b4d2\", \"tasks\" : [ { \"role\" : \"user\", \"lastAccessedById\" : \"74a8eb08-53ba-403c-9e52-40cc195f4ac0\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"9fcb308d-2d5d-4ad6-a2a7-406e6e00b3a4\", \"modules\" : [ { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e4ed1f11-eed0-44e9-8d3a-9e0f1a2c700f\", \"id\" : \"0306f180-dd9f-4365-8509-e6ae000ee95e\", \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"role\" : \"user\", \"lastAccessedById\" : \"74a8eb08-53ba-403c-9e52-40cc195f4ac0\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"9fcb308d-2d5d-4ad6-a2a7-406e6e00b3a4\", \"modules\" : [ { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" }, { \"systemId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"integrationAccount\" : { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, \"role\" : \"anonymous\", \"notes\" : \"notes\", \"moduleType\" : \"broadcast\", \"lastAccessedById\" : \"ba9273f4-5fad-45f6-9430-15bcdd7794f7\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"className\" : \"EmailModule, PipelineModule, RestApiModule\", \"moduleData\" : \"moduleData\", \"ownerId\" : \"0ae05055-3e5a-43ce-92b2-6e8e1595f7ae\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"6be1f028-58a4-496e-a9ff-67964eb7dc6a\", \"name\" : \"EmailSendModule, OpenApiSpecImportModule\", \"id\" : \"21019af6-6e83-4148-b290-0fe61e5d1e30\", \"taskId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e4ed1f11-eed0-44e9-8d3a-9e0f1a2c700f\", \"id\" : \"0306f180-dd9f-4365-8509-e6ae000ee95e\", \"workflowId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"status\" : \"running\" } ], \"status\" : \"running\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + workflow);
                            if(workflowService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            workflow.setId(id); // guard against a patch with no ID (upserts new objects)
                            Workflow ox = workflowService.saveOrUpdate(workflow);
                            return new ResponseEntity<Workflow>(workflowService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
