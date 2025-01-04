---
title: "ValkyrAI API : IntegrationAccount"
slug: "model-doc-IntegrationAccount"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        IntegrationAccount,
        model-docs
    ]
---

# IntegrationAccount


## Description
An integration account to authenticate workflows with various systems

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**execModuleId** | **UUID** |  |  [optional] |
|**accountName** | **String** | account name |  [optional] |
|**username** | **String** | account username |  [optional] |
|**password** | **String** | account password - encrypted |  [optional] |
|**accountId** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Integration Connection Status |  [optional] |
|**verified** | **Boolean** |  |  [optional] |
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
| READY | &quot;ready&quot; |
| CLOSED | &quot;closed&quot; |
| EXECUTED | &quot;executed&quot; |
| ERROR | &quot;error&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]
