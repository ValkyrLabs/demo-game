---
title: "ValkyrAI API : RoleApi"
slug: "RoleApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        RoleApi,
        api-docs
    ]
---

# RoleApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRole**](#deleteRole) | **DELETE** RoleApi | Delete a Role. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Role/deleteRole ]**[**getRole**](#getRole) | **GET** RoleApi | Retrieve a single Role | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Role/getRole ]**[**getRoleList**](#getRoleList) | **GET** RoleApi | Retrieve a list of Roles | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Role/getRoleList ]**[**postRole**](#postRole) | **POST** RoleApi | Create a new Role | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Role/postRole ]**[**updateRole**](#updateRole) | **PUT** RoleApi | Update an existing Role | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Role/updateRole ]**


<a name="deleteRole"></a>
# **deleteRole**
>  <h5>Void</h5> deleteRole(id)

Delete a Role.

Deletes a specific Role.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.RoleApi;


RoleApi apiInstance = new RoleApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Role.

try {
    Void result = apiInstance.deleteRole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#deleteRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Role. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRole"></a>
# **getRole**
>  <h5>Role</h5> getRole(id)

Retrieve a single Role

Retrieves a single Role for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.RoleApi;


RoleApi apiInstance = new RoleApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Role.

try {
    Role result = apiInstance.getRole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#getRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Role. |

### Return type

[**Role**](../model-docs/model-doc-Role)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRoleList"></a>
# **getRoleList**
>  <h5>Role</h5> getRoleList()

Retrieve a list of Roles

Retrieves a list of Roles.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.RoleApi;


RoleApi apiInstance = new RoleApi();

try {
    Role result = apiInstance.getRoleList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#getRoleList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Role**](../model-docs/model-doc-Role)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postRole"></a>
# **postRole**
>  <h5>Role</h5> postRole(role)

Create a new Role

Creates a new Role.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Role role = new Role(); // Role | Role details.

try {
    Role result = apiInstance.postRole(role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#postRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | [**Role**](Role)| Role details. |

### Return type

[**Role**](../model-docs/model-doc-Role)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRole"></a>
# **updateRole**
>  <h5>Role</h5> updateRole(idrole)

Update an existing Role

Updates an existing Role.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.RoleApi;


RoleApi apiInstance = new RoleApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Role.
Role role = new Role(); // Role | Updated Role details.

try {
    Role result = apiInstance.updateRole(idrole);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#updateRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Role. |
 **role** | [**Role**](Role)| Updated Role details. |

### Return type

[**Role**](../model-docs/model-doc-Role)

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
