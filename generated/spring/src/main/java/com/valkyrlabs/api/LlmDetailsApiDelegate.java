package com.valkyrlabs.api;


import com.valkyrlabs.model.LlmDetailsService;

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

import com.valkyrlabs.model.LlmDetails;
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
* A delegate to be called by the {@link LlmDetailsApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class LlmDetailsApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(LlmDetailsApiDelegate.class);

    @Autowired
    private LlmDetailsService llmDetailsService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /LlmDetails/{id} : Delete a LlmDetails.
            * Deletes a specific LlmDetails.
        *
            * @param id Unique identifier for the LlmDetails. (required)
        * @return LlmDetails deleted successfully. (status code 204)
            *         or LlmDetails not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LlmDetailsApi#deleteLlmDetails
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteLlmDetails(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(llmDetailsService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "LlmDetailsApi",  id);

            llmDetailsService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /LlmDetails/{id} : Retrieve a single LlmDetails
            * Retrieves a single LlmDetails for a specific uid.
        *
            * @param id Unique identifier for the LlmDetails. (required)
        * @return Successfully retrieved the LlmDetails. (status code 200)
            *         or LlmDetails not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LlmDetailsApi#getLlmDetails
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<LlmDetails>> getLlmDetails(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"initialPrompt\" : \"You are a helpful assistant\", \"notes\" : \"notes\", \"role\" : \"user\", \"apiKey\" : \"D6ObBZ599Z3xkuohG3/cogxZYwhxdVyLlIAPanlO35I=\", \"lastAccessedById\" : \"d32122d6-3e7a-409d-acf2-588c797823fc\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"requestParameters\" : \"requestParameters\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"2570f2fd-5cf6-4d2e-b53e-49a052eb29b3\", \"version\" : \"v3.0.3-B8\", \"url\" : \"http://example.com/aeiou\", \"keyHash\" : \"keyHash\", \"credentialPassword\" : \"c@nnotBeH@ckd!\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"credential\" : \"credential\", \"provider\" : \"valkyrai\", \"meta\" : \"meta\", \"lastModifiedById\" : \"f92f6ca3-0741-47ef-be79-fe4e048e2b75\", \"name\" : \"name\", \"id\" : \"b3c75132-b3eb-458e-b8e2-9df5ff48c36c\", \"apiType\" : \"openai\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "LlmDetailsApi",  id);
                            Optional<LlmDetails> ox = llmDetailsService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<LlmDetails>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /LlmDetails : Retrieve a list of LlmDetailss
            * Retrieves a list of LlmDetailss.
        *
        * @return Successfully retrieved the list of LlmDetailss. (status code 200)
            *         or No LlmDetailss were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LlmDetailsApi#getLlmDetailsList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<LlmDetails>>> getLlmDetailsList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"initialPrompt\" : \"You are a helpful assistant\", \"notes\" : \"notes\", \"role\" : \"user\", \"apiKey\" : \"D6ObBZ599Z3xkuohG3/cogxZYwhxdVyLlIAPanlO35I=\", \"lastAccessedById\" : \"d32122d6-3e7a-409d-acf2-588c797823fc\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"requestParameters\" : \"requestParameters\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"2570f2fd-5cf6-4d2e-b53e-49a052eb29b3\", \"version\" : \"v3.0.3-B8\", \"url\" : \"http://example.com/aeiou\", \"keyHash\" : \"keyHash\", \"credentialPassword\" : \"c@nnotBeH@ckd!\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"credential\" : \"credential\", \"provider\" : \"valkyrai\", \"meta\" : \"meta\", \"lastModifiedById\" : \"f92f6ca3-0741-47ef-be79-fe4e048e2b75\", \"name\" : \"name\", \"id\" : \"b3c75132-b3eb-458e-b8e2-9df5ff48c36c\", \"apiType\" : \"openai\" }, { \"initialPrompt\" : \"You are a helpful assistant\", \"notes\" : \"notes\", \"role\" : \"user\", \"apiKey\" : \"D6ObBZ599Z3xkuohG3/cogxZYwhxdVyLlIAPanlO35I=\", \"lastAccessedById\" : \"d32122d6-3e7a-409d-acf2-588c797823fc\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"requestParameters\" : \"requestParameters\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"2570f2fd-5cf6-4d2e-b53e-49a052eb29b3\", \"version\" : \"v3.0.3-B8\", \"url\" : \"http://example.com/aeiou\", \"keyHash\" : \"keyHash\", \"credentialPassword\" : \"c@nnotBeH@ckd!\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"credential\" : \"credential\", \"provider\" : \"valkyrai\", \"meta\" : \"meta\", \"lastModifiedById\" : \"f92f6ca3-0741-47ef-be79-fe4e048e2b75\", \"name\" : \"name\", \"id\" : \"b3c75132-b3eb-458e-b8e2-9df5ff48c36c\", \"apiType\" : \"openai\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(llmDetailsService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<LlmDetails>)llmDetailsService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /LlmDetails : Create a new LlmDetails
            * Creates a new LlmDetails.
        *
            * @param llmDetails LlmDetails details. (required)
        * @return LlmDetails created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or LlmDetails not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LlmDetailsApi#postLlmDetails
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<LlmDetails>> postLlmDetails(LlmDetails llmDetails) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"initialPrompt\" : \"You are a helpful assistant\", \"notes\" : \"notes\", \"role\" : \"user\", \"apiKey\" : \"D6ObBZ599Z3xkuohG3/cogxZYwhxdVyLlIAPanlO35I=\", \"lastAccessedById\" : \"d32122d6-3e7a-409d-acf2-588c797823fc\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"requestParameters\" : \"requestParameters\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"2570f2fd-5cf6-4d2e-b53e-49a052eb29b3\", \"version\" : \"v3.0.3-B8\", \"url\" : \"http://example.com/aeiou\", \"keyHash\" : \"keyHash\", \"credentialPassword\" : \"c@nnotBeH@ckd!\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"credential\" : \"credential\", \"provider\" : \"valkyrai\", \"meta\" : \"meta\", \"lastModifiedById\" : \"f92f6ca3-0741-47ef-be79-fe4e048e2b75\", \"name\" : \"name\", \"id\" : \"b3c75132-b3eb-458e-b8e2-9df5ff48c36c\", \"apiType\" : \"openai\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: llmDetails");
                            LlmDetails ox = llmDetailsService.saveOrUpdate(llmDetails);
                            return new ResponseEntity<LlmDetails>(llmDetailsService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /LlmDetails/{id} : Update an existing LlmDetails
            * Updates an existing LlmDetails.
        *
            * @param id Unique identifier for the LlmDetails. (required)
            * @param llmDetails Updated LlmDetails details. (required)
        * @return LlmDetails updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or LlmDetails not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LlmDetailsApi#updateLlmDetails
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<LlmDetails>> updateLlmDetails(UUID id,
    LlmDetails llmDetails) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"initialPrompt\" : \"You are a helpful assistant\", \"notes\" : \"notes\", \"role\" : \"user\", \"apiKey\" : \"D6ObBZ599Z3xkuohG3/cogxZYwhxdVyLlIAPanlO35I=\", \"lastAccessedById\" : \"d32122d6-3e7a-409d-acf2-588c797823fc\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"requestParameters\" : \"requestParameters\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"2570f2fd-5cf6-4d2e-b53e-49a052eb29b3\", \"version\" : \"v3.0.3-B8\", \"url\" : \"http://example.com/aeiou\", \"keyHash\" : \"keyHash\", \"credentialPassword\" : \"c@nnotBeH@ckd!\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"credential\" : \"credential\", \"provider\" : \"valkyrai\", \"meta\" : \"meta\", \"lastModifiedById\" : \"f92f6ca3-0741-47ef-be79-fe4e048e2b75\", \"name\" : \"name\", \"id\" : \"b3c75132-b3eb-458e-b8e2-9df5ff48c36c\", \"apiType\" : \"openai\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + llmDetails);
                            if(llmDetailsService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            llmDetails.setId(id); // guard against a patch with no ID (upserts new objects)
                            LlmDetails ox = llmDetailsService.saveOrUpdate(llmDetails);
                            return new ResponseEntity<LlmDetails>(llmDetailsService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
