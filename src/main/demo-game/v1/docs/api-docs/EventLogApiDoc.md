---
title: "ValkyrAI API : EventLogApi"
slug: "EventLogApi"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        EventLogApi,
        api-docs
    ]
---

# EventLogApi
## valkyrai-api
All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEventLog**](#deleteEventLog) | **DELETE** EventLogApi | Delete a EventLog. | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/EventLog/deleteEventLog ]**[**getEventLog**](#getEventLog) | **GET** EventLogApi | Retrieve a single EventLog | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/EventLog/getEventLog ]**[**getEventLogList**](#getEventLogList) | **GET** EventLogApi | Retrieve a list of EventLogs | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/EventLog/getEventLogList ]**[**postEventLog**](#postEventLog) | **POST** EventLogApi | Create a new EventLog | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/EventLog/postEventLog ]**[**updateEventLog**](#updateEventLog) | **PUT** EventLogApi | Update an existing EventLog | **( swagger )[ https://loki.valkyrlabs.com:8081/swagger-ui/index.html#/EventLog/updateEventLog ]**


<a name="deleteEventLog"></a>
# **deleteEventLog**
>  <h5>Void</h5> deleteEventLog(id)

Delete a EventLog.

Deletes a specific EventLog.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.EventLogApi;


EventLogApi apiInstance = new EventLogApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the EventLog.

try {
    Void result = apiInstance.deleteEventLog(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLogApi#deleteEventLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the EventLog. |

### Return type

[**Void**](../model-docs/model-doc-)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEventLog"></a>
# **getEventLog**
>  <h5>EventLog</h5> getEventLog(id)

Retrieve a single EventLog

Retrieves a single EventLog for a specific uid.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.EventLogApi;


EventLogApi apiInstance = new EventLogApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the EventLog.

try {
    EventLog result = apiInstance.getEventLog(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLogApi#getEventLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the EventLog. |

### Return type

[**EventLog**](../model-docs/model-doc-EventLog)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventLogList"></a>
# **getEventLogList**
>  <h5>EventLog</h5> getEventLogList()

Retrieve a list of EventLogs

Retrieves a list of EventLogs.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.EventLogApi;


EventLogApi apiInstance = new EventLogApi();

try {
    EventLog result = apiInstance.getEventLogList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLogApi#getEventLogList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventLog**](../model-docs/model-doc-EventLog)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postEventLog"></a>
# **postEventLog**
>  <h5>EventLog</h5> postEventLog(eventLog)

Create a new EventLog

Creates a new EventLog.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.EventLogApi;


EventLogApi apiInstance = new EventLogApi();
EventLog eventLog = new EventLog(); // EventLog | EventLog details.

try {
    EventLog result = apiInstance.postEventLog(eventLog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLogApi#postEventLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventLog** | [**EventLog**](EventLog)| EventLog details. |

### Return type

[**EventLog**](../model-docs/model-doc-EventLog)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEventLog"></a>
# **updateEventLog**
>  <h5>EventLog</h5> updateEventLog(ideventLog)

Update an existing EventLog

Updates an existing EventLog.

### Example
```java
Import classes:
import com.valkyrlabs.ApiException;
import com.valkyrlabs.api.EventLogApi;


EventLogApi apiInstance = new EventLogApi();
UUID id = UUID.randomUUID(); // UUID | Unique identifier for the EventLog.
EventLog eventLog = new EventLog(); // EventLog | Updated EventLog details.

try {
    EventLog result = apiInstance.updateEventLog(ideventLog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLogApi#updateEventLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Unique identifier for the EventLog. |
 **eventLog** | [**EventLog**](EventLog)| Updated EventLog details. |

### Return type

[**EventLog**](../model-docs/model-doc-EventLog)

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
