---
title: "ValkyrAI API : RatingApi"
slug: "RatingApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        RatingApi,
        api-docs
    ]
---

# RatingApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRating**](#deleteRating) | **DELETE** RatingApi | Delete a Rating. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Rating/deleteRating ]**[**getRating**](#getRating) | **GET** RatingApi | Retrieve a single Rating | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Rating/getRating ]**[**getRatingList**](#getRatingList) | **GET** RatingApi | Retrieve a list of Ratings | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Rating/getRatingList ]**[**postRating**](#postRating) | **POST** RatingApi | Create a new Rating | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Rating/postRating ]**[**updateRating**](#updateRating) | **PUT** RatingApi | Update an existing Rating | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/Rating/updateRating ]**


<a name="deleteRating"></a>
# **deleteRating**
>  <h5>Void</h5> deleteRating(id)

Delete a Rating.

Deletes a specific Rating.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.RatingApi;


RatingApi apiInstance = new RatingApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Rating.

try {
    Void result = apiInstance.deleteRating(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingApi#deleteRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Rating. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRating"></a>
# **getRating**
>  <h5>Rating</h5> getRating(id)

Retrieve a single Rating

Retrieves a single Rating for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.RatingApi;


RatingApi apiInstance = new RatingApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Rating.

try {
    Rating result = apiInstance.getRating(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingApi#getRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Rating. |

### Return type

[**Rating**](../model-docs/model-doc-Rating)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRatingList"></a>
# **getRatingList**
>  <h5>Rating</h5> getRatingList()

Retrieve a list of Ratings

Retrieves a list of Ratings.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.RatingApi;


RatingApi apiInstance = new RatingApi();

try {
    Rating result = apiInstance.getRatingList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingApi#getRatingList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Rating**](../model-docs/model-doc-Rating)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postRating"></a>
# **postRating**
>  <h5>Rating</h5> postRating(rating)

Create a new Rating

Creates a new Rating.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.RatingApi;


RatingApi apiInstance = new RatingApi();
Rating rating = new Rating(); // Rating | Rating details.

try {
    Rating result = apiInstance.postRating(rating);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingApi#postRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rating** | [**Rating**](Rating)| Rating details. |

### Return type

[**Rating**](../model-docs/model-doc-Rating)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRating"></a>
# **updateRating**
>  <h5>Rating</h5> updateRating(idrating)

Update an existing Rating

Updates an existing Rating.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.RatingApi;


RatingApi apiInstance = new RatingApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the Rating.
Rating rating = new Rating(); // Rating | Updated Rating details.

try {
    Rating result = apiInstance.updateRating(idrating);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingApi#updateRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the Rating. |
 **rating** | [**Rating**](Rating)| Updated Rating details. |

### Return type

[**Rating**](../model-docs/model-doc-Rating)

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
