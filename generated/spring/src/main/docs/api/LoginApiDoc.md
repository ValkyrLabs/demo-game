---
title: "ValkyrAI API : LoginApi"
slug: "LoginApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        LoginApi,
        api-docs
    ]
---

# LoginApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLogin**](#deleteLogin) | **DELETE** LoginApi | Delete a Login. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Login/deleteLogin ]**[**getLogin**](#getLogin) | **GET** LoginApi | Retrieve a single Login | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Login/getLogin ]**[**getLoginList**](#getLoginList) | **GET** LoginApi | Retrieve a list of Logins | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Login/getLoginList ]**[**postLogin**](#postLogin) | **POST** LoginApi | Create a new Login | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Login/postLogin ]**[**updateLogin**](#updateLogin) | **PUT** LoginApi | Update an existing Login | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Login/updateLogin ]**


<a name="deleteLogin"></a>
# **deleteLogin**
>  <h5>Void</h5> deleteLogin(id)

Delete a Login.

Deletes a specific Login.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LoginApi;


LoginApi apiInstance = new LoginApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Login.

try {
    Void result = apiInstance.deleteLogin(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#deleteLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Login. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getLogin"></a>
# **getLogin**
>  <h5>Login</h5> getLogin(id)

Retrieve a single Login

Retrieves a single Login for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LoginApi;


LoginApi apiInstance = new LoginApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Login.

try {
    Login result = apiInstance.getLogin(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#getLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Login. |

### Return type

[**Login**](../model-docs/model-doc-Login)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoginList"></a>
# **getLoginList**
>  <h5>Login</h5> getLoginList()

Retrieve a list of Logins

Retrieves a list of Logins.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LoginApi;


LoginApi apiInstance = new LoginApi();

try {
    Login result = apiInstance.getLoginList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#getLoginList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Login**](../model-docs/model-doc-Login)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postLogin"></a>
# **postLogin**
>  <h5>Login</h5> postLogin(login)

Create a new Login

Creates a new Login.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LoginApi;


LoginApi apiInstance = new LoginApi();
Login login = new Login(); // Login | Login details.

try {
    Login result = apiInstance.postLogin(login);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#postLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | [**Login**](Login)| Login details. |

### Return type

[**Login**](../model-docs/model-doc-Login)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLogin"></a>
# **updateLogin**
>  <h5>Login</h5> updateLogin(idlogin)

Update an existing Login

Updates an existing Login.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.LoginApi;


LoginApi apiInstance = new LoginApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Login.
Login login = new Login(); // Login | Updated Login details.

try {
    Login result = apiInstance.updateLogin(idlogin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#updateLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Login. |
 **login** | [**Login**](Login)| Updated Login details. |

### Return type

[**Login**](../model-docs/model-doc-Login)

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
