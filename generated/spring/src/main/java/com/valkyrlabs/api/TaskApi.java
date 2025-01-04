/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.valkyrlabs.api;

import com.valkyrlabs.model.Task;
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
@Tag(name = "Task", description = "the Task API")
public interface TaskApi {

    default TaskApiDelegate getDelegate() {
        return new TaskApiDelegate() {};
    }

    /**
     * DELETE /Task/{id} : Delete a Task.
     * Deletes a specific Task.
     *
     * @param id Unique identifier for the Task. (required)
     * @return Task deleted successfully. (status code 204)
     *         or Task not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteTask",
        summary = "Delete a Task.",
        description = "Deletes a specific Task.",
        tags = { "Task" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Task deleted successfully."),
            @ApiResponse(responseCode = "404", description = "Task not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/Task/{id}"
    )
    
    default CompletableFuture<ResponseEntity<Void>> deleteTask(
        @Parameter(name = "id", description = "Unique identifier for the Task.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().deleteTask(id);
    }


    /**
     * GET /Task/{id} : Retrieve a single Task
     * Retrieves a single Task for a specific uid.
     *
     * @param id Unique identifier for the Task. (required)
     * @return Successfully retrieved the Task. (status code 200)
     *         or Task not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getTask",
        summary = "Retrieve a single Task",
        description = "Retrieves a single Task for a specific uid.",
        tags = { "Task" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the Task.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Task.class))
            }),
            @ApiResponse(responseCode = "404", description = "Task not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Task/{id}",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Task>> getTask(
        @Parameter(name = "id", description = "Unique identifier for the Task.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return getDelegate().getTask(id);
    }


    /**
     * GET /Task : Retrieve a list of Tasks
     * Retrieves a list of Tasks.
     *
     * @return Successfully retrieved the list of Tasks. (status code 200)
     *         or No Tasks were found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "getTaskList",
        summary = "Retrieve a list of Tasks",
        description = "Retrieves a list of Tasks.",
        tags = { "Task" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of Tasks.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Task.class)))
            }),
            @ApiResponse(responseCode = "404", description = "No Tasks were found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Task",
        produces = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<List<Task>>> getTaskList(
        
    ) {
        return getDelegate().getTaskList();
    }


    /**
     * POST /Task : Create a new Task
     * Creates a new Task.
     *
     * @param task Task details. (required)
     * @return Task created successfully. (status code 201)
     *         or Invalid input. (status code 400)
     *         or Task not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "postTask",
        summary = "Create a new Task",
        description = "Creates a new Task.",
        tags = { "Task" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Task created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Task.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Task not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/Task",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Task>> postTask(
        @Parameter(name = "Task", description = "Task details.", required = true) @Valid @RequestBody Task task
    ) {
        return getDelegate().postTask(task);
    }


    /**
     * PUT /Task/{id} : Update an existing Task
     * Updates an existing Task.
     *
     * @param id Unique identifier for the Task. (required)
     * @param task Updated Task details. (required)
     * @return Task updated successfully. (status code 200)
     *         or Invalid input. (status code 400)
     *         or Task not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "updateTask",
        summary = "Update an existing Task",
        description = "Updates an existing Task.",
        tags = { "Task" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Task updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Task.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "404", description = "Task not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/Task/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default CompletableFuture<ResponseEntity<Task>> updateTask(
        @Parameter(name = "id", description = "Unique identifier for the Task.", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "Task", description = "Updated Task details.", required = true) @Valid @RequestBody Task task
    ) {
        return getDelegate().updateTask(id, task);
    }

}
