---
title: "ValkyrAI API : Level"
slug: "model-doc-Level"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        Level,
        model-docs
    ]
---

# Level


## Description
a game level

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | the name of level |  [optional] |
|**level** | **Integer** | the sequential level index (if applicable) |  [optional] |
|**scoreMultiplier** | **Integer** | use to increment extra points for harder levels |  [optional] |
|**color** | [**ColorEnum**](#ColorEnum) |  |  [optional] |
|**levelType** | [**LevelTypeEnum**](#LevelTypeEnum) | the type of the level |  [optional] |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: ColorEnum

| Name | Value |
|---- | -----|
| BLACK | &quot;BLACK&quot; |
| CAMO_AIRFORCE | &quot;CAMO-AIRFORCE&quot; |
| CAMO_MARINE | &quot;CAMO-MARINE&quot; |
| CAMO_NAVY | &quot;CAMO-NAVY&quot; |
| CAMO_ARMY | &quot;CAMO-ARMY&quot; |
| GRAY | &quot;GRAY&quot; |
| OLIVE | &quot;OLIVE&quot; |
| SILVER | &quot;SILVER&quot; |
| GOLD | &quot;GOLD&quot; |
| EXOTIC | &quot;EXOTIC&quot; |



## Enum: LevelTypeEnum

| Name | Value |
|---- | -----|
| MAP | &quot;MAP&quot; |
| ACHIEVEMENT | &quot;ACHIEVEMENT&quot; |
| BATTLE | &quot;BATTLE&quot; |
| CINEMATIC | &quot;CINEMATIC&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]
