/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import com.valkyrlabs.model.Level;
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
@Tag(name = "Level", description = "the Level API")
public interface LevelApi {

    default LevelApiDelegate getDelegate() {
        return new LevelApiDelegate() {};
    }

    /**
     * DELETE /Level/{id} : Delete a Level.
     * Deletes a specific Level.
     *
     * @param id Unique identifier for the Level. (required)
     * @return Level deleted successfully. (status code 204)
     *         or Level not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteLevel",
        summary = "Delete a Level.",
        description = "Deletes a specific Level.",
        tags = { "Level" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Level deleted successfully."),
            @ApiResponse(responseCode = "404", description = "Level not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/Level/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteLevel(
        @Parameter(name = "id", description = "Unique identifier for the Level.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteLevel(id);
    }


    /**
     * GET /Level/{id} : Retrieve a single Level
     * Retrieves a single Level for a specific uid.
     *
     * @param id Unique identifier for the Level. (required)
     * @return Successfully retrieved the Level. (status code 200)
     *         or Level not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getLevel",
        summary = "Retrieve a single Level",
        description = "Retrieves a single Level for a specific uid.",
        tags = { "Level" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the Level.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Level.class))
            }),
            @ApiResponse(responseCode = "404", description = "Level not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Level/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Level>> getLevel(
        @Parameter(name = "id", description = "Unique identifier for the Level.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getLevel(id);
    }


    /**
     * GET /Level : Retrieve a list of Levels
     * Retrieves a list of Levels.
     *
     * @return Successfully retrieved the list of Levels. (status code 200)
     *         or No Levels were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getLevelList",
        summary = "Retrieve a list of Levels",
        description = "Retrieves a list of Levels.",
        tags = { "Level" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of Levels.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Level.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No Levels were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Level",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<Level>>> getLevelList(
        
    ) {
        return getDelegate().getLevelList();
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
     */
    @Operation(
        operationId = "postLevel",
        summary = "Create a new Level",
        description = "Creates a new Level.",
        tags = { "Level" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Level created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Level.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Level not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/Level",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Level>> postLevel(
        @Parameter(name = "Level", description = "Level details.", required = true) @Valid @RequestBody Level level
    ) {
        return getDelegate().postLevel(level);
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
     */
    @Operation(
        operationId = "updateLevel",
        summary = "Update an existing Level",
        description = "Updates an existing Level.",
        tags = { "Level" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Level updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Level.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Level not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/Level/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Level>> updateLevel(
        @Parameter(name = "id", description = "Unique identifier for the Level.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "Level", description = "Updated Level details.", required = true) @Valid @RequestBody Level level
    ) {
        return getDelegate().updateLevel(id, level);
    }

}
