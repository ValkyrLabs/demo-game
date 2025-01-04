/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import java.util.UUID;
import com.valkyrlabs.model.Workflow;
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
@Tag(name = "Workflow", description = "the Workflow API")
public interface WorkflowApi {

    default WorkflowApiDelegate getDelegate() {
        return new WorkflowApiDelegate() {};
    }

    /**
     * DELETE /Workflow/{id} : Delete a Workflow.
     * Deletes a specific Workflow.
     *
     * @param id Unique identifier for the Workflow. (required)
     * @return Workflow deleted successfully. (status code 204)
     *         or Workflow not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteWorkflow",
        summary = "Delete a Workflow.",
        description = "Deletes a specific Workflow.",
        tags = { "Workflow" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Workflow deleted successfully."),
            @ApiResponse(responseCode = "404", description = "Workflow not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/Workflow/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteWorkflow(
        @Parameter(name = "id", description = "Unique identifier for the Workflow.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteWorkflow(id);
    }


    /**
     * GET /Workflow/{id} : Retrieve a single Workflow
     * Retrieves a single Workflow for a specific uid.
     *
     * @param id Unique identifier for the Workflow. (required)
     * @return Successfully retrieved the Workflow. (status code 200)
     *         or Workflow not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getWorkflow",
        summary = "Retrieve a single Workflow",
        description = "Retrieves a single Workflow for a specific uid.",
        tags = { "Workflow" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the Workflow.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Workflow.class))
            }),
            @ApiResponse(responseCode = "404", description = "Workflow not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Workflow/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Workflow>> getWorkflow(
        @Parameter(name = "id", description = "Unique identifier for the Workflow.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getWorkflow(id);
    }


    /**
     * GET /Workflow : Retrieve a list of Workflows
     * Retrieves a list of Workflows.
     *
     * @return Successfully retrieved the list of Workflows. (status code 200)
     *         or No Workflows were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getWorkflowList",
        summary = "Retrieve a list of Workflows",
        description = "Retrieves a list of Workflows.",
        tags = { "Workflow" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of Workflows.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Workflow.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No Workflows were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Workflow",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<Workflow>>> getWorkflowList(
        
    ) {
        return getDelegate().getWorkflowList();
    }


    /**
     * POST /Workflow : Create a new Workflow
     * Creates a new Workflow.
     *
     * @param workflow Workflow details. (required)
     * @return Workflow created successfully. (status code 201)
     *         or Invalid input. (status code 400)
     *         or Workflow not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "postWorkflow",
        summary = "Create a new Workflow",
        description = "Creates a new Workflow.",
        tags = { "Workflow" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Workflow created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Workflow.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Workflow not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/Workflow",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Workflow>> postWorkflow(
        @Parameter(name = "Workflow", description = "Workflow details.", required = true) @Valid @RequestBody Workflow workflow
    ) {
        return getDelegate().postWorkflow(workflow);
    }


    /**
     * PUT /Workflow/{id} : Update an existing Workflow
     * Updates an existing Workflow.
     *
     * @param id Unique identifier for the Workflow. (required)
     * @param workflow Updated Workflow details. (required)
     * @return Workflow updated successfully. (status code 200)
     *         or Invalid input. (status code 400)
     *         or Workflow not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "updateWorkflow",
        summary = "Update an existing Workflow",
        description = "Updates an existing Workflow.",
        tags = { "Workflow" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Workflow updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Workflow.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Workflow not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/Workflow/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Workflow>> updateWorkflow(
        @Parameter(name = "id", description = "Unique identifier for the Workflow.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "Workflow", description = "Updated Workflow details.", required = true) @Valid @RequestBody Workflow workflow
    ) {
        return getDelegate().updateWorkflow(id, workflow);
    }

}
