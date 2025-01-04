package com.valkyrlabs.api;


import com.valkyrlabs.model.AttackService;

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

import com.valkyrlabs.model.Attack;
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
* A delegate to be called by the {@link AttackApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class AttackApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(AttackApiDelegate.class);

    @Autowired
    private AttackService attackService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Attack/{id} : Delete a Attack.
            * Deletes a specific Attack.
        *
            * @param id Unique identifier for the Attack. (required)
        * @return Attack deleted successfully. (status code 204)
            *         or Attack not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AttackApi#deleteAttack
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteAttack(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(attackService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "AttackApi",  id);

            attackService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Attack/{id} : Retrieve a single Attack
            * Retrieves a single Attack for a specific uid.
        *
            * @param id Unique identifier for the Attack. (required)
        * @return Successfully retrieved the Attack. (status code 200)
            *         or Attack not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AttackApi#getAttack
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Attack>> getAttack(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"weapon\" : { \"game\" : { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, \"color\" : \"BLACK\", \"lastAccessedById\" : \"53488ab9-0365-4c42-a033-e7396b4df88e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"weight\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"b672d035-114a-4f68-b21f-2dc8aed6c332\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"harmLevel\" : 8, \"lastModifiedById\" : \"dd456faa-efaf-41d9-a3fe-661cc04564c5\", \"name\" : \"name\", \"weaponType\" : \"BALLISTiC\", \"id\" : \"b20b611b-53a5-49c5-82ba-fd9c6a8f9f1a\", \"attackId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"69ed1b31-0da5-49b3-aaa7-2436283e93d6\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"20886e51-82db-4d42-acf4-b165f8eaf2a2\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"eb84046e-e66f-4cf1-bcca-a7fe1e9bd457\", \"type\" : \"FRONTAL\", \"ownerId\" : \"fb8355a4-16ac-4853-b869-bf4f9c2f9c63\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "AttackApi",  id);
                            Optional<Attack> ox = attackService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Attack>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Attack : Retrieve a list of Attacks
            * Retrieves a list of Attacks.
        *
        * @return Successfully retrieved the list of Attacks. (status code 200)
            *         or No Attacks were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AttackApi#getAttackList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Attack>>> getAttackList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"weapon\" : { \"game\" : { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, \"color\" : \"BLACK\", \"lastAccessedById\" : \"53488ab9-0365-4c42-a033-e7396b4df88e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"weight\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"b672d035-114a-4f68-b21f-2dc8aed6c332\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"harmLevel\" : 8, \"lastModifiedById\" : \"dd456faa-efaf-41d9-a3fe-661cc04564c5\", \"name\" : \"name\", \"weaponType\" : \"BALLISTiC\", \"id\" : \"b20b611b-53a5-49c5-82ba-fd9c6a8f9f1a\", \"attackId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"69ed1b31-0da5-49b3-aaa7-2436283e93d6\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"20886e51-82db-4d42-acf4-b165f8eaf2a2\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"eb84046e-e66f-4cf1-bcca-a7fe1e9bd457\", \"type\" : \"FRONTAL\", \"ownerId\" : \"fb8355a4-16ac-4853-b869-bf4f9c2f9c63\" }, { \"weapon\" : { \"game\" : { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, \"color\" : \"BLACK\", \"lastAccessedById\" : \"53488ab9-0365-4c42-a033-e7396b4df88e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"weight\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"b672d035-114a-4f68-b21f-2dc8aed6c332\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"harmLevel\" : 8, \"lastModifiedById\" : \"dd456faa-efaf-41d9-a3fe-661cc04564c5\", \"name\" : \"name\", \"weaponType\" : \"BALLISTiC\", \"id\" : \"b20b611b-53a5-49c5-82ba-fd9c6a8f9f1a\", \"attackId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"69ed1b31-0da5-49b3-aaa7-2436283e93d6\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"20886e51-82db-4d42-acf4-b165f8eaf2a2\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"eb84046e-e66f-4cf1-bcca-a7fe1e9bd457\", \"type\" : \"FRONTAL\", \"ownerId\" : \"fb8355a4-16ac-4853-b869-bf4f9c2f9c63\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(attackService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Attack>)attackService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /Attack : Create a new Attack
            * Creates a new Attack.
        *
            * @param attack Attack details. (required)
        * @return Attack created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or Attack not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AttackApi#postAttack
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Attack>> postAttack(Attack attack) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"weapon\" : { \"game\" : { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, \"color\" : \"BLACK\", \"lastAccessedById\" : \"53488ab9-0365-4c42-a033-e7396b4df88e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"weight\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"b672d035-114a-4f68-b21f-2dc8aed6c332\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"harmLevel\" : 8, \"lastModifiedById\" : \"dd456faa-efaf-41d9-a3fe-661cc04564c5\", \"name\" : \"name\", \"weaponType\" : \"BALLISTiC\", \"id\" : \"b20b611b-53a5-49c5-82ba-fd9c6a8f9f1a\", \"attackId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"69ed1b31-0da5-49b3-aaa7-2436283e93d6\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"20886e51-82db-4d42-acf4-b165f8eaf2a2\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"eb84046e-e66f-4cf1-bcca-a7fe1e9bd457\", \"type\" : \"FRONTAL\", \"ownerId\" : \"fb8355a4-16ac-4853-b869-bf4f9c2f9c63\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: attack");
                            Attack ox = attackService.saveOrUpdate(attack);
                            return new ResponseEntity<Attack>(attackService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /Attack/{id} : Update an existing Attack
            * Updates an existing Attack.
        *
            * @param id Unique identifier for the Attack. (required)
            * @param attack Updated Attack details. (required)
        * @return Attack updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or Attack not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see AttackApi#updateAttack
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Attack>> updateAttack(UUID id,
    Attack attack) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"weapon\" : { \"game\" : { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, \"color\" : \"BLACK\", \"lastAccessedById\" : \"53488ab9-0365-4c42-a033-e7396b4df88e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"weight\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"b672d035-114a-4f68-b21f-2dc8aed6c332\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"harmLevel\" : 8, \"lastModifiedById\" : \"dd456faa-efaf-41d9-a3fe-661cc04564c5\", \"name\" : \"name\", \"weaponType\" : \"BALLISTiC\", \"id\" : \"b20b611b-53a5-49c5-82ba-fd9c6a8f9f1a\", \"attackId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"69ed1b31-0da5-49b3-aaa7-2436283e93d6\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"20886e51-82db-4d42-acf4-b165f8eaf2a2\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"eb84046e-e66f-4cf1-bcca-a7fe1e9bd457\", \"type\" : \"FRONTAL\", \"ownerId\" : \"fb8355a4-16ac-4853-b869-bf4f9c2f9c63\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + attack);
                            if(attackService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            attack.setId(id); // guard against a patch with no ID (upserts new objects)
                            Attack ox = attackService.saveOrUpdate(attack);
                            return new ResponseEntity<Attack>(attackService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
