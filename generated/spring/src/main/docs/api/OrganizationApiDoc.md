---
title: "ValkyrAI API : OrganizationApi"
slug: "OrganizationApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        OrganizationApi,
        api-docs
    ]
---

# OrganizationApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrganization**](#deleteOrganization) | **DELETE** OrganizationApi | Delete a Organization. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Organization/deleteOrganization ]**[**getOrganization**](#getOrganization) | **GET** OrganizationApi | Retrieve a single Organization | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Organization/getOrganization ]**[**getOrganizationList**](#getOrganizationList) | **GET** OrganizationApi | Retrieve a list of Organizations | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Organization/getOrganizationList ]**[**postOrganization**](#postOrganization) | **POST** OrganizationApi | Create a new Organization | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Organization/postOrganization ]**[**updateOrganization**](#updateOrganization) | **PUT** OrganizationApi | Update an existing Organization | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Organization/updateOrganization ]**


<a name="deleteOrganization"></a>
# **deleteOrganization**
>  <h5>Void</h5> deleteOrganization(id)

Delete a Organization.

Deletes a specific Organization.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Organization.

try {
    Void result = apiInstance.deleteOrganization(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#deleteOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Organization. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOrganization"></a>
# **getOrganization**
>  <h5>Organization</h5> getOrganization(id)

Retrieve a single Organization

Retrieves a single Organization for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Organization.

try {
    Organization result = apiInstance.getOrganization(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Organization. |

### Return type

[**Organization**](../model-docs/model-doc-Organization)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationList"></a>
# **getOrganizationList**
>  <h5>Organization</h5> getOrganizationList()

Retrieve a list of Organizations

Retrieves a list of Organizations.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();

try {
    Organization result = apiInstance.getOrganizationList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Organization**](../model-docs/model-doc-Organization)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postOrganization"></a>
# **postOrganization**
>  <h5>Organization</h5> postOrganization(organization)

Create a new Organization

Creates a new Organization.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
Organization organization = new Organization(); // Organization | Organization details.

try {
    Organization result = apiInstance.postOrganization(organization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#postOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | [**Organization**](Organization)| Organization details. |

### Return type

[**Organization**](../model-docs/model-doc-Organization)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrganization"></a>
# **updateOrganization**
>  <h5>Organization</h5> updateOrganization(idorganization)

Update an existing Organization

Updates an existing Organization.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Organization.
Organization organization = new Organization(); // Organization | Updated Organization details.

try {
    Organization result = apiInstance.updateOrganization(idorganization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#updateOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Organization. |
 **organization** | [**Organization**](Organization)| Updated Organization details. |

### Return type

[**Organization**](../model-docs/model-doc-Organization)

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
