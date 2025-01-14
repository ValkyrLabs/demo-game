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


    GameWeaponIDX,
    GameWeaponIDXFromJSON,
    GameWeaponIDXToJSON,
} from './';


// thorapi

/**
 * Percival the Dragon Slayer
 * @export
 * @interface Game
 */
export type Game  = {
    /**
     * the name of the game
     * @type {string}
     * @memberof Game
     */
    name?: string;
    /**
     * 
     * @type {Array<GameWeaponIDX>}
     * @memberof Game
     */
    weapons?: Array<GameWeaponIDX>;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof Game
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof Game
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof Game
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof Game
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof Game
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof Game
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof Game
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof Game
     */
    lastModifiedDate?: Date;
}

export function GameFromJSON(json: any): Game {
    return {
        'name': !exists(json, 'name') ? undefined : json['name'],
        'weapons': !exists(json, 'weapons') ? undefined : (json['weapons'] as Array<any>).map(GameWeaponIDXFromJSON),
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

export function GameToJSON(value?: Game): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'name': value.name,
        'weapons': value.weapons === undefined ? undefined : (value.weapons as Array<any>).map(GameWeaponIDXToJSON),
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


