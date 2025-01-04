package com.valkyrlabs.api;


import com.valkyrlabs.model.SalesPipelineService;

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

import com.valkyrlabs.model.SalesPipeline;
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
* A delegate to be called by the {@link SalesPipelineApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class SalesPipelineApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(SalesPipelineApiDelegate.class);

    @Autowired
    private SalesPipelineService salesPipelineService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /SalesPipeline/{id} : Delete a SalesPipeline.
            * Deletes a specific SalesPipeline.
        *
            * @param id Unique identifier for the SalesPipeline. (required)
        * @return SalesPipeline deleted successfully. (status code 204)
            *         or SalesPipeline not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see SalesPipelineApi#deleteSalesPipeline
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteSalesPipeline(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(salesPipelineService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "SalesPipelineApi",  id);

            salesPipelineService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /SalesPipeline/{id} : Retrieve a single SalesPipeline
            * Retrieves a single SalesPipeline for a specific uid.
        *
            * @param id Unique identifier for the SalesPipeline. (required)
        * @return Successfully retrieved the SalesPipeline. (status code 200)
            *         or SalesPipeline not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see SalesPipelineApi#getSalesPipeline
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<SalesPipeline>> getSalesPipeline(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"becf9b99-c3d8-445f-8665-fcb60f5e4092\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"89c07579-0151-457a-ad75-562dfe817488\", \"name\" : \"lead\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sequenceOrder\" : 0, \"id\" : \"a067c6de-22da-4587-ba54-6d1e9eea4203\", \"ownerId\" : \"51c5dc16-88fc-4853-a202-ecb6872e6b35\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "SalesPipelineApi",  id);
                            Optional<SalesPipeline> ox = salesPipelineService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<SalesPipeline>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /SalesPipeline : Retrieve a list of SalesPipelines
            * Retrieves a list of SalesPipelines.
        *
        * @return Successfully retrieved the list of SalesPipelines. (status code 200)
            *         or No SalesPipelines were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see SalesPipelineApi#getSalesPipelineList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<SalesPipeline>>> getSalesPipelineList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"becf9b99-c3d8-445f-8665-fcb60f5e4092\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"89c07579-0151-457a-ad75-562dfe817488\", \"name\" : \"lead\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sequenceOrder\" : 0, \"id\" : \"a067c6de-22da-4587-ba54-6d1e9eea4203\", \"ownerId\" : \"51c5dc16-88fc-4853-a202-ecb6872e6b35\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"becf9b99-c3d8-445f-8665-fcb60f5e4092\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"89c07579-0151-457a-ad75-562dfe817488\", \"name\" : \"lead\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sequenceOrder\" : 0, \"id\" : \"a067c6de-22da-4587-ba54-6d1e9eea4203\", \"ownerId\" : \"51c5dc16-88fc-4853-a202-ecb6872e6b35\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(salesPipelineService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<SalesPipeline>)salesPipelineService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /SalesPipeline : Create a new SalesPipeline
            * Creates a new SalesPipeline.
        *
            * @param salesPipeline SalesPipeline details. (required)
        * @return SalesPipeline created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or SalesPipeline not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see SalesPipelineApi#postSalesPipeline
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<SalesPipeline>> postSalesPipeline(SalesPipeline salesPipeline) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"becf9b99-c3d8-445f-8665-fcb60f5e4092\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"89c07579-0151-457a-ad75-562dfe817488\", \"name\" : \"lead\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sequenceOrder\" : 0, \"id\" : \"a067c6de-22da-4587-ba54-6d1e9eea4203\", \"ownerId\" : \"51c5dc16-88fc-4853-a202-ecb6872e6b35\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: salesPipeline");
                            SalesPipeline ox = salesPipelineService.saveOrUpdate(salesPipeline);
                            return new ResponseEntity<SalesPipeline>(salesPipelineService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /SalesPipeline/{id} : Update an existing SalesPipeline
            * Updates an existing SalesPipeline.
        *
            * @param id Unique identifier for the SalesPipeline. (required)
            * @param salesPipeline Updated SalesPipeline details. (required)
        * @return SalesPipeline updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or SalesPipeline not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see SalesPipelineApi#updateSalesPipeline
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<SalesPipeline>> updateSalesPipeline(UUID id,
    SalesPipeline salesPipeline) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"becf9b99-c3d8-445f-8665-fcb60f5e4092\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"89c07579-0151-457a-ad75-562dfe817488\", \"name\" : \"lead\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"sequenceOrder\" : 0, \"id\" : \"a067c6de-22da-4587-ba54-6d1e9eea4203\", \"ownerId\" : \"51c5dc16-88fc-4853-a202-ecb6872e6b35\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + salesPipeline);
                            if(salesPipelineService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            salesPipeline.setId(id); // guard against a patch with no ID (upserts new objects)
                            SalesPipeline ox = salesPipelineService.saveOrUpdate(salesPipeline);
                            return new ResponseEntity<SalesPipeline>(salesPipelineService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
