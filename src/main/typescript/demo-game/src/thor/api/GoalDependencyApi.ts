// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: GoalDependencyApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    GoalDependency,
    GoalDependencyFromJSON,
    GoalDependencyToJSON,
} from '../model';

export interface DeleteGoalDependencyRequest {
    id: string;
}

export interface GetGoalDependencyRequest {
    id: string;
}

export interface PostGoalDependencyRequest {
    goalDependency: GoalDependency;
}

export interface UpdateGoalDependencyRequest {
    id: string;
    goalDependency: GoalDependency;
}


/**
 * Deletes a specific GoalDependency.
 * Delete a GoalDependency.
 */
function deleteGoalDependencyRaw<T>(requestParameters: DeleteGoalDependencyRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteGoalDependency.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/GoalDependency/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
* Deletes a specific GoalDependency.
* Delete a GoalDependency.
*/
export function deleteGoalDependency<T>(requestParameters: DeleteGoalDependencyRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteGoalDependencyRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single GoalDependency for a specific uid.
 * Retrieve a single GoalDependency
 */
function getGoalDependencyRaw<T>(requestParameters: GetGoalDependencyRequest, requestConfig: runtime.TypedQueryConfig<T, GoalDependency> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getGoalDependency.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/GoalDependency/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GoalDependencyFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single GoalDependency for a specific uid.
* Retrieve a single GoalDependency
*/
export function getGoalDependency<T>(requestParameters: GetGoalDependencyRequest, requestConfig?: runtime.TypedQueryConfig<T, GoalDependency>): QueryConfig<T> {
    return getGoalDependencyRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of GoalDependencys.
 * Retrieve a list of GoalDependencys
 */
function getGoalDependencyListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<GoalDependency>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/GoalDependency`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(GoalDependencyFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of GoalDependencys.
* Retrieve a list of GoalDependencys
*/
export function getGoalDependencyList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<GoalDependency>>): QueryConfig<T> {
    return getGoalDependencyListRaw( requestConfig);
}

/**
 * Creates a new GoalDependency.
 * Create a new GoalDependency
 */
function postGoalDependencyRaw<T>(requestParameters: PostGoalDependencyRequest, requestConfig: runtime.TypedQueryConfig<T, GoalDependency> = {}): QueryConfig<T> {
    if (requestParameters.goalDependency === null || requestParameters.goalDependency === undefined) {
        throw new runtime.RequiredError('goalDependency','Required parameter requestParameters.goalDependency was null or undefined when calling postGoalDependency.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/GoalDependency`,
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
        body: queryParameters || GoalDependencyToJSON(requestParameters.goalDependency),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GoalDependencyFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new GoalDependency.
* Create a new GoalDependency
*/
export function postGoalDependency<T>(requestParameters: PostGoalDependencyRequest, requestConfig?: runtime.TypedQueryConfig<T, GoalDependency>): QueryConfig<T> {
    return postGoalDependencyRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing GoalDependency.
 * Update an existing GoalDependency
 */
function updateGoalDependencyRaw<T>(requestParameters: UpdateGoalDependencyRequest, requestConfig: runtime.TypedQueryConfig<T, GoalDependency> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateGoalDependency.');
    }

    if (requestParameters.goalDependency === null || requestParameters.goalDependency === undefined) {
        throw new runtime.RequiredError('goalDependency','Required parameter requestParameters.goalDependency was null or undefined when calling updateGoalDependency.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/GoalDependency/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        body: queryParameters || GoalDependencyToJSON(requestParameters.goalDependency),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(GoalDependencyFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing GoalDependency.
* Update an existing GoalDependency
*/
export function updateGoalDependency<T>(requestParameters: UpdateGoalDependencyRequest, requestConfig?: runtime.TypedQueryConfig<T, GoalDependency>): QueryConfig<T> {
    return updateGoalDependencyRaw(requestParameters, requestConfig);
}

