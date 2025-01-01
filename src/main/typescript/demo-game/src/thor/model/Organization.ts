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


    Address,
    AddressFromJSON,
    AddressToJSON,
} from './';


// thorapi

/**
 * TODO Organization CLASS DESCRIPTION
 * @export
 * @interface Organization
 */
export type Organization  = {
    /**
     * 
     * @type {string}
     * @memberof Organization
     */
    name: string;
    /**
     * 
     * @type {string}
     * @memberof Organization
     */
    homePage?: string;
    /**
     * 
     * @type {string}
     * @memberof Organization
     */
    phone?: string;
    /**
     * 
     * @type {string}
     * @memberof Organization
     */
    addressId?: string;
    /**
     * 
     * @type {Address}
     * @memberof Organization
     */
    address?: Address;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof Organization
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof Organization
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof Organization
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof Organization
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof Organization
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof Organization
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof Organization
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof Organization
     */
    lastModifiedDate?: Date;
}

export function OrganizationFromJSON(json: any): Organization {
    return {
        'name': json['name'],
        'homePage': !exists(json, 'homePage') ? undefined : json['homePage'],
        'phone': !exists(json, 'phone') ? undefined : json['phone'],
        'addressId': !exists(json, 'addressId') ? undefined : json['addressId'],
        'address': !exists(json, 'address') ? undefined : AddressFromJSON(json['address']),
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

export function OrganizationToJSON(value?: Organization): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'name': value.name,
        'homePage': value.homePage,
        'phone': value.phone,
        'addressId': value.addressId,
        'address': AddressToJSON(value.address),
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


