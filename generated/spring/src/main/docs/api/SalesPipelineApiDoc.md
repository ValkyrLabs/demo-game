---
title: "ValkyrAI API : SalesPipelineApi"
slug: "SalesPipelineApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        SalesPipelineApi,
        api-docs
    ]
---

# SalesPipelineApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSalesPipeline**](#deleteSalesPipeline) | **DELETE** SalesPipelineApi | Delete a SalesPipeline. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SalesPipeline/deleteSalesPipeline ]**[**getSalesPipeline**](#getSalesPipeline) | **GET** SalesPipelineApi | Retrieve a single SalesPipeline | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SalesPipeline/getSalesPipeline ]**[**getSalesPipelineList**](#getSalesPipelineList) | **GET** SalesPipelineApi | Retrieve a list of SalesPipelines | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SalesPipeline/getSalesPipelineList ]**[**postSalesPipeline**](#postSalesPipeline) | **POST** SalesPipelineApi | Create a new SalesPipeline | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SalesPipeline/postSalesPipeline ]**[**updateSalesPipeline**](#updateSalesPipeline) | **PUT** SalesPipelineApi | Update an existing SalesPipeline | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SalesPipeline/updateSalesPipeline ]**


<a name="deleteSalesPipeline"></a>
# **deleteSalesPipeline**
>  <h5>Void</h5> deleteSalesPipeline(id)

Delete a SalesPipeline.

Deletes a specific SalesPipeline.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SalesPipelineApi;


SalesPipelineApi apiInstance = new SalesPipelineApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the SalesPipeline.

try {
    Void result = apiInstance.deleteSalesPipeline(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesPipelineApi#deleteSalesPipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the SalesPipeline. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSalesPipeline"></a>
# **getSalesPipeline**
>  <h5>SalesPipeline</h5> getSalesPipeline(id)

Retrieve a single SalesPipeline

Retrieves a single SalesPipeline for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SalesPipelineApi;


SalesPipelineApi apiInstance = new SalesPipelineApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the SalesPipeline.

try {
    SalesPipeline result = apiInstance.getSalesPipeline(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesPipelineApi#getSalesPipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the SalesPipeline. |

### Return type

[**SalesPipeline**](../model-docs/model-doc-SalesPipeline)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSalesPipelineList"></a>
# **getSalesPipelineList**
>  <h5>SalesPipeline</h5> getSalesPipelineList()

Retrieve a list of SalesPipelines

Retrieves a list of SalesPipelines.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SalesPipelineApi;


SalesPipelineApi apiInstance = new SalesPipelineApi();

try {
    SalesPipeline result = apiInstance.getSalesPipelineList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesPipelineApi#getSalesPipelineList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SalesPipeline**](../model-docs/model-doc-SalesPipeline)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postSalesPipeline"></a>
# **postSalesPipeline**
>  <h5>SalesPipeline</h5> postSalesPipeline(salesPipeline)

Create a new SalesPipeline

Creates a new SalesPipeline.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SalesPipelineApi;


SalesPipelineApi apiInstance = new SalesPipelineApi();
SalesPipeline salesPipeline = new SalesPipeline(); // SalesPipeline | SalesPipeline details.

try {
    SalesPipeline result = apiInstance.postSalesPipeline(salesPipeline);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesPipelineApi#postSalesPipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesPipeline** | [**SalesPipeline**](SalesPipeline)| SalesPipeline details. |

### Return type

[**SalesPipeline**](../model-docs/model-doc-SalesPipeline)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSalesPipeline"></a>
# **updateSalesPipeline**
>  <h5>SalesPipeline</h5> updateSalesPipeline(idsalesPipeline)

Update an existing SalesPipeline

Updates an existing SalesPipeline.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SalesPipelineApi;


SalesPipelineApi apiInstance = new SalesPipelineApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the SalesPipeline.
SalesPipeline salesPipeline = new SalesPipeline(); // SalesPipeline | Updated SalesPipeline details.

try {
    SalesPipeline result = apiInstance.updateSalesPipeline(idsalesPipeline);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesPipelineApi#updateSalesPipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the SalesPipeline. |
 **salesPipeline** | [**SalesPipeline**](SalesPipeline)| Updated SalesPipeline details. |

### Return type

[**SalesPipeline**](../model-docs/model-doc-SalesPipeline)

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
