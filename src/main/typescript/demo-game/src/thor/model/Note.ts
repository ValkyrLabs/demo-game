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
 * Represents a note added to a CRM entity.
 * @export
 * @interface Note
 */
export type Note  = {
    /**
     * 
     * @type {string}
     * @memberof Note
     */
    noteId: string;
    /**
     * ID of the entity (Customer, Opportunity, etc.) the note is attached to.
     * @type {string}
     * @memberof Note
     */
    associatedEntityId: string;
    /**
     * Type of the associated entity.
     * @type {string}
     * @memberof Note
     */
    entityType: NoteEntityTypeEnum;
    /**
     * The actual note content.
     * @type {string}
     * @memberof Note
     */
    content: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof Note
     */
    createdDate: Date;
    /**
     * The user who created the note.
     * @type {string}
     * @memberof Note
     */
    createdBy: string;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof Note
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof Note
     */
    ownerId?: string;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof Note
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof Note
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof Note
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof Note
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof Note
     */
    lastModifiedDate?: Date;
}

export function NoteFromJSON(json: any): Note {
    return {
        'noteId': json['noteId'],
        'associatedEntityId': json['associatedEntityId'],
        'entityType': json['entityType'],
        'content': json['content'],
        'createdDate': new Date(json['createdDate']),
        'createdBy': json['createdBy'],
        'id': !exists(json, 'id') ? undefined : json['id'],
        'ownerId': !exists(json, 'ownerId') ? undefined : json['ownerId'],
        'keyHash': !exists(json, 'keyHash') ? undefined : json['keyHash'],
        'lastAccessedById': !exists(json, 'lastAccessedById') ? undefined : json['lastAccessedById'],
        'lastAccessedDate': !exists(json, 'lastAccessedDate') ? undefined : new Date(json['lastAccessedDate']),
        'lastModifiedById': !exists(json, 'lastModifiedById') ? undefined : json['lastModifiedById'],
        'lastModifiedDate': !exists(json, 'lastModifiedDate') ? undefined : new Date(json['lastModifiedDate']),
    };
}

export function NoteToJSON(value?: Note): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'noteId': value.noteId,
        'associatedEntityId': value.associatedEntityId,
        'entityType': value.entityType,
        'content': value.content,
        'createdDate': value.createdDate.toISOString(),
        'createdBy': value.createdBy,
        'id': value.id,
        'ownerId': value.ownerId,
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
export enum NoteEntityTypeEnum {
    CUSTOMER = 'customer',
    OPPORTUNITY = 'opportunity',
    CONTACT = 'contact',
    SALESACTIVITY = 'sales-activity'
}

