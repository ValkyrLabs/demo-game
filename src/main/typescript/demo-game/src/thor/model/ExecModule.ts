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


    IntegrationAccount,
    IntegrationAccountFromJSON,
    IntegrationAccountToJSON,
} from './';


// thorapi

/**
 * ExecModule is the execution unit of the ValkyrAI Workflow Engine
 * @export
 * @interface ExecModule
 */
export type ExecModule  = {
    /**
     * UUID of the system object being mutated/read (if any)
     * @type {string}
     * @memberof ExecModule
     */
    systemId?: string;
    /**
     * The task this module is executing in
     * @type {string}
     * @memberof ExecModule
     */
    taskId?: string;
    /**
     * the RBAC role to use in mutating/reading any system object
     * @type {string}
     * @memberof ExecModule
     */
    role?: ExecModuleRoleEnum;
    /**
     * the name of the module
     * @type {string}
     * @memberof ExecModule
     */
    name?: string;
    /**
     * notes about the module
     * @type {string}
     * @memberof ExecModule
     */
    notes?: string;
    /**
     * 
     * @type {IntegrationAccount}
     * @memberof ExecModule
     */
    integrationAccount?: IntegrationAccount;
    /**
     * the name of the implementation class for this module
     * @type {string}
     * @memberof ExecModule
     */
    className?: string;
    /**
     * the type of module
     * @type {string}
     * @memberof ExecModule
     */
    moduleType?: ExecModuleModuleTypeEnum;
    /**
     * json for configuring the module
     * @type {string}
     * @memberof ExecModule
     */
    moduleData?: string;
    /**
     * last known status of the module
     * @type {string}
     * @memberof ExecModule
     */
    status?: ExecModuleStatusEnum;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof ExecModule
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof ExecModule
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof ExecModule
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof ExecModule
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof ExecModule
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof ExecModule
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof ExecModule
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof ExecModule
     */
    lastModifiedDate?: Date;
}

export function ExecModuleFromJSON(json: any): ExecModule {
    return {
        'systemId': !exists(json, 'systemId') ? undefined : json['systemId'],
        'taskId': !exists(json, 'taskId') ? undefined : json['taskId'],
        'role': !exists(json, 'role') ? undefined : json['role'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'notes': !exists(json, 'notes') ? undefined : json['notes'],
        'integrationAccount': !exists(json, 'integrationAccount') ? undefined : IntegrationAccountFromJSON(json['integrationAccount']),
        'className': !exists(json, 'className') ? undefined : json['className'],
        'moduleType': !exists(json, 'moduleType') ? undefined : json['moduleType'],
        'moduleData': !exists(json, 'moduleData') ? undefined : json['moduleData'],
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

export function ExecModuleToJSON(value?: ExecModule): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'systemId': value.systemId,
        'taskId': value.taskId,
        'role': value.role,
        'name': value.name,
        'notes': value.notes,
        'integrationAccount': IntegrationAccountToJSON(value.integrationAccount),
        'className': value.className,
        'moduleType': value.moduleType,
        'moduleData': value.moduleData,
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
export enum ExecModuleRoleEnum {
    ANONYMOUS = 'anonymous',
    USER = 'user',
    ADMIN = 'admin'
}
/**
* @export
* @enum {string}
*/
export enum ExecModuleModuleTypeEnum {
    BROADCAST = 'broadcast',
    IO = 'io',
    READER = 'reader',
    WRITER = 'writer',
    TRANSFORMER = 'transformer'
}
/**
* @export
* @enum {string}
*/
export enum ExecModuleStatusEnum {
    RUNNING = 'running',
    STOPPED = 'stopped',
    READY = 'ready',
    GOOD = 'good',
    WARNING = 'warning',
    ERROR = 'error',
    DISABLED = 'disabled'
}


