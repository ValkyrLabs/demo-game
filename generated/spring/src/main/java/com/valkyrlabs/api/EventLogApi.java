/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import com.valkyrlabs.model.EventLog;
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
@Tag(name = "EventLog", description = "the EventLog API")
public interface EventLogApi {

    default EventLogApiDelegate getDelegate() {
        return new EventLogApiDelegate() {};
    }

    /**
     * DELETE /EventLog/{id} : Delete a EventLog.
     * Deletes a specific EventLog.
     *
     * @param id Unique identifier for the EventLog. (required)
     * @return EventLog deleted successfully. (status code 204)
     *         or EventLog not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteEventLog",
        summary = "Delete a EventLog.",
        description = "Deletes a specific EventLog.",
        tags = { "EventLog" },
        responses = {
            @ApiResponse(responseCode = "204", description = "EventLog deleted successfully."),
            @ApiResponse(responseCode = "404", description = "EventLog not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/EventLog/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteEventLog(
        @Parameter(name = "id", description = "Unique identifier for the EventLog.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteEventLog(id);
    }


    /**
     * GET /EventLog/{id} : Retrieve a single EventLog
     * Retrieves a single EventLog for a specific uid.
     *
     * @param id Unique identifier for the EventLog. (required)
     * @return Successfully retrieved the EventLog. (status code 200)
     *         or EventLog not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getEventLog",
        summary = "Retrieve a single EventLog",
        description = "Retrieves a single EventLog for a specific uid.",
        tags = { "EventLog" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the EventLog.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = EventLog.class))
            }),
            @ApiResponse(responseCode = "404", description = "EventLog not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/EventLog/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<EventLog>> getEventLog(
        @Parameter(name = "id", description = "Unique identifier for the EventLog.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getEventLog(id);
    }


    /**
     * GET /EventLog : Retrieve a list of EventLogs
     * Retrieves a list of EventLogs.
     *
     * @return Successfully retrieved the list of EventLogs. (status code 200)
     *         or No EventLogs were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getEventLogList",
        summary = "Retrieve a list of EventLogs",
        description = "Retrieves a list of EventLogs.",
        tags = { "EventLog" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of EventLogs.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = EventLog.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No EventLogs were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/EventLog",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<EventLog>>> getEventLogList(
        
    ) {
        return getDelegate().getEventLogList();
    }


    /**
     * POST /EventLog : Create a new EventLog
     * Creates a new EventLog.
     *
     * @param eventLog EventLog details. (required)
     * @return EventLog created successfully. (status code 201)
     *         or Invalid input. (status code 400)
     *         or EventLog not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "postEventLog",
        summary = "Create a new EventLog",
        description = "Creates a new EventLog.",
        tags = { "EventLog" },
        responses = {
            @ApiResponse(responseCode = "201", description = "EventLog created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = EventLog.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "EventLog not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/EventLog",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<EventLog>> postEventLog(
        @Parameter(name = "EventLog", description = "EventLog details.", required = true) @Valid @RequestBody EventLog eventLog
    ) {
        return getDelegate().postEventLog(eventLog);
    }


    /**
     * PUT /EventLog/{id} : Update an existing EventLog
     * Updates an existing EventLog.
     *
     * @param id Unique identifier for the EventLog. (required)
     * @param eventLog Updated EventLog details. (required)
     * @return EventLog updated successfully. (status code 200)
     *         or Invalid input. (status code 400)
     *         or EventLog not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "updateEventLog",
        summary = "Update an existing EventLog",
        description = "Updates an existing EventLog.",
        tags = { "EventLog" },
        responses = {
            @ApiResponse(responseCode = "200", description = "EventLog updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = EventLog.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "EventLog not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/EventLog/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<EventLog>> updateEventLog(
        @Parameter(name = "id", description = "Unique identifier for the EventLog.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "EventLog", description = "Updated EventLog details.", required = true) @Valid @RequestBody EventLog eventLog
    ) {
        return getDelegate().updateEventLog(id, eventLog);
    }

}
