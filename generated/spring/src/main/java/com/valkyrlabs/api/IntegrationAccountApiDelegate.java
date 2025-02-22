package com.valkyrlabs.api;


import com.valkyrlabs.model.IntegrationAccountService;

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

import com.valkyrlabs.model.IntegrationAccount;
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
* A delegate to be called by the {@link IntegrationAccountApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class IntegrationAccountApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(IntegrationAccountApiDelegate.class);

    @Autowired
    private IntegrationAccountService integrationAccountService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /IntegrationAccount/{id} : Delete a IntegrationAccount.
            * Deletes a specific IntegrationAccount.
        *
            * @param id Unique identifier for the IntegrationAccount. (required)
        * @return IntegrationAccount deleted successfully. (status code 204)
            *         or IntegrationAccount not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see IntegrationAccountApi#deleteIntegrationAccount
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteIntegrationAccount(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(integrationAccountService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "IntegrationAccountApi",  id);

            integrationAccountService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /IntegrationAccount/{id} : Retrieve a single IntegrationAccount
            * Retrieves a single IntegrationAccount for a specific uid.
        *
            * @param id Unique identifier for the IntegrationAccount. (required)
        * @return Successfully retrieved the IntegrationAccount. (status code 200)
            *         or IntegrationAccount not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see IntegrationAccountApi#getIntegrationAccount
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<IntegrationAccount>> getIntegrationAccount(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "IntegrationAccountApi",  id);
                            Optional<IntegrationAccount> ox = integrationAccountService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<IntegrationAccount>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /IntegrationAccount : Retrieve a list of IntegrationAccounts
            * Retrieves a list of IntegrationAccounts.
        *
        * @return Successfully retrieved the list of IntegrationAccounts. (status code 200)
            *         or No IntegrationAccounts were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see IntegrationAccountApi#getIntegrationAccountList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<IntegrationAccount>>> getIntegrationAccountList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }, { \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(integrationAccountService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<IntegrationAccount>)integrationAccountService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /IntegrationAccount : Create a new IntegrationAccount
            * Creates a new IntegrationAccount.
        *
            * @param integrationAccount IntegrationAccount details. (required)
        * @return IntegrationAccount created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or IntegrationAccount not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see IntegrationAccountApi#postIntegrationAccount
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<IntegrationAccount>> postIntegrationAccount(IntegrationAccount integrationAccount) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: integrationAccount");
                            IntegrationAccount ox = integrationAccountService.saveOrUpdate(integrationAccount);
                            return new ResponseEntity<IntegrationAccount>(integrationAccountService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /IntegrationAccount/{id} : Update an existing IntegrationAccount
            * Updates an existing IntegrationAccount.
        *
            * @param id Unique identifier for the IntegrationAccount. (required)
            * @param integrationAccount Updated IntegrationAccount details. (required)
        * @return IntegrationAccount updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or IntegrationAccount not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see IntegrationAccountApi#updateIntegrationAccount
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<IntegrationAccount>> updateIntegrationAccount(UUID id,
    IntegrationAccount integrationAccount) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"accountName\" : \"STRIPE, Shopify, Gmail, X.com\", \"lastAccessedById\" : \"beca4524-9242-42f6-a802-37ec0ec8cf30\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"execModuleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"verified\" : false, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"643f7177-ba27-4840-b985-e81832ac9490\", \"accountId\" : \"accountId\", \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"e92be91c-82d3-47d6-866a-287ca082f091\", \"id\" : \"3aab3b9d-9abd-404d-9967-4be5b2e7f257\", \"username\" : \"STRIPE, Shopify, Gmail, X.com\", \"status\" : \"ready\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + integrationAccount);
                            if(integrationAccountService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            integrationAccount.setId(id); // guard against a patch with no ID (upserts new objects)
                            IntegrationAccount ox = integrationAccountService.saveOrUpdate(integrationAccount);
                            return new ResponseEntity<IntegrationAccount>(integrationAccountService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
