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
 * Represents a marketing campaign.
 * @export
 * @interface Campaign
 */
export type Campaign  = {
    /**
     * 
     * @type {string}
     * @memberof Campaign
     */
    campaignId: string;
    /**
     * Name of the campaign.
     * @type {string}
     * @memberof Campaign
     */
    name: string;
    /**
     * 
     * @type {Date}
     * @memberof Campaign
     */
    startDate: Date;
    /**
     * 
     * @type {Date}
     * @memberof Campaign
     */
    endDate: Date;
    /**
     * 
     * @type {string}
     * @memberof Campaign
     */
    status: CampaignStatusEnum;
    /**
     * Details about the campaign.
     * @type {string}
     * @memberof Campaign
     */
    notes?: string;
    /**
     * Budget for the campaign.
     * @type {number}
     * @memberof Campaign
     */
    budget?: number;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof Campaign
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof Campaign
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof Campaign
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof Campaign
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof Campaign
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof Campaign
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof Campaign
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof Campaign
     */
    lastModifiedDate?: Date;
}

export function CampaignFromJSON(json: any): Campaign {
    return {
        'campaignId': json['campaignId'],
        'name': json['name'],
        'startDate': new Date(json['startDate']),
        'endDate': new Date(json['endDate']),
        'status': json['status'],
        'notes': !exists(json, 'notes') ? undefined : json['notes'],
        'budget': !exists(json, 'budget') ? undefined : json['budget'],
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

export function CampaignToJSON(value?: Campaign): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'campaignId': value.campaignId,
        'name': value.name,
        'startDate': value.startDate.toISOString(),
        'endDate': value.endDate.toISOString(),
        'status': value.status,
        'notes': value.notes,
        'budget': value.budget,
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
export enum CampaignStatusEnum {
    PLANNED = 'planned',
    ACTIVE = 'active',
    COMPLETED = 'completed',
    CANCELED = 'canceled'
}

