---
title: "ValkyrAI API : ChatMessageApi"
slug: "ChatMessageApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        ChatMessageApi,
        api-docs
    ]
---

# ChatMessageApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteChatMessage**](#deleteChatMessage) | **DELETE** ChatMessageApi | Delete a ChatMessage. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ChatMessage/deleteChatMessage ]**[**getChatMessage**](#getChatMessage) | **GET** ChatMessageApi | Retrieve a single ChatMessage | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ChatMessage/getChatMessage ]**[**getChatMessageList**](#getChatMessageList) | **GET** ChatMessageApi | Retrieve a list of ChatMessages | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ChatMessage/getChatMessageList ]**[**postChatMessage**](#postChatMessage) | **POST** ChatMessageApi | Create a new ChatMessage | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ChatMessage/postChatMessage ]**[**updateChatMessage**](#updateChatMessage) | **PUT** ChatMessageApi | Update an existing ChatMessage | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ChatMessage/updateChatMessage ]**


<a name="deleteChatMessage"></a>
# **deleteChatMessage**
>  <h5>Void</h5> deleteChatMessage(id)

Delete a ChatMessage.

Deletes a specific ChatMessage.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ChatMessageApi;


ChatMessageApi apiInstance = new ChatMessageApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ChatMessage.

try {
    Void result = apiInstance.deleteChatMessage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatMessageApi#deleteChatMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ChatMessage. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChatMessage"></a>
# **getChatMessage**
>  <h5>ChatMessage</h5> getChatMessage(id)

Retrieve a single ChatMessage

Retrieves a single ChatMessage for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ChatMessageApi;


ChatMessageApi apiInstance = new ChatMessageApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ChatMessage.

try {
    ChatMessage result = apiInstance.getChatMessage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatMessageApi#getChatMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ChatMessage. |

### Return type

[**ChatMessage**](../model-docs/model-doc-ChatMessage)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChatMessageList"></a>
# **getChatMessageList**
>  <h5>ChatMessage</h5> getChatMessageList()

Retrieve a list of ChatMessages

Retrieves a list of ChatMessages.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ChatMessageApi;


ChatMessageApi apiInstance = new ChatMessageApi();

try {
    ChatMessage result = apiInstance.getChatMessageList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatMessageApi#getChatMessageList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChatMessage**](../model-docs/model-doc-ChatMessage)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postChatMessage"></a>
# **postChatMessage**
>  <h5>ChatMessage</h5> postChatMessage(chatMessage)

Create a new ChatMessage

Creates a new ChatMessage.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ChatMessageApi;


ChatMessageApi apiInstance = new ChatMessageApi();
ChatMessage chatMessage = new ChatMessage(); // ChatMessage | ChatMessage details.

try {
    ChatMessage result = apiInstance.postChatMessage(chatMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatMessageApi#postChatMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatMessage** | [**ChatMessage**](ChatMessage)| ChatMessage details. |

### Return type

[**ChatMessage**](../model-docs/model-doc-ChatMessage)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateChatMessage"></a>
# **updateChatMessage**
>  <h5>ChatMessage</h5> updateChatMessage(idchatMessage)

Update an existing ChatMessage

Updates an existing ChatMessage.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ChatMessageApi;


ChatMessageApi apiInstance = new ChatMessageApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ChatMessage.
ChatMessage chatMessage = new ChatMessage(); // ChatMessage | Updated ChatMessage details.

try {
    ChatMessage result = apiInstance.updateChatMessage(idchatMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatMessageApi#updateChatMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ChatMessage. |
 **chatMessage** | [**ChatMessage**](ChatMessage)| Updated ChatMessage details. |

### Return type

[**ChatMessage**](../model-docs/model-doc-ChatMessage)

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
