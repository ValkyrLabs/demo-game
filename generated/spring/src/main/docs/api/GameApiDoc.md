---
title: "ValkyrAI API : GameApi"
slug: "GameApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        GameApi,
        api-docs
    ]
---

# GameApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteGame**](#deleteGame) | **DELETE** GameApi | Delete a Game. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Game/deleteGame ]**[**getGame**](#getGame) | **GET** GameApi | Retrieve a single Game | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Game/getGame ]**[**getGameList**](#getGameList) | **GET** GameApi | Retrieve a list of Games | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Game/getGameList ]**[**postGame**](#postGame) | **POST** GameApi | Create a new Game | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Game/postGame ]**[**updateGame**](#updateGame) | **PUT** GameApi | Update an existing Game | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Game/updateGame ]**


<a name="deleteGame"></a>
# **deleteGame**
>  <h5>Void</h5> deleteGame(id)

Delete a Game.

Deletes a specific Game.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.GameApi;


GameApi apiInstance = new GameApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Game.

try {
    Void result = apiInstance.deleteGame(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GameApi#deleteGame");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Game. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getGame"></a>
# **getGame**
>  <h5>Game</h5> getGame(id)

Retrieve a single Game

Retrieves a single Game for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.GameApi;


GameApi apiInstance = new GameApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Game.

try {
    Game result = apiInstance.getGame(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GameApi#getGame");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Game. |

### Return type

[**Game**](../model-docs/model-doc-Game)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGameList"></a>
# **getGameList**
>  <h5>Game</h5> getGameList()

Retrieve a list of Games

Retrieves a list of Games.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.GameApi;


GameApi apiInstance = new GameApi();

try {
    Game result = apiInstance.getGameList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GameApi#getGameList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Game**](../model-docs/model-doc-Game)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postGame"></a>
# **postGame**
>  <h5>Game</h5> postGame(game)

Create a new Game

Creates a new Game.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.GameApi;


GameApi apiInstance = new GameApi();
Game game = new Game(); // Game | Game details.

try {
    Game result = apiInstance.postGame(game);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GameApi#postGame");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | [**Game**](Game)| Game details. |

### Return type

[**Game**](../model-docs/model-doc-Game)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGame"></a>
# **updateGame**
>  <h5>Game</h5> updateGame(idgame)

Update an existing Game

Updates an existing Game.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.GameApi;


GameApi apiInstance = new GameApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Game.
Game game = new Game(); // Game | Updated Game details.

try {
    Game result = apiInstance.updateGame(idgame);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GameApi#updateGame");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Game. |
 **game** | [**Game**](Game)| Updated Game details. |

### Return type

[**Game**](../model-docs/model-doc-Game)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]
