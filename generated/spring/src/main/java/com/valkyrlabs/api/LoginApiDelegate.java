package com.valkyrlabs.api;


import com.valkyrlabs.model.LoginService;

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

import com.valkyrlabs.model.Login;
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
* A delegate to be called by the {@link LoginApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class LoginApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(LoginApiDelegate.class);

    @Autowired
    private LoginService loginService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Login/{id} : Delete a Login.
            * Deletes a specific Login.
        *
            * @param id Unique identifier for the Login. (required)
        * @return Login deleted successfully. (status code 204)
            *         or Login not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LoginApi#deleteLogin
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteLogin(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(loginService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "LoginApi",  id);

            loginService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Login/{id} : Retrieve a single Login
            * Retrieves a single Login for a specific uid.
        *
            * @param id Unique identifier for the Login. (required)
        * @return Successfully retrieved the Login. (status code 200)
            *         or Login not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LoginApi#getLogin
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Login>> getLogin(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"85d6f022-8a45-4cda-bcf8-df73fd27015d\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"310674e0-b7b1-4e08-aaf6-c535400d281f\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"3cb40daa-6d45-4c2b-9f50-744a51569c8c\", \"ownerId\" : \"f1d30892-3d4d-47d7-b169-556ee41de2a9\", \"username\" : \"username\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "LoginApi",  id);
                            Optional<Login> ox = loginService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Login>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Login : Retrieve a list of Logins
            * Retrieves a list of Logins.
        *
        * @return Successfully retrieved the list of Logins. (status code 200)
            *         or No Logins were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see LoginApi#getLoginList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Login>>> getLoginList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"85d6f022-8a45-4cda-bcf8-df73fd27015d\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"310674e0-b7b1-4e08-aaf6-c535400d281f\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"3cb40daa-6d45-4c2b-9f50-744a51569c8c\", \"ownerId\" : \"f1d30892-3d4d-47d7-b169-556ee41de2a9\", \"username\" : \"username\" }, { \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"85d6f022-8a45-4cda-bcf8-df73fd27015d\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"310674e0-b7b1-4e08-aaf6-c535400d281f\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"3cb40daa-6d45-4c2b-9f50-744a51569c8c\", \"ownerId\" : \"f1d30892-3d4d-47d7-b169-556ee41de2a9\", \"username\" : \"username\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(loginService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Login>)loginService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






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
        * @see LoginApi#postLogin
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Login>> postLogin(Login login) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"85d6f022-8a45-4cda-bcf8-df73fd27015d\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"310674e0-b7b1-4e08-aaf6-c535400d281f\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"3cb40daa-6d45-4c2b-9f50-744a51569c8c\", \"ownerId\" : \"f1d30892-3d4d-47d7-b169-556ee41de2a9\", \"username\" : \"username\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: login");
                            Login ox = loginService.saveOrUpdate(login);
                            return new ResponseEntity<Login>(loginService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






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
        * @see LoginApi#updateLogin
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Login>> updateLogin(UUID id,
    Login login) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"password\" : \"password\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"85d6f022-8a45-4cda-bcf8-df73fd27015d\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"310674e0-b7b1-4e08-aaf6-c535400d281f\", \"description\" : \"description\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"3cb40daa-6d45-4c2b-9f50-744a51569c8c\", \"ownerId\" : \"f1d30892-3d4d-47d7-b169-556ee41de2a9\", \"username\" : \"username\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + login);
                            if(loginService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            login.setId(id); // guard against a patch with no ID (upserts new objects)
                            Login ox = loginService.saveOrUpdate(login);
                            return new ResponseEntity<Login>(loginService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
