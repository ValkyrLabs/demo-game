/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import com.valkyrlabs.model.Organization;
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
@Tag(name = "Organization", description = "the Organization API")
public interface OrganizationApi {

    default OrganizationApiDelegate getDelegate() {
        return new OrganizationApiDelegate() {};
    }

    /**
     * DELETE /Organization/{id} : Delete a Organization.
     * Deletes a specific Organization.
     *
     * @param id Unique identifier for the Organization. (required)
     * @return Organization deleted successfully. (status code 204)
     *         or Organization not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteOrganization",
        summary = "Delete a Organization.",
        description = "Deletes a specific Organization.",
        tags = { "Organization" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Organization deleted successfully."),
            @ApiResponse(responseCode = "404", description = "Organization not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/Organization/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteOrganization(
        @Parameter(name = "id", description = "Unique identifier for the Organization.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteOrganization(id);
    }


    /**
     * GET /Organization/{id} : Retrieve a single Organization
     * Retrieves a single Organization for a specific uid.
     *
     * @param id Unique identifier for the Organization. (required)
     * @return Successfully retrieved the Organization. (status code 200)
     *         or Organization not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getOrganization",
        summary = "Retrieve a single Organization",
        description = "Retrieves a single Organization for a specific uid.",
        tags = { "Organization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the Organization.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Organization.class))
            }),
            @ApiResponse(responseCode = "404", description = "Organization not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Organization/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Organization>> getOrganization(
        @Parameter(name = "id", description = "Unique identifier for the Organization.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getOrganization(id);
    }


    /**
     * GET /Organization : Retrieve a list of Organizations
     * Retrieves a list of Organizations.
     *
     * @return Successfully retrieved the list of Organizations. (status code 200)
     *         or No Organizations were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getOrganizationList",
        summary = "Retrieve a list of Organizations",
        description = "Retrieves a list of Organizations.",
        tags = { "Organization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of Organizations.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Organization.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No Organizations were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Organization",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<Organization>>> getOrganizationList(
        
    ) {
        return getDelegate().getOrganizationList();
    }


    /**
     * POST /Organization : Create a new Organization
     * Creates a new Organization.
     *
     * @param organization Organization details. (required)
     * @return Organization created successfully. (status code 201)
     *         or Invalid input. (status code 400)
     *         or Organization not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "postOrganization",
        summary = "Create a new Organization",
        description = "Creates a new Organization.",
        tags = { "Organization" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Organization created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Organization.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Organization not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/Organization",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Organization>> postOrganization(
        @Parameter(name = "Organization", description = "Organization details.", required = true) @Valid @RequestBody Organization organization
    ) {
        return getDelegate().postOrganization(organization);
    }


    /**
     * PUT /Organization/{id} : Update an existing Organization
     * Updates an existing Organization.
     *
     * @param id Unique identifier for the Organization. (required)
     * @param organization Updated Organization details. (required)
     * @return Organization updated successfully. (status code 200)
     *         or Invalid input. (status code 400)
     *         or Organization not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "updateOrganization",
        summary = "Update an existing Organization",
        description = "Updates an existing Organization.",
        tags = { "Organization" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Organization updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Organization.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Organization not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/Organization/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Organization>> updateOrganization(
        @Parameter(name = "id", description = "Unique identifier for the Organization.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "Organization", description = "Updated Organization details.", required = true) @Valid @RequestBody Organization organization
    ) {
        return getDelegate().updateOrganization(id, organization);
    }

}
