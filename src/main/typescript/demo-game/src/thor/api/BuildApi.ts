// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: BuildApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    Build,
    BuildFromJSON,
    BuildToJSON,
} from '../model';

export interface DeleteBuildRequest {
    id: string;
}

export interface GetBuildRequest {
    id: string;
}

export interface PostBuildRequest {
    build: Build;
}

export interface UpdateBuildRequest {
    id: string;
    build: Build;
}


/**
 * Deletes a specific Build.
 * Delete a Build.
 */
function deleteBuildRaw<T>(requestParameters: DeleteBuildRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteBuild.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Build/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
* Deletes a specific Build.
* Delete a Build.
*/
export function deleteBuild<T>(requestParameters: DeleteBuildRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteBuildRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single Build for a specific uid.
 * Retrieve a single Build
 */
function getBuildRaw<T>(requestParameters: GetBuildRequest, requestConfig: runtime.TypedQueryConfig<T, Build> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getBuild.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Build/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(BuildFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single Build for a specific uid.
* Retrieve a single Build
*/
export function getBuild<T>(requestParameters: GetBuildRequest, requestConfig?: runtime.TypedQueryConfig<T, Build>): QueryConfig<T> {
    return getBuildRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of Builds.
 * Retrieve a list of Builds
 */
function getBuildListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<Build>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Build`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(BuildFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of Builds.
* Retrieve a list of Builds
*/
export function getBuildList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<Build>>): QueryConfig<T> {
    return getBuildListRaw( requestConfig);
}

/**
 * Creates a new Build.
 * Create a new Build
 */
function postBuildRaw<T>(requestParameters: PostBuildRequest, requestConfig: runtime.TypedQueryConfig<T, Build> = {}): QueryConfig<T> {
    if (requestParameters.build === null || requestParameters.build === undefined) {
        throw new runtime.RequiredError('build','Required parameter requestParameters.build was null or undefined when calling postBuild.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Build`,
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
        body: queryParameters || BuildToJSON(requestParameters.build),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(BuildFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new Build.
* Create a new Build
*/
export function postBuild<T>(requestParameters: PostBuildRequest, requestConfig?: runtime.TypedQueryConfig<T, Build>): QueryConfig<T> {
    return postBuildRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing Build.
 * Update an existing Build
 */
function updateBuildRaw<T>(requestParameters: UpdateBuildRequest, requestConfig: runtime.TypedQueryConfig<T, Build> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateBuild.');
    }

    if (requestParameters.build === null || requestParameters.build === undefined) {
        throw new runtime.RequiredError('build','Required parameter requestParameters.build was null or undefined when calling updateBuild.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Build/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        body: queryParameters || BuildToJSON(requestParameters.build),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(BuildFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing Build.
* Update an existing Build
*/
export function updateBuild<T>(requestParameters: UpdateBuildRequest, requestConfig?: runtime.TypedQueryConfig<T, Build>): QueryConfig<T> {
    return updateBuildRaw(requestParameters, requestConfig);
}

