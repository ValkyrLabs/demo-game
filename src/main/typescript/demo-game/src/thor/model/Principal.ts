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


    Address,
    AddressFromJSON,
    AddressToJSON,
    Authority,
    AuthorityFromJSON,
    AuthorityToJSON,
    Organization,
    OrganizationFromJSON,
    OrganizationToJSON,
    Role,
    RoleFromJSON,
    RoleToJSON,
} from './';


// thorapi

/**
 * The Valkyr Principal. Represents a user, service, or agent in the system with preferences and privileges.
 * @export
 * @interface Principal
 */
export type Principal  = {
    /**
     * Your account user name
     * @type {string}
     * @memberof Principal
     */
    username: string;
    /**
     * Your account password
     * @type {string}
     * @memberof Principal
     */
    password: string;
    /**
     * The main email address for the user (encrypted)
     * @type {string}
     * @memberof Principal
     */
    email: string;
    /**
     * first name of user (encrypted)
     * @type {string}
     * @memberof Principal
     */
    firstName?: string;
    /**
     * middle name of user
     * @type {string}
     * @memberof Principal
     */
    middleName?: string;
    /**
     * last name of user (encrypted)
     * @type {string}
     * @memberof Principal
     */
    lastName?: string;
    /**
     * Encrypted identity (Facial Recognition, Fingerprint Scanner, etc.)
     * @type {string}
     * @memberof Principal
     */
    readonly fingerprint?: string;
    /**
     * SSN or a 10 digit federal government ID (encrypted)
     * @type {string}
     * @memberof Principal
     */
    federalIdentification?: string;
    /**
     * Country of residence 3-character code
     * @type {string}
     * @memberof Principal
     */
    residenceCountry?: string;
    /**
     * Driver\'s License or a 10 digit state government ID
     * @type {string}
     * @memberof Principal
     */
    stateIdentification?: string;
    /**
     * State of residence 2-character code (USA)
     * @type {string}
     * @memberof Principal
     */
    residenceState?: string;
    /**
     * The username for your primary social account (if any)
     * @type {string}
     * @memberof Principal
     */
    social?: string;
    /**
     * More in-depth information about you and your account
     * @type {string}
     * @memberof Principal
     */
    bio?: string;
    /**
     * 
     * @type {string}
     * @memberof Principal
     */
    notes?: string;
    /**
     * URL for the user avatar image
     * @type {string}
     * @memberof Principal
     */
    avatarUrl?: string;
    /**
     * 
     * @type {string}
     * @memberof Principal
     */
    organizationId?: string;
    /**
     * 
     * @type {Organization}
     * @memberof Principal
     */
    organization?: Organization;
    /**
     * 
     * @type {Array<Address>}
     * @memberof Principal
     */
    addresses?: Array<Address>;
    /**
     * Whether the user accepted the use of cookies
     * @type {boolean}
     * @memberof Principal
     */
    acceptedCookies?: boolean;
    /**
     * Whether the user accepted the terms of service
     * @type {boolean}
     * @memberof Principal
     */
    acceptedTos?: boolean;
    /**
     * Spring Security User field whether the user is enabled
     * @type {boolean}
     * @memberof Principal
     */
    enabled?: boolean;
    /**
     * Spring Security User field whether the user\'s login credentials have expired
     * @type {boolean}
     * @memberof Principal
     */
    credentialNonExpired?: boolean;
    /**
     * Spring Security User field whether the user account is enabled
     * @type {boolean}
     * @memberof Principal
     */
    accountEnabled?: boolean;
    /**
     * Spring Security User field whether the user account is locked
     * @type {boolean}
     * @memberof Principal
     */
    accountNonLocked?: boolean;
    /**
     * Spring Security User field whether the user account has expired
     * @type {boolean}
     * @memberof Principal
     */
    accountNonExpired?: boolean;
    /**
     * the granted roles (or null if the granted authority cannot be expressed as a String with sufficient precision).
     * @type {Array<Role>}
     * @memberof Principal
     */
    roles?: Array<Role>;
    /**
     * the granted authorities (or null if the granted authority cannot be expressed as a String with sufficient precision).
     * @type {Array<Authority>}
     * @memberof Principal
     */
    authorityList?: Array<Authority>;
    /**
     * Unique identifier for object in the system
     * @type {string}
     * @memberof Principal
     */
    id?: string;
    /**
     * UUID of owner of the object in the system
     * @type {string}
     * @memberof Principal
     */
    ownerId?: string;
    /**
     * Date of object creation
     * @type {Date}
     * @memberof Principal
     */
    createdDate?: Date;
    /**
     * Data, including hash of the key(s) used to encrypt this record.
     * @type {string}
     * @memberof Principal
     */
    keyHash?: string;
    /**
     * Last user to access object
     * @type {string}
     * @memberof Principal
     */
    lastAccessedById?: string;
    /**
     * Timestamp of last access of object
     * @type {Date}
     * @memberof Principal
     */
    lastAccessedDate?: Date;
    /**
     * Unique identifier for user who last modifed the object in the system
     * @type {string}
     * @memberof Principal
     */
    lastModifiedById?: string;
    /**
     * Date of last object modification
     * @type {Date}
     * @memberof Principal
     */
    lastModifiedDate?: Date;
}

