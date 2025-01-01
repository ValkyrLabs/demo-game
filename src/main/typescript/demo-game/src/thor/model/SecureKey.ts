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
 * SecureKey is the KMS for the SecureField keys
 * @export
 * @interface SecureKey
 */
export type SecureKey  = {
    /**
     * the algorithm used for encryption/decryption
     * @type {string}
     * @memberof SecureKey
     */
    algorithm: string;
    /**
     * the version of this key
     * @type {string}
     * @memberof SecureKey
     */
    version: string;
    /**
     * the key itself
     * @type {string}
     * @memberof SecureKey
     */
    keyValue: string;
    /**
     * 
     * @type {string}
     * @memberof SecureKey
     */
    status: SecureKeyStatusEnum;
    /**
     * any notes about the key
     * @type {string}
     * @memberof SecureKey
     */
    notes?: string;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof SecureKey
     */
    keyHash?: string;
    /**
     * the exponential strength of the BCrypt hashing used by the Hashing cipher
     * @type {number}
     * @memberof SecureKey
     */
    cipherWorkCost?: number;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof SecureKey
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof SecureKey
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof SecureKey
     */
    createdDate?: Date;
    /**
     * Last user to access object
     * @type {string}
     * @memberof SecureKey
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof SecureKey
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof SecureKey
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof SecureKey
     */
    lastModifiedDate?: Date;
}

export function SecureKeyFromJSON(json: any): SecureKey {
    return {
        'algorithm': json['algorithm'],
        'version': json['version'],
        'keyValue': json['keyValue'],
        'status': json['status'],
        'notes': !exists(json, 'notes') ? undefined : json['notes'],
        'keyHash': !exists(json, 'keyHash') ? undefined : json['keyHash'],
        'cipherWorkCost': !exists(json, 'cipherWorkCost') ? undefined : json['cipherWorkCost'],
        'id': !exists(json, 'id') ? undefined : json['id'],
        'ownerId': !exists(json, 'ownerId') ? undefined : json['ownerId'],
        'createdDate': !exists(json, 'createdDate') ? undefined : new Date(json['createdDate']),
        'lastAccessedById': !exists(json, 'lastAccessedById') ? undefined : json['lastAccessedById'],
        'lastAccessedDate': !exists(json, 'lastAccessedDate') ? undefined : new Date(json['lastAccessedDate']),
        'lastModifiedById': !exists(json, 'lastModifiedById') ? undefined : json['lastModifiedById'],
        'lastModifiedDate': !exists(json, 'lastModifiedDate') ? undefined : new Date(json['lastModifiedDate']),
    };
}

export function SecureKeyToJSON(value?: SecureKey): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'algorithm': value.algorithm,
        'version': value.version,
        'keyValue': value.keyValue,
        'status': value.status,
        'notes': value.notes,
        'keyHash': value.keyHash,
        'cipherWorkCost': value.cipherWorkCost,
        'id': value.id,
        'ownerId': value.ownerId,
        'createdDate': value.createdDate === undefined ? undefined : value.createdDate.toISOString(),
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
export enum SecureKeyStatusEnum {
    KEYACTIVE = 'active',
    KEYDEFAULT = 'default',
    KEYARCHIVED = 'archived',
    KEYREVOKED = 'revoked',
    KEYINVALID = 'invalid'
}

