---
title: "ValkyrAI API : AddressApi"
slug: "AddressApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        AddressApi,
        api-docs
    ]
---

# AddressApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAddress**](#deleteAddress) | **DELETE** AddressApi | Delete a Address. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Address/deleteAddress ]**[**getAddress**](#getAddress) | **GET** AddressApi | Retrieve a single Address | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Address/getAddress ]**[**getAddressList**](#getAddressList) | **GET** AddressApi | Retrieve a list of Addresss | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Address/getAddressList ]**[**postAddress**](#postAddress) | **POST** AddressApi | Create a new Address | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Address/postAddress ]**[**updateAddress**](#updateAddress) | **PUT** AddressApi | Update an existing Address | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Address/updateAddress ]**


<a name="deleteAddress"></a>
# **deleteAddress**
>  <h5>Void</h5> deleteAddress(id)

Delete a Address.

Deletes a specific Address.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AddressApi;


AddressApi apiInstance = new AddressApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Address.

try {
    Void result = apiInstance.deleteAddress(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#deleteAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Address. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAddress"></a>
# **getAddress**
>  <h5>Address</h5> getAddress(id)

Retrieve a single Address

Retrieves a single Address for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AddressApi;


AddressApi apiInstance = new AddressApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Address.

try {
    Address result = apiInstance.getAddress(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#getAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Address. |

### Return type

[**Address**](../model-docs/model-doc-Address)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAddressList"></a>
# **getAddressList**
>  <h5>Address</h5> getAddressList()

Retrieve a list of Addresss

Retrieves a list of Addresss.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AddressApi;


AddressApi apiInstance = new AddressApi();

try {
    Address result = apiInstance.getAddressList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#getAddressList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Address**](../model-docs/model-doc-Address)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postAddress"></a>
# **postAddress**
>  <h5>Address</h5> postAddress(address)

Create a new Address

Creates a new Address.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AddressApi;


AddressApi apiInstance = new AddressApi();
Address address = new Address(); // Address | Address details.

try {
    Address result = apiInstance.postAddress(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#postAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | [**Address**](Address)| Address details. |

### Return type

[**Address**](../model-docs/model-doc-Address)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAddress"></a>
# **updateAddress**
>  <h5>Address</h5> updateAddress(idaddress)

Update an existing Address

Updates an existing Address.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.AddressApi;


AddressApi apiInstance = new AddressApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Address.
Address address = new Address(); // Address | Updated Address details.

try {
    Address result = apiInstance.updateAddress(idaddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#updateAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Address. |
 **address** | [**Address**](Address)| Updated Address details. |

### Return type

[**Address**](../model-docs/model-doc-Address)

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
