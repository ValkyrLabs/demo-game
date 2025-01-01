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


    OasEnum,
    OasEnumFromJSON,
    OasEnumToJSON,
    OasRequired,
    OasRequiredFromJSON,
    OasRequiredToJSON,
} from './';


// thorapi

/**
 * a schema object in the OAS Spec
 * @export
 * @interface OasObjectSchema
 */
export type OasObjectSchema  = {
    /**
     * 
     * @type {string}
     * @memberof OasObjectSchema
     */
    oasComponentsId?: string;
    /**
     * 
     * @type {string}
     * @memberof OasObjectSchema
     */
    oasParameterId?: string;
    /**
     * 
     * @type {string}
     * @memberof OasObjectSchema
     */
    oasResponseId?: string;
    /**
     * 
     * @type {string}
     * @memberof OasObjectSchema
     */
    type?: string;
    /**
     * 
     * @type {string}
     * @memberof OasObjectSchema
     */
    format?: string;
    /**
     * 
     * @type {Array<OasEnum>}
     * @memberof OasObjectSchema
     */
    oasEnum?: Array<OasEnum>;
    /**
     * 
     * @type {Array<OasRequired>}
     * @memberof OasObjectSchema
     */
    required?: Array<OasRequired>;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof OasObjectSchema
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof OasObjectSchema
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof OasObjectSchema
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof OasObjectSchema
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof OasObjectSchema
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof OasObjectSchema
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof OasObjectSchema
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof OasObjectSchema
     */
    lastModifiedDate?: Date;
}

export function OasObjectSchemaFromJSON(json: any): OasObjectSchema {
    return {
        'oasComponentsId': !exists(json, 'oasComponentsId') ? undefined : json['oasComponentsId'],
        'oasParameterId': !exists(json, 'oasParameterId') ? undefined : json['oasParameterId'],
        'oasResponseId': !exists(json, 'oasResponseId') ? undefined : json['oasResponseId'],
        'type': !exists(json, 'type') ? undefined : json['type'],
        'format': !exists(json, 'format') ? undefined : json['format'],
        'oasEnum': !exists(json, 'oasEnum') ? undefined : (json['oasEnum'] as Array<any>).map(OasEnumFromJSON),
        'required': !exists(json, 'required') ? undefined : (json['required'] as Array<any>).map(OasRequiredFromJSON),
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

export function OasObjectSchemaToJSON(value?: OasObjectSchema): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'oasComponentsId': value.oasComponentsId,
        'oasParameterId': value.oasParameterId,
        'oasResponseId': value.oasResponseId,
        'type': value.type,
        'format': value.format,
        'oasEnum': value.oasEnum === undefined ? undefined : (value.oasEnum as Array<any>).map(OasEnumToJSON),
        'required': value.required === undefined ? undefined : (value.required as Array<any>).map(OasRequiredToJSON),
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


