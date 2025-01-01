// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: AclEntryApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    AclEntry,
    AclEntryFromJSON,
    AclEntryToJSON,
} from '../model';

export interface DeleteAclEntryRequest {
    id: string;
}

export interface GetAclEntryRequest {
    id: string;
}

export interface PostAclEntryRequest {
    aclEntry: AclEntry;
}

export interface UpdateAclEntryRequest {
    id: string;
    aclEntry: AclEntry;
}


/**
 * Deletes a specific AclEntry.
 * Delete a AclEntry.
 */
function deleteAclEntryRaw<T>(requestParameters: DeleteAclEntryRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteAclEntry.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/AclEntry/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
* Deletes a specific AclEntry.
* Delete a AclEntry.
*/
export function deleteAclEntry<T>(requestParameters: DeleteAclEntryRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteAclEntryRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single AclEntry for a specific uid.
 * Retrieve a single AclEntry
 */
function getAclEntryRaw<T>(requestParameters: GetAclEntryRequest, requestConfig: runtime.TypedQueryConfig<T, AclEntry> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getAclEntry.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/AclEntry/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(AclEntryFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single AclEntry for a specific uid.
* Retrieve a single AclEntry
*/
export function getAclEntry<T>(requestParameters: GetAclEntryRequest, requestConfig?: runtime.TypedQueryConfig<T, AclEntry>): QueryConfig<T> {
    return getAclEntryRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of AclEntrys.
 * Retrieve a list of AclEntrys
 */
function getAclEntryListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<AclEntry>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/AclEntry`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(AclEntryFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of AclEntrys.
* Retrieve a list of AclEntrys
*/
export function getAclEntryList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<AclEntry>>): QueryConfig<T> {
    return getAclEntryListRaw( requestConfig);
}

/**
 * Creates a new AclEntry.
 * Create a new AclEntry
 */
function postAclEntryRaw<T>(requestParameters: PostAclEntryRequest, requestConfig: runtime.TypedQueryConfig<T, AclEntry> = {}): QueryConfig<T> {
    if (requestParameters.aclEntry === null || requestParameters.aclEntry === undefined) {
        throw new runtime.RequiredError('aclEntry','Required parameter requestParameters.aclEntry was null or undefined when calling postAclEntry.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/AclEntry`,
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
        body: queryParameters || AclEntryToJSON(requestParameters.aclEntry),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(AclEntryFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new AclEntry.
* Create a new AclEntry
*/
export function postAclEntry<T>(requestParameters: PostAclEntryRequest, requestConfig?: runtime.TypedQueryConfig<T, AclEntry>): QueryConfig<T> {
    return postAclEntryRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing AclEntry.
 * Update an existing AclEntry
 */
function updateAclEntryRaw<T>(requestParameters: UpdateAclEntryRequest, requestConfig: runtime.TypedQueryConfig<T, AclEntry> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateAclEntry.');
    }

    if (requestParameters.aclEntry === null || requestParameters.aclEntry === undefined) {
        throw new runtime.RequiredError('aclEntry','Required parameter requestParameters.aclEntry was null or undefined when calling updateAclEntry.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/AclEntry/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        body: queryParameters || AclEntryToJSON(requestParameters.aclEntry),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(AclEntryFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing AclEntry.
* Update an existing AclEntry
*/
export function updateAclEntry<T>(requestParameters: UpdateAclEntryRequest, requestConfig?: runtime.TypedQueryConfig<T, AclEntry>): QueryConfig<T> {
    return updateAclEntryRaw(requestParameters, requestConfig);
}

