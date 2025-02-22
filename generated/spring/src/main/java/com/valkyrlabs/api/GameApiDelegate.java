package com.valkyrlabs.api;


import com.valkyrlabs.model.GameService;

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

import com.valkyrlabs.model.Game;
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
* A delegate to be called by the {@link GameApiController}}.
* Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
*/
@Controller
// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
public class GameApiDelegate {

    protected static final Logger	logger	= LoggerFactory.getLogger(GameApiDelegate.class);

    @Autowired
    private GameService gameService;

    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

        /**
        * DELETE /Game/{id} : Delete a Game.
            * Deletes a specific Game.
        *
            * @param id Unique identifier for the Game. (required)
        * @return Game deleted successfully. (status code 204)
            *         or Game not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see GameApi#deleteGame
        */

    // THORApi Permissions

    // ThorAPI DELETE
    //@PreAuthorize("hasPermission(#id, 'delete')")



    public CompletableFuture<ResponseEntity<Void>> deleteGame(UUID id) {
        // ThorAPI Method Template

        
        // ThorAPI DELETE
        if(gameService.findById(id).isEmpty()){
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        logger.info("DELETING: {}:{} " , "GameApi",  id);

            gameService.deleteById(id);
            return CompletableFuture.completedFuture(new ResponseEntity<>(HttpStatus.NO_CONTENT));



        





    }
        /**
        * GET /Game/{id} : Retrieve a single Game
            * Retrieves a single Game for a specific uid.
        *
            * @param id Unique identifier for the Game. (required)
        * @return Successfully retrieved the Game. (status code 200)
            *         or Game not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see GameApi#getGame
        */

    // THORApi Permissions
    // ThorAPI GET
    //@PreAuthorize("hasPermission(#id, 'read')")




    public CompletableFuture<ResponseEntity<Game>> getGame(UUID id) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"537dbb10-653a-4599-9049-0bc65a86babb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2e2698cb-2812-4af2-9835-0307fb620b25\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"2fc54c12-6913-478e-a087-e2222bf27ea5\", \"ownerId\" : \"7d6f7412-2a3c-44f8-98be-b5b022b4829e\", \"weapons\" : [ { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" } ] }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI GET
                            logger.info("GETTING: {}:{} " , "GameApi",  id);
                            Optional<Game> ox = gameService.findById(id);
                            if(ox.isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            return new ResponseEntity<Game>(ox.get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * GET /Game : Retrieve a list of Games
            * Retrieves a list of Games.
        *
        * @return Successfully retrieved the list of Games. (status code 200)
            *         or No Games were found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see GameApi#getGameList
        */

    // THORApi Permissions
    // ThorAPI LIST
    // @PostFilter("hasPermission(filterObject, 'READ')")
    public CompletableFuture<ResponseEntity<List<Game>>> getGameList() {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "[ { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"537dbb10-653a-4599-9049-0bc65a86babb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2e2698cb-2812-4af2-9835-0307fb620b25\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"2fc54c12-6913-478e-a087-e2222bf27ea5\", \"ownerId\" : \"7d6f7412-2a3c-44f8-98be-b5b022b4829e\", \"weapons\" : [ { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" } ] }, { \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"537dbb10-653a-4599-9049-0bc65a86babb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2e2698cb-2812-4af2-9835-0307fb620b25\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"2fc54c12-6913-478e-a087-e2222bf27ea5\", \"ownerId\" : \"7d6f7412-2a3c-44f8-98be-b5b022b4829e\", \"weapons\" : [ { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" } ] } ]";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                if(gameService.findAll() == null){
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<>((List<Game>)gameService.findAll(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * POST /Game : Create a new Game
            * Creates a new Game.
        *
            * @param game Game details. (required)
        * @return Game created successfully. (status code 201)
            *         or Invalid input. (status code 400)
            *         or Game not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see GameApi#postGame
        */

    // THORApi Permissions
    // ThorAPI CREATE
    //@PreAuthorize("hasPermission(#id, 'insert')")




    public CompletableFuture<ResponseEntity<Game>> postGame(Game game) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"537dbb10-653a-4599-9049-0bc65a86babb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2e2698cb-2812-4af2-9835-0307fb620b25\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"2fc54c12-6913-478e-a087-e2222bf27ea5\", \"ownerId\" : \"7d6f7412-2a3c-44f8-98be-b5b022b4829e\", \"weapons\" : [ { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" } ] }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI CREATE
                            logger.trace("CREATING RECORD: game");
                            Game ox = gameService.saveOrUpdate(game);
                            return new ResponseEntity<Game>(gameService.findById(ox.getId()).get(), HttpStatus.CREATED);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
        /**
        * PUT /Game/{id} : Update an existing Game
            * Updates an existing Game.
        *
            * @param id Unique identifier for the Game. (required)
            * @param game Updated Game details. (required)
        * @return Game updated successfully. (status code 200)
            *         or Invalid input. (status code 400)
            *         or Game not found. (status code 404)
            *         or Internal server error. (status code 500)
        * @see GameApi#updateGame
        */

    // THORApi Permissions
    // ThorAPI UPDATE
    //@PreAuthorize("hasPermission(#id, 'update')")
    




    public CompletableFuture<ResponseEntity<Game>> updateGame(UUID id,
    Game game) {
        // ThorAPI Method Template

                return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                                String exampleString = "{ \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"537dbb10-653a-4599-9049-0bc65a86babb\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"2e2698cb-2812-4af2-9835-0307fb620b25\", \"name\" : \"name\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"2fc54c12-6913-478e-a087-e2222bf27ea5\", \"ownerId\" : \"7d6f7412-2a3c-44f8-98be-b5b022b4829e\", \"weapons\" : [ { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" }, { \"gameId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"weaponId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"keyHash\" : \"keyHash\", \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastAccessedById\" : \"619a6ba7-3f15-49db-a680-86f9f804ba73\", \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedById\" : \"44b24cd5-32de-49d0-a1e0-943507f98605\", \"lastAccessedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : \"4b37eb03-82c6-4146-8e5b-b715c165f580\", \"ownerId\" : \"80601c34-1c3e-4710-8527-a27c0737921f\" } ] }";
                                ApiUtil.setExampleResponse(request, "application/json", exampleString);
                                break;
                            }
                            }
                        });
                
                /// ThorAPI method impl
                            // ThorAPI UPDATE
                            // logger.trace("UPDATING RECORD:" + game);
                            if(gameService.findById(id).isEmpty()){
                                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
                            }
                            game.setId(id); // guard against a patch with no ID (upserts new objects)
                            Game ox = gameService.saveOrUpdate(game);
                            return new ResponseEntity<Game>(gameService.findById(ox.getId()).get(), HttpStatus.OK);
                /// END ThorAPI method impl
                }, Runnable::run);






    }
    }
