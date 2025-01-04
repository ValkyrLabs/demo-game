---
title: "ValkyrAI API : LogoutApi"
slug: "LogoutApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        LogoutApi,
        api-docs
    ]
---

# LogoutApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLogout**](#deleteLogout) | **DELETE** LogoutApi | Delete a Logout. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Logout/deleteLogout ]**[**getLogout**](#getLogout) | **GET** LogoutApi | Retrieve a single Logout | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Logout/getLogout ]**[**getLogoutList**](#getLogoutList) | **GET** LogoutApi | Retrieve a list of Logouts | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Logout/getLogoutList ]**[**postLogout**](#postLogout) | **POST** LogoutApi | Create a new Logout | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Logout/postLogout ]**[**updateLogout**](#updateLogout) | **PUT** LogoutApi | Update an existing Logout | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Logout/updateLogout ]**


<a name="deleteLogout"></a>
# **deleteLogout**
>  <h5>Void</h5> deleteLogout(id)

Delete a Logout.

Deletes a specific Logout.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LogoutApi;


LogoutApi apiInstance = new LogoutApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Logout.

try {
    Void result = apiInstance.deleteLogout(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogoutApi#deleteLogout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Logout. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getLogout"></a>
# **getLogout**
>  <h5>Logout</h5> getLogout(id)

Retrieve a single Logout

Retrieves a single Logout for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LogoutApi;


LogoutApi apiInstance = new LogoutApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Logout.

try {
    Logout result = apiInstance.getLogout(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogoutApi#getLogout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Logout. |

### Return type

[**Logout**](../model-docs/model-doc-Logout)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogoutList"></a>
# **getLogoutList**
>  <h5>Logout</h5> getLogoutList()

Retrieve a list of Logouts

Retrieves a list of Logouts.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LogoutApi;


LogoutApi apiInstance = new LogoutApi();

try {
    Logout result = apiInstance.getLogoutList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogoutApi#getLogoutList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Logout**](../model-docs/model-doc-Logout)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postLogout"></a>
# **postLogout**
>  <h5>Logout</h5> postLogout(logout)

Create a new Logout

Creates a new Logout.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LogoutApi;


LogoutApi apiInstance = new LogoutApi();
Logout logout = new Logout(); // Logout | Logout details.

try {
    Logout result = apiInstance.postLogout(logout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogoutApi#postLogout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logout** | [**Logout**](Logout)| Logout details. |

### Return type

[**Logout**](../model-docs/model-doc-Logout)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLogout"></a>
# **updateLogout**
>  <h5>Logout</h5> updateLogout(idlogout)

Update an existing Logout

Updates an existing Logout.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LogoutApi;


LogoutApi apiInstance = new LogoutApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Logout.
Logout logout = new Logout(); // Logout | Updated Logout details.

try {
    Logout result = apiInstance.updateLogout(idlogout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogoutApi#updateLogout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Logout. |
 **logout** | [**Logout**](Logout)| Updated Logout details. |

### Return type

[**Logout**](../model-docs/model-doc-Logout)

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
