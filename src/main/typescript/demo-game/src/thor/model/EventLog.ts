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
 * Logs specific Workflow Related Events
 * @export
 * @interface EventLog
 */
export type EventLog  = {
    /**
     * detailed event description
     * @type {string}
     * @memberof EventLog
     */
    eventDetails?: string;
    /**
     * status for event
     * @type {string}
     * @memberof EventLog
     */
    status?: EventLogStatusEnum;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof EventLog
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof EventLog
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof EventLog
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof EventLog
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof EventLog
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof EventLog
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof EventLog
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof EventLog
     */
    lastModifiedDate?: Date;
}

export function EventLogFromJSON(json: any): EventLog {
    return {
        'eventDetails': !exists(json, 'eventDetails') ? undefined : json['eventDetails'],
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

export function EventLogToJSON(value?: EventLog): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'eventDetails': value.eventDetails,
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
export enum EventLogStatusEnum {
    OK = 'ok',
    ERROR = 'error',
    DISABLED = 'disabled'
}


