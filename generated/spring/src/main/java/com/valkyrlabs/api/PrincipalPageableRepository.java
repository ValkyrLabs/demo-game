package com.valkyrlabs.api;

import com.valkyrlabs.model.Principal;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
public interface PrincipalPageableRepository extends Serializable, PagingAndSortingRepository<Principal, UUID> {

    // ThorAPI Generated search methods for each property on Principal
    /** Find a Principal by firstName with pagination
        firstName ** | **String** | first name of user (encrypted) |  [optional]
        * @param firstName String first name of user (encrypted) 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByFirstName(String firstName, Pageable pageable);
    /** Find a Principal by middleName with pagination
        middleName ** | **String** | middle name of user |  [optional]
        * @param middleName String middle name of user 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByMiddleName(String middleName, Pageable pageable);
    /** Find a Principal by lastName with pagination
        lastName ** | **String** | last name of user (encrypted) |  [optional]
        * @param lastName String last name of user (encrypted) 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByLastName(String lastName, Pageable pageable);
    /** Find a Principal by username with pagination
        username ** | **String** | Your account user name | 
        * @param username String Your account user name 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByUsername(String username, Pageable pageable);
    /** Find a Principal by password with pagination
        password ** | **String** | Your account password | 
        * @param password String Your account password 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByPassword(String password, Pageable pageable);
    /** Find a Principal by fingerprint with pagination
        fingerprint ** | **String** | Encrypted identity (Facial Recognition, Fingerprint Scanner, etc.) |  [optional] [readonly]
        * @param fingerprint String Encrypted identity (Facial Recognition, Fingerprint Scanner, etc.) 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByFingerprint(String fingerprint, Pageable pageable);
    /** Find a Principal by federalIdentification with pagination
        federalIdentification ** | **String** | SSN or a 10 digit federal government ID (encrypted) |  [optional]
        * @param federalIdentification String SSN or a 10 digit federal government ID (encrypted) 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByFederalIdentification(String federalIdentification, Pageable pageable);
    /** Find a Principal by residenceCountry with pagination
        residenceCountry ** | **String** | Country of residence 3-character code |  [optional]
        * @param residenceCountry String Country of residence 3-character code 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByResidenceCountry(String residenceCountry, Pageable pageable);
    /** Find a Principal by stateIdentification with pagination
        stateIdentification ** | **String** | Driver&#39;s License or a 10 digit state government ID |  [optional]
        * @param stateIdentification String Driver&#39;s License or a 10 digit state government ID 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByStateIdentification(String stateIdentification, Pageable pageable);
    /** Find a Principal by residenceState with pagination
        residenceState ** | **String** | State of residence 2-character code (USA) |  [optional]
        * @param residenceState String State of residence 2-character code (USA) 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByResidenceState(String residenceState, Pageable pageable);
    /** Find a Principal by email with pagination
        email ** | **String** | The main email address for the user (encrypted) | 
        * @param email String The main email address for the user (encrypted) 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByEmail(String email, Pageable pageable);
    /** Find a Principal by social with pagination
        social ** | **String** | The username for your primary social account (if any) |  [optional]
        * @param social String The username for your primary social account (if any) 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findBySocial(String social, Pageable pageable);
    /** Find a Principal by bio with pagination
        bio ** | **String** | More in-depth information about you and your account |  [optional]
        * @param bio String More in-depth information about you and your account 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByBio(String bio, Pageable pageable);
    /** Find a Principal by notes with pagination
        notes ** | **String** |  |  [optional]
        * @param notes String  
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByNotes(String notes, Pageable pageable);
    /** Find a Principal by avatarUrl with pagination
        avatarUrl ** | **String** | URL for the user avatar image |  [optional]
        * @param avatarUrl String URL for the user avatar image 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByAvatarUrl(String avatarUrl, Pageable pageable);
    /** Find a Principal by organizationId with pagination
        organizationId ** | **UUID** |  |  [optional]
        * @param organizationId UUID  
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByOrganizationId(UUID organizationId, Pageable pageable);
    /** Find a Principal by organization with pagination
        organization ** | [**Organization**](Organization.md) |  |  [optional]
        * @param organization Organization  
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByOrganization(Organization organization, Pageable pageable);
    /** Find a Principal by addresses with pagination
        addresses ** | [**List<Address>**](Address.md) |  |  [optional]
        * @param addresses List&lt;@Valid Address&gt;  
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByAddresses(List<@Valid Address> addresses, Pageable pageable);
    /** Find a Principal by acceptedCookies with pagination
        acceptedCookies ** | **Boolean** | Whether the user accepted the use of cookies |  [optional]
        * @param acceptedCookies Boolean Whether the user accepted the use of cookies 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByAcceptedCookies(Boolean acceptedCookies, Pageable pageable);
    /** Find a Principal by acceptedTos with pagination
        acceptedTos ** | **Boolean** | Whether the user accepted the terms of service |  [optional]
        * @param acceptedTos Boolean Whether the user accepted the terms of service 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByAcceptedTos(Boolean acceptedTos, Pageable pageable);
    /** Find a Principal by enabled with pagination
        enabled ** | **Boolean** | Spring Security User field whether the user is enabled |  [optional]
        * @param enabled Boolean Spring Security User field whether the user is enabled 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByEnabled(Boolean enabled, Pageable pageable);
    /** Find a Principal by credentialNonExpired with pagination
        credentialNonExpired ** | **Boolean** | Spring Security User field whether the user&#39;s login credentials have expired |  [optional]
        * @param credentialNonExpired Boolean Spring Security User field whether the user&#39;s login credentials have expired 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByCredentialNonExpired(Boolean credentialNonExpired, Pageable pageable);
    /** Find a Principal by accountEnabled with pagination
        accountEnabled ** | **Boolean** | Spring Security User field whether the user account is enabled |  [optional]
        * @param accountEnabled Boolean Spring Security User field whether the user account is enabled 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByAccountEnabled(Boolean accountEnabled, Pageable pageable);
    /** Find a Principal by accountNonLocked with pagination
        accountNonLocked ** | **Boolean** | Spring Security User field whether the user account is locked |  [optional]
        * @param accountNonLocked Boolean Spring Security User field whether the user account is locked 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByAccountNonLocked(Boolean accountNonLocked, Pageable pageable);
    /** Find a Principal by accountNonExpired with pagination
        accountNonExpired ** | **Boolean** | Spring Security User field whether the user account has expired |  [optional]
        * @param accountNonExpired Boolean Spring Security User field whether the user account has expired 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByAccountNonExpired(Boolean accountNonExpired, Pageable pageable);
    /** Find a Principal by roles with pagination
        roles ** | [**List<Role>**](Role.md) | the granted roles (or null if the granted authority cannot be expressed as a String with sufficient precision). |  [optional]
        * @param roles List&lt;@Valid Role&gt; the granted roles (or null if the granted authority cannot be expressed as a String with sufficient precision). 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByRoles(List<@Valid Role> roles, Pageable pageable);
    /** Find a Principal by authorityList with pagination
        authorityList ** | [**List<Authority>**](Authority.md) | the granted authorities (or null if the granted authority cannot be expressed as a String with sufficient precision). |  [optional]
        * @param authorityList List&lt;@Valid Authority&gt; the granted authorities (or null if the granted authority cannot be expressed as a String with sufficient precision). 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByAuthorityList(List<@Valid Authority> authorityList, Pageable pageable);
    /** Find a Principal by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findById(UUID id, Pageable pageable);
    /** Find a Principal by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Principal by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Principal by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Principal by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Principal by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Principal by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Principal by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Principal>
    */
    public Page<Principal> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Principal as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Principal instances
     */
    List<Principal> findAll();

    /** 
     * Find all instances of Principal with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Principal instances
     */
    Page<Principal> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Principal> findAll(Example<Principal> example, Pageable pageable);

    // end search methods
}
