---
title: "ValkyrAI API : SalesActivityApi"
slug: "SalesActivityApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        SalesActivityApi,
        api-docs
    ]
---

# SalesActivityApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSalesActivity**](#deleteSalesActivity) | **DELETE** SalesActivityApi | Delete a SalesActivity. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SalesActivity/deleteSalesActivity ]**[**getSalesActivity**](#getSalesActivity) | **GET** SalesActivityApi | Retrieve a single SalesActivity | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SalesActivity/getSalesActivity ]**[**getSalesActivityList**](#getSalesActivityList) | **GET** SalesActivityApi | Retrieve a list of SalesActivitys | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SalesActivity/getSalesActivityList ]**[**postSalesActivity**](#postSalesActivity) | **POST** SalesActivityApi | Create a new SalesActivity | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SalesActivity/postSalesActivity ]**[**updateSalesActivity**](#updateSalesActivity) | **PUT** SalesActivityApi | Update an existing SalesActivity | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SalesActivity/updateSalesActivity ]**


<a name="deleteSalesActivity"></a>
# **deleteSalesActivity**
>  <h5>Void</h5> deleteSalesActivity(id)

Delete a SalesActivity.

Deletes a specific SalesActivity.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SalesActivityApi;


SalesActivityApi apiInstance = new SalesActivityApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the SalesActivity.

try {
    Void result = apiInstance.deleteSalesActivity(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesActivityApi#deleteSalesActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the SalesActivity. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSalesActivity"></a>
# **getSalesActivity**
>  <h5>SalesActivity</h5> getSalesActivity(id)

Retrieve a single SalesActivity

Retrieves a single SalesActivity for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SalesActivityApi;


SalesActivityApi apiInstance = new SalesActivityApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the SalesActivity.

try {
    SalesActivity result = apiInstance.getSalesActivity(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesActivityApi#getSalesActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the SalesActivity. |

### Return type

[**SalesActivity**](../model-docs/model-doc-SalesActivity)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSalesActivityList"></a>
# **getSalesActivityList**
>  <h5>SalesActivity</h5> getSalesActivityList()

Retrieve a list of SalesActivitys

Retrieves a list of SalesActivitys.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SalesActivityApi;


SalesActivityApi apiInstance = new SalesActivityApi();

try {
    SalesActivity result = apiInstance.getSalesActivityList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesActivityApi#getSalesActivityList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SalesActivity**](../model-docs/model-doc-SalesActivity)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postSalesActivity"></a>
# **postSalesActivity**
>  <h5>SalesActivity</h5> postSalesActivity(salesActivity)

Create a new SalesActivity

Creates a new SalesActivity.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SalesActivityApi;


SalesActivityApi apiInstance = new SalesActivityApi();
SalesActivity salesActivity = new SalesActivity(); // SalesActivity | SalesActivity details.

try {
    SalesActivity result = apiInstance.postSalesActivity(salesActivity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesActivityApi#postSalesActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesActivity** | [**SalesActivity**](SalesActivity)| SalesActivity details. |

### Return type

[**SalesActivity**](../model-docs/model-doc-SalesActivity)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSalesActivity"></a>
# **updateSalesActivity**
>  <h5>SalesActivity</h5> updateSalesActivity(idsalesActivity)

Update an existing SalesActivity

Updates an existing SalesActivity.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SalesActivityApi;


SalesActivityApi apiInstance = new SalesActivityApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the SalesActivity.
SalesActivity salesActivity = new SalesActivity(); // SalesActivity | Updated SalesActivity details.

try {
    SalesActivity result = apiInstance.updateSalesActivity(idsalesActivity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesActivityApi#updateSalesActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the SalesActivity. |
 **salesActivity** | [**SalesActivity**](SalesActivity)| Updated SalesActivity details. |

### Return type

[**SalesActivity**](../model-docs/model-doc-SalesActivity)

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
