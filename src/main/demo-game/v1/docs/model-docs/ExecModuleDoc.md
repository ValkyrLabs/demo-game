---
title: "ValkyrAI API : ExecModule"
slug: "model-doc-ExecModule"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        ExecModule,
        model-docs
    ]
---

# ExecModule


## Description
ExecModule is the execution unit of the ValkyrAI Workflow Engine

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**systemId** | **UUID** | UUID of the system object being mutated/read (if any) |  [optional] |
|**taskId** | **UUID** | The task this module is executing in |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | the RBAC role to use in mutating/reading any system object |  [optional] |
|**name** | **String** | the name of the module |  [optional] |
|**notes** | **String** | notes about the module |  [optional] |
|**integrationAccount** | [**IntegrationAccount**](IntegrationAccount.md) |  |  [optional] |
|**className** | **String** | the name of the implementation class for this module |  [optional] |
|**moduleType** | [**ModuleTypeEnum**](#ModuleTypeEnum) | the type of module |  [optional] |
|**moduleData** | **String** | json for configuring the module |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | last known status of the module |  [optional] |
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
| ANONYMOUS | &quot;anonymous&quot; |
| USER | &quot;user&quot; |
| ADMIN | &quot;admin&quot; |



## Enum: ModuleTypeEnum

| Name | Value |
|---- | -----|
| BROADCAST | &quot;broadcast&quot; |
| IO | &quot;io&quot; |
| READER | &quot;reader&quot; |
| WRITER | &quot;writer&quot; |
| TRANSFORMER | &quot;transformer&quot; |



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
**GENERATED DATE** | 2025-01-03T16:21:43.722881-08:00[America/Los_Angeles]
