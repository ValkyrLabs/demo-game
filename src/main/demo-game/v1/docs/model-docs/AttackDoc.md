---
title: "ValkyrAI API : Attack"
slug: "model-doc-Attack"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        Attack,
        model-docs
    ]
---

# Attack


## Description
DEMO attack of various type

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | the name of the attack |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**weapon** | [**Weapon**](Weapon.md) |  |  [optional] |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FRONTAL | &quot;FRONTAL&quot; |
| SNEAK | &quot;SNEAK&quot; |
| FROM_ABOVE | &quot;FROM_ABOVE&quot; |
| FROM_BELOW | &quot;FROM_BELOW&quot; |
| WATER | &quot;WATER&quot; |
| LAND | &quot;LAND&quot; |
| AIR | &quot;AIR&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:21:43.722881-08:00[America/Los_Angeles]
