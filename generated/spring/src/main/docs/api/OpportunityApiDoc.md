---
title: "ValkyrAI API : OpportunityApi"
slug: "OpportunityApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        OpportunityApi,
        api-docs
    ]
---

# OpportunityApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOpportunity**](#deleteOpportunity) | **DELETE** OpportunityApi | Delete a Opportunity. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Opportunity/deleteOpportunity ]**[**getOpportunity**](#getOpportunity) | **GET** OpportunityApi | Retrieve a single Opportunity | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Opportunity/getOpportunity ]**[**getOpportunityList**](#getOpportunityList) | **GET** OpportunityApi | Retrieve a list of Opportunitys | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Opportunity/getOpportunityList ]**[**postOpportunity**](#postOpportunity) | **POST** OpportunityApi | Create a new Opportunity | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Opportunity/postOpportunity ]**[**updateOpportunity**](#updateOpportunity) | **PUT** OpportunityApi | Update an existing Opportunity | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Opportunity/updateOpportunity ]**


<a name="deleteOpportunity"></a>
# **deleteOpportunity**
>  <h5>Void</h5> deleteOpportunity(id)

Delete a Opportunity.

Deletes a specific Opportunity.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Opportunity.

try {
    Void result = apiInstance.deleteOpportunity(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#deleteOpportunity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Opportunity. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOpportunity"></a>
# **getOpportunity**
>  <h5>Opportunity</h5> getOpportunity(id)

Retrieve a single Opportunity

Retrieves a single Opportunity for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Opportunity.

try {
    Opportunity result = apiInstance.getOpportunity(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#getOpportunity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Opportunity. |

### Return type

[**Opportunity**](../model-docs/model-doc-Opportunity)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOpportunityList"></a>
# **getOpportunityList**
>  <h5>Opportunity</h5> getOpportunityList()

Retrieve a list of Opportunitys

Retrieves a list of Opportunitys.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();

try {
    Opportunity result = apiInstance.getOpportunityList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#getOpportunityList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Opportunity**](../model-docs/model-doc-Opportunity)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postOpportunity"></a>
# **postOpportunity**
>  <h5>Opportunity</h5> postOpportunity(opportunity)

Create a new Opportunity

Creates a new Opportunity.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();
Opportunity opportunity = new Opportunity(); // Opportunity | Opportunity details.

try {
    Opportunity result = apiInstance.postOpportunity(opportunity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#postOpportunity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **opportunity** | [**Opportunity**](Opportunity)| Opportunity details. |

### Return type

[**Opportunity**](../model-docs/model-doc-Opportunity)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOpportunity"></a>
# **updateOpportunity**
>  <h5>Opportunity</h5> updateOpportunity(idopportunity)

Update an existing Opportunity

Updates an existing Opportunity.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Opportunity.
Opportunity opportunity = new Opportunity(); // Opportunity | Updated Opportunity details.

try {
    Opportunity result = apiInstance.updateOpportunity(idopportunity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#updateOpportunity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Opportunity. |
 **opportunity** | [**Opportunity**](Opportunity)| Updated Opportunity details. |

### Return type

[**Opportunity**](../model-docs/model-doc-Opportunity)

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
