---
title: "ValkyrAI API : ContentDataApi"
slug: "ContentDataApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        ContentDataApi,
        api-docs
    ]
---

# ContentDataApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteContentData**](#deleteContentData) | **DELETE** ContentDataApi | Delete a ContentData. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ContentData/deleteContentData ]**[**getContentData**](#getContentData) | **GET** ContentDataApi | Retrieve a single ContentData | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ContentData/getContentData ]**[**getContentDataList**](#getContentDataList) | **GET** ContentDataApi | Retrieve a list of ContentDatas | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ContentData/getContentDataList ]**[**postContentData**](#postContentData) | **POST** ContentDataApi | Create a new ContentData | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ContentData/postContentData ]**[**updateContentData**](#updateContentData) | **PUT** ContentDataApi | Update an existing ContentData | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ContentData/updateContentData ]**


<a name="deleteContentData"></a>
# **deleteContentData**
>  <h5>Void</h5> deleteContentData(id)

Delete a ContentData.

Deletes a specific ContentData.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ContentDataApi;


ContentDataApi apiInstance = new ContentDataApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ContentData.

try {
    Void result = apiInstance.deleteContentData(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentDataApi#deleteContentData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ContentData. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getContentData"></a>
# **getContentData**
>  <h5>ContentData</h5> getContentData(id)

Retrieve a single ContentData

Retrieves a single ContentData for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ContentDataApi;


ContentDataApi apiInstance = new ContentDataApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ContentData.

try {
    ContentData result = apiInstance.getContentData(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentDataApi#getContentData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ContentData. |

### Return type

[**ContentData**](../model-docs/model-doc-ContentData)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContentDataList"></a>
# **getContentDataList**
>  <h5>ContentData</h5> getContentDataList()

Retrieve a list of ContentDatas

Retrieves a list of ContentDatas.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ContentDataApi;


ContentDataApi apiInstance = new ContentDataApi();

try {
    ContentData result = apiInstance.getContentDataList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentDataApi#getContentDataList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContentData**](../model-docs/model-doc-ContentData)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postContentData"></a>
# **postContentData**
>  <h5>ContentData</h5> postContentData(contentData)

Create a new ContentData

Creates a new ContentData.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ContentDataApi;


ContentDataApi apiInstance = new ContentDataApi();
ContentData contentData = new ContentData(); // ContentData | ContentData details.

try {
    ContentData result = apiInstance.postContentData(contentData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentDataApi#postContentData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentData** | [**ContentData**](ContentData)| ContentData details. |

### Return type

[**ContentData**](../model-docs/model-doc-ContentData)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateContentData"></a>
# **updateContentData**
>  <h5>ContentData</h5> updateContentData(idcontentData)

Update an existing ContentData

Updates an existing ContentData.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ContentDataApi;


ContentDataApi apiInstance = new ContentDataApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ContentData.
ContentData contentData = new ContentData(); // ContentData | Updated ContentData details.

try {
    ContentData result = apiInstance.updateContentData(idcontentData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentDataApi#updateContentData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ContentData. |
 **contentData** | [**ContentData**](ContentData)| Updated ContentData details. |

### Return type

[**ContentData**](../model-docs/model-doc-ContentData)

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
