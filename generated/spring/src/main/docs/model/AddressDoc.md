---
title: "ValkyrAI API : Address"
slug: "model-doc-Address"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        Address,
        model-docs
    ]
---

# Address


## Description
TODO Address CLASS DESCRIPTION

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hasWifi** | **Boolean** |  |  [optional] |
|**principalId** | **UUID** |  |  [optional] |
|**addressType** | [**AddressTypeEnum**](#AddressTypeEnum) | The type of address |  [optional] |
|**name** | **String** | full name of addressee |  |
|**street1** | **String** | street address line 1 |  |
|**street2** | **String** | street address line 2 |  [optional] |
|**city** | **String** | full name of city |  |
|**state** | **String** | State of residence 2-character code (USA) |  |
|**country** | **String** | 3 character country code (upper case) |  [optional] |
|**postalCode** | **String** | 5+4 digit zip code |  |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: AddressTypeEnum

| Name | Value |
|---- | -----|
| HOME | &quot;home&quot; |
| MAIL | &quot;mail&quot; |
| WORK | &quot;work&quot; |
| SCHOOL | &quot;school&quot; |
| OTHER | &quot;other&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]
