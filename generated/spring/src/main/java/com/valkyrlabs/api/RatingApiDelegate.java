package com.valkyrlabs.api;


import com.valkyrlabs.model.RatingService;

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

import com.valkyrlabs.model.Rating;
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
* A delegate to be called by the {@link RatingApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class RatingApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(RatingApiDelegate.class);

    @Autowired
    private RatingService ratingService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Rating/{id} : Delete a Rating.
            * Deletes a specific Rating.
        *
            * @param id Unique identifier for the Rating. (required)
        * @return Rating deleted successfully. (status code 204)
            *         or Rating not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see RatingApi#deleteRating
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteRating(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(ratingService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "RatingApi",  id);

            ratingService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Rating/{id} : Retrieve a single Rating
            * Retrieves a single Rating for a specific uid.
        *
            * @param id Unique identifier for the Rating. (required)
        * @return Successfully retrieved the Rating. (status code 200)
            *         or Rating not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see RatingApi#getRating
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Rating>> getRating(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"comments\" : \"Your real feelings\", \"lastAccessedById\" : \"09193484-6993-4617-9850-42e011231d46\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"rating\" : 0, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"targetType\" : \"homepage\", \"ownerId\" : \"c73f05d3-555b-466f-9d7b-fe5c76633b7d\", \"url\" : \"The URL of the rating record is about\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"57a7c75b-71de-4f3a-95ad-032223b0cc6d\", \"id\" : \"52a083a8-6282-4978-abdd-ebbf0856f613\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "RatingApi",  id);
                            Optional<Rating> ox = ratingService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Rating>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Rating : Retrieve a list of Ratings
            * Retrieves a list of Ratings.
        *
        * @return Successfully retrieved the list of Ratings. (status code 200)
            *         or No Ratings were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see RatingApi#getRatingList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Rating>>> getRatingList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"comments\" : \"Your real feelings\", \"lastAccessedById\" : \"09193484-6993-4617-9850-42e011231d46\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"rating\" : 0, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"targetType\" : \"homepage\", \"ownerId\" : \"c73f05d3-555b-466f-9d7b-fe5c76633b7d\", \"url\" : \"The URL of the rating record is about\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"57a7c75b-71de-4f3a-95ad-032223b0cc6d\", \"id\" : \"52a083a8-6282-4978-abdd-ebbf0856f613\" }, { \"comments\" : \"Your real feelings\", \"lastAccessedById\" : \"09193484-6993-4617-9850-42e011231d46\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"rating\" : 0, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"targetType\" : \"homepage\", \"ownerId\" : \"c73f05d3-555b-466f-9d7b-fe5c76633b7d\", \"url\" : \"The URL of the rating record is about\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"57a7c75b-71de-4f3a-95ad-032223b0cc6d\", \"id\" : \"52a083a8-6282-4978-abdd-ebbf0856f613\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(ratingService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Rating>)ratingService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /Rating : Create a new Rating
            * Creates a new Rating.
        *
            * @param rating Rating details. (required)
        * @return Rating created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or Rating not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see RatingApi#postRating
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Rating>> postRating(Rating rating) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"comments\" : \"Your real feelings\", \"lastAccessedById\" : \"09193484-6993-4617-9850-42e011231d46\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"rating\" : 0, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"targetType\" : \"homepage\", \"ownerId\" : \"c73f05d3-555b-466f-9d7b-fe5c76633b7d\", \"url\" : \"The URL of the rating record is about\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"57a7c75b-71de-4f3a-95ad-032223b0cc6d\", \"id\" : \"52a083a8-6282-4978-abdd-ebbf0856f613\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: rating");
                            Rating ox = ratingService.saveOrUpdate(rating);
                            return new ResponseEntity<Rating>(ratingService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /Rating/{id} : Update an existing Rating
            * Updates an existing Rating.
        *
            * @param id Unique identifier for the Rating. (required)
            * @param rating Updated Rating details. (required)
        * @return Rating updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or Rating not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see RatingApi#updateRating
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Rating>> updateRating(UUID id,
    Rating rating) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"comments\" : \"Your real feelings\", \"lastAccessedById\" : \"09193484-6993-4617-9850-42e011231d46\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"contentId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"rating\" : 0, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"targetType\" : \"homepage\", \"ownerId\" : \"c73f05d3-555b-466f-9d7b-fe5c76633b7d\", \"url\" : \"The URL of the rating record is about\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"57a7c75b-71de-4f3a-95ad-032223b0cc6d\", \"id\" : \"52a083a8-6282-4978-abdd-ebbf0856f613\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + rating);
                            if(ratingService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            rating.setId(id); // guard against a patch with no ID (upserts new objects)
                            Rating ox = ratingService.saveOrUpdate(rating);
                            return new ResponseEntity<Rating>(ratingService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
