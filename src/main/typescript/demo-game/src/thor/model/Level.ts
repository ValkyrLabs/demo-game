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
 * a game level
 * @export
 * @interface Level
 */
export type Level  = {
    /**
     * the name of level
     * @type {string}
     * @memberof Level
     */
    name?: string;
    /**
     * the sequential level index (if applicable)
     * @type {number}
     * @memberof Level
     */
    level?: number;
    /**
     * use to increment extra points for harder levels
     * @type {number}
     * @memberof Level
     */
    scoreMultiplier?: number;
    /**
     * 
     * @type {string}
     * @memberof Level
     */
    color?: LevelColorEnum;
    /**
     * the type of the level
     * @type {string}
     * @memberof Level
     */
    levelType?: LevelLevelTypeEnum;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof Level
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof Level
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof Level
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof Level
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof Level
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof Level
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof Level
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof Level
     */
    lastModifiedDate?: Date;
}

export function LevelFromJSON(json: any): Level {
    return {
        'name': !exists(json, 'name') ? undefined : json['name'],
        'level': !exists(json, 'level') ? undefined : json['level'],
        'scoreMultiplier': !exists(json, 'scoreMultiplier') ? undefined : json['scoreMultiplier'],
        'color': !exists(json, 'color') ? undefined : json['color'],
        'levelType': !exists(json, 'levelType') ? undefined : json['levelType'],
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

export function LevelToJSON(value?: Level): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'name': value.name,
        'level': value.level,
        'scoreMultiplier': value.scoreMultiplier,
        'color': value.color,
        'levelType': value.levelType,
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
export enum LevelColorEnum {
    BLACK = 'black',
    CAMOAIRFORCE = 'camo-airforce',
    CAMOMARINE = 'camo-marine',
    CAMONAVY = 'camo-navy',
    CAMOARMY = 'camo-army',
    GRAY = 'gray',
    OLIVE = 'olive',
    SILVER = 'silver',
    GOLD = 'gold',
    EXOTIC = 'exotic'
}
/**
* @export
* @enum {string}
*/
export enum LevelLevelTypeEnum {
    MAP = 'map',
    ACHIEVEMENT = 'achievement',
    BATTLE = 'battle',
    CINEMATIC = 'cinematic'
}


