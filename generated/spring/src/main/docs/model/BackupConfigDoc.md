---
title: "ValkyrAI API : BackupConfig"
slug: "model-doc-BackupConfig"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        BackupConfig,
        model-docs
    ]
---

# BackupConfig


## Description
System backup configuration for backup jobs workstation and server

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**description** | **String** | source code only backup of test workspace |  [optional] |
|**remoteConfigUrl** | **String** | basically a callback url |  [optional] |
|**runNumber** | **Integer** | the number of times this has been run before |  [optional] |
|**percentComplete** | **Integer** | 0-100 percentage of compleion of this backup if known |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | the type of backup ie Workstation or Server |  [optional] |
|**priorityLevel** | [**PriorityLevelEnum**](#PriorityLevelEnum) |  |  [optional] |
|**backupDir** | **String** | path to the folder that will be backed up |  [optional] |
|**workingDir** | **String** | path to the folder that will be backed up |  [optional] |
|**skiplist** | **String** | a json string describing the items to skip in the backup set |  [optional] |
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
| WORKSTATION | &quot;workstation&quot; |
| SERVER | &quot;server&quot; |
| DESKTOP | &quot;desktop&quot; |
| LAPTOP | &quot;laptop&quot; |
| DEVICE | &quot;device&quot; |



## Enum: PriorityLevelEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| CRITICAL | &quot;critical&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]
