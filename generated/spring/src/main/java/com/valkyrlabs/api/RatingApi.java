/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import com.valkyrlabs.model.Rating;
import java.util.UUID;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
@Validated
@Tag(name = "Rating", description = "the Rating API")
public interface RatingApi {

    default RatingApiDelegate getDelegate() {
        return new RatingApiDelegate() {};
    }

    /**
     * DELETE /Rating/{id} : Delete a Rating.
     * Deletes a specific Rating.
     *
     * @param id Unique identifier for the Rating. (required)
     * @return Rating deleted successfully. (status code 204)
     *         or Rating not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteRating",
        summary = "Delete a Rating.",
        description = "Deletes a specific Rating.",
        tags = { "Rating" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Rating deleted successfully."),
            @ApiResponse(responseCode = "404", description = "Rating not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/Rating/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteRating(
        @Parameter(name = "id", description = "Unique identifier for the Rating.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteRating(id);
    }


    /**
     * GET /Rating/{id} : Retrieve a single Rating
     * Retrieves a single Rating for a specific uid.
     *
     * @param id Unique identifier for the Rating. (required)
     * @return Successfully retrieved the Rating. (status code 200)
     *         or Rating not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getRating",
        summary = "Retrieve a single Rating",
        description = "Retrieves a single Rating for a specific uid.",
        tags = { "Rating" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the Rating.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Rating.class))
            }),
            @ApiResponse(responseCode = "404", description = "Rating not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Rating/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Rating>> getRating(
        @Parameter(name = "id", description = "Unique identifier for the Rating.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getRating(id);
    }


    /**
     * GET /Rating : Retrieve a list of Ratings
     * Retrieves a list of Ratings.
     *
     * @return Successfully retrieved the list of Ratings. (status code 200)
     *         or No Ratings were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getRatingList",
        summary = "Retrieve a list of Ratings",
        description = "Retrieves a list of Ratings.",
        tags = { "Rating" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of Ratings.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Rating.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No Ratings were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Rating",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<Rating>>> getRatingList(
        
    ) {
        return getDelegate().getRatingList();
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
     */
    @Operation(
        operationId = "postRating",
        summary = "Create a new Rating",
        description = "Creates a new Rating.",
        tags = { "Rating" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Rating created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Rating.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Rating not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/Rating",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Rating>> postRating(
        @Parameter(name = "Rating", description = "Rating details.", required = true) @Valid @RequestBody Rating rating
    ) {
        return getDelegate().postRating(rating);
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
     */
    @Operation(
        operationId = "updateRating",
        summary = "Update an existing Rating",
        description = "Updates an existing Rating.",
        tags = { "Rating" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Rating updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Rating.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Rating not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/Rating/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Rating>> updateRating(
        @Parameter(name = "id", description = "Unique identifier for the Rating.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "Rating", description = "Updated Rating details.", required = true) @Valid @RequestBody Rating rating
    ) {
        return getDelegate().updateRating(id, rating);
    }

}
