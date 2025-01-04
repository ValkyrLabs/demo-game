---
title: "ValkyrAI API : ContentData"
slug: "model-doc-ContentData"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        ContentData,
        model-docs
    ]
---

# ContentData


## Description
TODO ContentData CLASS DESCRIPTION

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorName** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**subtitle** | **String** |  |  [optional] |
|**contentUrl** | **String** |  |  [optional] |
|**contentData** | **String** |  |  [optional] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) |  |  [optional] |
|**thumbnailImage** | **String** | The large image (optional) for your content |  [optional] |
|**largeImage** | **String** | The large image (optional) for your content |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**releaseDate** | **OffsetDateTime** | the release date (used to automate publishing) |  [optional] |
|**contentMedia** | [**List&lt;ContentMediaLink&gt;**](ContentMediaLink.md) | media contained in or referenced by the content |  [optional] |
|**principalId** | **UUID** | the author or attibuted entity |  [optional] |
|**principal** | [**Principal**](Principal.md) |  |  [optional] |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| PLAINTEXT | &quot;plaintext&quot; |
| MARKDOWN | &quot;markdown&quot; |
| JSON | &quot;json&quot; |
| YAML | &quot;yaml&quot; |
| AUDIO | &quot;audio&quot; |
| VIDEO | &quot;video&quot; |
| URL | &quot;url&quot; |
| BINARY | &quot;binary&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| CODEGEN | &quot;CodeGen&quot; |
| DOCS | &quot;DOCS&quot; |
| BLOG | &quot;BLOG&quot; |
| PRODUCT | &quot;Product&quot; |
| SECURITY | &quot;SECURITY&quot; |
| EVENT | &quot;Event&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| HOLDING | &quot;holding&quot; |
| EDITING | &quot;editing&quot; |
| PUBLISHED | &quot;published&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:21:43.722881-08:00[America/Los_Angeles]
