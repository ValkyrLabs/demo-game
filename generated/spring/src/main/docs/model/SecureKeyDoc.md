---
title: "ValkyrAI API : SecureKey"
slug: "model-doc-SecureKey"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        SecureKey,
        model-docs
    ]
---

# SecureKey


## Description
SecureKey is the KMS for the SecureField keys

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notes** | **String** | any notes about the key |  [optional] |
|**algorithm** | **String** | the algorithm used for encryption/decryption |  |
|**version** | **String** | the version of this key |  |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**cipherWorkCost** | **Integer** | the exponential strength of the BCrypt hashing used by the Hashing cipher |  [optional] |
|**keyValue** | **String** | the key itself |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| keyActive | &quot;ACTIVE&quot; |
| keyDefault | &quot;DEFAULT&quot; |
| keyArchived | &quot;ARCHIVED&quot; |
| keyRevoked | &quot;REVOKED&quot; |
| keyInvalid | &quot;INVALID&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]
