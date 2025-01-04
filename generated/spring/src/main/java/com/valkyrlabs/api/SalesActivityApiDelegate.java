package com.valkyrlabs.api;


import com.valkyrlabs.model.SalesActivityService;

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

import com.valkyrlabs.model.SalesActivity;
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
* A delegate to be called by the {@link SalesActivityApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class SalesActivityApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(SalesActivityApiDelegate.class);

    @Autowired
    private SalesActivityService salesActivityService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /SalesActivity/{id} : Delete a SalesActivity.
            * Deletes a specific SalesActivity.
        *
            * @param id Unique identifier for the SalesActivity. (required)
        * @return SalesActivity deleted successfully. (status code 204)
            *         or SalesActivity not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see SalesActivityApi#deleteSalesActivity
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteSalesActivity(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(salesActivityService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "SalesActivityApi",  id);

            salesActivityService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /SalesActivity/{id} : Retrieve a single SalesActivity
            * Retrieves a single SalesActivity for a specific uid.
        *
            * @param id Unique identifier for the SalesActivity. (required)
        * @return Successfully retrieved the SalesActivity. (status code 200)
            *         or SalesActivity not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see SalesActivityApi#getSalesActivity
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<SalesActivity>> getSalesActivity(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"lastAccessedById\" : \"bba43247-148c-44b5-b60e-3eca205c491d\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"type\" : \"call\", \"ownerId\" : \"2b9f9be4-683a-4113-ac6d-7067d94037bc\", \"opportunityId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"activityDate\" : \"2000-01-23T04:56:07.000+00:00\", \"performedBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"5600d31a-f57e-499f-8454-20c54f0eba79\", \"details\" : \"details\", \"id\" : \"d1291c3e-0260-4bc5-92e9-8931b67fc35a\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "SalesActivityApi",  id);
                            Optional<SalesActivity> ox = salesActivityService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<SalesActivity>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /SalesActivity : Retrieve a list of SalesActivitys
            * Retrieves a list of SalesActivitys.
        *
        * @return Successfully retrieved the list of SalesActivitys. (status code 200)
            *         or No SalesActivitys were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see SalesActivityApi#getSalesActivityList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<SalesActivity>>> getSalesActivityList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"lastAccessedById\" : \"bba43247-148c-44b5-b60e-3eca205c491d\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"type\" : \"call\", \"ownerId\" : \"2b9f9be4-683a-4113-ac6d-7067d94037bc\", \"opportunityId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"activityDate\" : \"2000-01-23T04:56:07.000+00:00\", \"performedBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"5600d31a-f57e-499f-8454-20c54f0eba79\", \"details\" : \"details\", \"id\" : \"d1291c3e-0260-4bc5-92e9-8931b67fc35a\" }, { \"lastAccessedById\" : \"bba43247-148c-44b5-b60e-3eca205c491d\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"type\" : \"call\", \"ownerId\" : \"2b9f9be4-683a-4113-ac6d-7067d94037bc\", \"opportunityId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"activityDate\" : \"2000-01-23T04:56:07.000+00:00\", \"performedBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"5600d31a-f57e-499f-8454-20c54f0eba79\", \"details\" : \"details\", \"id\" : \"d1291c3e-0260-4bc5-92e9-8931b67fc35a\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(salesActivityService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<SalesActivity>)salesActivityService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /SalesActivity : Create a new SalesActivity
            * Creates a new SalesActivity.
        *
            * @param salesActivity SalesActivity details. (required)
        * @return SalesActivity created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or SalesActivity not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see SalesActivityApi#postSalesActivity
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<SalesActivity>> postSalesActivity(SalesActivity salesActivity) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"lastAccessedById\" : \"bba43247-148c-44b5-b60e-3eca205c491d\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"type\" : \"call\", \"ownerId\" : \"2b9f9be4-683a-4113-ac6d-7067d94037bc\", \"opportunityId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"activityDate\" : \"2000-01-23T04:56:07.000+00:00\", \"performedBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"5600d31a-f57e-499f-8454-20c54f0eba79\", \"details\" : \"details\", \"id\" : \"d1291c3e-0260-4bc5-92e9-8931b67fc35a\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: salesActivity");
                            SalesActivity ox = salesActivityService.saveOrUpdate(salesActivity);
                            return new ResponseEntity<SalesActivity>(salesActivityService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /SalesActivity/{id} : Update an existing SalesActivity
            * Updates an existing SalesActivity.
        *
            * @param id Unique identifier for the SalesActivity. (required)
            * @param salesActivity Updated SalesActivity details. (required)
        * @return SalesActivity updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or SalesActivity not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see SalesActivityApi#updateSalesActivity
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<SalesActivity>> updateSalesActivity(UUID id,
    SalesActivity salesActivity) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"lastAccessedById\" : \"bba43247-148c-44b5-b60e-3eca205c491d\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"type\" : \"call\", \"ownerId\" : \"2b9f9be4-683a-4113-ac6d-7067d94037bc\", \"opportunityId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"activityDate\" : \"2000-01-23T04:56:07.000+00:00\", \"performedBy\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"5600d31a-f57e-499f-8454-20c54f0eba79\", \"details\" : \"details\", \"id\" : \"d1291c3e-0260-4bc5-92e9-8931b67fc35a\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + salesActivity);
                            if(salesActivityService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            salesActivity.setId(id); // guard against a patch with no ID (upserts new objects)
                            SalesActivity ox = salesActivityService.saveOrUpdate(salesActivity);
                            return new ResponseEntity<SalesActivity>(salesActivityService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
