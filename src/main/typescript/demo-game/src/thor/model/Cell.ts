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


    Format,
    FormatFromJSON,
    FormatToJSON,
    Formula,
    FormulaFromJSON,
    FormulaToJSON,
    SheetColumn,
    SheetColumnFromJSON,
    SheetColumnToJSON,
    SheetRow,
    SheetRowFromJSON,
    SheetRowToJSON,
} from './';


// thorapi

/**
 * Sheetster spreadsheet cell
 * @export
 * @interface Cell
 */
export type Cell  = {
    /**
     * the sheet containing this cell
     * @type {string}
     * @memberof Cell
     */
    sheetId?: string;
    /**
     * Cell comment (if any)
     * @type {string}
     * @memberof Cell
     */
    comment?: string;
    /**
     * If this cell is a hyperlink, store the target URL here
     * @type {string}
     * @memberof Cell
     */
    hyperlink?: string;
    /**
     * 
     * @type {string}
     * @memberof Cell
     */
    sheetRowId?: string;
    /**
     * 
     * @type {SheetRow}
     * @memberof Cell
     */
    row?: SheetRow;
    /**
     * 
     * @type {string}
     * @memberof Cell
     */
    sheetColumnId?: string;
    /**
     * 
     * @type {SheetColumn}
     * @memberof Cell
     */
    column?: SheetColumn;
    /**
     * 
     * @type {string}
     * @memberof Cell
     */
    stringValue?: string;
    /**
     * 
     * @type {number}
     * @memberof Cell
     */
    numberValue?: number;
    /**
     * 
     * @type {Formula}
     * @memberof Cell
     */
    formula?: Formula;
    /**
     * 
     * @type {Format}
     * @memberof Cell
     */
    format?: Format;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof Cell
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof Cell
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof Cell
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof Cell
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof Cell
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof Cell
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof Cell
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof Cell
     */
    lastModifiedDate?: Date;
}

export function CellFromJSON(json: any): Cell {
    return {
        'sheetId': !exists(json, 'sheetId') ? undefined : json['sheetId'],
        'comment': !exists(json, 'comment') ? undefined : json['comment'],
        'hyperlink': !exists(json, 'hyperlink') ? undefined : json['hyperlink'],
        'sheetRowId': !exists(json, 'sheetRowId') ? undefined : json['sheetRowId'],
        'row': !exists(json, 'row') ? undefined : SheetRowFromJSON(json['row']),
        'sheetColumnId': !exists(json, 'sheetColumnId') ? undefined : json['sheetColumnId'],
        'column': !exists(json, 'column') ? undefined : SheetColumnFromJSON(json['column']),
        'stringValue': !exists(json, 'stringValue') ? undefined : json['stringValue'],
        'numberValue': !exists(json, 'numberValue') ? undefined : json['numberValue'],
        'formula': !exists(json, 'formula') ? undefined : FormulaFromJSON(json['formula']),
        'format': !exists(json, 'format') ? undefined : FormatFromJSON(json['format']),
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

export function CellToJSON(value?: Cell): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'sheetId': value.sheetId,
        'comment': value.comment,
        'hyperlink': value.hyperlink,
        'sheetRowId': value.sheetRowId,
        'row': SheetRowToJSON(value.row),
        'sheetColumnId': value.sheetColumnId,
        'column': SheetColumnToJSON(value.column),
        'stringValue': value.stringValue,
        'numberValue': value.numberValue,
        'formula': FormulaToJSON(value.formula),
        'format': FormatToJSON(value.format),
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


