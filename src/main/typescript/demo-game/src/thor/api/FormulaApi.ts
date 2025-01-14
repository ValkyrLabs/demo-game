// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: FormulaApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    Formula,
    FormulaFromJSON,
    FormulaToJSON,
} from '../model';

export interface DeleteFormulaRequest {
    id: string;
}

export interface GetFormulaRequest {
    id: string;
}

export interface PostFormulaRequest {
    formula: Formula;
}

export interface UpdateFormulaRequest {
    id: string;
    formula: Formula;
}


/**
 * Deletes a specific Formula.
 * Delete a Formula.
 */
function deleteFormulaRaw<T>(requestParameters: DeleteFormulaRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteFormula.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Formula/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
* Deletes a specific Formula.
* Delete a Formula.
*/
export function deleteFormula<T>(requestParameters: DeleteFormulaRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteFormulaRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single Formula for a specific uid.
 * Retrieve a single Formula
 */
function getFormulaRaw<T>(requestParameters: GetFormulaRequest, requestConfig: runtime.TypedQueryConfig<T, Formula> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getFormula.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Formula/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(FormulaFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single Formula for a specific uid.
* Retrieve a single Formula
*/
export function getFormula<T>(requestParameters: GetFormulaRequest, requestConfig?: runtime.TypedQueryConfig<T, Formula>): QueryConfig<T> {
    return getFormulaRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of Formulas.
 * Retrieve a list of Formulas
 */
function getFormulaListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<Formula>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Formula`,
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(FormulaFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of Formulas.
* Retrieve a list of Formulas
*/
export function getFormulaList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<Formula>>): QueryConfig<T> {
    return getFormulaListRaw( requestConfig);
}

/**
 * Creates a new Formula.
 * Create a new Formula
 */
function postFormulaRaw<T>(requestParameters: PostFormulaRequest, requestConfig: runtime.TypedQueryConfig<T, Formula> = {}): QueryConfig<T> {
    if (requestParameters.formula === null || requestParameters.formula === undefined) {
        throw new runtime.RequiredError('formula','Required parameter requestParameters.formula was null or undefined when calling postFormula.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Formula`,
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
        body: queryParameters || FormulaToJSON(requestParameters.formula),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(FormulaFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new Formula.
* Create a new Formula
*/
export function postFormula<T>(requestParameters: PostFormulaRequest, requestConfig?: runtime.TypedQueryConfig<T, Formula>): QueryConfig<T> {
    return postFormulaRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing Formula.
 * Update an existing Formula
 */
function updateFormulaRaw<T>(requestParameters: UpdateFormulaRequest, requestConfig: runtime.TypedQueryConfig<T, Formula> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateFormula.');
    }

    if (requestParameters.formula === null || requestParameters.formula === undefined) {
        throw new runtime.RequiredError('formula','Required parameter requestParameters.formula was null or undefined when calling updateFormula.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/Formula/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
        body: queryParameters || FormulaToJSON(requestParameters.formula),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(FormulaFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing Formula.
* Update an existing Formula
*/
export function updateFormula<T>(requestParameters: UpdateFormulaRequest, requestConfig?: runtime.TypedQueryConfig<T, Formula>): QueryConfig<T> {
    return updateFormulaRaw(requestParameters, requestConfig);
}

