/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import com.valkyrlabs.model.SalesActivity;
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
@Tag(name = "SalesActivity", description = "the SalesActivity API")
public interface SalesActivityApi {

    default SalesActivityApiDelegate getDelegate() {
        return new SalesActivityApiDelegate() {};
    }

    /**
     * DELETE /SalesActivity/{id} : Delete a SalesActivity.
     * Deletes a specific SalesActivity.
     *
     * @param id Unique identifier for the SalesActivity. (required)
     * @return SalesActivity deleted successfully. (status code 204)
     *         or SalesActivity not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteSalesActivity",
        summary = "Delete a SalesActivity.",
        description = "Deletes a specific SalesActivity.",
        tags = { "SalesActivity" },
        responses = {
            @ApiResponse(responseCode = "204", description = "SalesActivity deleted successfully."),
            @ApiResponse(responseCode = "404", description = "SalesActivity not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/SalesActivity/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteSalesActivity(
        @Parameter(name = "id", description = "Unique identifier for the SalesActivity.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteSalesActivity(id);
    }


    /**
     * GET /SalesActivity/{id} : Retrieve a single SalesActivity
     * Retrieves a single SalesActivity for a specific uid.
     *
     * @param id Unique identifier for the SalesActivity. (required)
     * @return Successfully retrieved the SalesActivity. (status code 200)
     *         or SalesActivity not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getSalesActivity",
        summary = "Retrieve a single SalesActivity",
        description = "Retrieves a single SalesActivity for a specific uid.",
        tags = { "SalesActivity" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the SalesActivity.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SalesActivity.class))
            }),
            @ApiResponse(responseCode = "404", description = "SalesActivity not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/SalesActivity/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<SalesActivity>> getSalesActivity(
        @Parameter(name = "id", description = "Unique identifier for the SalesActivity.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getSalesActivity(id);
    }


    /**
     * GET /SalesActivity : Retrieve a list of SalesActivitys
     * Retrieves a list of SalesActivitys.
     *
     * @return Successfully retrieved the list of SalesActivitys. (status code 200)
     *         or No SalesActivitys were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getSalesActivityList",
        summary = "Retrieve a list of SalesActivitys",
        description = "Retrieves a list of SalesActivitys.",
        tags = { "SalesActivity" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of SalesActivitys.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = SalesActivity.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No SalesActivitys were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/SalesActivity",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<SalesActivity>>> getSalesActivityList(
        
    ) {
        return getDelegate().getSalesActivityList();
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
     */
    @Operation(
        operationId = "postSalesActivity",
        summary = "Create a new SalesActivity",
        description = "Creates a new SalesActivity.",
        tags = { "SalesActivity" },
        responses = {
            @ApiResponse(responseCode = "201", description = "SalesActivity created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SalesActivity.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "SalesActivity not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/SalesActivity",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<SalesActivity>> postSalesActivity(
        @Parameter(name = "SalesActivity", description = "SalesActivity details.", required = true) @Valid @RequestBody SalesActivity salesActivity
    ) {
        return getDelegate().postSalesActivity(salesActivity);
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
     */
    @Operation(
        operationId = "updateSalesActivity",
        summary = "Update an existing SalesActivity",
        description = "Updates an existing SalesActivity.",
        tags = { "SalesActivity" },
        responses = {
            @ApiResponse(responseCode = "200", description = "SalesActivity updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SalesActivity.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "SalesActivity not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/SalesActivity/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<SalesActivity>> updateSalesActivity(
        @Parameter(name = "id", description = "Unique identifier for the SalesActivity.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "SalesActivity", description = "Updated SalesActivity details.", required = true) @Valid @RequestBody SalesActivity salesActivity
    ) {
        return getDelegate().updateSalesActivity(id, salesActivity);
    }

}
