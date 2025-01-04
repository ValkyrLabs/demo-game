---
title: "ValkyrAI API : IntegrationAccountApi"
slug: "IntegrationAccountApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        IntegrationAccountApi,
        api-docs
    ]
---

# IntegrationAccountApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteIntegrationAccount**](#deleteIntegrationAccount) | **DELETE** IntegrationAccountApi | Delete a IntegrationAccount. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/IntegrationAccount/deleteIntegrationAccount ]**[**getIntegrationAccount**](#getIntegrationAccount) | **GET** IntegrationAccountApi | Retrieve a single IntegrationAccount | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/IntegrationAccount/getIntegrationAccount ]**[**getIntegrationAccountList**](#getIntegrationAccountList) | **GET** IntegrationAccountApi | Retrieve a list of IntegrationAccounts | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/IntegrationAccount/getIntegrationAccountList ]**[**postIntegrationAccount**](#postIntegrationAccount) | **POST** IntegrationAccountApi | Create a new IntegrationAccount | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/IntegrationAccount/postIntegrationAccount ]**[**updateIntegrationAccount**](#updateIntegrationAccount) | **PUT** IntegrationAccountApi | Update an existing IntegrationAccount | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/IntegrationAccount/updateIntegrationAccount ]**


<a name="deleteIntegrationAccount"></a>
# **deleteIntegrationAccount**
>  <h5>Void</h5> deleteIntegrationAccount(id)

Delete a IntegrationAccount.

Deletes a specific IntegrationAccount.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.IntegrationAccountApi;


IntegrationAccountApi apiInstance = new IntegrationAccountApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the IntegrationAccount.

try {
    Void result = apiInstance.deleteIntegrationAccount(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAccountApi#deleteIntegrationAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the IntegrationAccount. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getIntegrationAccount"></a>
# **getIntegrationAccount**
>  <h5>IntegrationAccount</h5> getIntegrationAccount(id)

Retrieve a single IntegrationAccount

Retrieves a single IntegrationAccount for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.IntegrationAccountApi;


IntegrationAccountApi apiInstance = new IntegrationAccountApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the IntegrationAccount.

try {
    IntegrationAccount result = apiInstance.getIntegrationAccount(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAccountApi#getIntegrationAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the IntegrationAccount. |

### Return type

[**IntegrationAccount**](../model-docs/model-doc-IntegrationAccount)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIntegrationAccountList"></a>
# **getIntegrationAccountList**
>  <h5>IntegrationAccount</h5> getIntegrationAccountList()

Retrieve a list of IntegrationAccounts

Retrieves a list of IntegrationAccounts.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.IntegrationAccountApi;


IntegrationAccountApi apiInstance = new IntegrationAccountApi();

try {
    IntegrationAccount result = apiInstance.getIntegrationAccountList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAccountApi#getIntegrationAccountList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IntegrationAccount**](../model-docs/model-doc-IntegrationAccount)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postIntegrationAccount"></a>
# **postIntegrationAccount**
>  <h5>IntegrationAccount</h5> postIntegrationAccount(integrationAccount)

Create a new IntegrationAccount

Creates a new IntegrationAccount.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.IntegrationAccountApi;


IntegrationAccountApi apiInstance = new IntegrationAccountApi();
IntegrationAccount integrationAccount = new IntegrationAccount(); // IntegrationAccount | IntegrationAccount details.

try {
    IntegrationAccount result = apiInstance.postIntegrationAccount(integrationAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAccountApi#postIntegrationAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationAccount** | [**IntegrationAccount**](IntegrationAccount)| IntegrationAccount details. |

### Return type

[**IntegrationAccount**](../model-docs/model-doc-IntegrationAccount)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIntegrationAccount"></a>
# **updateIntegrationAccount**
>  <h5>IntegrationAccount</h5> updateIntegrationAccount(idintegrationAccount)

Update an existing IntegrationAccount

Updates an existing IntegrationAccount.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.IntegrationAccountApi;


IntegrationAccountApi apiInstance = new IntegrationAccountApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the IntegrationAccount.
IntegrationAccount integrationAccount = new IntegrationAccount(); // IntegrationAccount | Updated IntegrationAccount details.

try {
    IntegrationAccount result = apiInstance.updateIntegrationAccount(idintegrationAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAccountApi#updateIntegrationAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the IntegrationAccount. |
 **integrationAccount** | [**IntegrationAccount**](IntegrationAccount)| Updated IntegrationAccount details. |

### Return type

[**IntegrationAccount**](../model-docs/model-doc-IntegrationAccount)

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
