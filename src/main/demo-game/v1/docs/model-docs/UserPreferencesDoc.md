---
title: "ValkyrAI API : UserPreferences"
slug: "model-doc-UserPreferences"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        UserPreferences,
        model-docs
    ]
---

# UserPreferences


## Description
Various System User Preferences

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**preference** | **String** | The value of the User Preferences |  [optional] |
|**preferenceType** | [**PreferenceTypeEnum**](#PreferenceTypeEnum) | The type of the preference |  [optional] |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: PreferenceTypeEnum

| Name | Value |
|---- | -----|
| UX_LAYOUT | &quot;ux-layout&quot; |
| UX_MODE | &quot;ux-mode&quot; |
| UX_THEME | &quot;ux-theme&quot; |
| MEASUREMENT | &quot;measurement&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:21:43.722881-08:00[America/Los_Angeles]
