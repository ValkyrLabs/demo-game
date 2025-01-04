package com.valkyrlabs.api;


import com.valkyrlabs.model.RoleService;

// ValkyrLabs Section

import com.valkyrlabs.valkyrai.audit.AuditingField;
import com.valkyrlabs.valkyrai.audit.AuditedClass;
import com.valkyrlabs.valkyrai.service.SecureField;
// End ValkyrLabs Section

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

// End ThorAPI Section

import com.valkyrlabs.model.Role;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

// import jakarta.annotation.Generated;
import org.springframework.stereotype.Controller;

/**
* A delegate to be called by the {@link RoleApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class RoleApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(RoleApiDelegate.class);

    @Autowired
    private RoleService roleService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Role/{id} : Delete a Role.
            * Deletes a specific Role.
        *
            * @param id Unique identifier for the Role. (required)
        * @return Role deleted successfully. (status code 204)
            *         or Role not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see RoleApi#deleteRole
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteRole(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(roleService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "RoleApi",  id);

            roleService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Role/{id} : Retrieve a single Role
            * Retrieves a single Role for a specific uid.
        *
            * @param id Unique identifier for the Role. (required)
        * @return Successfully retrieved the Role. (status code 200)
            *         or Role not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see RoleApi#getRole
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Role>> getRole(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "RoleApi",  id);
                            Optional<Role> ox = roleService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Role>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Role : Retrieve a list of Roles
            * Retrieves a list of Roles.
        *
        * @return Successfully retrieved the list of Roles. (status code 200)
            *         or No Roles were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see RoleApi#getRoleList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Role>>> getRoleList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(roleService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Role>)roleService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /Role : Create a new Role
            * Creates a new Role.
        *
            * @param role Role details. (required)
        * @return Role created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or Role not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see RoleApi#postRole
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Role>> postRole(Role role) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: role");
                            Role ox = roleService.saveOrUpdate(role);
                            return new ResponseEntity<Role>(roleService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /Role/{id} : Update an existing Role
            * Updates an existing Role.
        *
            * @param id Unique identifier for the Role. (required)
            * @param role Updated Role details. (required)
        * @return Role updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or Role not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see RoleApi#updateRole
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Role>> updateRole(UUID id,
    Role role) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + role);
                            if(roleService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            role.setId(id); // guard against a patch with no ID (upserts new objects)
                            Role ox = roleService.saveOrUpdate(role);
                            return new ResponseEntity<Role>(roleService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
