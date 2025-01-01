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
import {


    Solution,
    SolutionFromJSON,
    SolutionToJSON,
} from './';


// thorapi

/**
 * TODO BuildOutput CLASS DESCRIPTION
 * @export
 * @interface BuildOutput
 */
export type BuildOutput  = {
    /**
     * 
     * @type {string}
     * @memberof BuildOutput
     */
    buildId: string;
    /**
     * 
     * @type {boolean}
     * @memberof BuildOutput
     */
    success: boolean;
    /**
     * 
     * @type {string}
     * @memberof BuildOutput
     */
    output: string;
    /**
     * 
     * @type {string}
     * @memberof BuildOutput
     */
    applicationId?: string;
    /**
     * 
     * @type {Date}
     * @memberof BuildOutput
     */
    lastSuccessfulRun?: Date;
    /**
     * 
     * @type {Array<Solution>}
     * @memberof BuildOutput
     */
    solutions?: Array<Solution>;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof BuildOutput
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof BuildOutput
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof BuildOutput
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof BuildOutput
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof BuildOutput
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof BuildOutput
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof BuildOutput
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof BuildOutput
     */
    lastModifiedDate?: Date;
}

export function BuildOutputFromJSON(json: any): BuildOutput {
    return {
        'buildId': json['buildId'],
        'success': json['success'],
        'output': json['output'],
        'applicationId': !exists(json, 'applicationId') ? undefined : json['applicationId'],
        'lastSuccessfulRun': !exists(json, 'lastSuccessfulRun') ? undefined : new Date(json['lastSuccessfulRun']),
        'solutions': !exists(json, 'solutions') ? undefined : (json['solutions'] as Array<any>).map(SolutionFromJSON),
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

export function BuildOutputToJSON(value?: BuildOutput): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'buildId': value.buildId,
        'success': value.success,
        'output': value.output,
        'applicationId': value.applicationId,
        'lastSuccessfulRun': value.lastSuccessfulRun === undefined ? undefined : value.lastSuccessfulRun.toISOString(),
        'solutions': value.solutions === undefined ? undefined : (value.solutions as Array<any>).map(SolutionToJSON),
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

