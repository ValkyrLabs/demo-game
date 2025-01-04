/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import com.valkyrlabs.model.Address;
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
@Tag(name = "Address", description = "the Address API")
public interface AddressApi {

    default AddressApiDelegate getDelegate() {
        return new AddressApiDelegate() {};
    }

    /**
     * DELETE /Address/{id} : Delete a Address.
     * Deletes a specific Address.
     *
     * @param id Unique identifier for the Address. (required)
     * @return Address deleted successfully. (status code 204)
     *         or Address not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteAddress",
        summary = "Delete a Address.",
        description = "Deletes a specific Address.",
        tags = { "Address" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Address deleted successfully."),
            @ApiResponse(responseCode = "404", description = "Address not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/Address/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteAddress(
        @Parameter(name = "id", description = "Unique identifier for the Address.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteAddress(id);
    }


    /**
     * GET /Address/{id} : Retrieve a single Address
     * Retrieves a single Address for a specific uid.
     *
     * @param id Unique identifier for the Address. (required)
     * @return Successfully retrieved the Address. (status code 200)
     *         or Address not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getAddress",
        summary = "Retrieve a single Address",
        description = "Retrieves a single Address for a specific uid.",
        tags = { "Address" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the Address.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Address.class))
            }),
            @ApiResponse(responseCode = "404", description = "Address not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Address/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Address>> getAddress(
        @Parameter(name = "id", description = "Unique identifier for the Address.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getAddress(id);
    }


    /**
     * GET /Address : Retrieve a list of Addresss
     * Retrieves a list of Addresss.
     *
     * @return Successfully retrieved the list of Addresss. (status code 200)
     *         or No Addresss were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getAddressList",
        summary = "Retrieve a list of Addresss",
        description = "Retrieves a list of Addresss.",
        tags = { "Address" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of Addresss.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Address.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No Addresss were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Address",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<Address>>> getAddressList(
        
    ) {
        return getDelegate().getAddressList();
    }


    /**
     * POST /Address : Create a new Address
     * Creates a new Address.
     *
     * @param address Address details. (required)
     * @return Address created successfully. (status code 201)
     *         or Invalid input. (status code 400)
     *         or Address not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "postAddress",
        summary = "Create a new Address",
        description = "Creates a new Address.",
        tags = { "Address" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Address created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Address.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Address not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/Address",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Address>> postAddress(
        @Parameter(name = "Address", description = "Address details.", required = true) @Valid @RequestBody Address address
    ) {
        return getDelegate().postAddress(address);
    }


    /**
     * PUT /Address/{id} : Update an existing Address
     * Updates an existing Address.
     *
     * @param id Unique identifier for the Address. (required)
     * @param address Updated Address details. (required)
     * @return Address updated successfully. (status code 200)
     *         or Invalid input. (status code 400)
     *         or Address not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "updateAddress",
        summary = "Update an existing Address",
        description = "Updates an existing Address.",
        tags = { "Address" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Address updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Address.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Address not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/Address/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Address>> updateAddress(
        @Parameter(name = "id", description = "Unique identifier for the Address.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "Address", description = "Updated Address details.", required = true) @Valid @RequestBody Address address
    ) {
        return getDelegate().updateAddress(id, address);
    }

}
