---
title: "ValkyrAI API : WorkflowStateApi"
slug: "WorkflowStateApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        WorkflowStateApi,
        api-docs
    ]
---

# WorkflowStateApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWorkflowState**](#deleteWorkflowState) | **DELETE** WorkflowStateApi | Delete a WorkflowState. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/WorkflowState/deleteWorkflowState ]**[**getWorkflowState**](#getWorkflowState) | **GET** WorkflowStateApi | Retrieve a single WorkflowState | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/WorkflowState/getWorkflowState ]**[**getWorkflowStateList**](#getWorkflowStateList) | **GET** WorkflowStateApi | Retrieve a list of WorkflowStates | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/WorkflowState/getWorkflowStateList ]**[**postWorkflowState**](#postWorkflowState) | **POST** WorkflowStateApi | Create a new WorkflowState | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/WorkflowState/postWorkflowState ]**[**updateWorkflowState**](#updateWorkflowState) | **PUT** WorkflowStateApi | Update an existing WorkflowState | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/WorkflowState/updateWorkflowState ]**


<a name="deleteWorkflowState"></a>
# **deleteWorkflowState**
>  <h5>Void</h5> deleteWorkflowState(id)

Delete a WorkflowState.

Deletes a specific WorkflowState.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WorkflowStateApi;


WorkflowStateApi apiInstance = new WorkflowStateApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the WorkflowState.

try {
    Void result = apiInstance.deleteWorkflowState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowStateApi#deleteWorkflowState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the WorkflowState. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getWorkflowState"></a>
# **getWorkflowState**
>  <h5>WorkflowState</h5> getWorkflowState(id)

Retrieve a single WorkflowState

Retrieves a single WorkflowState for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WorkflowStateApi;


WorkflowStateApi apiInstance = new WorkflowStateApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the WorkflowState.

try {
    WorkflowState result = apiInstance.getWorkflowState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowStateApi#getWorkflowState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the WorkflowState. |

### Return type

[**WorkflowState**](../model-docs/model-doc-WorkflowState)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflowStateList"></a>
# **getWorkflowStateList**
>  <h5>WorkflowState</h5> getWorkflowStateList()

Retrieve a list of WorkflowStates

Retrieves a list of WorkflowStates.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WorkflowStateApi;


WorkflowStateApi apiInstance = new WorkflowStateApi();

try {
    WorkflowState result = apiInstance.getWorkflowStateList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowStateApi#getWorkflowStateList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WorkflowState**](../model-docs/model-doc-WorkflowState)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postWorkflowState"></a>
# **postWorkflowState**
>  <h5>WorkflowState</h5> postWorkflowState(workflowState)

Create a new WorkflowState

Creates a new WorkflowState.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WorkflowStateApi;


WorkflowStateApi apiInstance = new WorkflowStateApi();
WorkflowState workflowState = new WorkflowState(); // WorkflowState | WorkflowState details.

try {
    WorkflowState result = apiInstance.postWorkflowState(workflowState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowStateApi#postWorkflowState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowState** | [**WorkflowState**](WorkflowState)| WorkflowState details. |

### Return type

[**WorkflowState**](../model-docs/model-doc-WorkflowState)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorkflowState"></a>
# **updateWorkflowState**
>  <h5>WorkflowState</h5> updateWorkflowState(idworkflowState)

Update an existing WorkflowState

Updates an existing WorkflowState.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WorkflowStateApi;


WorkflowStateApi apiInstance = new WorkflowStateApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the WorkflowState.
WorkflowState workflowState = new WorkflowState(); // WorkflowState | Updated WorkflowState details.

try {
    WorkflowState result = apiInstance.updateWorkflowState(idworkflowState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowStateApi#updateWorkflowState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the WorkflowState. |
 **workflowState** | [**WorkflowState**](WorkflowState)| Updated WorkflowState details. |

### Return type

[**WorkflowState**](../model-docs/model-doc-WorkflowState)

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
