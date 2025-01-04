---
title: "ValkyrAI API : Task"
slug: "model-doc-Task"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        Task,
        model-docs
    ]
---

# Task


## Description
ValkyrAI Task object manages execution and state of automation workflows

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**workflowId** | **UUID** | The workflow this state is participating in |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | override the workflow role for specific task -login to a system- the role with permissions -temporary user is created |  [optional] |
|**modules** | [**List&lt;ExecModule&gt;**](ExecModule.md) | an array of ExecModules to be processed |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | last known status of the task |  [optional] |
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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RUNNING | &quot;running&quot; |
| STOPPED | &quot;stopped&quot; |
| READY | &quot;ready&quot; |
| GOOD | &quot;good&quot; |
| WARNING | &quot;warning&quot; |
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
