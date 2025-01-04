package com.valkyrlabs.api;


import com.valkyrlabs.model.PrincipalService;

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

import com.valkyrlabs.model.Principal;
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
* A delegate to be called by the {@link PrincipalApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class PrincipalApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(PrincipalApiDelegate.class);

    @Autowired
    private PrincipalService principalService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Principal/{id} : Delete a Principal.
            * Deletes a specific Principal.
        *
            * @param id Unique identifier for the Principal. (required)
        * @return Principal deleted successfully. (status code 204)
            *         or Principal not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see PrincipalApi#deletePrincipal
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deletePrincipal(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(principalService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "PrincipalApi",  id);

            principalService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Principal/{id} : Retrieve a single Principal
            * Retrieves a single Principal for a specific uid.
        *
            * @param id Unique identifier for the Principal. (required)
        * @return Successfully retrieved the Principal. (status code 200)
            *         or Principal not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see PrincipalApi#getPrincipal
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Principal>> getPrincipal(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"residenceCountry\" : \"USA\", \"residenceState\" : \"CA\", \"lastName\" : \"Harmony\", \"addresses\" : [ { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" } ], \"notes\" : \"Notes about this account\", \"lastAccessedById\" : \"1417708a-45ad-43cd-a294-521766640255\", \"acceptedCookies\" : false, \"roles\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" } ], \"bio\" : \"bio\", \"ownerId\" : \"ed29628e-caf1-419f-9985-f8ecc6394b1e\", \"federalIdentification\" : \"111-22-3333\", \"enabled\" : true, \"accountEnabled\" : true, \"organizationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"password\" : \"HardToGuess1980\", \"keyHash\" : \"keyHash\", \"lastModifiedById\" : \"b3bcecd5-3344-46c0-90c5-f1bfabee65b6\", \"fingerprint\" : \"DK$DFSJaraDD\", \"id\" : \"c62b9065-3bc5-445c-88ee-efeee05f207c\", \"email\" : \"wiley.coyote@acme-corp.com\", \"accountNonLocked\" : true, \"social\" : \"https://twitter.com/ValkyrAI\", \"avatarUrl\" : \"https://img.com/mypic.png\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"authorityList\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" } ], \"stateIdentification\" : \"3333333333\", \"firstName\" : \"Peace\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"organization\" : { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }, \"acceptedTos\" : false, \"credentialNonExpired\" : true, \"middleName\" : \"Love\", \"accountNonExpired\" : false, \"username\" : \"Sparky\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "PrincipalApi",  id);
                            Optional<Principal> ox = principalService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Principal>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Principal : Retrieve a list of Principals
            * Retrieves a list of Principals.
        *
        * @return Successfully retrieved the list of Principals. (status code 200)
            *         or No Principals were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see PrincipalApi#getPrincipalList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Principal>>> getPrincipalList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"residenceCountry\" : \"USA\", \"residenceState\" : \"CA\", \"lastName\" : \"Harmony\", \"addresses\" : [ { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" } ], \"notes\" : \"Notes about this account\", \"lastAccessedById\" : \"1417708a-45ad-43cd-a294-521766640255\", \"acceptedCookies\" : false, \"roles\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" } ], \"bio\" : \"bio\", \"ownerId\" : \"ed29628e-caf1-419f-9985-f8ecc6394b1e\", \"federalIdentification\" : \"111-22-3333\", \"enabled\" : true, \"accountEnabled\" : true, \"organizationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"password\" : \"HardToGuess1980\", \"keyHash\" : \"keyHash\", \"lastModifiedById\" : \"b3bcecd5-3344-46c0-90c5-f1bfabee65b6\", \"fingerprint\" : \"DK$DFSJaraDD\", \"id\" : \"c62b9065-3bc5-445c-88ee-efeee05f207c\", \"email\" : \"wiley.coyote@acme-corp.com\", \"accountNonLocked\" : true, \"social\" : \"https://twitter.com/ValkyrAI\", \"avatarUrl\" : \"https://img.com/mypic.png\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"authorityList\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" } ], \"stateIdentification\" : \"3333333333\", \"firstName\" : \"Peace\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"organization\" : { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }, \"acceptedTos\" : false, \"credentialNonExpired\" : true, \"middleName\" : \"Love\", \"accountNonExpired\" : false, \"username\" : \"Sparky\" }, { \"residenceCountry\" : \"USA\", \"residenceState\" : \"CA\", \"lastName\" : \"Harmony\", \"addresses\" : [ { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" } ], \"notes\" : \"Notes about this account\", \"lastAccessedById\" : \"1417708a-45ad-43cd-a294-521766640255\", \"acceptedCookies\" : false, \"roles\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" } ], \"bio\" : \"bio\", \"ownerId\" : \"ed29628e-caf1-419f-9985-f8ecc6394b1e\", \"federalIdentification\" : \"111-22-3333\", \"enabled\" : true, \"accountEnabled\" : true, \"organizationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"password\" : \"HardToGuess1980\", \"keyHash\" : \"keyHash\", \"lastModifiedById\" : \"b3bcecd5-3344-46c0-90c5-f1bfabee65b6\", \"fingerprint\" : \"DK$DFSJaraDD\", \"id\" : \"c62b9065-3bc5-445c-88ee-efeee05f207c\", \"email\" : \"wiley.coyote@acme-corp.com\", \"accountNonLocked\" : true, \"social\" : \"https://twitter.com/ValkyrAI\", \"avatarUrl\" : \"https://img.com/mypic.png\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"authorityList\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" } ], \"stateIdentification\" : \"3333333333\", \"firstName\" : \"Peace\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"organization\" : { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }, \"acceptedTos\" : false, \"credentialNonExpired\" : true, \"middleName\" : \"Love\", \"accountNonExpired\" : false, \"username\" : \"Sparky\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(principalService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Principal>)principalService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /Principal : Create a new Principal
            * Creates a new Principal.
        *
            * @param principal Principal details. (required)
        * @return Principal created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or Principal not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see PrincipalApi#postPrincipal
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Principal>> postPrincipal(Principal principal) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"residenceCountry\" : \"USA\", \"residenceState\" : \"CA\", \"lastName\" : \"Harmony\", \"addresses\" : [ { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" } ], \"notes\" : \"Notes about this account\", \"lastAccessedById\" : \"1417708a-45ad-43cd-a294-521766640255\", \"acceptedCookies\" : false, \"roles\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" } ], \"bio\" : \"bio\", \"ownerId\" : \"ed29628e-caf1-419f-9985-f8ecc6394b1e\", \"federalIdentification\" : \"111-22-3333\", \"enabled\" : true, \"accountEnabled\" : true, \"organizationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"password\" : \"HardToGuess1980\", \"keyHash\" : \"keyHash\", \"lastModifiedById\" : \"b3bcecd5-3344-46c0-90c5-f1bfabee65b6\", \"fingerprint\" : \"DK$DFSJaraDD\", \"id\" : \"c62b9065-3bc5-445c-88ee-efeee05f207c\", \"email\" : \"wiley.coyote@acme-corp.com\", \"accountNonLocked\" : true, \"social\" : \"https://twitter.com/ValkyrAI\", \"avatarUrl\" : \"https://img.com/mypic.png\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"authorityList\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" } ], \"stateIdentification\" : \"3333333333\", \"firstName\" : \"Peace\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"organization\" : { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }, \"acceptedTos\" : false, \"credentialNonExpired\" : true, \"middleName\" : \"Love\", \"accountNonExpired\" : false, \"username\" : \"Sparky\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: principal");
                            Principal ox = principalService.saveOrUpdate(principal);
                            return new ResponseEntity<Principal>(principalService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /Principal/{id} : Update an existing Principal
            * Updates an existing Principal.
        *
            * @param id Unique identifier for the Principal. (required)
            * @param principal Updated Principal details. (required)
        * @return Principal updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or Principal not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see PrincipalApi#updatePrincipal
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Principal>> updatePrincipal(UUID id,
    Principal principal) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"residenceCountry\" : \"USA\", \"residenceState\" : \"CA\", \"lastName\" : \"Harmony\", \"addresses\" : [ { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" } ], \"notes\" : \"Notes about this account\", \"lastAccessedById\" : \"1417708a-45ad-43cd-a294-521766640255\", \"acceptedCookies\" : false, \"roles\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"e9b571b9-7603-4eba-822e-aa0005aff37a\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"cd99207c-073f-46f6-94f1-a9419d67befa\", \"roleName\" : \"ANONYMOUS\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"5b7c95bb-95c1-4cf9-86ca-c7d5f1d0a3b8\", \"ownerId\" : \"77d060ed-e686-4102-8a69-937a7e385efb\" } ], \"bio\" : \"bio\", \"ownerId\" : \"ed29628e-caf1-419f-9985-f8ecc6394b1e\", \"federalIdentification\" : \"111-22-3333\", \"enabled\" : true, \"accountEnabled\" : true, \"organizationId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"password\" : \"HardToGuess1980\", \"keyHash\" : \"keyHash\", \"lastModifiedById\" : \"b3bcecd5-3344-46c0-90c5-f1bfabee65b6\", \"fingerprint\" : \"DK$DFSJaraDD\", \"id\" : \"c62b9065-3bc5-445c-88ee-efeee05f207c\", \"email\" : \"wiley.coyote@acme-corp.com\", \"accountNonLocked\" : true, \"social\" : \"https://twitter.com/ValkyrAI\", \"avatarUrl\" : \"https://img.com/mypic.png\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"authorityList\" : [ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"65f9c26b-a776-453f-9d13-e3f8abfdc615\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2d209bfb-1703-42f6-a2e2-c44c3be2f163\", \"authority\" : \"authority\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"7741596e-c29d-41fd-94eb-08ac186bf3bc\", \"ownerId\" : \"0e05e4d9-5c2e-40ac-b92d-3166daf592c4\", \"username\" : \"username\" } ], \"stateIdentification\" : \"3333333333\", \"firstName\" : \"Peace\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"organization\" : { \"address\" : { \"country\" : \"USA\", \"hasWifi\" : true, \"city\" : \"San Francisco\", \"lastAccessedById\" : \"ef297a29-e742-4535-82c6-6ef6211bca12\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"addressType\" : \"home\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"principalId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"ownerId\" : \"5297b19d-fd2a-4007-9aef-f0b7264cd539\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"ba749007-a05a-4505-a434-d92c7cf9712d\", \"name\" : \"Henry Johnson\", \"street1\" : \"123 Daydream Blvd.\", \"street2\" : \"Apt. 7\", \"state\" : \"CA\", \"id\" : \"3773d666-dea1-4d02-b430-11ca52e266a8\", \"postal_code\" : \"94210-0000\" }, \"lastAccessedById\" : \"bbf6c89f-0f93-435f-871a-d2985bd90dbb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"07c45e12-d2e8-49ed-9e26-192e868673bc\", \"homePage\" : \"https://www.acme-corp.com\", \"addressId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"415-867-5309\", \"lastModifiedById\" : \"2f3719a1-091e-47ab-89f9-9359e01e6feb\", \"name\" : \"ACME Corp Inc.\", \"id\" : \"96040b16-458f-46f6-8a90-6b163b2d6e12\" }, \"acceptedTos\" : false, \"credentialNonExpired\" : true, \"middleName\" : \"Love\", \"accountNonExpired\" : false, \"username\" : \"Sparky\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + principal);
                            if(principalService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            principal.setId(id); // guard against a patch with no ID (upserts new objects)
                            Principal ox = principalService.saveOrUpdate(principal);
                            return new ResponseEntity<Principal>(principalService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
