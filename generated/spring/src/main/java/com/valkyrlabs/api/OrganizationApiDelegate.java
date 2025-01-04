package com.valkyrlabs.api;


import com.valkyrlabs.model.OrganizationService;

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

import com.valkyrlabs.model.Organization;
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
* A delegate to be called by the {@link OrganizationApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class OrganizationApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(OrganizationApiDelegate.class);

    @Autowired
    private OrganizationService organizationService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Organization/{id} : Delete a Organization.
            * Deletes a specific Organization.
        *
            * @param id Unique identifier for the Organization. (required)
        * @return Organization deleted successfully. (status code 204)
            *         or Organization not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see OrganizationApi#deleteOrganization
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteOrganization(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(organizationService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "OrganizationApi",  id);

            organizationService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Organization/{id} : Retrieve a single Organization
            * Retrieves a single Organization for a specific uid.
        *
            * @param id Unique identifier for the Organization. (required)
        * @return Successfully retrieved the Organization. (status code 200)
            *         or Organization not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see OrganizationApi#getOrganization
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Organization>> getOrganization(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "OrganizationApi",  id);
                            Optional<Organization> ox = organizationService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Organization>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Organization : Retrieve a list of Organizations
            * Retrieves a list of Organizations.
        *
        * @return Successfully retrieved the list of Organizations. (status code 200)
            *         or No Organizations were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see OrganizationApi#getOrganizationList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Organization>>> getOrganizationList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }, { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(organizationService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Organization>)organizationService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






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
        * @see OrganizationApi#postOrganization
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Organization>> postOrganization(Organization organization) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: organization");
                            Organization ox = organizationService.saveOrUpdate(organization);
                            return new ResponseEntity<Organization>(organizationService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






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
        * @see OrganizationApi#updateOrganization
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Organization>> updateOrganization(UUID id,
    Organization organization) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + organization);
                            if(organizationService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            organization.setId(id); // guard against a patch with no ID (upserts new objects)
                            Organization ox = organizationService.saveOrUpdate(organization);
                            return new ResponseEntity<Organization>(organizationService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
