// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: TaskApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    Task,
    TaskFromJSON,
    TaskToJSON,
} from '../model';

export interface DeleteTaskRequest {
    id: string;
}

export interface GetTaskRequest {
    id: string;
}

export interface PostTaskRequest {
    task: Task;
}

export interface UpdateTaskRequest {
    id: string;
    task: Task;
}


/**
 * Deletes a specific Task.
 * Delete a Task.
 */
function deleteTaskRaw<T>(requestParameters: DeleteTaskRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteTask.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Task/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
* Deletes a specific Task.
* Delete a Task.
*/
export function deleteTask<T>(requestParameters: DeleteTaskRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteTaskRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single Task for a specific uid.
 * Retrieve a single Task
 */
function getTaskRaw<T>(requestParameters: GetTaskRequest, requestConfig: runtime.TypedQueryConfig<T, Task> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getTask.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Task/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(TaskFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single Task for a specific uid.
* Retrieve a single Task
*/
export function getTask<T>(requestParameters: GetTaskRequest, requestConfig?: runtime.TypedQueryConfig<T, Task>): QueryConfig<T> {
    return getTaskRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of Tasks.
 * Retrieve a list of Tasks
 */
function getTaskListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<Task>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Task`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(TaskFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of Tasks.
* Retrieve a list of Tasks
*/
export function getTaskList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<Task>>): QueryConfig<T> {
    return getTaskListRaw( requestConfig);
}

/**
 * Creates a new Task.
 * Create a new Task
 */
function postTaskRaw<T>(requestParameters: PostTaskRequest, requestConfig: runtime.TypedQueryConfig<T, Task> = {}): QueryConfig<T> {
    if (requestParameters.task === null || requestParameters.task === undefined) {
        throw new runtime.RequiredError('task','Required parameter requestParameters.task was null or undefined when calling postTask.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Task`,
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
        body: queryParameters || TaskToJSON(requestParameters.task),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(TaskFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new Task.
* Create a new Task
*/
export function postTask<T>(requestParameters: PostTaskRequest, requestConfig?: runtime.TypedQueryConfig<T, Task>): QueryConfig<T> {
    return postTaskRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing Task.
 * Update an existing Task
 */
function updateTaskRaw<T>(requestParameters: UpdateTaskRequest, requestConfig: runtime.TypedQueryConfig<T, Task> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateTask.');
    }

    if (requestParameters.task === null || requestParameters.task === undefined) {
        throw new runtime.RequiredError('task','Required parameter requestParameters.task was null or undefined when calling updateTask.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Task/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        body: queryParameters || TaskToJSON(requestParameters.task),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(TaskFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing Task.
* Update an existing Task
*/
export function updateTask<T>(requestParameters: UpdateTaskRequest, requestConfig?: runtime.TypedQueryConfig<T, Task>): QueryConfig<T> {
    return updateTaskRaw(requestParameters, requestConfig);
}
