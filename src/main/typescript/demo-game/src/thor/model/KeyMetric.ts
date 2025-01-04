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
 * A Key Metric for Tracking Strategy Results
 * @export
 * @interface KeyMetric
 */
export type KeyMetric  = {
    /**
     * 
     * @type {string}
     * @memberof KeyMetric
     */
    goalId?: string;
    /**
     * 
     * @type {string}
     * @memberof KeyMetric
     */
    metricName?: string;
    /**
     * actual value of the metric
     * @type {number}
     * @memberof KeyMetric
     */
    metricValue?: number;
    /**
     * expected value of the metric
     * @type {number}
     * @memberof KeyMetric
     */
    targetValue?: number;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof KeyMetric
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof KeyMetric
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof KeyMetric
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof KeyMetric
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof KeyMetric
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof KeyMetric
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof KeyMetric
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof KeyMetric
     */
    lastModifiedDate?: Date;
}

export function KeyMetricFromJSON(json: any): KeyMetric {
    return {
        'goalId': !exists(json, 'goalId') ? undefined : json['goalId'],
        'metricName': !exists(json, 'metricName') ? undefined : json['metricName'],
        'metricValue': !exists(json, 'metricValue') ? undefined : json['metricValue'],
        'targetValue': !exists(json, 'targetValue') ? undefined : json['targetValue'],
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

export function KeyMetricToJSON(value?: KeyMetric): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'goalId': value.goalId,
        'metricName': value.metricName,
        'metricValue': value.metricValue,
        'targetValue': value.targetValue,
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


