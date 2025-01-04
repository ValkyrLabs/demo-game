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


    Goal,
    GoalFromJSON,
    GoalToJSON,
} from './';


// thorapi

/**
 * Organization-Wide Strategic Priorities
 * @export
 * @interface StrategicPriority
 */
export type StrategicPriority  = {
    /**
     * 
     * @type {string}
     * @memberof StrategicPriority
     */
    name?: string;
    /**
     * high-level description of the strategic priority
     * @type {string}
     * @memberof StrategicPriority
     */
    description?: string;
    /**
     * 
     * @type {string}
     * @memberof StrategicPriority
     */
    priorityLevel?: StrategicPriorityPriorityLevelEnum;
    /**
     * URL for the strategic priority
     * @type {string}
     * @memberof StrategicPriority
     */
    imageUrl?: string;
    /**
     * 
     * @type {Date}
     * @memberof StrategicPriority
     */
    startDate?: Date;
    /**
     * 
     * @type {Date}
     * @memberof StrategicPriority
     */
    targetDate?: Date;
    /**
     * 
     * @type {Array<Goal>}
     * @memberof StrategicPriority
     */
    goals?: Array<Goal>;
    /**
     * 
     * @type {string}
     * @memberof StrategicPriority
     */
    status?: StrategicPriorityStatusEnum;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof StrategicPriority
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof StrategicPriority
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof StrategicPriority
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof StrategicPriority
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof StrategicPriority
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof StrategicPriority
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof StrategicPriority
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof StrategicPriority
     */
    lastModifiedDate?: Date;
}

export function StrategicPriorityFromJSON(json: any): StrategicPriority {
    return {
        'name': !exists(json, 'name') ? undefined : json['name'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'priorityLevel': !exists(json, 'priorityLevel') ? undefined : json['priorityLevel'],
        'imageUrl': !exists(json, 'imageUrl') ? undefined : json['imageUrl'],
        'startDate': !exists(json, 'startDate') ? undefined : new Date(json['startDate']),
        'targetDate': !exists(json, 'targetDate') ? undefined : new Date(json['targetDate']),
        'goals': !exists(json, 'goals') ? undefined : (json['goals'] as Array<any>).map(GoalFromJSON),
        'status': !exists(json, 'status') ? undefined : json['status'],
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

export function StrategicPriorityToJSON(value?: StrategicPriority): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'name': value.name,
        'description': value.description,
        'priorityLevel': value.priorityLevel,
        'imageUrl': value.imageUrl,
        'startDate': value.startDate === undefined ? undefined : value.startDate.toISOString().substring(0,10),
        'targetDate': value.targetDate === undefined ? undefined : value.targetDate.toISOString().substring(0,10),
        'goals': value.goals === undefined ? undefined : (value.goals as Array<any>).map(GoalToJSON),
        'status': value.status,
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
export enum StrategicPriorityPriorityLevelEnum {
    LOW = 'low',
    MEDIUM = 'medium',
    HIGH = 'high',
    CRITICAL = 'critical'
}
/**
* @export
* @enum {string}
*/
export enum StrategicPriorityStatusEnum {
    NOTSTARTED = 'not-started',
    INPROGRESS = 'in-progress',
    COMPLETE = 'complete'
}


