// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: OrganizationApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    Organization,
    OrganizationFromJSON,
    OrganizationToJSON,
} from '../model';

export interface DeleteOrganizationRequest {
    id: string;
}

export interface GetOrganizationRequest {
    id: string;
}

export interface PostOrganizationRequest {
    organization: Organization;
}

export interface UpdateOrganizationRequest {
    id: string;
    organization: Organization;
}


/**
 * Deletes a specific Organization.
 * Delete a Organization.
 */
function deleteOrganizationRaw<T>(requestParameters: DeleteOrganizationRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteOrganization.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Organization/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
* Deletes a specific Organization.
* Delete a Organization.
*/
export function deleteOrganization<T>(requestParameters: DeleteOrganizationRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteOrganizationRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single Organization for a specific uid.
 * Retrieve a single Organization
 */
function getOrganizationRaw<T>(requestParameters: GetOrganizationRequest, requestConfig: runtime.TypedQueryConfig<T, Organization> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getOrganization.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Organization/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(OrganizationFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single Organization for a specific uid.
* Retrieve a single Organization
*/
export function getOrganization<T>(requestParameters: GetOrganizationRequest, requestConfig?: runtime.TypedQueryConfig<T, Organization>): QueryConfig<T> {
    return getOrganizationRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of Organizations.
 * Retrieve a list of Organizations
 */
function getOrganizationListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<Organization>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Organization`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(OrganizationFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of Organizations.
* Retrieve a list of Organizations
*/
export function getOrganizationList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<Organization>>): QueryConfig<T> {
    return getOrganizationListRaw( requestConfig);
}

/**
 * Creates a new Organization.
 * Create a new Organization
 */
function postOrganizationRaw<T>(requestParameters: PostOrganizationRequest, requestConfig: runtime.TypedQueryConfig<T, Organization> = {}): QueryConfig<T> {
    if (requestParameters.organization === null || requestParameters.organization === undefined) {
        throw new runtime.RequiredError('organization','Required parameter requestParameters.organization was null or undefined when calling postOrganization.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Organization`,
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
        body: queryParameters || OrganizationToJSON(requestParameters.organization),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(OrganizationFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new Organization.
* Create a new Organization
*/
export function postOrganization<T>(requestParameters: PostOrganizationRequest, requestConfig?: runtime.TypedQueryConfig<T, Organization>): QueryConfig<T> {
    return postOrganizationRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing Organization.
 * Update an existing Organization
 */
function updateOrganizationRaw<T>(requestParameters: UpdateOrganizationRequest, requestConfig: runtime.TypedQueryConfig<T, Organization> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateOrganization.');
    }

    if (requestParameters.organization === null || requestParameters.organization === undefined) {
        throw new runtime.RequiredError('organization','Required parameter requestParameters.organization was null or undefined when calling updateOrganization.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Organization/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        body: queryParameters || OrganizationToJSON(requestParameters.organization),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(OrganizationFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing Organization.
* Update an existing Organization
*/
export function updateOrganization<T>(requestParameters: UpdateOrganizationRequest, requestConfig?: runtime.TypedQueryConfig<T, Organization>): QueryConfig<T> {
    return updateOrganizationRaw(requestParameters, requestConfig);
}
