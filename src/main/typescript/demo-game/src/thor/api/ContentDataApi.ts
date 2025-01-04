// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Valkyr Labs ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: ContentDataApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    ContentData,
    ContentDataFromJSON,
    ContentDataToJSON,
} from '../model';

export interface DeleteContentDataRequest {
    id: string;
}

export interface GetContentDataRequest {
    id: string;
}

export interface PostContentDataRequest {
    contentData: ContentData;
}

export interface UpdateContentDataRequest {
    id: string;
    contentData: ContentData;
}


/**
 * Deletes a specific ContentData.
 * Delete a ContentData.
 */
function deleteContentDataRaw<T>(requestParameters: DeleteContentDataRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteContentData.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ContentData/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
* Deletes a specific ContentData.
* Delete a ContentData.
*/
export function deleteContentData<T>(requestParameters: DeleteContentDataRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteContentDataRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single ContentData for a specific uid.
 * Retrieve a single ContentData
 */
function getContentDataRaw<T>(requestParameters: GetContentDataRequest, requestConfig: runtime.TypedQueryConfig<T, ContentData> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getContentData.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ContentData/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ContentDataFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single ContentData for a specific uid.
* Retrieve a single ContentData
*/
export function getContentData<T>(requestParameters: GetContentDataRequest, requestConfig?: runtime.TypedQueryConfig<T, ContentData>): QueryConfig<T> {
    return getContentDataRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of ContentDatas.
 * Retrieve a list of ContentDatas
 */
function getContentDataListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<ContentData>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ContentData`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(ContentDataFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of ContentDatas.
* Retrieve a list of ContentDatas
*/
export function getContentDataList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<ContentData>>): QueryConfig<T> {
    return getContentDataListRaw( requestConfig);
}

/**
 * Creates a new ContentData.
 * Create a new ContentData
 */
function postContentDataRaw<T>(requestParameters: PostContentDataRequest, requestConfig: runtime.TypedQueryConfig<T, ContentData> = {}): QueryConfig<T> {
    if (requestParameters.contentData === null || requestParameters.contentData === undefined) {
        throw new runtime.RequiredError('contentData','Required parameter requestParameters.contentData was null or undefined when calling postContentData.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ContentData`,
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
        body: queryParameters || ContentDataToJSON(requestParameters.contentData),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ContentDataFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new ContentData.
* Create a new ContentData
*/
export function postContentData<T>(requestParameters: PostContentDataRequest, requestConfig?: runtime.TypedQueryConfig<T, ContentData>): QueryConfig<T> {
    return postContentDataRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing ContentData.
 * Update an existing ContentData
 */
function updateContentDataRaw<T>(requestParameters: UpdateContentDataRequest, requestConfig: runtime.TypedQueryConfig<T, ContentData> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateContentData.');
    }

    if (requestParameters.contentData === null || requestParameters.contentData === undefined) {
        throw new runtime.RequiredError('contentData','Required parameter requestParameters.contentData was null or undefined when calling updateContentData.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ContentData/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        body: queryParameters || ContentDataToJSON(requestParameters.contentData),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ContentDataFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing ContentData.
* Update an existing ContentData
*/
export function updateContentData<T>(requestParameters: UpdateContentDataRequest, requestConfig?: runtime.TypedQueryConfig<T, ContentData>): QueryConfig<T> {
    return updateContentDataRaw(requestParameters, requestConfig);
}

