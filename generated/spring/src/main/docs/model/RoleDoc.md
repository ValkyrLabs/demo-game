---
title: "ValkyrAI API : Role"
slug: "model-doc-Role"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        Role,
        model-docs
    ]
---

# Role


## Description
A Role for a Principal in the system

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**principalId** | **UUID** |  |  [optional] |
|**roleName** | [**RoleNameEnum**](#RoleNameEnum) | the role |  [optional] |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: RoleNameEnum

| Name | Value |
|---- | -----|
| ROLE_ANONYMOUS | &quot;ANONYMOUS&quot; |
| ROLE_USER | &quot;USER&quot; |
| ROLE_STAFF | &quot;STAFF&quot; |
| ROLE_ADMIN | &quot;ADMIN&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]