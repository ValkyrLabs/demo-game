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

// thorapi

/**
 * ThorAPI System Object Interface
 * @export
 * @interface DataObject
 */
export type DataObject  = {
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof DataObject
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof DataObject
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof DataObject
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof DataObject
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof DataObject
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof DataObject
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof DataObject
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof DataObject
     */
    lastModifiedDate?: Date;
}

export function DataObjectFromJSON(json: any): DataObject {
    return {
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

export function DataObjectToJSON(value?: DataObject): any {
    if (value === undefined) {
        return undefined;
    }
    return {
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


