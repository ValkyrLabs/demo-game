---
title: "ValkyrAI API : Application"
slug: "model-doc-Application"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        Application,
        model-docs
    ]
---

# Application


## Description
Application represents a logical system

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | name of the application |  [optional] |
|**description** | **String** | detailed description of the application |  [optional] |
|**isTemplate** | **Boolean** | whether this Application is a Template |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of application |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status for event |  [optional] |
|**entrypointUrl** | **String** | the url to the &#39;homepage&#39; or service endpoint |  [optional] |
|**contentMedia** | [**List&lt;ContentMediaLink&gt;**](ContentMediaLink.md) |  |  [optional] |
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
| FULL_STACK | &quot;full-stack&quot; |
| AUTOMATION | &quot;automation&quot; |
| AGENT | &quot;agent&quot; |
| SERVICE | &quot;service&quot; |
| FRONT_END | &quot;front-end&quot; |
| MOBILE | &quot;mobile&quot; |
| CI_CD | &quot;ci-cd&quot; |
| LAMBDA | &quot;lambda&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| DEPLOYED | &quot;deployed&quot; |
| STAGING | &quot;staging&quot; |
| ERROR | &quot;error&quot; |
| DISABLED | &quot;disabled&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]
