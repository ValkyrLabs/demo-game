---
title: "ValkyrAI API : TaskApi"
slug: "TaskApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        TaskApi,
        api-docs
    ]
---

# TaskApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTask**](#deleteTask) | **DELETE** TaskApi | Delete a Task. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Task/deleteTask ]**[**getTask**](#getTask) | **GET** TaskApi | Retrieve a single Task | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Task/getTask ]**[**getTaskList**](#getTaskList) | **GET** TaskApi | Retrieve a list of Tasks | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Task/getTaskList ]**[**postTask**](#postTask) | **POST** TaskApi | Create a new Task | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Task/postTask ]**[**updateTask**](#updateTask) | **PUT** TaskApi | Update an existing Task | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Task/updateTask ]**


<a name="deleteTask"></a>
# **deleteTask**
>  <h5>Void</h5> deleteTask(id)

Delete a Task.

Deletes a specific Task.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.TaskApi;


TaskApi apiInstance = new TaskApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Task.

try {
    Void result = apiInstance.deleteTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#deleteTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Task. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTask"></a>
# **getTask**
>  <h5>Task</h5> getTask(id)

Retrieve a single Task

Retrieves a single Task for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.TaskApi;


TaskApi apiInstance = new TaskApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Task.

try {
    Task result = apiInstance.getTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Task. |

### Return type

[**Task**](../model-docs/model-doc-Task)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskList"></a>
# **getTaskList**
>  <h5>Task</h5> getTaskList()

Retrieve a list of Tasks

Retrieves a list of Tasks.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.TaskApi;


TaskApi apiInstance = new TaskApi();

try {
    Task result = apiInstance.getTaskList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTaskList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Task**](../model-docs/model-doc-Task)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postTask"></a>
# **postTask**
>  <h5>Task</h5> postTask(task)

Create a new Task

Creates a new Task.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Task task = new Task(); // Task | Task details.

try {
    Task result = apiInstance.postTask(task);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#postTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task** | [**Task**](Task)| Task details. |

### Return type

[**Task**](../model-docs/model-doc-Task)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTask"></a>
# **updateTask**
>  <h5>Task</h5> updateTask(idtask)

Update an existing Task

Updates an existing Task.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.TaskApi;


TaskApi apiInstance = new TaskApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Task.
Task task = new Task(); // Task | Updated Task details.

try {
    Task result = apiInstance.updateTask(idtask);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#updateTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Task. |
 **task** | [**Task**](Task)| Updated Task details. |

### Return type

[**Task**](../model-docs/model-doc-Task)

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
