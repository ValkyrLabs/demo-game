package com.valkyrlabs.api;


import com.valkyrlabs.model.AclEntryService;

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

import com.valkyrlabs.model.AclEntry;
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
* A delegate to be called by the {@link AclEntryApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class AclEntryApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(AclEntryApiDelegate.class);

    @Autowired
    private AclEntryService aclEntryService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /AclEntry/{id} : Delete a AclEntry.
            * Deletes a specific AclEntry.
        *
            * @param id Unique identifier for the AclEntry. (required)
        * @return AclEntry deleted successfully. (status code 204)
            *         or AclEntry not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AclEntryApi#deleteAclEntry
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteAclEntry(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(aclEntryService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "AclEntryApi",  id);

            aclEntryService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /AclEntry/{id} : Retrieve a single AclEntry
            * Retrieves a single AclEntry for a specific uid.
        *
            * @param id Unique identifier for the AclEntry. (required)
        * @return Successfully retrieved the AclEntry. (status code 200)
            *         or AclEntry not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AclEntryApi#getAclEntry
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<AclEntry>> getAclEntry(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"auditSuccess\" : 5, \"lastAccessedById\" : \"bc414fd8-a228-441a-b606-edd49cc0bbef\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"aceOrder\" : 0, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"2c1fed55-df40-4850-b97f-48867b50b339\", \"aclObjectOdentity\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"sid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"granting\" : 1, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"53283013-1c3d-4728-8d1f-0aef4f0089a9\", \"auditFailure\" : 5, \"id\" : \"7413f82e-9a3a-4d5d-8d2e-916e8afbe8ff\", \"mask\" : 6 }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "AclEntryApi",  id);
                            Optional<AclEntry> ox = aclEntryService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<AclEntry>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /AclEntry : Retrieve a list of AclEntrys
            * Retrieves a list of AclEntrys.
        *
        * @return Successfully retrieved the list of AclEntrys. (status code 200)
            *         or No AclEntrys were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AclEntryApi#getAclEntryList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<AclEntry>>> getAclEntryList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"auditSuccess\" : 5, \"lastAccessedById\" : \"bc414fd8-a228-441a-b606-edd49cc0bbef\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"aceOrder\" : 0, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"2c1fed55-df40-4850-b97f-48867b50b339\", \"aclObjectOdentity\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"sid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"granting\" : 1, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"53283013-1c3d-4728-8d1f-0aef4f0089a9\", \"auditFailure\" : 5, \"id\" : \"7413f82e-9a3a-4d5d-8d2e-916e8afbe8ff\", \"mask\" : 6 }, { \"auditSuccess\" : 5, \"lastAccessedById\" : \"bc414fd8-a228-441a-b606-edd49cc0bbef\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"aceOrder\" : 0, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"2c1fed55-df40-4850-b97f-48867b50b339\", \"aclObjectOdentity\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"sid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"granting\" : 1, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"53283013-1c3d-4728-8d1f-0aef4f0089a9\", \"auditFailure\" : 5, \"id\" : \"7413f82e-9a3a-4d5d-8d2e-916e8afbe8ff\", \"mask\" : 6 } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(aclEntryService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<AclEntry>)aclEntryService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /AclEntry : Create a new AclEntry
            * Creates a new AclEntry.
        *
            * @param aclEntry AclEntry details. (required)
        * @return AclEntry created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or AclEntry not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AclEntryApi#postAclEntry
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<AclEntry>> postAclEntry(AclEntry aclEntry) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"auditSuccess\" : 5, \"lastAccessedById\" : \"bc414fd8-a228-441a-b606-edd49cc0bbef\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"aceOrder\" : 0, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"2c1fed55-df40-4850-b97f-48867b50b339\", \"aclObjectOdentity\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"sid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"granting\" : 1, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"53283013-1c3d-4728-8d1f-0aef4f0089a9\", \"auditFailure\" : 5, \"id\" : \"7413f82e-9a3a-4d5d-8d2e-916e8afbe8ff\", \"mask\" : 6 }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: aclEntry");
                            AclEntry ox = aclEntryService.saveOrUpdate(aclEntry);
                            return new ResponseEntity<AclEntry>(aclEntryService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /AclEntry/{id} : Update an existing AclEntry
            * Updates an existing AclEntry.
        *
            * @param id Unique identifier for the AclEntry. (required)
            * @param aclEntry Updated AclEntry details. (required)
        * @return AclEntry updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or AclEntry not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AclEntryApi#updateAclEntry
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<AclEntry>> updateAclEntry(UUID id,
    AclEntry aclEntry) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"auditSuccess\" : 5, \"lastAccessedById\" : \"bc414fd8-a228-441a-b606-edd49cc0bbef\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"aceOrder\" : 0, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"2c1fed55-df40-4850-b97f-48867b50b339\", \"aclObjectOdentity\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"sid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"granting\" : 1, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"53283013-1c3d-4728-8d1f-0aef4f0089a9\", \"auditFailure\" : 5, \"id\" : \"7413f82e-9a3a-4d5d-8d2e-916e8afbe8ff\", \"mask\" : 6 }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + aclEntry);
                            if(aclEntryService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            aclEntry.setId(id); // guard against a patch with no ID (upserts new objects)
                            AclEntry ox = aclEntryService.saveOrUpdate(aclEntry);
                            return new ResponseEntity<AclEntry>(aclEntryService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
