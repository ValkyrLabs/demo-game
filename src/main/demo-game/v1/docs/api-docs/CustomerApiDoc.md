---
title: "ValkyrAI API : CustomerApi"
slug: "CustomerApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        CustomerApi,
        api-docs
    ]
---

# CustomerApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCustomer**](#deleteCustomer) | **DELETE** CustomerApi | Delete a Customer. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Customer/deleteCustomer ]**[**getCustomer**](#getCustomer) | **GET** CustomerApi | Retrieve a single Customer | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Customer/getCustomer ]**[**getCustomerList**](#getCustomerList) | **GET** CustomerApi | Retrieve a list of Customers | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Customer/getCustomerList ]**[**postCustomer**](#postCustomer) | **POST** CustomerApi | Create a new Customer | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Customer/postCustomer ]**[**updateCustomer**](#updateCustomer) | **PUT** CustomerApi | Update an existing Customer | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Customer/updateCustomer ]**


<a name="deleteCustomer"></a>
# **deleteCustomer**
>  <h5>Void</h5> deleteCustomer(id)

Delete a Customer.

Deletes a specific Customer.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Customer.

try {
    Void result = apiInstance.deleteCustomer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#deleteCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Customer. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCustomer"></a>
# **getCustomer**
>  <h5>Customer</h5> getCustomer(id)

Retrieve a single Customer

Retrieves a single Customer for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Customer.

try {
    Customer result = apiInstance.getCustomer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Customer. |

### Return type

[**Customer**](../model-docs/model-doc-Customer)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerList"></a>
# **getCustomerList**
>  <h5>Customer</h5> getCustomerList()

Retrieve a list of Customers

Retrieves a list of Customers.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();

try {
    Customer result = apiInstance.getCustomerList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomerList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Customer**](../model-docs/model-doc-Customer)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postCustomer"></a>
# **postCustomer**
>  <h5>Customer</h5> postCustomer(customer)

Create a new Customer

Creates a new Customer.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
Customer customer = new Customer(); // Customer | Customer details.

try {
    Customer result = apiInstance.postCustomer(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#postCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer)| Customer details. |

### Return type

[**Customer**](../model-docs/model-doc-Customer)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomer"></a>
# **updateCustomer**
>  <h5>Customer</h5> updateCustomer(idcustomer)

Update an existing Customer

Updates an existing Customer.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Customer.
Customer customer = new Customer(); // Customer | Updated Customer details.

try {
    Customer result = apiInstance.updateCustomer(idcustomer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Customer. |
 **customer** | [**Customer**](Customer)| Updated Customer details. |

### Return type

[**Customer**](../model-docs/model-doc-Customer)

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
