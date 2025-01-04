---
title: "ValkyrAI API : LlmDetailsApi"
slug: "LlmDetailsApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        LlmDetailsApi,
        api-docs
    ]
---

# LlmDetailsApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLlmDetails**](#deleteLlmDetails) | **DELETE** LlmDetailsApi | Delete a LlmDetails. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/LlmDetails/deleteLlmDetails ]**[**getLlmDetails**](#getLlmDetails) | **GET** LlmDetailsApi | Retrieve a single LlmDetails | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/LlmDetails/getLlmDetails ]**[**getLlmDetailsList**](#getLlmDetailsList) | **GET** LlmDetailsApi | Retrieve a list of LlmDetailss | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/LlmDetails/getLlmDetailsList ]**[**postLlmDetails**](#postLlmDetails) | **POST** LlmDetailsApi | Create a new LlmDetails | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/LlmDetails/postLlmDetails ]**[**updateLlmDetails**](#updateLlmDetails) | **PUT** LlmDetailsApi | Update an existing LlmDetails | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/LlmDetails/updateLlmDetails ]**


<a name="deleteLlmDetails"></a>
# **deleteLlmDetails**
>  <h5>Void</h5> deleteLlmDetails(id)

Delete a LlmDetails.

Deletes a specific LlmDetails.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LlmDetailsApi;


LlmDetailsApi apiInstance = new LlmDetailsApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the LlmDetails.

try {
    Void result = apiInstance.deleteLlmDetails(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LlmDetailsApi#deleteLlmDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the LlmDetails. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getLlmDetails"></a>
# **getLlmDetails**
>  <h5>LlmDetails</h5> getLlmDetails(id)

Retrieve a single LlmDetails

Retrieves a single LlmDetails for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LlmDetailsApi;


LlmDetailsApi apiInstance = new LlmDetailsApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the LlmDetails.

try {
    LlmDetails result = apiInstance.getLlmDetails(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LlmDetailsApi#getLlmDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the LlmDetails. |

### Return type

[**LlmDetails**](../model-docs/model-doc-LlmDetails)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLlmDetailsList"></a>
# **getLlmDetailsList**
>  <h5>LlmDetails</h5> getLlmDetailsList()

Retrieve a list of LlmDetailss

Retrieves a list of LlmDetailss.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LlmDetailsApi;


LlmDetailsApi apiInstance = new LlmDetailsApi();

try {
    LlmDetails result = apiInstance.getLlmDetailsList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LlmDetailsApi#getLlmDetailsList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LlmDetails**](../model-docs/model-doc-LlmDetails)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postLlmDetails"></a>
# **postLlmDetails**
>  <h5>LlmDetails</h5> postLlmDetails(llmDetails)

Create a new LlmDetails

Creates a new LlmDetails.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LlmDetailsApi;


LlmDetailsApi apiInstance = new LlmDetailsApi();
LlmDetails llmDetails = new LlmDetails(); // LlmDetails | LlmDetails details.

try {
    LlmDetails result = apiInstance.postLlmDetails(llmDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LlmDetailsApi#postLlmDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **llmDetails** | [**LlmDetails**](LlmDetails)| LlmDetails details. |

### Return type

[**LlmDetails**](../model-docs/model-doc-LlmDetails)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLlmDetails"></a>
# **updateLlmDetails**
>  <h5>LlmDetails</h5> updateLlmDetails(idllmDetails)

Update an existing LlmDetails

Updates an existing LlmDetails.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LlmDetailsApi;


LlmDetailsApi apiInstance = new LlmDetailsApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the LlmDetails.
LlmDetails llmDetails = new LlmDetails(); // LlmDetails | Updated LlmDetails details.

try {
    LlmDetails result = apiInstance.updateLlmDetails(idllmDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LlmDetailsApi#updateLlmDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the LlmDetails. |
 **llmDetails** | [**LlmDetails**](LlmDetails)| Updated LlmDetails details. |

### Return type

[**LlmDetails**](../model-docs/model-doc-LlmDetails)

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
**GENERATED DATE** | 2025-01-03T16:21:43.722881-08:00[America/Los_Angeles]
