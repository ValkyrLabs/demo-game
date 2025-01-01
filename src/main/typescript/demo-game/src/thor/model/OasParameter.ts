// tslint:disable
/**
 * Percival the Dragon Slayer CORE API
 * The API for accessing Percival the Dragon Slayer services
 *
 * The version of the OpenAPI document: 0.9.25
 * Contact: info@valkyrlabs.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../src/runtime';
import {


    OasObjectSchema,
    OasObjectSchemaFromJSON,
    OasObjectSchemaToJSON,
} from './';


// thorapi

/**
 * a parameter to a request in the OAS Spec
 * @export
 * @interface OasParameter
 */
export type OasParameter  = {
    /**
     * 
     * @type {string}
     * @memberof OasParameter
     */
    oasOperationId?: string;
    /**
     * 
     * @type {string}
     * @memberof OasParameter
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof OasParameter
     */
    location?: OasParameterLocationEnum;
    /**
     * 
     * @type {string}
     * @memberof OasParameter
     */
    description?: string;
    /**
     * 
     * @type {boolean}
     * @memberof OasParameter
     */
    required?: boolean;
    /**
     * 
     * @type {OasObjectSchema}
     * @memberof OasParameter
     */
    schema?: OasObjectSchema;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof OasParameter
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof OasParameter
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof OasParameter
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof OasParameter
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof OasParameter
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof OasParameter
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof OasParameter
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof OasParameter
     */
    lastModifiedDate?: Date;
}

export function OasParameterFromJSON(json: any): OasParameter {
    return {
        'oasOperationId': !exists(json, 'oasOperationId') ? undefined : json['oasOperationId'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'location': !exists(json, 'location') ? undefined : json['location'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'required': !exists(json, 'required') ? undefined : json['required'],
        'schema': !exists(json, 'schema') ? undefined : OasObjectSchemaFromJSON(json['schema']),
        'id': !exists(json, 'id') ? undefined : json['id'],
        'ownerId': !exists(json, 'ownerId') ? undefined : json['ownerId'],
        'createdDate': !exists(json, 'createdDate') ? undefined : new Date(json['createdDate']),
        'keyHash': !exists(json, 'keyHash') ? undefined : json['keyHash'],
        'lastAccessedById': !exists(json, 'lastAccessedById') ? undefined : json['lastAccessedById'],
        'lastAccessedDate': !exists(json, 'lastAccessedDate') ? undefined : new Date(json['lastAccessedDate']),
        'lastModifiedById': !exists(json, 'lastModifiedById') ? undefined : json['lastModifiedById'],
        'lastModifiedDate': !exists(json, 'lastModifiedDate') ? undefined : new Date(json['lastModifiedDate']),
    };
}

export function OasParameterToJSON(value?: OasParameter): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'oasOperationId': value.oasOperationId,
        'name': value.name,
        'location': value.location,
        'description': value.description,
        'required': value.required,
        'schema': OasObjectSchemaToJSON(value.schema),
        'id': value.id,
        'ownerId': value.ownerId,
        'createdDate': value.createdDate === undefined ? undefined : value.createdDate.toISOString(),
        'keyHash': value.keyHash,
        'lastAccessedById': value.lastAccessedById,
        'lastAccessedDate': value.lastAccessedDate === undefined ? undefined : value.lastAccessedDate.toISOString(),
        'lastModifiedById': value.lastModifiedById,
        'lastModifiedDate': value.lastModifiedDate === undefined ? undefined : value.lastModifiedDate.toISOString(),
    };
}

/**
* @export
* @enum {string}
*/
export enum OasParameterLocationEnum {
    QUERY = 'query',
    HEADER = 'header',
    PATH = 'path',
    COOKIE = 'cookie'
}


