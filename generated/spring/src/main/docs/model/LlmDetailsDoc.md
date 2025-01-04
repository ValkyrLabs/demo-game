---
title: "ValkyrAI API : LlmDetails"
slug: "model-doc-LlmDetails"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        LlmDetails,
        model-docs
    ]
---

# LlmDetails


## Description
TODO LlmDetails CLASS DESCRIPTION

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the LLM |  [optional] |
|**version** | **String** | The vendor-specific version of the LLM |  [optional] |
|**notes** | **String** | Notes on the LLM implementation |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | the user role to set for the target LLM |  [optional] |
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  [optional] |
|**apiType** | [**ApiTypeEnum**](#ApiTypeEnum) |  |  [optional] |
|**initialPrompt** | **String** | the initial prompt to instruct the LLM how to behave |  [optional] |
|**apiKey** | **String** | the api-key to access the llm |  [optional] |
|**credential** | **String** | the user name to access the LLM |  [optional] |
|**credentialPassword** | **String** | the password to access the LLM |  [optional] |
|**url** | **String** | the URL to connect to the LLM api |  [optional] |
|**requestParameters** | **String** | request parameters to send to the service |  [optional] |
|**meta** | **String** | metadata in any text format to be used in client code |  [optional] |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ASSISTANT | &quot;assistant&quot; |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| VALKYRAI | &quot;valkyrai&quot; |
| OPENAI | &quot;openai&quot; |
| LLAMA | &quot;llama&quot; |
| PHI | &quot;phi&quot; |
| GEMMA | &quot;gemma&quot; |
| MISTRAL | &quot;mistral&quot; |
| CLAUDE | &quot;claude&quot; |
| GEMINI | &quot;gemini&quot; |
| OTHER | &quot;other&quot; |



## Enum: ApiTypeEnum

| Name | Value |
|---- | -----|
| OPENAI | &quot;openai&quot; |
| OLLAMA | &quot;ollama&quot; |
| OTHER | &quot;other&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]
