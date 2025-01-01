// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: CampaignApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    Campaign,
    CampaignFromJSON,
    CampaignToJSON,
} from '../model';

export interface DeleteCampaignRequest {
    id: string;
}

export interface GetCampaignRequest {
    id: string;
}

export interface PostCampaignRequest {
    campaign: Campaign;
}

export interface UpdateCampaignRequest {
    id: string;
    campaign: Campaign;
}


/**
 * Deletes a specific Campaign.
 * Delete a Campaign.
 */
function deleteCampaignRaw<T>(requestParameters: DeleteCampaignRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteCampaign.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Campaign/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
* Deletes a specific Campaign.
* Delete a Campaign.
*/
export function deleteCampaign<T>(requestParameters: DeleteCampaignRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteCampaignRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single Campaign for a specific uid.
 * Retrieve a single Campaign
 */
function getCampaignRaw<T>(requestParameters: GetCampaignRequest, requestConfig: runtime.TypedQueryConfig<T, Campaign> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getCampaign.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Campaign/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(CampaignFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single Campaign for a specific uid.
* Retrieve a single Campaign
*/
export function getCampaign<T>(requestParameters: GetCampaignRequest, requestConfig?: runtime.TypedQueryConfig<T, Campaign>): QueryConfig<T> {
    return getCampaignRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of Campaigns.
 * Retrieve a list of Campaigns
 */
function getCampaignListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<Campaign>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Campaign`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(CampaignFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of Campaigns.
* Retrieve a list of Campaigns
*/
export function getCampaignList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<Campaign>>): QueryConfig<T> {
    return getCampaignListRaw( requestConfig);
}

/**
 * Creates a new Campaign.
 * Create a new Campaign
 */
function postCampaignRaw<T>(requestParameters: PostCampaignRequest, requestConfig: runtime.TypedQueryConfig<T, Campaign> = {}): QueryConfig<T> {
    if (requestParameters.campaign === null || requestParameters.campaign === undefined) {
        throw new runtime.RequiredError('campaign','Required parameter requestParameters.campaign was null or undefined when calling postCampaign.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Campaign`,
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
        body: queryParameters || CampaignToJSON(requestParameters.campaign),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(CampaignFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new Campaign.
* Create a new Campaign
*/
export function postCampaign<T>(requestParameters: PostCampaignRequest, requestConfig?: runtime.TypedQueryConfig<T, Campaign>): QueryConfig<T> {
    return postCampaignRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing Campaign.
 * Update an existing Campaign
 */
function updateCampaignRaw<T>(requestParameters: UpdateCampaignRequest, requestConfig: runtime.TypedQueryConfig<T, Campaign> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateCampaign.');
    }

    if (requestParameters.campaign === null || requestParameters.campaign === undefined) {
        throw new runtime.RequiredError('campaign','Required parameter requestParameters.campaign was null or undefined when calling updateCampaign.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Campaign/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        body: queryParameters || CampaignToJSON(requestParameters.campaign),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(CampaignFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing Campaign.
* Update an existing Campaign
*/
export function updateCampaign<T>(requestParameters: UpdateCampaignRequest, requestConfig?: runtime.TypedQueryConfig<T, Campaign>): QueryConfig<T> {
    return updateCampaignRaw(requestParameters, requestConfig);
}

