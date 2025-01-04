package com.valkyrlabs.api;


import com.valkyrlabs.model.CustomerService;

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

import com.valkyrlabs.model.Customer;
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
* A delegate to be called by the {@link CustomerApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class CustomerApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(CustomerApiDelegate.class);

    @Autowired
    private CustomerService customerService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Customer/{id} : Delete a Customer.
            * Deletes a specific Customer.
        *
            * @param id Unique identifier for the Customer. (required)
        * @return Customer deleted successfully. (status code 204)
            *         or Customer not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see CustomerApi#deleteCustomer
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteCustomer(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(customerService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "CustomerApi",  id);

            customerService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Customer/{id} : Retrieve a single Customer
            * Retrieves a single Customer for a specific uid.
        *
            * @param id Unique identifier for the Customer. (required)
        * @return Successfully retrieved the Customer. (status code 200)
            *         or Customer not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see CustomerApi#getCustomer
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Customer>> getCustomer(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"role\" : \"ceo\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"09309af7-d8d4-424d-91d4-98fb2fe1331c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"fb86dcdc-dd42-4699-99e0-817962f03fe7\", \"customerId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"c0baba1c-adeb-46d9-a3bf-9abd77b96ee2\", \"ownerId\" : \"aabd4bac-f0b3-428d-a94c-2bcb1ccab417\", \"customer\" : { \"residenceCountry\" : \"USA\", \"residenceState\" : \"CA\", \"lastName\" : \"Harmony\", \"addresses\" : [ { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" } ], \"notes\" : \"Notes about this account\", \"lastAccessedById\" : \"1417708a-45ad-43cd-a294-521766640255\", \"acceptedCookies\" : false, \"roles\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" } ], \"bio\" : \"bio\", \"ownerId\" : \"ed29628e-caf1-419f-9985-f8ecc6394b1e\", \"federalIdentification\" : \"111-22-3333\", \"enabled\" : true, \"accountEnabled\" : true, \"organizationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"password\" : \"HardToGuess1980\", \"keyHash\" : \"keyHash\", \"lastModifiedById\" : \"b3bcecd5-3344-46c0-90c5-f1bfabee65b6\", \"fingerprint\" : \"DK$DFSJaraDD\", \"id\" : \"c62b9065-3bc5-445c-88ee-efeee05f207c\", \"email\" : \"wiley.coyote@acme-corp.com\", \"accountNonLocked\" : true, \"social\" : \"https://twitter.com/ValkyrAI\", \"avatarUrl\" : \"https://img.com/mypic.png\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"authorityList\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" } ], \"stateIdentification\" : \"3333333333\", \"firstName\" : \"Peace\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"organization\" : { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }, \"acceptedTos\" : false, \"credentialNonExpired\" : true, \"middleName\" : \"Love\", \"accountNonExpired\" : false, \"username\" : \"Sparky\" }, \"status\" : \"active\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "CustomerApi",  id);
                            Optional<Customer> ox = customerService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Customer>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Customer : Retrieve a list of Customers
            * Retrieves a list of Customers.
        *
        * @return Successfully retrieved the list of Customers. (status code 200)
            *         or No Customers were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see CustomerApi#getCustomerList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Customer>>> getCustomerList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"keyHash\" : \"keyHash\", \"role\" : \"ceo\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"09309af7-d8d4-424d-91d4-98fb2fe1331c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"fb86dcdc-dd42-4699-99e0-817962f03fe7\", \"customerId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"c0baba1c-adeb-46d9-a3bf-9abd77b96ee2\", \"ownerId\" : \"aabd4bac-f0b3-428d-a94c-2bcb1ccab417\", \"customer\" : { \"residenceCountry\" : \"USA\", \"residenceState\" : \"CA\", \"lastName\" : \"Harmony\", \"addresses\" : [ { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" } ], \"notes\" : \"Notes about this account\", \"lastAccessedById\" : \"1417708a-45ad-43cd-a294-521766640255\", \"acceptedCookies\" : false, \"roles\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" } ], \"bio\" : \"bio\", \"ownerId\" : \"ed29628e-caf1-419f-9985-f8ecc6394b1e\", \"federalIdentification\" : \"111-22-3333\", \"enabled\" : true, \"accountEnabled\" : true, \"organizationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"password\" : \"HardToGuess1980\", \"keyHash\" : \"keyHash\", \"lastModifiedById\" : \"b3bcecd5-3344-46c0-90c5-f1bfabee65b6\", \"fingerprint\" : \"DK$DFSJaraDD\", \"id\" : \"c62b9065-3bc5-445c-88ee-efeee05f207c\", \"email\" : \"wiley.coyote@acme-corp.com\", \"accountNonLocked\" : true, \"social\" : \"https://twitter.com/ValkyrAI\", \"avatarUrl\" : \"https://img.com/mypic.png\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"authorityList\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" } ], \"stateIdentification\" : \"3333333333\", \"firstName\" : \"Peace\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"organization\" : { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }, \"acceptedTos\" : false, \"credentialNonExpired\" : true, \"middleName\" : \"Love\", \"accountNonExpired\" : false, \"username\" : \"Sparky\" }, \"status\" : \"active\" }, { \"keyHash\" : \"keyHash\", \"role\" : \"ceo\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"09309af7-d8d4-424d-91d4-98fb2fe1331c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"fb86dcdc-dd42-4699-99e0-817962f03fe7\", \"customerId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"c0baba1c-adeb-46d9-a3bf-9abd77b96ee2\", \"ownerId\" : \"aabd4bac-f0b3-428d-a94c-2bcb1ccab417\", \"customer\" : { \"residenceCountry\" : \"USA\", \"residenceState\" : \"CA\", \"lastName\" : \"Harmony\", \"addresses\" : [ { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" } ], \"notes\" : \"Notes about this account\", \"lastAccessedById\" : \"1417708a-45ad-43cd-a294-521766640255\", \"acceptedCookies\" : false, \"roles\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" } ], \"bio\" : \"bio\", \"ownerId\" : \"ed29628e-caf1-419f-9985-f8ecc6394b1e\", \"federalIdentification\" : \"111-22-3333\", \"enabled\" : true, \"accountEnabled\" : true, \"organizationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"password\" : \"HardToGuess1980\", \"keyHash\" : \"keyHash\", \"lastModifiedById\" : \"b3bcecd5-3344-46c0-90c5-f1bfabee65b6\", \"fingerprint\" : \"DK$DFSJaraDD\", \"id\" : \"c62b9065-3bc5-445c-88ee-efeee05f207c\", \"email\" : \"wiley.coyote@acme-corp.com\", \"accountNonLocked\" : true, \"social\" : \"https://twitter.com/ValkyrAI\", \"avatarUrl\" : \"https://img.com/mypic.png\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"authorityList\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" } ], \"stateIdentification\" : \"3333333333\", \"firstName\" : \"Peace\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"organization\" : { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }, \"acceptedTos\" : false, \"credentialNonExpired\" : true, \"middleName\" : \"Love\", \"accountNonExpired\" : false, \"username\" : \"Sparky\" }, \"status\" : \"active\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(customerService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Customer>)customerService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /Customer : Create a new Customer
            * Creates a new Customer.
        *
            * @param customer Customer details. (required)
        * @return Customer created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or Customer not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see CustomerApi#postCustomer
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Customer>> postCustomer(Customer customer) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"role\" : \"ceo\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"09309af7-d8d4-424d-91d4-98fb2fe1331c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"fb86dcdc-dd42-4699-99e0-817962f03fe7\", \"customerId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"c0baba1c-adeb-46d9-a3bf-9abd77b96ee2\", \"ownerId\" : \"aabd4bac-f0b3-428d-a94c-2bcb1ccab417\", \"customer\" : { \"residenceCountry\" : \"USA\", \"residenceState\" : \"CA\", \"lastName\" : \"Harmony\", \"addresses\" : [ { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" } ], \"notes\" : \"Notes about this account\", \"lastAccessedById\" : \"1417708a-45ad-43cd-a294-521766640255\", \"acceptedCookies\" : false, \"roles\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" } ], \"bio\" : \"bio\", \"ownerId\" : \"ed29628e-caf1-419f-9985-f8ecc6394b1e\", \"federalIdentification\" : \"111-22-3333\", \"enabled\" : true, \"accountEnabled\" : true, \"organizationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"password\" : \"HardToGuess1980\", \"keyHash\" : \"keyHash\", \"lastModifiedById\" : \"b3bcecd5-3344-46c0-90c5-f1bfabee65b6\", \"fingerprint\" : \"DK$DFSJaraDD\", \"id\" : \"c62b9065-3bc5-445c-88ee-efeee05f207c\", \"email\" : \"wiley.coyote@acme-corp.com\", \"accountNonLocked\" : true, \"social\" : \"https://twitter.com/ValkyrAI\", \"avatarUrl\" : \"https://img.com/mypic.png\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"authorityList\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" } ], \"stateIdentification\" : \"3333333333\", \"firstName\" : \"Peace\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"organization\" : { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }, \"acceptedTos\" : false, \"credentialNonExpired\" : true, \"middleName\" : \"Love\", \"accountNonExpired\" : false, \"username\" : \"Sparky\" }, \"status\" : \"active\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: customer");
                            Customer ox = customerService.saveOrUpdate(customer);
                            return new ResponseEntity<Customer>(customerService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /Customer/{id} : Update an existing Customer
            * Updates an existing Customer.
        *
            * @param id Unique identifier for the Customer. (required)
            * @param customer Updated Customer details. (required)
        * @return Customer updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or Customer not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see CustomerApi#updateCustomer
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Customer>> updateCustomer(UUID id,
    Customer customer) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"role\" : \"ceo\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"09309af7-d8d4-424d-91d4-98fb2fe1331c\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"fb86dcdc-dd42-4699-99e0-817962f03fe7\", \"customerId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"c0baba1c-adeb-46d9-a3bf-9abd77b96ee2\", \"ownerId\" : \"aabd4bac-f0b3-428d-a94c-2bcb1ccab417\", \"customer\" : { \"residenceCountry\" : \"USA\", \"residenceState\" : \"CA\", \"lastName\" : \"Harmony\", \"addresses\" : [ { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" } ], \"notes\" : \"Notes about this account\", \"lastAccessedById\" : \"1417708a-45ad-43cd-a294-521766640255\", \"acceptedCookies\" : false, \"roles\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" } ], \"bio\" : \"bio\", \"ownerId\" : \"ed29628e-caf1-419f-9985-f8ecc6394b1e\", \"federalIdentification\" : \"111-22-3333\", \"enabled\" : true, \"accountEnabled\" : true, \"organizationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"password\" : \"HardToGuess1980\", \"keyHash\" : \"keyHash\", \"lastModifiedById\" : \"b3bcecd5-3344-46c0-90c5-f1bfabee65b6\", \"fingerprint\" : \"DK$DFSJaraDD\", \"id\" : \"c62b9065-3bc5-445c-88ee-efeee05f207c\", \"email\" : \"wiley.coyote@acme-corp.com\", \"accountNonLocked\" : true, \"social\" : \"https://twitter.com/ValkyrAI\", \"avatarUrl\" : \"https://img.com/mypic.png\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"authorityList\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" } ], \"stateIdentification\" : \"3333333333\", \"firstName\" : \"Peace\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"organization\" : { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }, \"acceptedTos\" : false, \"credentialNonExpired\" : true, \"middleName\" : \"Love\", \"accountNonExpired\" : false, \"username\" : \"Sparky\" }, \"status\" : \"active\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + customer);
                            if(customerService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            customer.setId(id); // guard against a patch with no ID (upserts new objects)
                            Customer ox = customerService.saveOrUpdate(customer);
                            return new ResponseEntity<Customer>(customerService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
