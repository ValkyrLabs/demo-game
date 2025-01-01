// tslint:disable
/**
 * Percival the Dragon Slayer API
 * The Percival the Dragon Slayer API
 *
 * The version of the OpenAPI document: 0.9.26
 * Contact: info@valkyrai.pro
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { Meta, OptimisticUpdate, QueryKey, QueryOptions, Rollback, TransformStrategy, Update } from "redux-query";

// un-comment for Vite apps
export const BASE_PATH = import.meta.env.VITE_basePath.replace(/\/+$/, "");

// un-comment for Create REact APp apps
// export const BASE_PATH = process.env.REACT_APP_BASE_PATH.replace(/\/+$/, "");



export const Configuration = {
    basePath: BASE_PATH, // This is the value that will be prepended to all endpoints.  For compatibility with
                  // previous versions, the default is an empty string.  Other generators typically use
                  // BASE_PATH as the default.
};

export interface TypedQueryConfig<TState, TBody> {
    force?: boolean;
    meta?: Meta;
    options?: QueryOptions;
    queryKey?: QueryKey;
    update?: Update<TState>;
    optimisticUpdate?: OptimisticUpdate<TState>;
    retry?: boolean;
    rollback?: Rollback<TState>;
    transform?: TransformStrategy<TState, TBody>
}

export class RequiredError extends Error {
    name: "RequiredError" = "RequiredError";
    constructor(public field: string, msg?: string) {
        super(msg);
    }
}

export const COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};

export type ModelPropertyNaming = 'camelCase' | 'snake_case' | 'PascalCase' | 'original';

export type HttpHeaders = { [key: string]: string };

export function exists(json: any, key: string) {
    const value = json[key];
    return value !== null && value !== undefined;
}

export function mapValues(data: any, fn: (item: any) => any) {
  return Object.keys(data).reduce(
    (acc, key) => ({ ...acc, [key]: fn(data[key]) }),
    {}
  );
}