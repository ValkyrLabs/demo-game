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


    Product,
    ProductFromJSON,
    ProductToJSON,
} from './';


// thorapi

/**
 * Represents an order lineitem in a customer order.
 * @export
 * @interface LineItem
 */
export type LineItem  = {
    /**
     * 
     * @type {string}
     * @memberof LineItem
     */
    salesOrderId?: string;
    /**
     * 
     * @type {string}
     * @memberof LineItem
     */
    productId?: string;
    /**
     * 
     * @type {Product}
     * @memberof LineItem
     */
    product?: Product;
    /**
     * 
     * @type {number}
     * @memberof LineItem
     */
    lineItemAmount?: number;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof LineItem
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof LineItem
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof LineItem
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof LineItem
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof LineItem
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof LineItem
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof LineItem
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof LineItem
     */
    lastModifiedDate?: Date;
}

export function LineItemFromJSON(json: any): LineItem {
    return {
        'salesOrderId': !exists(json, 'salesOrderId') ? undefined : json['salesOrderId'],
        'productId': !exists(json, 'productId') ? undefined : json['productId'],
        'product': !exists(json, 'product') ? undefined : ProductFromJSON(json['product']),
        'lineItemAmount': !exists(json, 'lineItemAmount') ? undefined : json['lineItemAmount'],
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

export function LineItemToJSON(value?: LineItem): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'salesOrderId': value.salesOrderId,
        'productId': value.productId,
        'product': ProductToJSON(value.product),
        'lineItemAmount': value.lineItemAmount,
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


