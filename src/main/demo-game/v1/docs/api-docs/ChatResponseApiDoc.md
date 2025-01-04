---
title: "ValkyrAI API : ChatResponseApi"
slug: "ChatResponseApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        ChatResponseApi,
        api-docs
    ]
---

# ChatResponseApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteChatResponse**](#deleteChatResponse) | **DELETE** ChatResponseApi | Delete a ChatResponse. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ChatResponse/deleteChatResponse ]**[**getChatResponse**](#getChatResponse) | **GET** ChatResponseApi | Retrieve a single ChatResponse | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ChatResponse/getChatResponse ]**[**getChatResponseList**](#getChatResponseList) | **GET** ChatResponseApi | Retrieve a list of ChatResponses | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ChatResponse/getChatResponseList ]**[**postChatResponse**](#postChatResponse) | **POST** ChatResponseApi | Create a new ChatResponse | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ChatResponse/postChatResponse ]**[**updateChatResponse**](#updateChatResponse) | **PUT** ChatResponseApi | Update an existing ChatResponse | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ChatResponse/updateChatResponse ]**


<a name="deleteChatResponse"></a>
# **deleteChatResponse**
>  <h5>Void</h5> deleteChatResponse(id)

Delete a ChatResponse.

Deletes a specific ChatResponse.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ChatResponseApi;


ChatResponseApi apiInstance = new ChatResponseApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ChatResponse.

try {
    Void result = apiInstance.deleteChatResponse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatResponseApi#deleteChatResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ChatResponse. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChatResponse"></a>
# **getChatResponse**
>  <h5>ChatResponse</h5> getChatResponse(id)

Retrieve a single ChatResponse

Retrieves a single ChatResponse for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ChatResponseApi;


ChatResponseApi apiInstance = new ChatResponseApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ChatResponse.

try {
    ChatResponse result = apiInstance.getChatResponse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatResponseApi#getChatResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ChatResponse. |

### Return type

[**ChatResponse**](../model-docs/model-doc-ChatResponse)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChatResponseList"></a>
# **getChatResponseList**
>  <h5>ChatResponse</h5> getChatResponseList()

Retrieve a list of ChatResponses

Retrieves a list of ChatResponses.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ChatResponseApi;


ChatResponseApi apiInstance = new ChatResponseApi();

try {
    ChatResponse result = apiInstance.getChatResponseList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatResponseApi#getChatResponseList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChatResponse**](../model-docs/model-doc-ChatResponse)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postChatResponse"></a>
# **postChatResponse**
>  <h5>ChatResponse</h5> postChatResponse(chatResponse)

Create a new ChatResponse

Creates a new ChatResponse.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ChatResponseApi;


ChatResponseApi apiInstance = new ChatResponseApi();
ChatResponse chatResponse = new ChatResponse(); // ChatResponse | ChatResponse details.

try {
    ChatResponse result = apiInstance.postChatResponse(chatResponse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatResponseApi#postChatResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatResponse** | [**ChatResponse**](ChatResponse)| ChatResponse details. |

### Return type

[**ChatResponse**](../model-docs/model-doc-ChatResponse)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateChatResponse"></a>
# **updateChatResponse**
>  <h5>ChatResponse</h5> updateChatResponse(idchatResponse)

Update an existing ChatResponse

Updates an existing ChatResponse.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ChatResponseApi;


ChatResponseApi apiInstance = new ChatResponseApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ChatResponse.
ChatResponse chatResponse = new ChatResponse(); // ChatResponse | Updated ChatResponse details.

try {
    ChatResponse result = apiInstance.updateChatResponse(idchatResponse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatResponseApi#updateChatResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ChatResponse. |
 **chatResponse** | [**ChatResponse**](ChatResponse)| Updated ChatResponse details. |

### Return type

[**ChatResponse**](../model-docs/model-doc-ChatResponse)

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
