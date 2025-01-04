---
title: "ValkyrAI API : Customer"
slug: "model-doc-Customer"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        Customer,
        model-docs
    ]
---

# Customer


## Description
Represents a customer entity for CRM.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **UUID** | Associated customer Principal ID. |  |
|**customer** | [**Principal**](Principal.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the customer. |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | Role of the contact person within the customer account (e.g., CEO, Procurement, Technical Lead). |  [optional] |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| PROSPECT | &quot;prospect&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| CEO | &quot;ceo&quot; |
| MANAGEMENT | &quot;management&quot; |
| PROCUREMENT | &quot;procurement&quot; |
| TECHNICAL | &quot;technical&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:21:43.722881-08:00[America/Los_Angeles]
