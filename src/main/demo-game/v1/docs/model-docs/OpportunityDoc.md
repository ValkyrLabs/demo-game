---
title: "ValkyrAI API : Opportunity"
slug: "model-doc-Opportunity"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        Opportunity,
        model-docs
    ]
---

# Opportunity


## Description
Represents a sales opportunity related to a customer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **UUID** | The customer associated with the opportunity. |  |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**description** | **String** | Description of the opportunity. |  |
|**totalValue** | **Double** | Expected total value of the opportunity. |  [optional] |
|**currentStatus** | [**CurrentStatusEnum**](#CurrentStatusEnum) | Status of the opportunity. |  [optional] |
|**estimatedCloseDate** | **OffsetDateTime** | Estimated closing date for the opportunity. |  [optional] |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: CurrentStatusEnum

| Name | Value |
|---- | -----|
| WON | &quot;won&quot; |
| OPEN | &quot;open&quot; |
| LOST | &quot;lost&quot; |
| INACTIVE | &quot;inactive&quot; |
| REVIVE | &quot;revive&quot; |
| LEGAL | &quot;legal&quot; |
| BLOCKED | &quot;blocked&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:21:43.722881-08:00[America/Los_Angeles]
