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
import {


    Weapon,
    WeaponFromJSON,
    WeaponToJSON,
} from './';


// thorapi

/**
 * DEMO attack of various type
 * @export
 * @interface Attack
 */
export type Attack  = {
    /**
     * the name of the attack
     * @type {string}
     * @memberof Attack
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof Attack
     */
    type?: AttackTypeEnum;
    /**
     * 
     * @type {Weapon}
     * @memberof Attack
     */
    weapon?: Weapon;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof Attack
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof Attack
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof Attack
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof Attack
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof Attack
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof Attack
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof Attack
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof Attack
     */
    lastModifiedDate?: Date;
}

export function AttackFromJSON(json: any): Attack {
    return {
        'name': !exists(json, 'name') ? undefined : json['name'],
        'type': !exists(json, 'type') ? undefined : json['type'],
        'weapon': !exists(json, 'weapon') ? undefined : WeaponFromJSON(json['weapon']),
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

export function AttackToJSON(value?: Attack): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'name': value.name,
        'type': value.type,
        'weapon': WeaponToJSON(value.weapon),
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
export enum AttackTypeEnum {
    FRONTAL = 'frontal',
    SNEAK = 'sneak',
    FROMABOVE = 'from_above',
    FROMBELOW = 'from_below',
    WATER = 'water',
    LAND = 'land',
    AIR = 'air'
}

