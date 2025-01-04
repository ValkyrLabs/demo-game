---
title: "ValkyrAI API : Weapon"
slug: "model-doc-Weapon"
cover: ""
authors: "OpenAPI-Generator Contributors team@openapitools.org"
needsAuth: false
date: ""
category: "valkyrai-api"
tags: [
        ValkyrAI CORE API,
        org.openapitools,
        Weapon,
        model-docs
    ]
---

# Weapon


## Description
DEMO weapon that can be used for the game

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attackId** | **UUID** |  |  [optional] |
|**name** | **String** | the name of the weapon |  [optional] |
|**game** | [**GameWeaponIDX**](GameWeaponIDX.md) |  |  [optional] |
|**harmLevel** | **Integer** | the the damage output level the weapon can have |  [optional] |
|**weight** | **Integer** | how much one of these weapons weighs in lbs |  [optional] |
|**color** | [**ColorEnum**](#ColorEnum) |  |  [optional] |
|**weaponType** | [**WeaponTypeEnum**](#WeaponTypeEnum) | the type of the weapon |  [optional] |
|**id** | **UUID** | Unique identifier for object in the system |  [optional] |
|**ownerId** | **UUID** | UUID of owner of the object in the system |  [optional] |
|**createdDate** | **OffsetDateTime** | Date of object creation |  [optional] |
|**keyHash** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional] |
|**lastAccessedById** | **UUID** | Last user to access object |  [optional] |
|**lastAccessedDate** | **OffsetDateTime** | Timestamp of last access of object |  [optional] |
|**lastModifiedById** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional] |
|**lastModifiedDate** | **OffsetDateTime** | Date of last object modification |  [optional] |



## Enum: ColorEnum

| Name | Value |
|---- | -----|
| BLACK | &quot;BLACK&quot; |
| CAMO_AIRFORCE | &quot;CAMO-AIRFORCE&quot; |
| CAMO_MARINE | &quot;CAMO-MARINE&quot; |
| CAMO_NAVY | &quot;CAMO-NAVY&quot; |
| CAMO_ARMY | &quot;CAMO-ARMY&quot; |
| GRAY | &quot;GRAY&quot; |
| OLIVE | &quot;OLIVE&quot; |
| SILVER | &quot;SILVER&quot; |
| GOLD | &quot;GOLD&quot; |
| EXOTIC | &quot;EXOTIC&quot; |



## Enum: WeaponTypeEnum

| Name | Value |
|---- | -----|
| BALLISTIC | &quot;BALLISTiC&quot; |
| PROJECTILE | &quot;PROJECTILE&quot; |
| FIRE | &quot;FIRE&quot; |
| KINETIC | &quot;KINETIC&quot; |
| NUCLEAR | &quot;NUCLEAR&quot; |
| MUNITIONS | &quot;MUNITIONS&quot; |
| MELEE | &quot;MELEE&quot; |
| AIRCRAFT | &quot;AIRCRAFT&quot; |
| VESSELS | &quot;VESSELS&quot; |
| BOWS | &quot;BOWS&quot; |
| SLINGS | &quot;SLINGS&quot; |


### Generated Version Details

~ | value
------------- | -------------
**GENERATOR VERSION** | com.valkyrlabs:ValkyrAI API 1.0-SNAPSHOT
**API ARTIFACT** | com.valkyrlabs.valkyrai-api.jar
**GENERATOR VERSION** | org.openapitools.openapi-generator:7.5.0
**GENERATOR CLASS** | org.openapitools.codegen.languages.SpringCodegen
**GENERATED DATE** | 2025-01-03T16:21:43.722881-08:00[America/Los_Angeles]
