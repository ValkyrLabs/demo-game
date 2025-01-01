// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: LoginApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    Login,
    LoginFromJSON,
    LoginToJSON,
} from '../model';

export interface DeleteLoginRequest {
    id: string;
}

export interface GetLoginRequest {
    id: string;
}

export interface PostLoginRequest {
    login: Login;
}

export interface UpdateLoginRequest {
    id: string;
    login: Login;
}


/**
 * Deletes a specific Login.
 * Delete a Login.
 */
function deleteLoginRaw<T>(requestParameters: DeleteLoginRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteLogin.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Login/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
* Deletes a specific Login.
* Delete a Login.
*/
export function deleteLogin<T>(requestParameters: DeleteLoginRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteLoginRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single Login for a specific uid.
 * Retrieve a single Login
 */
function getLoginRaw<T>(requestParameters: GetLoginRequest, requestConfig: runtime.TypedQueryConfig<T, Login> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getLogin.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Login/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(LoginFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single Login for a specific uid.
* Retrieve a single Login
*/
export function getLogin<T>(requestParameters: GetLoginRequest, requestConfig?: runtime.TypedQueryConfig<T, Login>): QueryConfig<T> {
    return getLoginRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of Logins.
 * Retrieve a list of Logins
 */
function getLoginListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<Login>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Login`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(LoginFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of Logins.
* Retrieve a list of Logins
*/
export function getLoginList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<Login>>): QueryConfig<T> {
    return getLoginListRaw( requestConfig);
}

/**
 * Creates a new Login.
 * Create a new Login
 */
function postLoginRaw<T>(requestParameters: PostLoginRequest, requestConfig: runtime.TypedQueryConfig<T, Login> = {}): QueryConfig<T> {
    if (requestParameters.login === null || requestParameters.login === undefined) {
        throw new runtime.RequiredError('login','Required parameter requestParameters.login was null or undefined when calling postLogin.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Login`,
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
        body: queryParameters || LoginToJSON(requestParameters.login),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(LoginFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new Login.
* Create a new Login
*/
export function postLogin<T>(requestParameters: PostLoginRequest, requestConfig?: runtime.TypedQueryConfig<T, Login>): QueryConfig<T> {
    return postLoginRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing Login.
 * Update an existing Login
 */
function updateLoginRaw<T>(requestParameters: UpdateLoginRequest, requestConfig: runtime.TypedQueryConfig<T, Login> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateLogin.');
    }

    if (requestParameters.login === null || requestParameters.login === undefined) {
        throw new runtime.RequiredError('login','Required parameter requestParameters.login was null or undefined when calling updateLogin.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Login/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        body: queryParameters || LoginToJSON(requestParameters.login),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(LoginFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing Login.
* Update an existing Login
*/
export function updateLogin<T>(requestParameters: UpdateLoginRequest, requestConfig?: runtime.TypedQueryConfig<T, Login>): QueryConfig<T> {
    return updateLoginRaw(requestParameters, requestConfig);
}

