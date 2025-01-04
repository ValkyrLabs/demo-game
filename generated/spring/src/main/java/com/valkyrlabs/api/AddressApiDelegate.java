package com.valkyrlabs.api;


import com.valkyrlabs.model.AddressService;

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

import com.valkyrlabs.model.Address;
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
* A delegate to be called by the {@link AddressApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class AddressApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(AddressApiDelegate.class);

    @Autowired
    private AddressService addressService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Address/{id} : Delete a Address.
            * Deletes a specific Address.
        *
            * @param id Unique identifier for the Address. (required)
        * @return Address deleted successfully. (status code 204)
            *         or Address not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AddressApi#deleteAddress
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteAddress(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(addressService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "AddressApi",  id);

            addressService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Address/{id} : Retrieve a single Address
            * Retrieves a single Address for a specific uid.
        *
            * @param id Unique identifier for the Address. (required)
        * @return Successfully retrieved the Address. (status code 200)
            *         or Address not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AddressApi#getAddress
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Address>> getAddress(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "AddressApi",  id);
                            Optional<Address> ox = addressService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Address>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Address : Retrieve a list of Addresss
            * Retrieves a list of Addresss.
        *
        * @return Successfully retrieved the list of Addresss. (status code 200)
            *         or No Addresss were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AddressApi#getAddressList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Address>>> getAddressList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(addressService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Address>)addressService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






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
        * @see AddressApi#postAddress
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Address>> postAddress(Address address) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: address");
                            Address ox = addressService.saveOrUpdate(address);
                            return new ResponseEntity<Address>(addressService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






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
        * @see AddressApi#updateAddress
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Address>> updateAddress(UUID id,
    Address address) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + address);
                            if(addressService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            address.setId(id); // guard against a patch with no ID (upserts new objects)
                            Address ox = addressService.saveOrUpdate(address);
                            return new ResponseEntity<Address>(addressService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
