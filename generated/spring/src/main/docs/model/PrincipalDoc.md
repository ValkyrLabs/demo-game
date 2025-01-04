---
title: "ValkyrAI API : Principal"
slug: "model-doc-Principal"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        Principal,
        model-docs
    ]
---

# Principal


## Description
The Valkyr Principal. Represents a user, service, or agent in the system with preferences and privileges.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | first name of user (encrypted) |  [optional] |
|**middleName** | **String** | middle name of user |  [optional] |
|**lastName** | **String** | last name of user (encrypted) |  [optional] |
|**username** | **String** | Your account user name |  |
|**password** | **String** | Your account password |  |
|**fingerprint** | **String** | Encrypted identity (Facial Recognition, Fingerprint Scanner, etc.) |  [optional] [readonly] |
|**federalIdentification** | **String** | SSN or a 10 digit federal government ID (encrypted) |  [optional] |
|**residenceCountry** | **String** | Country of residence 3-character code |  [optional] |
|**stateIdentification** | **String** | Driver&#39;s License or a 10 digit state government ID |  [optional] |
|**residenceState** | **String** | State of residence 2-character code (USA) |  [optional] |
|**email** | **String** | The main email address for the user (encrypted) |  |
|**social** | **String** | The username for your primary social account (if any) |  [optional] |
|**bio** | **String** | More in-depth information about you and your account |  [optional] |
|**notes** | **String** |  |  [optional] |
|**avatarUrl** | **String** | URL for the user avatar image |  [optional] |
|**organizationId** | **UUID** |  |  [optional] |
|**organization** | [**Organization**](Organization.md) |  |  [optional] |
|**addresses** | [**List&lt;Address&gt;**](Address.md) |  |  [optional] |
|**acceptedCookies** | **Boolean** | Whether the user accepted the use of cookies |  [optional] |
|**acceptedTos** | **Boolean** | Whether the user accepted the terms of service |  [optional] |
|**enabled** | **Boolean** | Spring Security User field whether the user is enabled |  [optional] |
|**credentialNonExpired** | **Boolean** | Spring Security User field whether the user&#39;s login credentials have expired |  [optional] |
|**accountEnabled** | **Boolean** | Spring Security User field whether the user account is enabled |  [optional] |
|**accountNonLocked** | **Boolean** | Spring Security User field whether the user account is locked |  [optional] |
|**accountNonExpired** | **Boolean** | Spring Security User field whether the user account has expired |  [optional] |
|**roles** | [**List&lt;Role&gt;**](Role.md) | the granted roles (or null if the granted authority cannot be expressed as a String with sufficient precision). |  [optional] |
|**authorityList** | [**List&lt;Authority&gt;**](Authority.md) | the granted authorities (or null if the granted authority cannot be expressed as a String with sufficient precision). |  [optional] |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]
