---
title: "ValkyrAI API : ExecModuleApi"
slug: "ExecModuleApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        ExecModuleApi,
        api-docs
    ]
---

# ExecModuleApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteExecModule**](#deleteExecModule) | **DELETE** ExecModuleApi | Delete a ExecModule. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ExecModule/deleteExecModule ]**[**getExecModule**](#getExecModule) | **GET** ExecModuleApi | Retrieve a single ExecModule | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ExecModule/getExecModule ]**[**getExecModuleList**](#getExecModuleList) | **GET** ExecModuleApi | Retrieve a list of ExecModules | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ExecModule/getExecModuleList ]**[**postExecModule**](#postExecModule) | **POST** ExecModuleApi | Create a new ExecModule | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ExecModule/postExecModule ]**[**updateExecModule**](#updateExecModule) | **PUT** ExecModuleApi | Update an existing ExecModule | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/ExecModule/updateExecModule ]**


<a name="deleteExecModule"></a>
# **deleteExecModule**
>  <h5>Void</h5> deleteExecModule(id)

Delete a ExecModule.

Deletes a specific ExecModule.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ExecModuleApi;


ExecModuleApi apiInstance = new ExecModuleApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ExecModule.

try {
    Void result = apiInstance.deleteExecModule(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecModuleApi#deleteExecModule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ExecModule. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getExecModule"></a>
# **getExecModule**
>  <h5>ExecModule</h5> getExecModule(id)

Retrieve a single ExecModule

Retrieves a single ExecModule for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ExecModuleApi;


ExecModuleApi apiInstance = new ExecModuleApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ExecModule.

try {
    ExecModule result = apiInstance.getExecModule(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecModuleApi#getExecModule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ExecModule. |

### Return type

[**ExecModule**](../model-docs/model-doc-ExecModule)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExecModuleList"></a>
# **getExecModuleList**
>  <h5>ExecModule</h5> getExecModuleList()

Retrieve a list of ExecModules

Retrieves a list of ExecModules.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ExecModuleApi;


ExecModuleApi apiInstance = new ExecModuleApi();

try {
    ExecModule result = apiInstance.getExecModuleList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecModuleApi#getExecModuleList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ExecModule**](../model-docs/model-doc-ExecModule)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postExecModule"></a>
# **postExecModule**
>  <h5>ExecModule</h5> postExecModule(execModule)

Create a new ExecModule

Creates a new ExecModule.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ExecModuleApi;


ExecModuleApi apiInstance = new ExecModuleApi();
ExecModule execModule = new ExecModule(); // ExecModule | ExecModule details.

try {
    ExecModule result = apiInstance.postExecModule(execModule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecModuleApi#postExecModule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **execModule** | [**ExecModule**](ExecModule)| ExecModule details. |

### Return type

[**ExecModule**](../model-docs/model-doc-ExecModule)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateExecModule"></a>
# **updateExecModule**
>  <h5>ExecModule</h5> updateExecModule(idexecModule)

Update an existing ExecModule

Updates an existing ExecModule.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ExecModuleApi;


ExecModuleApi apiInstance = new ExecModuleApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the ExecModule.
ExecModule execModule = new ExecModule(); // ExecModule | Updated ExecModule details.

try {
    ExecModule result = apiInstance.updateExecModule(idexecModule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecModuleApi#updateExecModule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the ExecModule. |
 **execModule** | [**ExecModule**](ExecModule)| Updated ExecModule details. |

### Return type

[**ExecModule**](../model-docs/model-doc-ExecModule)

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
