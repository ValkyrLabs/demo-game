---
title: "ValkyrAI API : Workflow"
slug: "model-doc-Workflow"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        Workflow,
        model-docs
    ]
---

# Workflow


## Description
ValkyrAI Workflow object manages execution and state of automation workflows

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | short description of this workflow |  [optional] |
|**description** | **String** | detailed description of this workflow |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | the role with permissions to execute the workfow as |  [optional] |
|**schedule** | **String** | cron string to determine when this runs |  [optional] |
|**meta** | **String** | metadata in any text format to be used in client code |  [optional] |
|**tasks** | [**List&lt;Task&gt;**](Task.md) | an array of Tasks to be performed |  [optional] |
|**state** | [**List&lt;WorkflowState&gt;**](WorkflowState.md) | an array stateful objects to be used in the workflow |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | last known status of the workflow |  [optional] |
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
| SYSTEM | &quot;system&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RUNNING | &quot;running&quot; |
| STOPPED | &quot;stopped&quot; |
| READY | &quot;ready&quot; |
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
