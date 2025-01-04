---
title: "ValkyrAI API : LevelApi"
slug: "LevelApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        LevelApi,
        api-docs
    ]
---

# LevelApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLevel**](#deleteLevel) | **DELETE** LevelApi | Delete a Level. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Level/deleteLevel ]**[**getLevel**](#getLevel) | **GET** LevelApi | Retrieve a single Level | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Level/getLevel ]**[**getLevelList**](#getLevelList) | **GET** LevelApi | Retrieve a list of Levels | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Level/getLevelList ]**[**postLevel**](#postLevel) | **POST** LevelApi | Create a new Level | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Level/postLevel ]**[**updateLevel**](#updateLevel) | **PUT** LevelApi | Update an existing Level | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Level/updateLevel ]**


<a name="deleteLevel"></a>
# **deleteLevel**
>  <h5>Void</h5> deleteLevel(id)

Delete a Level.

Deletes a specific Level.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LevelApi;


LevelApi apiInstance = new LevelApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Level.

try {
    Void result = apiInstance.deleteLevel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelApi#deleteLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Level. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getLevel"></a>
# **getLevel**
>  <h5>Level</h5> getLevel(id)

Retrieve a single Level

Retrieves a single Level for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LevelApi;


LevelApi apiInstance = new LevelApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Level.

try {
    Level result = apiInstance.getLevel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelApi#getLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Level. |

### Return type

[**Level**](../model-docs/model-doc-Level)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLevelList"></a>
# **getLevelList**
>  <h5>Level</h5> getLevelList()

Retrieve a list of Levels

Retrieves a list of Levels.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LevelApi;


LevelApi apiInstance = new LevelApi();

try {
    Level result = apiInstance.getLevelList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelApi#getLevelList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Level**](../model-docs/model-doc-Level)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postLevel"></a>
# **postLevel**
>  <h5>Level</h5> postLevel(level)

Create a new Level

Creates a new Level.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LevelApi;


LevelApi apiInstance = new LevelApi();
Level level = new Level(); // Level | Level details.

try {
    Level result = apiInstance.postLevel(level);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelApi#postLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **level** | [**Level**](Level)| Level details. |

### Return type

[**Level**](../model-docs/model-doc-Level)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLevel"></a>
# **updateLevel**
>  <h5>Level</h5> updateLevel(idlevel)

Update an existing Level

Updates an existing Level.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LevelApi;


LevelApi apiInstance = new LevelApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Level.
Level level = new Level(); // Level | Updated Level details.

try {
    Level result = apiInstance.updateLevel(idlevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LevelApi#updateLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Level. |
 **level** | [**Level**](Level)| Updated Level details. |

### Return type

[**Level**](../model-docs/model-doc-Level)

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
