// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: MediaObjectApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    MediaObject,
    MediaObjectFromJSON,
    MediaObjectToJSON,
} from '../model';

export interface DeleteMediaObjectRequest {
    id: string;
}

export interface GetMediaObjectRequest {
    id: string;
}

export interface PostMediaObjectRequest {
    mediaObject: MediaObject;
}

export interface UpdateMediaObjectRequest {
    id: string;
    mediaObject: MediaObject;
}


/**
 * Deletes a specific MediaObject.
 * Delete a MediaObject.
 */
function deleteMediaObjectRaw<T>(requestParameters: DeleteMediaObjectRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteMediaObject.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/MediaObject/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'DELETE',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
    }

    return config;
}

/**
* Deletes a specific MediaObject.
* Delete a MediaObject.
*/
export function deleteMediaObject<T>(requestParameters: DeleteMediaObjectRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteMediaObjectRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single MediaObject for a specific uid.
 * Retrieve a single MediaObject
 */
function getMediaObjectRaw<T>(requestParameters: GetMediaObjectRequest, requestConfig: runtime.TypedQueryConfig<T, MediaObject> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getMediaObject.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/MediaObject/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(MediaObjectFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single MediaObject for a specific uid.
* Retrieve a single MediaObject
*/
export function getMediaObject<T>(requestParameters: GetMediaObjectRequest, requestConfig?: runtime.TypedQueryConfig<T, MediaObject>): QueryConfig<T> {
    return getMediaObjectRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of MediaObjects.
 * Retrieve a list of MediaObjects
 */
function getMediaObjectListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<MediaObject>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/MediaObject`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(MediaObjectFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of MediaObjects.
* Retrieve a list of MediaObjects
*/
export function getMediaObjectList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<MediaObject>>): QueryConfig<T> {
    return getMediaObjectListRaw( requestConfig);
}

/**
 * Creates a new MediaObject.
 * Create a new MediaObject
 */
function postMediaObjectRaw<T>(requestParameters: PostMediaObjectRequest, requestConfig: runtime.TypedQueryConfig<T, MediaObject> = {}): QueryConfig<T> {
    if (requestParameters.mediaObject === null || requestParameters.mediaObject === undefined) {
        throw new runtime.RequiredError('mediaObject','Required parameter requestParameters.mediaObject was null or undefined when calling postMediaObject.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/MediaObject`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters || MediaObjectToJSON(requestParameters.mediaObject),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(MediaObjectFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new MediaObject.
* Create a new MediaObject
*/
export function postMediaObject<T>(requestParameters: PostMediaObjectRequest, requestConfig?: runtime.TypedQueryConfig<T, MediaObject>): QueryConfig<T> {
    return postMediaObjectRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing MediaObject.
 * Update an existing MediaObject
 */
function updateMediaObjectRaw<T>(requestParameters: UpdateMediaObjectRequest, requestConfig: runtime.TypedQueryConfig<T, MediaObject> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateMediaObject.');
    }

    if (requestParameters.mediaObject === null || requestParameters.mediaObject === undefined) {
        throw new runtime.RequiredError('mediaObject','Required parameter requestParameters.mediaObject was null or undefined when calling updateMediaObject.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/MediaObject/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'PUT',
            headers: headerParameters,
        },
        body: queryParameters || MediaObjectToJSON(requestParameters.mediaObject),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(MediaObjectFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing MediaObject.
* Update an existing MediaObject
*/
export function updateMediaObject<T>(requestParameters: UpdateMediaObjectRequest, requestConfig?: runtime.TypedQueryConfig<T, MediaObject>): QueryConfig<T> {
    return updateMediaObjectRaw(requestParameters, requestConfig);
}

