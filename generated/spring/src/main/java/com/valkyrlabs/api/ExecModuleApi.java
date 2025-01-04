/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import com.valkyrlabs.model.ExecModule;
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
@Tag(name = "ExecModule", description = "the ExecModule API")
public interface ExecModuleApi {

    default ExecModuleApiDelegate getDelegate() {
        return new ExecModuleApiDelegate() {};
    }

    /**
     * DELETE /ExecModule/{id} : Delete a ExecModule.
     * Deletes a specific ExecModule.
     *
     * @param id Unique identifier for the ExecModule. (required)
     * @return ExecModule deleted successfully. (status code 204)
     *         or ExecModule not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteExecModule",
        summary = "Delete a ExecModule.",
        description = "Deletes a specific ExecModule.",
        tags = { "ExecModule" },
        responses = {
            @ApiResponse(responseCode = "204", description = "ExecModule deleted successfully."),
            @ApiResponse(responseCode = "404", description = "ExecModule not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/ExecModule/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteExecModule(
        @Parameter(name = "id", description = "Unique identifier for the ExecModule.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteExecModule(id);
    }


    /**
     * GET /ExecModule/{id} : Retrieve a single ExecModule
     * Retrieves a single ExecModule for a specific uid.
     *
     * @param id Unique identifier for the ExecModule. (required)
     * @return Successfully retrieved the ExecModule. (status code 200)
     *         or ExecModule not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getExecModule",
        summary = "Retrieve a single ExecModule",
        description = "Retrieves a single ExecModule for a specific uid.",
        tags = { "ExecModule" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the ExecModule.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ExecModule.class))
            }),
            @ApiResponse(responseCode = "404", description = "ExecModule not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/ExecModule/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<ExecModule>> getExecModule(
        @Parameter(name = "id", description = "Unique identifier for the ExecModule.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getExecModule(id);
    }


    /**
     * GET /ExecModule : Retrieve a list of ExecModules
     * Retrieves a list of ExecModules.
     *
     * @return Successfully retrieved the list of ExecModules. (status code 200)
     *         or No ExecModules were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getExecModuleList",
        summary = "Retrieve a list of ExecModules",
        description = "Retrieves a list of ExecModules.",
        tags = { "ExecModule" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of ExecModules.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ExecModule.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No ExecModules were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/ExecModule",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<ExecModule>>> getExecModuleList(
        
    ) {
        return getDelegate().getExecModuleList();
    }


    /**
     * POST /ExecModule : Create a new ExecModule
     * Creates a new ExecModule.
     *
     * @param execModule ExecModule details. (required)
     * @return ExecModule created successfully. (status code 201)
     *         or Invalid input. (status code 400)
     *         or ExecModule not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "postExecModule",
        summary = "Create a new ExecModule",
        description = "Creates a new ExecModule.",
        tags = { "ExecModule" },
        responses = {
            @ApiResponse(responseCode = "201", description = "ExecModule created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ExecModule.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "ExecModule not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/ExecModule",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<ExecModule>> postExecModule(
        @Parameter(name = "ExecModule", description = "ExecModule details.", required = true) @Valid @RequestBody ExecModule execModule
    ) {
        return getDelegate().postExecModule(execModule);
    }


    /**
     * PUT /ExecModule/{id} : Update an existing ExecModule
     * Updates an existing ExecModule.
     *
     * @param id Unique identifier for the ExecModule. (required)
     * @param execModule Updated ExecModule details. (required)
     * @return ExecModule updated successfully. (status code 200)
     *         or Invalid input. (status code 400)
     *         or ExecModule not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "updateExecModule",
        summary = "Update an existing ExecModule",
        description = "Updates an existing ExecModule.",
        tags = { "ExecModule" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ExecModule updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ExecModule.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "ExecModule not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/ExecModule/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<ExecModule>> updateExecModule(
        @Parameter(name = "id", description = "Unique identifier for the ExecModule.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "ExecModule", description = "Updated ExecModule details.", required = true) @Valid @RequestBody ExecModule execModule
    ) {
        return getDelegate().updateExecModule(id, execModule);
    }

}
