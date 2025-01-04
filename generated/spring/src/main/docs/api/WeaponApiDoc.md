---
title: "ValkyrAI API : WeaponApi"
slug: "WeaponApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        WeaponApi,
        api-docs
    ]
---

# WeaponApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWeapon**](#deleteWeapon) | **DELETE** WeaponApi | Delete a Weapon. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Weapon/deleteWeapon ]**[**getWeapon**](#getWeapon) | **GET** WeaponApi | Retrieve a single Weapon | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Weapon/getWeapon ]**[**getWeaponList**](#getWeaponList) | **GET** WeaponApi | Retrieve a list of Weapons | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Weapon/getWeaponList ]**[**postWeapon**](#postWeapon) | **POST** WeaponApi | Create a new Weapon | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Weapon/postWeapon ]**[**updateWeapon**](#updateWeapon) | **PUT** WeaponApi | Update an existing Weapon | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Weapon/updateWeapon ]**


<a name="deleteWeapon"></a>
# **deleteWeapon**
>  <h5>Void</h5> deleteWeapon(id)

Delete a Weapon.

Deletes a specific Weapon.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WeaponApi;


WeaponApi apiInstance = new WeaponApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Weapon.

try {
    Void result = apiInstance.deleteWeapon(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeaponApi#deleteWeapon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Weapon. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getWeapon"></a>
# **getWeapon**
>  <h5>Weapon</h5> getWeapon(id)

Retrieve a single Weapon

Retrieves a single Weapon for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WeaponApi;


WeaponApi apiInstance = new WeaponApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Weapon.

try {
    Weapon result = apiInstance.getWeapon(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeaponApi#getWeapon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Weapon. |

### Return type

[**Weapon**](../model-docs/model-doc-Weapon)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeaponList"></a>
# **getWeaponList**
>  <h5>Weapon</h5> getWeaponList()

Retrieve a list of Weapons

Retrieves a list of Weapons.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WeaponApi;


WeaponApi apiInstance = new WeaponApi();

try {
    Weapon result = apiInstance.getWeaponList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeaponApi#getWeaponList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Weapon**](../model-docs/model-doc-Weapon)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postWeapon"></a>
# **postWeapon**
>  <h5>Weapon</h5> postWeapon(weapon)

Create a new Weapon

Creates a new Weapon.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WeaponApi;


WeaponApi apiInstance = new WeaponApi();
Weapon weapon = new Weapon(); // Weapon | Weapon details.

try {
    Weapon result = apiInstance.postWeapon(weapon);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeaponApi#postWeapon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **weapon** | [**Weapon**](Weapon)| Weapon details. |

### Return type

[**Weapon**](../model-docs/model-doc-Weapon)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWeapon"></a>
# **updateWeapon**
>  <h5>Weapon</h5> updateWeapon(idweapon)

Update an existing Weapon

Updates an existing Weapon.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.WeaponApi;


WeaponApi apiInstance = new WeaponApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Weapon.
Weapon weapon = new Weapon(); // Weapon | Updated Weapon details.

try {
    Weapon result = apiInstance.updateWeapon(idweapon);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeaponApi#updateWeapon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Weapon. |
 **weapon** | [**Weapon**](Weapon)| Updated Weapon details. |

### Return type

[**Weapon**](../model-docs/model-doc-Weapon)

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
