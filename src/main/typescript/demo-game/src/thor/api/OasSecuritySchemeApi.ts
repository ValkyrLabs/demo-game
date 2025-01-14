// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: OasSecuritySchemeApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    OasSecurityScheme,
    OasSecuritySchemeFromJSON,
    OasSecuritySchemeToJSON,
} from '../model';

export interface DeleteOasSecuritySchemeRequest {
    id: string;
}

export interface GetOasSecuritySchemeRequest {
    id: string;
}

export interface PostOasSecuritySchemeRequest {
    oasSecurityScheme: OasSecurityScheme;
}

export interface UpdateOasSecuritySchemeRequest {
    id: string;
    oasSecurityScheme: OasSecurityScheme;
}


/**
 * Deletes a specific OasSecurityScheme.
 * Delete a OasSecurityScheme.
 */
function deleteOasSecuritySchemeRaw<T>(requestParameters: DeleteOasSecuritySchemeRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteOasSecurityScheme.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/OasSecurityScheme/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
* Deletes a specific OasSecurityScheme.
* Delete a OasSecurityScheme.
*/
export function deleteOasSecurityScheme<T>(requestParameters: DeleteOasSecuritySchemeRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteOasSecuritySchemeRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single OasSecurityScheme for a specific uid.
 * Retrieve a single OasSecurityScheme
 */
function getOasSecuritySchemeRaw<T>(requestParameters: GetOasSecuritySchemeRequest, requestConfig: runtime.TypedQueryConfig<T, OasSecurityScheme> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getOasSecurityScheme.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/OasSecurityScheme/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(OasSecuritySchemeFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single OasSecurityScheme for a specific uid.
* Retrieve a single OasSecurityScheme
*/
export function getOasSecurityScheme<T>(requestParameters: GetOasSecuritySchemeRequest, requestConfig?: runtime.TypedQueryConfig<T, OasSecurityScheme>): QueryConfig<T> {
    return getOasSecuritySchemeRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of OasSecuritySchemes.
 * Retrieve a list of OasSecuritySchemes
 */
function getOasSecuritySchemeListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<OasSecurityScheme>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/OasSecurityScheme`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(OasSecuritySchemeFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of OasSecuritySchemes.
* Retrieve a list of OasSecuritySchemes
*/
export function getOasSecuritySchemeList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<OasSecurityScheme>>): QueryConfig<T> {
    return getOasSecuritySchemeListRaw( requestConfig);
}

/**
 * Creates a new OasSecurityScheme.
 * Create a new OasSecurityScheme
 */
function postOasSecuritySchemeRaw<T>(requestParameters: PostOasSecuritySchemeRequest, requestConfig: runtime.TypedQueryConfig<T, OasSecurityScheme> = {}): QueryConfig<T> {
    if (requestParameters.oasSecurityScheme === null || requestParameters.oasSecurityScheme === undefined) {
        throw new runtime.RequiredError('oasSecurityScheme','Required parameter requestParameters.oasSecurityScheme was null or undefined when calling postOasSecurityScheme.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/OasSecurityScheme`,
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
        body: queryParameters || OasSecuritySchemeToJSON(requestParameters.oasSecurityScheme),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(OasSecuritySchemeFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new OasSecurityScheme.
* Create a new OasSecurityScheme
*/
export function postOasSecurityScheme<T>(requestParameters: PostOasSecuritySchemeRequest, requestConfig?: runtime.TypedQueryConfig<T, OasSecurityScheme>): QueryConfig<T> {
    return postOasSecuritySchemeRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing OasSecurityScheme.
 * Update an existing OasSecurityScheme
 */
function updateOasSecuritySchemeRaw<T>(requestParameters: UpdateOasSecuritySchemeRequest, requestConfig: runtime.TypedQueryConfig<T, OasSecurityScheme> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateOasSecurityScheme.');
    }

    if (requestParameters.oasSecurityScheme === null || requestParameters.oasSecurityScheme === undefined) {
        throw new runtime.RequiredError('oasSecurityScheme','Required parameter requestParameters.oasSecurityScheme was null or undefined when calling updateOasSecurityScheme.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/OasSecurityScheme/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        body: queryParameters || OasSecuritySchemeToJSON(requestParameters.oasSecurityScheme),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(OasSecuritySchemeFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing OasSecurityScheme.
* Update an existing OasSecurityScheme
*/
export function updateOasSecurityScheme<T>(requestParameters: UpdateOasSecuritySchemeRequest, requestConfig?: runtime.TypedQueryConfig<T, OasSecurityScheme>): QueryConfig<T> {
    return updateOasSecuritySchemeRaw(requestParameters, requestConfig);
}

