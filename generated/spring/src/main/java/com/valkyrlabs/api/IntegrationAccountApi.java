/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import com.valkyrlabs.model.IntegrationAccount;
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
@Tag(name = "IntegrationAccount", description = "the IntegrationAccount API")
public interface IntegrationAccountApi {

    default IntegrationAccountApiDelegate getDelegate() {
        return new IntegrationAccountApiDelegate() {};
    }

    /**
     * DELETE /IntegrationAccount/{id} : Delete a IntegrationAccount.
     * Deletes a specific IntegrationAccount.
     *
     * @param id Unique identifier for the IntegrationAccount. (required)
     * @return IntegrationAccount deleted successfully. (status code 204)
     *         or IntegrationAccount not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteIntegrationAccount",
        summary = "Delete a IntegrationAccount.",
        description = "Deletes a specific IntegrationAccount.",
        tags = { "IntegrationAccount" },
        responses = {
            @ApiResponse(responseCode = "204", description = "IntegrationAccount deleted successfully."),
            @ApiResponse(responseCode = "404", description = "IntegrationAccount not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/IntegrationAccount/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteIntegrationAccount(
        @Parameter(name = "id", description = "Unique identifier for the IntegrationAccount.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteIntegrationAccount(id);
    }


    /**
     * GET /IntegrationAccount/{id} : Retrieve a single IntegrationAccount
     * Retrieves a single IntegrationAccount for a specific uid.
     *
     * @param id Unique identifier for the IntegrationAccount. (required)
     * @return Successfully retrieved the IntegrationAccount. (status code 200)
     *         or IntegrationAccount not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getIntegrationAccount",
        summary = "Retrieve a single IntegrationAccount",
        description = "Retrieves a single IntegrationAccount for a specific uid.",
        tags = { "IntegrationAccount" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the IntegrationAccount.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = IntegrationAccount.class))
            }),
            @ApiResponse(responseCode = "404", description = "IntegrationAccount not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/IntegrationAccount/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<IntegrationAccount>> getIntegrationAccount(
        @Parameter(name = "id", description = "Unique identifier for the IntegrationAccount.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getIntegrationAccount(id);
    }


    /**
     * GET /IntegrationAccount : Retrieve a list of IntegrationAccounts
     * Retrieves a list of IntegrationAccounts.
     *
     * @return Successfully retrieved the list of IntegrationAccounts. (status code 200)
     *         or No IntegrationAccounts were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getIntegrationAccountList",
        summary = "Retrieve a list of IntegrationAccounts",
        description = "Retrieves a list of IntegrationAccounts.",
        tags = { "IntegrationAccount" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of IntegrationAccounts.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = IntegrationAccount.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No IntegrationAccounts were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/IntegrationAccount",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<IntegrationAccount>>> getIntegrationAccountList(
        
    ) {
        return getDelegate().getIntegrationAccountList();
    }


    /**
     * POST /IntegrationAccount : Create a new IntegrationAccount
     * Creates a new IntegrationAccount.
     *
     * @param integrationAccount IntegrationAccount details. (required)
     * @return IntegrationAccount created successfully. (status code 201)
     *         or Invalid input. (status code 400)
     *         or IntegrationAccount not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "postIntegrationAccount",
        summary = "Create a new IntegrationAccount",
        description = "Creates a new IntegrationAccount.",
        tags = { "IntegrationAccount" },
        responses = {
            @ApiResponse(responseCode = "201", description = "IntegrationAccount created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = IntegrationAccount.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "IntegrationAccount not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/IntegrationAccount",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<IntegrationAccount>> postIntegrationAccount(
        @Parameter(name = "IntegrationAccount", description = "IntegrationAccount details.", required = true) @Valid @RequestBody IntegrationAccount integrationAccount
    ) {
        return getDelegate().postIntegrationAccount(integrationAccount);
    }


    /**
     * PUT /IntegrationAccount/{id} : Update an existing IntegrationAccount
     * Updates an existing IntegrationAccount.
     *
     * @param id Unique identifier for the IntegrationAccount. (required)
     * @param integrationAccount Updated IntegrationAccount details. (required)
     * @return IntegrationAccount updated successfully. (status code 200)
     *         or Invalid input. (status code 400)
     *         or IntegrationAccount not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "updateIntegrationAccount",
        summary = "Update an existing IntegrationAccount",
        description = "Updates an existing IntegrationAccount.",
        tags = { "IntegrationAccount" },
        responses = {
            @ApiResponse(responseCode = "200", description = "IntegrationAccount updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = IntegrationAccount.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "IntegrationAccount not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/IntegrationAccount/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<IntegrationAccount>> updateIntegrationAccount(
        @Parameter(name = "id", description = "Unique identifier for the IntegrationAccount.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "IntegrationAccount", description = "Updated IntegrationAccount details.", required = true) @Valid @RequestBody IntegrationAccount integrationAccount
    ) {
        return getDelegate().updateIntegrationAccount(id, integrationAccount);
    }

}
