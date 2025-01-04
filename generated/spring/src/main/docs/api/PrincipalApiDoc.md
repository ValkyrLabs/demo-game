---
title: "ValkyrAI API : PrincipalApi"
slug: "PrincipalApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        PrincipalApi,
        api-docs
    ]
---

# PrincipalApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePrincipal**](#deletePrincipal) | **DELETE** PrincipalApi | Delete a Principal. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Principal/deletePrincipal ]**[**getPrincipal**](#getPrincipal) | **GET** PrincipalApi | Retrieve a single Principal | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Principal/getPrincipal ]**[**getPrincipalList**](#getPrincipalList) | **GET** PrincipalApi | Retrieve a list of Principals | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Principal/getPrincipalList ]**[**postPrincipal**](#postPrincipal) | **POST** PrincipalApi | Create a new Principal | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Principal/postPrincipal ]**[**updatePrincipal**](#updatePrincipal) | **PUT** PrincipalApi | Update an existing Principal | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Principal/updatePrincipal ]**


<a name="deletePrincipal"></a>
# **deletePrincipal**
>  <h5>Void</h5> deletePrincipal(id)

Delete a Principal.

Deletes a specific Principal.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.PrincipalApi;


PrincipalApi apiInstance = new PrincipalApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Principal.

try {
    Void result = apiInstance.deletePrincipal(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrincipalApi#deletePrincipal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Principal. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPrincipal"></a>
# **getPrincipal**
>  <h5>Principal</h5> getPrincipal(id)

Retrieve a single Principal

Retrieves a single Principal for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.PrincipalApi;


PrincipalApi apiInstance = new PrincipalApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Principal.

try {
    Principal result = apiInstance.getPrincipal(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrincipalApi#getPrincipal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Principal. |

### Return type

[**Principal**](../model-docs/model-doc-Principal)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPrincipalList"></a>
# **getPrincipalList**
>  <h5>Principal</h5> getPrincipalList()

Retrieve a list of Principals

Retrieves a list of Principals.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.PrincipalApi;


PrincipalApi apiInstance = new PrincipalApi();

try {
    Principal result = apiInstance.getPrincipalList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrincipalApi#getPrincipalList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Principal**](../model-docs/model-doc-Principal)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postPrincipal"></a>
# **postPrincipal**
>  <h5>Principal</h5> postPrincipal(principal)

Create a new Principal

Creates a new Principal.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.PrincipalApi;


PrincipalApi apiInstance = new PrincipalApi();
Principal principal = new Principal(); // Principal | Principal details.

try {
    Principal result = apiInstance.postPrincipal(principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrincipalApi#postPrincipal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **principal** | [**Principal**](Principal)| Principal details. |

### Return type

[**Principal**](../model-docs/model-doc-Principal)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePrincipal"></a>
# **updatePrincipal**
>  <h5>Principal</h5> updatePrincipal(idprincipal)

Update an existing Principal

Updates an existing Principal.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.PrincipalApi;


PrincipalApi apiInstance = new PrincipalApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Principal.
Principal principal = new Principal(); // Principal | Updated Principal details.

try {
    Principal result = apiInstance.updatePrincipal(idprincipal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrincipalApi#updatePrincipal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Principal. |
 **principal** | [**Principal**](Principal)| Updated Principal details. |

### Return type

[**Principal**](../model-docs/model-doc-Principal)

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
