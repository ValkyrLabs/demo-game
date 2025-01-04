---
title: "ValkyrAI API : ContentMediaLinkApi"
slug: "ContentMediaLinkApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        ContentMediaLinkApi,
        api-docs
    ]
---

# ContentMediaLinkApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteContentMediaLink**](#deleteContentMediaLink) | **DELETE** ContentMediaLinkApi | Delete a ContentMediaLink. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ContentMediaLink/deleteContentMediaLink ]**[**getContentMediaLink**](#getContentMediaLink) | **GET** ContentMediaLinkApi | Retrieve a single ContentMediaLink | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ContentMediaLink/getContentMediaLink ]**[**getContentMediaLinkList**](#getContentMediaLinkList) | **GET** ContentMediaLinkApi | Retrieve a list of ContentMediaLinks | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ContentMediaLink/getContentMediaLinkList ]**[**postContentMediaLink**](#postContentMediaLink) | **POST** ContentMediaLinkApi | Create a new ContentMediaLink | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ContentMediaLink/postContentMediaLink ]**[**updateContentMediaLink**](#updateContentMediaLink) | **PUT** ContentMediaLinkApi | Update an existing ContentMediaLink | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ContentMediaLink/updateContentMediaLink ]**


<a name="deleteContentMediaLink"></a>
# **deleteContentMediaLink**
>  <h5>Void</h5> deleteContentMediaLink(id)

Delete a ContentMediaLink.

Deletes a specific ContentMediaLink.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ContentMediaLinkApi;


ContentMediaLinkApi apiInstance = new ContentMediaLinkApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ContentMediaLink.

try {
    Void result = apiInstance.deleteContentMediaLink(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentMediaLinkApi#deleteContentMediaLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ContentMediaLink. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getContentMediaLink"></a>
# **getContentMediaLink**
>  <h5>ContentMediaLink</h5> getContentMediaLink(id)

Retrieve a single ContentMediaLink

Retrieves a single ContentMediaLink for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ContentMediaLinkApi;


ContentMediaLinkApi apiInstance = new ContentMediaLinkApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ContentMediaLink.

try {
    ContentMediaLink result = apiInstance.getContentMediaLink(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentMediaLinkApi#getContentMediaLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ContentMediaLink. |

### Return type

[**ContentMediaLink**](../model-docs/model-doc-ContentMediaLink)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContentMediaLinkList"></a>
# **getContentMediaLinkList**
>  <h5>ContentMediaLink</h5> getContentMediaLinkList()

Retrieve a list of ContentMediaLinks

Retrieves a list of ContentMediaLinks.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ContentMediaLinkApi;


ContentMediaLinkApi apiInstance = new ContentMediaLinkApi();

try {
    ContentMediaLink result = apiInstance.getContentMediaLinkList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentMediaLinkApi#getContentMediaLinkList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContentMediaLink**](../model-docs/model-doc-ContentMediaLink)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postContentMediaLink"></a>
# **postContentMediaLink**
>  <h5>ContentMediaLink</h5> postContentMediaLink(contentMediaLink)

Create a new ContentMediaLink

Creates a new ContentMediaLink.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ContentMediaLinkApi;


ContentMediaLinkApi apiInstance = new ContentMediaLinkApi();
ContentMediaLink contentMediaLink = new ContentMediaLink(); // ContentMediaLink | ContentMediaLink details.

try {
    ContentMediaLink result = apiInstance.postContentMediaLink(contentMediaLink);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentMediaLinkApi#postContentMediaLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentMediaLink** | [**ContentMediaLink**](ContentMediaLink)| ContentMediaLink details. |

### Return type

[**ContentMediaLink**](../model-docs/model-doc-ContentMediaLink)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateContentMediaLink"></a>
# **updateContentMediaLink**
>  <h5>ContentMediaLink</h5> updateContentMediaLink(idcontentMediaLink)

Update an existing ContentMediaLink

Updates an existing ContentMediaLink.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ContentMediaLinkApi;


ContentMediaLinkApi apiInstance = new ContentMediaLinkApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ContentMediaLink.
ContentMediaLink contentMediaLink = new ContentMediaLink(); // ContentMediaLink | Updated ContentMediaLink details.

try {
    ContentMediaLink result = apiInstance.updateContentMediaLink(idcontentMediaLink);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentMediaLinkApi#updateContentMediaLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ContentMediaLink. |
 **contentMediaLink** | [**ContentMediaLink**](ContentMediaLink)| Updated ContentMediaLink details. |

### Return type

[**ContentMediaLink**](../model-docs/model-doc-ContentMediaLink)

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