export function PrincipalFromJSON(json: any): Principal {
    return {
        'username': json['username'],
        'password': json['password'],
        'email': json['email'],
        'firstName': !exists(json, 'firstName') ? undefined : json['firstName'],
        'middleName': !exists(json, 'middleName') ? undefined : json['middleName'],
        'lastName': !exists(json, 'lastName') ? undefined : json['lastName'],
        'fingerprint': !exists(json, 'fingerprint') ? undefined : json['fingerprint'],
        'federalIdentification': !exists(json, 'federalIdentification') ? undefined : json['federalIdentification'],
        'residenceCountry': !exists(json, 'residenceCountry') ? undefined : json['residenceCountry'],
        'stateIdentification': !exists(json, 'stateIdentification') ? undefined : json['stateIdentification'],
        'residenceState': !exists(json, 'residenceState') ? undefined : json['residenceState'],
        'social': !exists(json, 'social') ? undefined : json['social'],
        'bio': !exists(json, 'bio') ? undefined : json['bio'],
        'notes': !exists(json, 'notes') ? undefined : json['notes'],
        'avatarUrl': !exists(json, 'avatarUrl') ? undefined : json['avatarUrl'],
        'organizationId': !exists(json, 'organizationId') ? undefined : json['organizationId'],
        'organization': !exists(json, 'organization') ? undefined : OrganizationFromJSON(json['organization']),
        'addresses': !exists(json, 'addresses') ? undefined : (json['addresses'] as Array<any>).map(AddressFromJSON),
        'acceptedCookies': !exists(json, 'acceptedCookies') ? undefined : json['acceptedCookies'],
        'acceptedTos': !exists(json, 'acceptedTos') ? undefined : json['acceptedTos'],
        'enabled': !exists(json, 'enabled') ? undefined : json['enabled'],
        'credentialNonExpired': !exists(json, 'credentialNonExpired') ? undefined : json['credentialNonExpired'],
        'accountEnabled': !exists(json, 'accountEnabled') ? undefined : json['accountEnabled'],
        'accountNonLocked': !exists(json, 'accountNonLocked') ? undefined : json['accountNonLocked'],
        'accountNonExpired': !exists(json, 'accountNonExpired') ? undefined : json['accountNonExpired'],
        'roles': !exists(json, 'roles') ? undefined : (json['roles'] as Array<any>).map(RoleFromJSON),
        'authorityList': !exists(json, 'authorityList') ? undefined : (json['authorityList'] as Array<any>).map(AuthorityFromJSON),
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

export function PrincipalToJSON(value?: Principal): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'username': value.username,
        'password': value.password,
        'email': value.email,
        'firstName': value.firstName,
        'middleName': value.middleName,
        'lastName': value.lastName,
        'federalIdentification': value.federalIdentification,
        'residenceCountry': value.residenceCountry,
        'stateIdentification': value.stateIdentification,
        'residenceState': value.residenceState,
        'social': value.social,
        'bio': value.bio,
        'notes': value.notes,
        'avatarUrl': value.avatarUrl,
        'organizationId': value.organizationId,
        'organization': OrganizationToJSON(value.organization),
        'addresses': value.addresses === undefined ? undefined : (value.addresses as Array<any>).map(AddressToJSON),
        'acceptedCookies': value.acceptedCookies,
        'acceptedTos': value.acceptedTos,
        'enabled': value.enabled,
        'credentialNonExpired': value.credentialNonExpired,
        'accountEnabled': value.accountEnabled,
        'accountNonLocked': value.accountNonLocked,
        'accountNonExpired': value.accountNonExpired,
        'roles': value.roles === undefined ? undefined : (value.roles as Array<any>).map(RoleToJSON),
        'authorityList': value.authorityList === undefined ? undefined : (value.authorityList as Array<any>).map(AuthorityToJSON),
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


