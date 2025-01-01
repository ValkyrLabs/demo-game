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
 * Metadata for ThorUX components.
 * @export
 * @interface ThorUXMeta
 */
export type ThorUXMeta  = {
    /**
     * Temporary string holder for config data.
     * @type {string}
     * @memberof ThorUXMeta
     */
    thoruxComponents?: string;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof ThorUXMeta
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof ThorUXMeta
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof ThorUXMeta
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof ThorUXMeta
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof ThorUXMeta
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof ThorUXMeta
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof ThorUXMeta
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof ThorUXMeta
     */
    lastModifiedDate?: Date;
}

export function ThorUXMetaFromJSON(json: any): ThorUXMeta {
    return {
        'thoruxComponents': !exists(json, 'thoruxComponents') ? undefined : json['thoruxComponents'],
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

export function ThorUXMetaToJSON(value?: ThorUXMeta): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'thoruxComponents': value.thoruxComponents,
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

