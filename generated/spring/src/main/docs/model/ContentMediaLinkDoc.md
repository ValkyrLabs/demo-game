---
title: "ValkyrAI API : ContentMediaLink"
slug: "model-doc-ContentMediaLink"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        ContentMediaLink,
        model-docs
    ]
---

# ContentMediaLink


## Description
link to images, videos, audio, and other content media

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationId** | **UUID** | used when linked to an Application |  [optional] |
|**contentDataId** | **UUID** | used when linked to ContentData |  [optional] |
|**contentUse** | [**ContentUseEnum**](#ContentUseEnum) | specialized usage for the media object if any |  [optional] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | content type of the media object |  [optional] |
|**mediaUrl** | **String** | url to the media object |  [optional] |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: ContentUseEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| SCREENSHOT | &quot;screenshot&quot; |
| SELFIE | &quot;selfie&quot; |
| PORTRAIT | &quot;portrait&quot; |
| PROMOTIONAL | &quot;promotional&quot; |
| INFORMATIONAL | &quot;informational&quot; |
| ENTERTAINMENT | &quot;entertainment&quot; |
| PRODUCT | &quot;product&quot; |
| SUPPORT | &quot;support&quot; |
| TRAINING | &quot;training&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;image&quot; |
| ICON | &quot;icon&quot; |
| VIDEO | &quot;video&quot; |
| AUDIO | &quot;audio&quot; |
| TEXT | &quot;text&quot; |
| JSON | &quot;json&quot; |
| YAML | &quot;yaml&quot; |
| XML | &quot;xml&quot; |
| MARKDOWN | &quot;markdown&quot; |
| SPREADSHEET | &quot;spreadsheet&quot; |
| PDF | &quot;pdf&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]
