---
title: "ValkyrAI API : AttackApi"
slug: "AttackApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        AttackApi,
        api-docs
    ]
---

# AttackApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAttack**](#deleteAttack) | **DELETE** AttackApi | Delete a Attack. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Attack/deleteAttack ]**[**getAttack**](#getAttack) | **GET** AttackApi | Retrieve a single Attack | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Attack/getAttack ]**[**getAttackList**](#getAttackList) | **GET** AttackApi | Retrieve a list of Attacks | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Attack/getAttackList ]**[**postAttack**](#postAttack) | **POST** AttackApi | Create a new Attack | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Attack/postAttack ]**[**updateAttack**](#updateAttack) | **PUT** AttackApi | Update an existing Attack | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Attack/updateAttack ]**


<a name="deleteAttack"></a>
# **deleteAttack**
>  <h5>Void</h5> deleteAttack(id)

Delete a Attack.

Deletes a specific Attack.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AttackApi;


AttackApi apiInstance = new AttackApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Attack.

try {
    Void result = apiInstance.deleteAttack(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttackApi#deleteAttack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Attack. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAttack"></a>
# **getAttack**
>  <h5>Attack</h5> getAttack(id)

Retrieve a single Attack

Retrieves a single Attack for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AttackApi;


AttackApi apiInstance = new AttackApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Attack.

try {
    Attack result = apiInstance.getAttack(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttackApi#getAttack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Attack. |

### Return type

[**Attack**](../model-docs/model-doc-Attack)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttackList"></a>
# **getAttackList**
>  <h5>Attack</h5> getAttackList()

Retrieve a list of Attacks

Retrieves a list of Attacks.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AttackApi;


AttackApi apiInstance = new AttackApi();

try {
    Attack result = apiInstance.getAttackList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttackApi#getAttackList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Attack**](../model-docs/model-doc-Attack)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postAttack"></a>
# **postAttack**
>  <h5>Attack</h5> postAttack(attack)

Create a new Attack

Creates a new Attack.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AttackApi;


AttackApi apiInstance = new AttackApi();
Attack attack = new Attack(); // Attack | Attack details.

try {
    Attack result = apiInstance.postAttack(attack);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttackApi#postAttack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attack** | [**Attack**](Attack)| Attack details. |

### Return type

[**Attack**](../model-docs/model-doc-Attack)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAttack"></a>
# **updateAttack**
>  <h5>Attack</h5> updateAttack(idattack)

Update an existing Attack

Updates an existing Attack.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AttackApi;


AttackApi apiInstance = new AttackApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Attack.
Attack attack = new Attack(); // Attack | Updated Attack details.

try {
    Attack result = apiInstance.updateAttack(idattack);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttackApi#updateAttack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Attack. |
 **attack** | [**Attack**](Attack)| Updated Attack details. |

### Return type

[**Attack**](../model-docs/model-doc-Attack)

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
