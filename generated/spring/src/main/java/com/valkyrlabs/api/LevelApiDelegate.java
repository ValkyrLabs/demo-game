package com.valkyrlabs.api;


import com.valkyrlabs.model.LevelService;

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

import com.valkyrlabs.model.Level;
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
* A delegate to be called by the {@link LevelApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class LevelApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(LevelApiDelegate.class);

    @Autowired
    private LevelService levelService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Level/{id} : Delete a Level.
            * Deletes a specific Level.
        *
            * @param id Unique identifier for the Level. (required)
        * @return Level deleted successfully. (status code 204)
            *         or Level not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LevelApi#deleteLevel
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteLevel(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(levelService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "LevelApi",  id);

            levelService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Level/{id} : Retrieve a single Level
            * Retrieves a single Level for a specific uid.
        *
            * @param id Unique identifier for the Level. (required)
        * @return Successfully retrieved the Level. (status code 200)
            *         or Level not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LevelApi#getLevel
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Level>> getLevel(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"color\" : \"BLACK\", \"level\" : 0, \"lastAccessedById\" : \"e13d1a53-bdf7-4ef8-9ce5-5d2c4bad654f\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"scoreMultiplier\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"fdbb825b-0db1-43bf-ab1f-485c482df862\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"levelType\" : \"MAP\", \"lastModifiedById\" : \"941a62d0-68f0-42f6-a883-70bd5b776b58\", \"name\" : \"name\", \"id\" : \"ffef594f-a40e-43c3-a913-fb4294f8a897\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "LevelApi",  id);
                            Optional<Level> ox = levelService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Level>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Level : Retrieve a list of Levels
            * Retrieves a list of Levels.
        *
        * @return Successfully retrieved the list of Levels. (status code 200)
            *         or No Levels were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LevelApi#getLevelList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Level>>> getLevelList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"color\" : \"BLACK\", \"level\" : 0, \"lastAccessedById\" : \"e13d1a53-bdf7-4ef8-9ce5-5d2c4bad654f\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"scoreMultiplier\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"fdbb825b-0db1-43bf-ab1f-485c482df862\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"levelType\" : \"MAP\", \"lastModifiedById\" : \"941a62d0-68f0-42f6-a883-70bd5b776b58\", \"name\" : \"name\", \"id\" : \"ffef594f-a40e-43c3-a913-fb4294f8a897\" }, { \"color\" : \"BLACK\", \"level\" : 0, \"lastAccessedById\" : \"e13d1a53-bdf7-4ef8-9ce5-5d2c4bad654f\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"scoreMultiplier\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"fdbb825b-0db1-43bf-ab1f-485c482df862\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"levelType\" : \"MAP\", \"lastModifiedById\" : \"941a62d0-68f0-42f6-a883-70bd5b776b58\", \"name\" : \"name\", \"id\" : \"ffef594f-a40e-43c3-a913-fb4294f8a897\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(levelService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Level>)levelService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /Level : Create a new Level
            * Creates a new Level.
        *
            * @param level Level details. (required)
        * @return Level created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or Level not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LevelApi#postLevel
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Level>> postLevel(Level level) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"color\" : \"BLACK\", \"level\" : 0, \"lastAccessedById\" : \"e13d1a53-bdf7-4ef8-9ce5-5d2c4bad654f\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"scoreMultiplier\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"fdbb825b-0db1-43bf-ab1f-485c482df862\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"levelType\" : \"MAP\", \"lastModifiedById\" : \"941a62d0-68f0-42f6-a883-70bd5b776b58\", \"name\" : \"name\", \"id\" : \"ffef594f-a40e-43c3-a913-fb4294f8a897\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: level");
                            Level ox = levelService.saveOrUpdate(level);
                            return new ResponseEntity<Level>(levelService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /Level/{id} : Update an existing Level
            * Updates an existing Level.
        *
            * @param id Unique identifier for the Level. (required)
            * @param level Updated Level details. (required)
        * @return Level updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or Level not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LevelApi#updateLevel
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Level>> updateLevel(UUID id,
    Level level) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"color\" : \"BLACK\", \"level\" : 0, \"lastAccessedById\" : \"e13d1a53-bdf7-4ef8-9ce5-5d2c4bad654f\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"scoreMultiplier\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"fdbb825b-0db1-43bf-ab1f-485c482df862\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"levelType\" : \"MAP\", \"lastModifiedById\" : \"941a62d0-68f0-42f6-a883-70bd5b776b58\", \"name\" : \"name\", \"id\" : \"ffef594f-a40e-43c3-a913-fb4294f8a897\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + level);
                            if(levelService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            level.setId(id); // guard against a patch with no ID (upserts new objects)
                            Level ox = levelService.saveOrUpdate(level);
                            return new ResponseEntity<Level>(levelService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
