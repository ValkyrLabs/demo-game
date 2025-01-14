// tslint:disable
/**
 * ValkyrAI CORE API
 * The API for accessing ValkyrAI services
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
 * ACL identity for an object
 * @export
 * @interface AclObjectIdentity
 */
export type AclObjectIdentity  = {
    /**
     * 
     * @type {string}
     * @memberof AclObjectIdentity
     */
    objectIdClass?: string;
    /**
     * 
     * @type {string}
     * @memberof AclObjectIdentity
     */
    objectIdIdentity?: string;
    /**
     * 
     * @type {string}
     * @memberof AclObjectIdentity
     */
    parentObject?: string;
    /**
     * 
     * @type {string}
     * @memberof AclObjectIdentity
     */
    ownerSid?: string;
    /**
     * 
     * @type {number}
     * @memberof AclObjectIdentity
     */
    entriesInheriting?: number;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof AclObjectIdentity
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof AclObjectIdentity
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof AclObjectIdentity
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof AclObjectIdentity
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof AclObjectIdentity
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof AclObjectIdentity
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof AclObjectIdentity
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof AclObjectIdentity
     */
    lastModifiedDate?: Date;
}

export function AclObjectIdentityFromJSON(json: any): AclObjectIdentity {
    return {
        'objectIdClass': !exists(json, 'objectIdClass') ? undefined : json['objectIdClass'],
        'objectIdIdentity': !exists(json, 'objectIdIdentity') ? undefined : json['objectIdIdentity'],
        'parentObject': !exists(json, 'parentObject') ? undefined : json['parentObject'],
        'ownerSid': !exists(json, 'ownerSid') ? undefined : json['ownerSid'],
        'entriesInheriting': !exists(json, 'entriesInheriting') ? undefined : json['entriesInheriting'],
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

export function AclObjectIdentityToJSON(value?: AclObjectIdentity): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'objectIdClass': value.objectIdClass,
        'objectIdIdentity': value.objectIdIdentity,
        'parentObject': value.parentObject,
        'ownerSid': value.ownerSid,
        'entriesInheriting': value.entriesInheriting,
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


