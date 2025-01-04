---
title: "ValkyrAI API : AclEntryApi"
slug: "AclEntryApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        AclEntryApi,
        api-docs
    ]
---

# AclEntryApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAclEntry**](#deleteAclEntry) | **DELETE** AclEntryApi | Delete a AclEntry. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/AclEntry/deleteAclEntry ]**[**getAclEntry**](#getAclEntry) | **GET** AclEntryApi | Retrieve a single AclEntry | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/AclEntry/getAclEntry ]**[**getAclEntryList**](#getAclEntryList) | **GET** AclEntryApi | Retrieve a list of AclEntrys | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/AclEntry/getAclEntryList ]**[**postAclEntry**](#postAclEntry) | **POST** AclEntryApi | Create a new AclEntry | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/AclEntry/postAclEntry ]**[**updateAclEntry**](#updateAclEntry) | **PUT** AclEntryApi | Update an existing AclEntry | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/AclEntry/updateAclEntry ]**


<a name="deleteAclEntry"></a>
# **deleteAclEntry**
>  <h5>Void</h5> deleteAclEntry(id)

Delete a AclEntry.

Deletes a specific AclEntry.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AclEntryApi;


AclEntryApi apiInstance = new AclEntryApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the AclEntry.

try {
    Void result = apiInstance.deleteAclEntry(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclEntryApi#deleteAclEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the AclEntry. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAclEntry"></a>
# **getAclEntry**
>  <h5>AclEntry</h5> getAclEntry(id)

Retrieve a single AclEntry

Retrieves a single AclEntry for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AclEntryApi;


AclEntryApi apiInstance = new AclEntryApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the AclEntry.

try {
    AclEntry result = apiInstance.getAclEntry(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclEntryApi#getAclEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the AclEntry. |

### Return type

[**AclEntry**](../model-docs/model-doc-AclEntry)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAclEntryList"></a>
# **getAclEntryList**
>  <h5>AclEntry</h5> getAclEntryList()

Retrieve a list of AclEntrys

Retrieves a list of AclEntrys.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AclEntryApi;


AclEntryApi apiInstance = new AclEntryApi();

try {
    AclEntry result = apiInstance.getAclEntryList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclEntryApi#getAclEntryList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AclEntry**](../model-docs/model-doc-AclEntry)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postAclEntry"></a>
# **postAclEntry**
>  <h5>AclEntry</h5> postAclEntry(aclEntry)

Create a new AclEntry

Creates a new AclEntry.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AclEntryApi;


AclEntryApi apiInstance = new AclEntryApi();
AclEntry aclEntry = new AclEntry(); // AclEntry | AclEntry details.

try {
    AclEntry result = apiInstance.postAclEntry(aclEntry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclEntryApi#postAclEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aclEntry** | [**AclEntry**](AclEntry)| AclEntry details. |

### Return type

[**AclEntry**](../model-docs/model-doc-AclEntry)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAclEntry"></a>
# **updateAclEntry**
>  <h5>AclEntry</h5> updateAclEntry(idaclEntry)

Update an existing AclEntry

Updates an existing AclEntry.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AclEntryApi;


AclEntryApi apiInstance = new AclEntryApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the AclEntry.
AclEntry aclEntry = new AclEntry(); // AclEntry | Updated AclEntry details.

try {
    AclEntry result = apiInstance.updateAclEntry(idaclEntry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclEntryApi#updateAclEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the AclEntry. |
 **aclEntry** | [**AclEntry**](AclEntry)| Updated AclEntry details. |

### Return type

[**AclEntry**](../model-docs/model-doc-AclEntry)

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
