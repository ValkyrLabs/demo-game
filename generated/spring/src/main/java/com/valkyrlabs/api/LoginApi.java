/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import com.valkyrlabs.model.Login;
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
@Tag(name = "Login", description = "the Login API")
public interface LoginApi {

    default LoginApiDelegate getDelegate() {
        return new LoginApiDelegate() {};
    }

    /**
     * DELETE /Login/{id} : Delete a Login.
     * Deletes a specific Login.
     *
     * @param id Unique identifier for the Login. (required)
     * @return Login deleted successfully. (status code 204)
     *         or Login not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteLogin",
        summary = "Delete a Login.",
        description = "Deletes a specific Login.",
        tags = { "Login" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Login deleted successfully."),
            @ApiResponse(responseCode = "404", description = "Login not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/Login/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteLogin(
        @Parameter(name = "id", description = "Unique identifier for the Login.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteLogin(id);
    }


    /**
     * GET /Login/{id} : Retrieve a single Login
     * Retrieves a single Login for a specific uid.
     *
     * @param id Unique identifier for the Login. (required)
     * @return Successfully retrieved the Login. (status code 200)
     *         or Login not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getLogin",
        summary = "Retrieve a single Login",
        description = "Retrieves a single Login for a specific uid.",
        tags = { "Login" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the Login.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Login.class))
            }),
            @ApiResponse(responseCode = "404", description = "Login not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Login/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Login>> getLogin(
        @Parameter(name = "id", description = "Unique identifier for the Login.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getLogin(id);
    }


    /**
     * GET /Login : Retrieve a list of Logins
     * Retrieves a list of Logins.
     *
     * @return Successfully retrieved the list of Logins. (status code 200)
     *         or No Logins were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getLoginList",
        summary = "Retrieve a list of Logins",
        description = "Retrieves a list of Logins.",
        tags = { "Login" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of Logins.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Login.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No Logins were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Login",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<Login>>> getLoginList(
        
    ) {
        return getDelegate().getLoginList();
    }


    /**
     * POST /Login : Create a new Login
     * Creates a new Login.
     *
     * @param login Login details. (required)
     * @return Login created successfully. (status code 201)
     *         or Invalid input. (status code 400)
     *         or Login not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "postLogin",
        summary = "Create a new Login",
        description = "Creates a new Login.",
        tags = { "Login" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Login created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Login.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Login not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/Login",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Login>> postLogin(
        @Parameter(name = "Login", description = "Login details.", required = true) @Valid @RequestBody Login login
    ) {
        return getDelegate().postLogin(login);
    }


    /**
     * PUT /Login/{id} : Update an existing Login
     * Updates an existing Login.
     *
     * @param id Unique identifier for the Login. (required)
     * @param login Updated Login details. (required)
     * @return Login updated successfully. (status code 200)
     *         or Invalid input. (status code 400)
     *         or Login not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "updateLogin",
        summary = "Update an existing Login",
        description = "Updates an existing Login.",
        tags = { "Login" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Login updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Login.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Login not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/Login/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Login>> updateLogin(
        @Parameter(name = "id", description = "Unique identifier for the Login.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "Login", description = "Updated Login details.", required = true) @Valid @RequestBody Login login
    ) {
        return getDelegate().updateLogin(id, login);
    }

}
