---
title: "ValkyrAI API : WorkflowApi"
slug: "WorkflowApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        WorkflowApi,
        api-docs
    ]
---

# WorkflowApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWorkflow**](#deleteWorkflow) | **DELETE** WorkflowApi | Delete a Workflow. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Workflow/deleteWorkflow ]**[**getWorkflow**](#getWorkflow) | **GET** WorkflowApi | Retrieve a single Workflow | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Workflow/getWorkflow ]**[**getWorkflowList**](#getWorkflowList) | **GET** WorkflowApi | Retrieve a list of Workflows | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Workflow/getWorkflowList ]**[**postWorkflow**](#postWorkflow) | **POST** WorkflowApi | Create a new Workflow | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Workflow/postWorkflow ]**[**updateWorkflow**](#updateWorkflow) | **PUT** WorkflowApi | Update an existing Workflow | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Workflow/updateWorkflow ]**


<a name="deleteWorkflow"></a>
# **deleteWorkflow**
>  <h5>Void</h5> deleteWorkflow(id)

Delete a Workflow.

Deletes a specific Workflow.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WorkflowApi;


WorkflowApi apiInstance = new WorkflowApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Workflow.

try {
    Void result = apiInstance.deleteWorkflow(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#deleteWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Workflow. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getWorkflow"></a>
# **getWorkflow**
>  <h5>Workflow</h5> getWorkflow(id)

Retrieve a single Workflow

Retrieves a single Workflow for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WorkflowApi;


WorkflowApi apiInstance = new WorkflowApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Workflow.

try {
    Workflow result = apiInstance.getWorkflow(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Workflow. |

### Return type

[**Workflow**](../model-docs/model-doc-Workflow)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflowList"></a>
# **getWorkflowList**
>  <h5>Workflow</h5> getWorkflowList()

Retrieve a list of Workflows

Retrieves a list of Workflows.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WorkflowApi;


WorkflowApi apiInstance = new WorkflowApi();

try {
    Workflow result = apiInstance.getWorkflowList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflowList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Workflow**](../model-docs/model-doc-Workflow)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postWorkflow"></a>
# **postWorkflow**
>  <h5>Workflow</h5> postWorkflow(workflow)

Create a new Workflow

Creates a new Workflow.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WorkflowApi;


WorkflowApi apiInstance = new WorkflowApi();
Workflow workflow = new Workflow(); // Workflow | Workflow details.

try {
    Workflow result = apiInstance.postWorkflow(workflow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#postWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflow** | [**Workflow**](Workflow)| Workflow details. |

### Return type

[**Workflow**](../model-docs/model-doc-Workflow)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorkflow"></a>
# **updateWorkflow**
>  <h5>Workflow</h5> updateWorkflow(idworkflow)

Update an existing Workflow

Updates an existing Workflow.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WorkflowApi;


WorkflowApi apiInstance = new WorkflowApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Workflow.
Workflow workflow = new Workflow(); // Workflow | Updated Workflow details.

try {
    Workflow result = apiInstance.updateWorkflow(idworkflow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#updateWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Workflow. |
 **workflow** | [**Workflow**](Workflow)| Updated Workflow details. |

### Return type

[**Workflow**](../model-docs/model-doc-Workflow)

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
