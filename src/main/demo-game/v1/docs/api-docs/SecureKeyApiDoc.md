---
title: "ValkyrAI API : SecureKeyApi"
slug: "SecureKeyApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        SecureKeyApi,
        api-docs
    ]
---

# SecureKeyApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSecureKey**](#deleteSecureKey) | **DELETE** SecureKeyApi | Delete a SecureKey. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SecureKey/deleteSecureKey ]**[**getSecureKey**](#getSecureKey) | **GET** SecureKeyApi | Retrieve a single SecureKey | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SecureKey/getSecureKey ]**[**getSecureKeyList**](#getSecureKeyList) | **GET** SecureKeyApi | Retrieve a list of SecureKeys | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SecureKey/getSecureKeyList ]**[**postSecureKey**](#postSecureKey) | **POST** SecureKeyApi | Create a new SecureKey | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SecureKey/postSecureKey ]**[**updateSecureKey**](#updateSecureKey) | **PUT** SecureKeyApi | Update an existing SecureKey | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/SecureKey/updateSecureKey ]**


<a name="deleteSecureKey"></a>
# **deleteSecureKey**
>  <h5>Void</h5> deleteSecureKey(id)

Delete a SecureKey.

Deletes a specific SecureKey.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SecureKeyApi;


SecureKeyApi apiInstance = new SecureKeyApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the SecureKey.

try {
    Void result = apiInstance.deleteSecureKey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecureKeyApi#deleteSecureKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the SecureKey. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSecureKey"></a>
# **getSecureKey**
>  <h5>SecureKey</h5> getSecureKey(id)

Retrieve a single SecureKey

Retrieves a single SecureKey for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SecureKeyApi;


SecureKeyApi apiInstance = new SecureKeyApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the SecureKey.

try {
    SecureKey result = apiInstance.getSecureKey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecureKeyApi#getSecureKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the SecureKey. |

### Return type

[**SecureKey**](../model-docs/model-doc-SecureKey)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSecureKeyList"></a>
# **getSecureKeyList**
>  <h5>SecureKey</h5> getSecureKeyList()

Retrieve a list of SecureKeys

Retrieves a list of SecureKeys.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SecureKeyApi;


SecureKeyApi apiInstance = new SecureKeyApi();

try {
    SecureKey result = apiInstance.getSecureKeyList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecureKeyApi#getSecureKeyList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SecureKey**](../model-docs/model-doc-SecureKey)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postSecureKey"></a>
# **postSecureKey**
>  <h5>SecureKey</h5> postSecureKey(secureKey)

Create a new SecureKey

Creates a new SecureKey.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SecureKeyApi;


SecureKeyApi apiInstance = new SecureKeyApi();
SecureKey secureKey = new SecureKey(); // SecureKey | SecureKey details.

try {
    SecureKey result = apiInstance.postSecureKey(secureKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecureKeyApi#postSecureKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secureKey** | [**SecureKey**](SecureKey)| SecureKey details. |

### Return type

[**SecureKey**](../model-docs/model-doc-SecureKey)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSecureKey"></a>
# **updateSecureKey**
>  <h5>SecureKey</h5> updateSecureKey(idsecureKey)

Update an existing SecureKey

Updates an existing SecureKey.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.SecureKeyApi;


SecureKeyApi apiInstance = new SecureKeyApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the SecureKey.
SecureKey secureKey = new SecureKey(); // SecureKey | Updated SecureKey details.

try {
    SecureKey result = apiInstance.updateSecureKey(idsecureKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecureKeyApi#updateSecureKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the SecureKey. |
 **secureKey** | [**SecureKey**](SecureKey)| Updated SecureKey details. |

### Return type

[**SecureKey**](../model-docs/model-doc-SecureKey)

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
