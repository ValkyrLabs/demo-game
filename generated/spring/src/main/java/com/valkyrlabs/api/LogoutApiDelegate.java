package com.valkyrlabs.api;


import com.valkyrlabs.model.LogoutService;

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

import com.valkyrlabs.model.Logout;
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
* A delegate to be called by the {@link LogoutApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class LogoutApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(LogoutApiDelegate.class);

    @Autowired
    private LogoutService logoutService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Logout/{id} : Delete a Logout.
            * Deletes a specific Logout.
        *
            * @param id Unique identifier for the Logout. (required)
        * @return Logout deleted successfully. (status code 204)
            *         or Logout not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LogoutApi#deleteLogout
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteLogout(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(logoutService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "LogoutApi",  id);

            logoutService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Logout/{id} : Retrieve a single Logout
            * Retrieves a single Logout for a specific uid.
        *
            * @param id Unique identifier for the Logout. (required)
        * @return Successfully retrieved the Logout. (status code 200)
            *         or Logout not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LogoutApi#getLogout
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Logout>> getLogout(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"93850cc7-673e-48ea-a594-385bde8e9fca\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"60418982-a1ea-4832-8848-d37adf120363\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"8ec508fe-99a6-4a98-b47e-e28d057b6284\", \"ownerId\" : \"29cfd419-c81a-47ae-8600-79ac5d8cc6c7\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "LogoutApi",  id);
                            Optional<Logout> ox = logoutService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Logout>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Logout : Retrieve a list of Logouts
            * Retrieves a list of Logouts.
        *
        * @return Successfully retrieved the list of Logouts. (status code 200)
            *         or No Logouts were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LogoutApi#getLogoutList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Logout>>> getLogoutList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"93850cc7-673e-48ea-a594-385bde8e9fca\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"60418982-a1ea-4832-8848-d37adf120363\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"8ec508fe-99a6-4a98-b47e-e28d057b6284\", \"ownerId\" : \"29cfd419-c81a-47ae-8600-79ac5d8cc6c7\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"93850cc7-673e-48ea-a594-385bde8e9fca\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"60418982-a1ea-4832-8848-d37adf120363\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"8ec508fe-99a6-4a98-b47e-e28d057b6284\", \"ownerId\" : \"29cfd419-c81a-47ae-8600-79ac5d8cc6c7\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(logoutService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Logout>)logoutService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /Logout : Create a new Logout
            * Creates a new Logout.
        *
            * @param logout Logout details. (required)
        * @return Logout created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or Logout not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LogoutApi#postLogout
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Logout>> postLogout(Logout logout) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"93850cc7-673e-48ea-a594-385bde8e9fca\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"60418982-a1ea-4832-8848-d37adf120363\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"8ec508fe-99a6-4a98-b47e-e28d057b6284\", \"ownerId\" : \"29cfd419-c81a-47ae-8600-79ac5d8cc6c7\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: logout");
                            Logout ox = logoutService.saveOrUpdate(logout);
                            return new ResponseEntity<Logout>(logoutService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /Logout/{id} : Update an existing Logout
            * Updates an existing Logout.
        *
            * @param id Unique identifier for the Logout. (required)
            * @param logout Updated Logout details. (required)
        * @return Logout updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or Logout not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LogoutApi#updateLogout
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Logout>> updateLogout(UUID id,
    Logout logout) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"93850cc7-673e-48ea-a594-385bde8e9fca\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"60418982-a1ea-4832-8848-d37adf120363\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"8ec508fe-99a6-4a98-b47e-e28d057b6284\", \"ownerId\" : \"29cfd419-c81a-47ae-8600-79ac5d8cc6c7\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + logout);
                            if(logoutService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            logout.setId(id); // guard against a patch with no ID (upserts new objects)
                            Logout ox = logoutService.saveOrUpdate(logout);
                            return new ResponseEntity<Logout>(logoutService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
