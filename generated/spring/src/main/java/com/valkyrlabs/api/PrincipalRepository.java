package com.valkyrlabs.api;

import com.valkyrlabs.model.Principal;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.valkyrlabs.model.Address;
import com.valkyrlabs.model.Authority;
import com.valkyrlabs.model.Organization;
import com.valkyrlabs.model.Role;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: PrincipalRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface PrincipalRepository extends Serializable, JpaRepository<Principal, UUID> {

    // ThorAPI Generated search methods for each property on Principal
    /** Find a Principal by firstName 
        firstName ** | **String** | first name of user (encrypted) |  [optional]
        * @param firstName String first name of user (encrypted) 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByFirstName (  String firstName);
    /** Find a Principal by middleName 
        middleName ** | **String** | middle name of user |  [optional]
        * @param middleName String middle name of user 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByMiddleName (  String middleName);
    /** Find a Principal by lastName 
        lastName ** | **String** | last name of user (encrypted) |  [optional]
        * @param lastName String last name of user (encrypted) 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByLastName (  String lastName);
    /** Find a Principal by username 
        username ** | **String** | Your account user name | 
        * @param username String Your account user name 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByUsername (  String username);
    /** Find a Principal by password 
        password ** | **String** | Your account password | 
        * @param password String Your account password 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByPassword (  String password);
    /** Find a Principal by fingerprint 
        fingerprint ** | **String** | Encrypted identity (Facial Recognition, Fingerprint Scanner, etc.) |  [optional] [readonly]
        * @param fingerprint String Encrypted identity (Facial Recognition, Fingerprint Scanner, etc.) 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByFingerprint (  String fingerprint);
    /** Find a Principal by federalIdentification 
        federalIdentification ** | **String** | SSN or a 10 digit federal government ID (encrypted) |  [optional]
        * @param federalIdentification String SSN or a 10 digit federal government ID (encrypted) 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByFederalIdentification (  String federalIdentification);
    /** Find a Principal by residenceCountry 
        residenceCountry ** | **String** | Country of residence 3-character code |  [optional]
        * @param residenceCountry String Country of residence 3-character code 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByResidenceCountry (  String residenceCountry);
    /** Find a Principal by stateIdentification 
        stateIdentification ** | **String** | Driver&#39;s License or a 10 digit state government ID |  [optional]
        * @param stateIdentification String Driver&#39;s License or a 10 digit state government ID 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByStateIdentification (  String stateIdentification);
    /** Find a Principal by residenceState 
        residenceState ** | **String** | State of residence 2-character code (USA) |  [optional]
        * @param residenceState String State of residence 2-character code (USA) 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByResidenceState (  String residenceState);
    /** Find a Principal by email 
        email ** | **String** | The main email address for the user (encrypted) | 
        * @param email String The main email address for the user (encrypted) 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByEmail (  String email);
    /** Find a Principal by social 
        social ** | **String** | The username for your primary social account (if any) |  [optional]
        * @param social String The username for your primary social account (if any) 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalBySocial (  String social);
    /** Find a Principal by bio 
        bio ** | **String** | More in-depth information about you and your account |  [optional]
        * @param bio String More in-depth information about you and your account 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByBio (  String bio);
    /** Find a Principal by notes 
        notes ** | **String** |  |  [optional]
        * @param notes String  
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByNotes (  String notes);
    /** Find a Principal by avatarUrl 
        avatarUrl ** | **String** | URL for the user avatar image |  [optional]
        * @param avatarUrl String URL for the user avatar image 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByAvatarUrl (  String avatarUrl);
    /** Find a Principal by organizationId 
        organizationId ** | **UUID** |  |  [optional]
        * @param organizationId UUID  
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByOrganizationId (  UUID organizationId);
    /** Find a Principal by organization 
        organization ** | [**Organization**](Organization.md) |  |  [optional]
        * @param organization Organization  
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByOrganization (  Organization organization);
    /** Find a Principal by addresses 
        addresses ** | [**List&lt;Address&gt;**](Address.md) |  |  [optional]
        * @param addresses List&lt;@Valid Address&gt;  
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByAddresses (  List<@Valid Address> addresses);
    /** Find a Principal by acceptedCookies 
        acceptedCookies ** | **Boolean** | Whether the user accepted the use of cookies |  [optional]
        * @param acceptedCookies Boolean Whether the user accepted the use of cookies 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByAcceptedCookies (  Boolean acceptedCookies);
    /** Find a Principal by acceptedTos 
        acceptedTos ** | **Boolean** | Whether the user accepted the terms of service |  [optional]
        * @param acceptedTos Boolean Whether the user accepted the terms of service 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByAcceptedTos (  Boolean acceptedTos);
    /** Find a Principal by enabled 
        enabled ** | **Boolean** | Spring Security User field whether the user is enabled |  [optional]
        * @param enabled Boolean Spring Security User field whether the user is enabled 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByEnabled (  Boolean enabled);
    /** Find a Principal by credentialNonExpired 
        credentialNonExpired ** | **Boolean** | Spring Security User field whether the user&#39;s login credentials have expired |  [optional]
        * @param credentialNonExpired Boolean Spring Security User field whether the user&#39;s login credentials have expired 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByCredentialNonExpired (  Boolean credentialNonExpired);
    /** Find a Principal by accountEnabled 
        accountEnabled ** | **Boolean** | Spring Security User field whether the user account is enabled |  [optional]
        * @param accountEnabled Boolean Spring Security User field whether the user account is enabled 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByAccountEnabled (  Boolean accountEnabled);
    /** Find a Principal by accountNonLocked 
        accountNonLocked ** | **Boolean** | Spring Security User field whether the user account is locked |  [optional]
        * @param accountNonLocked Boolean Spring Security User field whether the user account is locked 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByAccountNonLocked (  Boolean accountNonLocked);
    /** Find a Principal by accountNonExpired 
        accountNonExpired ** | **Boolean** | Spring Security User field whether the user account has expired |  [optional]
        * @param accountNonExpired Boolean Spring Security User field whether the user account has expired 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByAccountNonExpired (  Boolean accountNonExpired);
    /** Find a Principal by roles 
        roles ** | [**List&lt;Role&gt;**](Role.md) | the granted roles (or null if the granted authority cannot be expressed as a String with sufficient precision). |  [optional]
        * @param roles List&lt;@Valid Role&gt; the granted roles (or null if the granted authority cannot be expressed as a String with sufficient precision). 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByRoles (  List<@Valid Role> roles);
    /** Find a Principal by authorityList 
        authorityList ** | [**List&lt;Authority&gt;**](Authority.md) | the granted authorities (or null if the granted authority cannot be expressed as a String with sufficient precision). |  [optional]
        * @param authorityList List&lt;@Valid Authority&gt; the granted authorities (or null if the granted authority cannot be expressed as a String with sufficient precision). 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByAuthorityList (  List<@Valid Authority> authorityList);
    /** Find a Principal by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalById (  UUID id);
    /** Find a Principal by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByOwnerId (  UUID ownerId);
    /** Find a Principal by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Principal by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByKeyHash (  String keyHash);
    /** Find a Principal by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByLastAccessedById (  UUID lastAccessedById);
    /** Find a Principal by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Principal by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByLastModifiedById (  UUID lastModifiedById);
    /** Find a Principal by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Principal>
    */
    // nullable
    public List<Principal>  findPrincipalByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
