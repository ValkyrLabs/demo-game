// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Valkyr Labs ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: LevelApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    Level,
    LevelFromJSON,
    LevelToJSON,
} from '../model';

export interface DeleteLevelRequest {
    id: string;
}

export interface GetLevelRequest {
    id: string;
}

export interface PostLevelRequest {
    level: Level;
}

export interface UpdateLevelRequest {
    id: string;
    level: Level;
}


/**
 * Deletes a specific Level.
 * Delete a Level.
 */
function deleteLevelRaw<T>(requestParameters: DeleteLevelRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteLevel.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Level/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
* Deletes a specific Level.
* Delete a Level.
*/
export function deleteLevel<T>(requestParameters: DeleteLevelRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteLevelRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single Level for a specific uid.
 * Retrieve a single Level
 */
function getLevelRaw<T>(requestParameters: GetLevelRequest, requestConfig: runtime.TypedQueryConfig<T, Level> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getLevel.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Level/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(LevelFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single Level for a specific uid.
* Retrieve a single Level
*/
export function getLevel<T>(requestParameters: GetLevelRequest, requestConfig?: runtime.TypedQueryConfig<T, Level>): QueryConfig<T> {
    return getLevelRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of Levels.
 * Retrieve a list of Levels
 */
function getLevelListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<Level>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Level`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(LevelFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of Levels.
* Retrieve a list of Levels
*/
export function getLevelList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<Level>>): QueryConfig<T> {
    return getLevelListRaw( requestConfig);
}

/**
 * Creates a new Level.
 * Create a new Level
 */
function postLevelRaw<T>(requestParameters: PostLevelRequest, requestConfig: runtime.TypedQueryConfig<T, Level> = {}): QueryConfig<T> {
    if (requestParameters.level === null || requestParameters.level === undefined) {
        throw new runtime.RequiredError('level','Required parameter requestParameters.level was null or undefined when calling postLevel.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Level`,
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
        body: queryParameters || LevelToJSON(requestParameters.level),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(LevelFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new Level.
* Create a new Level
*/
export function postLevel<T>(requestParameters: PostLevelRequest, requestConfig?: runtime.TypedQueryConfig<T, Level>): QueryConfig<T> {
    return postLevelRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing Level.
 * Update an existing Level
 */
function updateLevelRaw<T>(requestParameters: UpdateLevelRequest, requestConfig: runtime.TypedQueryConfig<T, Level> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateLevel.');
    }

    if (requestParameters.level === null || requestParameters.level === undefined) {
        throw new runtime.RequiredError('level','Required parameter requestParameters.level was null or undefined when calling updateLevel.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Level/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        body: queryParameters || LevelToJSON(requestParameters.level),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(LevelFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing Level.
* Update an existing Level
*/
export function updateLevel<T>(requestParameters: UpdateLevelRequest, requestConfig?: runtime.TypedQueryConfig<T, Level>): QueryConfig<T> {
    return updateLevelRaw(requestParameters, requestConfig);
}
