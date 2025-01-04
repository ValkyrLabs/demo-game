package com.valkyrlabs.api;


import com.valkyrlabs.model.WeaponService;

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

import java.util.UUID;
import com.valkyrlabs.model.Weapon;
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
* A delegate to be called by the {@link WeaponApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class WeaponApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(WeaponApiDelegate.class);

    @Autowired
    private WeaponService weaponService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Weapon/{id} : Delete a Weapon.
            * Deletes a specific Weapon.
        *
            * @param id Unique identifier for the Weapon. (required)
        * @return Weapon deleted successfully. (status code 204)
            *         or Weapon not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WeaponApi#deleteWeapon
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteWeapon(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(weaponService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "WeaponApi",  id);

            weaponService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Weapon/{id} : Retrieve a single Weapon
            * Retrieves a single Weapon for a specific uid.
        *
            * @param id Unique identifier for the Weapon. (required)
        * @return Successfully retrieved the Weapon. (status code 200)
            *         or Weapon not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WeaponApi#getWeapon
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Weapon>> getWeapon(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"game\" : { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, \"color\" : \"BLACK\", \"lastAccessedById\" : \"53488ab9-0365-4c42-a033-e7396b4df88e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"weight\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"b672d035-114a-4f68-b21f-2dc8aed6c332\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"harmLevel\" : 8, \"lastModifiedById\" : \"dd456faa-efaf-41d9-a3fe-661cc04564c5\", \"name\" : \"name\", \"weaponType\" : \"BALLISTiC\", \"id\" : \"b20b611b-53a5-49c5-82ba-fd9c6a8f9f1a\", \"attackId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "WeaponApi",  id);
                            Optional<Weapon> ox = weaponService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Weapon>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Weapon : Retrieve a list of Weapons
            * Retrieves a list of Weapons.
        *
        * @return Successfully retrieved the list of Weapons. (status code 200)
            *         or No Weapons were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WeaponApi#getWeaponList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Weapon>>> getWeaponList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"game\" : { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, \"color\" : \"BLACK\", \"lastAccessedById\" : \"53488ab9-0365-4c42-a033-e7396b4df88e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"weight\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"b672d035-114a-4f68-b21f-2dc8aed6c332\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"harmLevel\" : 8, \"lastModifiedById\" : \"dd456faa-efaf-41d9-a3fe-661cc04564c5\", \"name\" : \"name\", \"weaponType\" : \"BALLISTiC\", \"id\" : \"b20b611b-53a5-49c5-82ba-fd9c6a8f9f1a\", \"attackId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"game\" : { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, \"color\" : \"BLACK\", \"lastAccessedById\" : \"53488ab9-0365-4c42-a033-e7396b4df88e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"weight\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"b672d035-114a-4f68-b21f-2dc8aed6c332\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"harmLevel\" : 8, \"lastModifiedById\" : \"dd456faa-efaf-41d9-a3fe-661cc04564c5\", \"name\" : \"name\", \"weaponType\" : \"BALLISTiC\", \"id\" : \"b20b611b-53a5-49c5-82ba-fd9c6a8f9f1a\", \"attackId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(weaponService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Weapon>)weaponService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /Weapon : Create a new Weapon
            * Creates a new Weapon.
        *
            * @param weapon Weapon details. (required)
        * @return Weapon created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or Weapon not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WeaponApi#postWeapon
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Weapon>> postWeapon(Weapon weapon) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"game\" : { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, \"color\" : \"BLACK\", \"lastAccessedById\" : \"53488ab9-0365-4c42-a033-e7396b4df88e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"weight\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"b672d035-114a-4f68-b21f-2dc8aed6c332\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"harmLevel\" : 8, \"lastModifiedById\" : \"dd456faa-efaf-41d9-a3fe-661cc04564c5\", \"name\" : \"name\", \"weaponType\" : \"BALLISTiC\", \"id\" : \"b20b611b-53a5-49c5-82ba-fd9c6a8f9f1a\", \"attackId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: weapon");
                            Weapon ox = weaponService.saveOrUpdate(weapon);
                            return new ResponseEntity<Weapon>(weaponService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /Weapon/{id} : Update an existing Weapon
            * Updates an existing Weapon.
        *
            * @param id Unique identifier for the Weapon. (required)
            * @param weapon Updated Weapon details. (required)
        * @return Weapon updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or Weapon not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see WeaponApi#updateWeapon
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Weapon>> updateWeapon(UUID id,
    Weapon weapon) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"game\" : { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, \"color\" : \"BLACK\", \"lastAccessedById\" : \"53488ab9-0365-4c42-a033-e7396b4df88e\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"weight\" : 6, \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"ownerId\" : \"b672d035-114a-4f68-b21f-2dc8aed6c332\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"harmLevel\" : 8, \"lastModifiedById\" : \"dd456faa-efaf-41d9-a3fe-661cc04564c5\", \"name\" : \"name\", \"weaponType\" : \"BALLISTiC\", \"id\" : \"b20b611b-53a5-49c5-82ba-fd9c6a8f9f1a\", \"attackId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + weapon);
                            if(weaponService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            weapon.setId(id); // guard against a patch with no ID (upserts new objects)
                            Weapon ox = weaponService.saveOrUpdate(weapon);
                            return new ResponseEntity<Weapon>(weaponService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
