---
title: "ValkyrAI API : ApplicationApi"
slug: "ApplicationApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        ApplicationApi,
        api-docs
    ]
---

# ApplicationApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteApplication**](#deleteApplication) | **DELETE** ApplicationApi | Delete a Application. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Application/deleteApplication ]**[**getApplication**](#getApplication) | **GET** ApplicationApi | Retrieve a single Application | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Application/getApplication ]**[**getApplicationList**](#getApplicationList) | **GET** ApplicationApi | Retrieve a list of Applications | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Application/getApplicationList ]**[**postApplication**](#postApplication) | **POST** ApplicationApi | Create a new Application | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Application/postApplication ]**[**updateApplication**](#updateApplication) | **PUT** ApplicationApi | Update an existing Application | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Application/updateApplication ]**


<a name="deleteApplication"></a>
# **deleteApplication**
>  <h5>Void</h5> deleteApplication(id)

Delete a Application.

Deletes a specific Application.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Application.

try {
    Void result = apiInstance.deleteApplication(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#deleteApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Application. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getApplication"></a>
# **getApplication**
>  <h5>Application</h5> getApplication(id)

Retrieve a single Application

Retrieves a single Application for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Application.

try {
    Application result = apiInstance.getApplication(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Application. |

### Return type

[**Application**](../model-docs/model-doc-Application)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getApplicationList"></a>
# **getApplicationList**
>  <h5>Application</h5> getApplicationList()

Retrieve a list of Applications

Retrieves a list of Applications.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();

try {
    Application result = apiInstance.getApplicationList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getApplicationList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Application**](../model-docs/model-doc-Application)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postApplication"></a>
# **postApplication**
>  <h5>Application</h5> postApplication(application)

Create a new Application

Creates a new Application.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Application application = new Application(); // Application | Application details.

try {
    Application result = apiInstance.postApplication(application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#postApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | [**Application**](Application)| Application details. |

### Return type

[**Application**](../model-docs/model-doc-Application)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateApplication"></a>
# **updateApplication**
>  <h5>Application</h5> updateApplication(idapplication)

Update an existing Application

Updates an existing Application.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Application.
Application application = new Application(); // Application | Updated Application details.

try {
    Application result = apiInstance.updateApplication(idapplication);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#updateApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Application. |
 **application** | [**Application**](Application)| Updated Application details. |

### Return type

[**Application**](../model-docs/model-doc-Application)

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
