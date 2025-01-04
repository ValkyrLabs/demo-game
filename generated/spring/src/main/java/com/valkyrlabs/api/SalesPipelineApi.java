/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import com.valkyrlabs.model.SalesPipeline;
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
@Tag(name = "SalesPipeline", description = "the SalesPipeline API")
public interface SalesPipelineApi {

    default SalesPipelineApiDelegate getDelegate() {
        return new SalesPipelineApiDelegate() {};
    }

    /**
     * DELETE /SalesPipeline/{id} : Delete a SalesPipeline.
     * Deletes a specific SalesPipeline.
     *
     * @param id Unique identifier for the SalesPipeline. (required)
     * @return SalesPipeline deleted successfully. (status code 204)
     *         or SalesPipeline not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteSalesPipeline",
        summary = "Delete a SalesPipeline.",
        description = "Deletes a specific SalesPipeline.",
        tags = { "SalesPipeline" },
        responses = {
            @ApiResponse(responseCode = "204", description = "SalesPipeline deleted successfully."),
            @ApiResponse(responseCode = "404", description = "SalesPipeline not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/SalesPipeline/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteSalesPipeline(
        @Parameter(name = "id", description = "Unique identifier for the SalesPipeline.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteSalesPipeline(id);
    }


    /**
     * GET /SalesPipeline/{id} : Retrieve a single SalesPipeline
     * Retrieves a single SalesPipeline for a specific uid.
     *
     * @param id Unique identifier for the SalesPipeline. (required)
     * @return Successfully retrieved the SalesPipeline. (status code 200)
     *         or SalesPipeline not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getSalesPipeline",
        summary = "Retrieve a single SalesPipeline",
        description = "Retrieves a single SalesPipeline for a specific uid.",
        tags = { "SalesPipeline" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the SalesPipeline.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SalesPipeline.class))
            }),
            @ApiResponse(responseCode = "404", description = "SalesPipeline not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/SalesPipeline/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<SalesPipeline>> getSalesPipeline(
        @Parameter(name = "id", description = "Unique identifier for the SalesPipeline.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getSalesPipeline(id);
    }


    /**
     * GET /SalesPipeline : Retrieve a list of SalesPipelines
     * Retrieves a list of SalesPipelines.
     *
     * @return Successfully retrieved the list of SalesPipelines. (status code 200)
     *         or No SalesPipelines were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getSalesPipelineList",
        summary = "Retrieve a list of SalesPipelines",
        description = "Retrieves a list of SalesPipelines.",
        tags = { "SalesPipeline" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of SalesPipelines.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = SalesPipeline.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No SalesPipelines were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/SalesPipeline",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<SalesPipeline>>> getSalesPipelineList(
        
    ) {
        return getDelegate().getSalesPipelineList();
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
     */
    @Operation(
        operationId = "postSalesPipeline",
        summary = "Create a new SalesPipeline",
        description = "Creates a new SalesPipeline.",
        tags = { "SalesPipeline" },
        responses = {
            @ApiResponse(responseCode = "201", description = "SalesPipeline created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SalesPipeline.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "SalesPipeline not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/SalesPipeline",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<SalesPipeline>> postSalesPipeline(
        @Parameter(name = "SalesPipeline", description = "SalesPipeline details.", required = true) @Valid @RequestBody SalesPipeline salesPipeline
    ) {
        return getDelegate().postSalesPipeline(salesPipeline);
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
     */
    @Operation(
        operationId = "updateSalesPipeline",
        summary = "Update an existing SalesPipeline",
        description = "Updates an existing SalesPipeline.",
        tags = { "SalesPipeline" },
        responses = {
            @ApiResponse(responseCode = "200", description = "SalesPipeline updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SalesPipeline.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "SalesPipeline not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/SalesPipeline/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<SalesPipeline>> updateSalesPipeline(
        @Parameter(name = "id", description = "Unique identifier for the SalesPipeline.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "SalesPipeline", description = "Updated SalesPipeline details.", required = true) @Valid @RequestBody SalesPipeline salesPipeline
    ) {
        return getDelegate().updateSalesPipeline(id, salesPipeline);
    }

}