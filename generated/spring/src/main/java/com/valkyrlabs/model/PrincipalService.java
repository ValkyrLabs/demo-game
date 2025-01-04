package com.valkyrlabs.model;

import com.valkyrlabs.api.*;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
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

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Example;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/** 
*
*  ThorAPI Service Methods
*
*/
@Service
// @Transactional(readOnly = false)
public class PrincipalService {

    @Autowired
    private PrincipalRepository principalRepository;

    @Autowired
    private PrincipalPageableRepository principalPageableRepositoryRepository;

    /** 
     * Find all instances of Principal with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Principal instances
     */
    public Page<Principal> findAll(Pageable pageable){
        return principalPageableRepositoryRepository.findAll(pageable);
    }

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    public Page<Principal> findAll(Example<Principal> example, Pageable pageable){
        return principalPageableRepositoryRepository.findAll(example, pageable);
    }


    public PrincipalRepository getRepository(){
        return principalRepository;
    }

    // Create or Update a Principal
    public Principal saveOrUpdate(Principal principal) {
        return principalRepository.save( principal ); // This method handles both creation and update
        // principalRepository.flush();
        // return ret;
    }

    // Find a Principal by ID
    public Optional<Principal>  findById(UUID id) {
        return principalRepository.findById(id);
    }

    // Find all Principals
    public Iterable<Principal> findAll() {
        return principalRepository.findAll();
    }

    
    /** Find a Principal by firstName 
        
        * @param firstName String first name of user (encrypted) [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByFirstName(  String  firstName){
        return principalRepository.findPrincipalByFirstName( firstName  );
    }
    /** Find a Principal by middleName 
        
        * @param middleName String middle name of user [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByMiddleName(  String  middleName){
        return principalRepository.findPrincipalByMiddleName( middleName  );
    }
    /** Find a Principal by lastName 
        
        * @param lastName String last name of user (encrypted) [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByLastName(  String  lastName){
        return principalRepository.findPrincipalByLastName( lastName  );
    }
    /** Find a Principal by username 
        
        * @param username String Your account user name
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByUsername(  String  username){
        return principalRepository.findPrincipalByUsername( username  );
    }
    /** Find a Principal by password 
        
        * @param password String Your account password
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByPassword(  String  password){
        return principalRepository.findPrincipalByPassword( password  );
    }
    /** Find a Principal by fingerprint 
        
        * @param fingerprint String Encrypted identity (Facial Recognition, Fingerprint Scanner, etc.) [optional] [readonly]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByFingerprint(  String  fingerprint){
        return principalRepository.findPrincipalByFingerprint( fingerprint  );
    }
    /** Find a Principal by federalIdentification 
        
        * @param federalIdentification String SSN or a 10 digit federal government ID (encrypted) [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByFederalIdentification(  String  federalIdentification){
        return principalRepository.findPrincipalByFederalIdentification( federalIdentification  );
    }
    /** Find a Principal by residenceCountry 
        
        * @param residenceCountry String Country of residence 3-character code [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByResidenceCountry(  String  residenceCountry){
        return principalRepository.findPrincipalByResidenceCountry( residenceCountry  );
    }
    /** Find a Principal by stateIdentification 
        
        * @param stateIdentification String Driver&#39;s License or a 10 digit state government ID [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByStateIdentification(  String  stateIdentification){
        return principalRepository.findPrincipalByStateIdentification( stateIdentification  );
    }
    /** Find a Principal by residenceState 
        
        * @param residenceState String State of residence 2-character code (USA) [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByResidenceState(  String  residenceState){
        return principalRepository.findPrincipalByResidenceState( residenceState  );
    }
    /** Find a Principal by email 
        
        * @param email String The main email address for the user (encrypted)
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByEmail(  String  email){
        return principalRepository.findPrincipalByEmail( email  );
    }
    /** Find a Principal by social 
        
        * @param social String The username for your primary social account (if any) [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalBySocial(  String  social){
        return principalRepository.findPrincipalBySocial( social  );
    }
    /** Find a Principal by bio 
        
        * @param bio String More in-depth information about you and your account [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByBio(  String  bio){
        return principalRepository.findPrincipalByBio( bio  );
    }
    /** Find a Principal by notes 
        
        * @param notes String  [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByNotes(  String  notes){
        return principalRepository.findPrincipalByNotes( notes  );
    }
    /** Find a Principal by avatarUrl 
        
        * @param avatarUrl String URL for the user avatar image [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByAvatarUrl(  String  avatarUrl){
        return principalRepository.findPrincipalByAvatarUrl( avatarUrl  );
    }
    /** Find a Principal by organizationId 
        
        * @param organizationId UUID  [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByOrganizationId(  UUID  organizationId){
        return principalRepository.findPrincipalByOrganizationId( organizationId  );
    }
    /** Find a Principal by organization 
        
        * @param organization [Organization](Organization.md)  [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByOrganization(  Organization  organization){
        return principalRepository.findPrincipalByOrganization( organization  );
    }
    /** Find a Principal by addresses 
        
        * @param addresses [ List <Address> ](Address)  [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByAddresses(  List<@Valid Address>  addresses){
        return principalRepository.findPrincipalByAddresses( addresses  );
    }
    /** Find a Principal by acceptedCookies 
        
        * @param acceptedCookies Boolean Whether the user accepted the use of cookies [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByAcceptedCookies(  Boolean  acceptedCookies){
        return principalRepository.findPrincipalByAcceptedCookies( acceptedCookies  );
    }
    /** Find a Principal by acceptedTos 
        
        * @param acceptedTos Boolean Whether the user accepted the terms of service [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByAcceptedTos(  Boolean  acceptedTos){
        return principalRepository.findPrincipalByAcceptedTos( acceptedTos  );
    }
    /** Find a Principal by enabled 
        
        * @param enabled Boolean Spring Security User field whether the user is enabled [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByEnabled(  Boolean  enabled){
        return principalRepository.findPrincipalByEnabled( enabled  );
    }
    /** Find a Principal by credentialNonExpired 
        
        * @param credentialNonExpired Boolean Spring Security User field whether the user&#39;s login credentials have expired [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByCredentialNonExpired(  Boolean  credentialNonExpired){
        return principalRepository.findPrincipalByCredentialNonExpired( credentialNonExpired  );
    }
    /** Find a Principal by accountEnabled 
        
        * @param accountEnabled Boolean Spring Security User field whether the user account is enabled [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByAccountEnabled(  Boolean  accountEnabled){
        return principalRepository.findPrincipalByAccountEnabled( accountEnabled  );
    }
    /** Find a Principal by accountNonLocked 
        
        * @param accountNonLocked Boolean Spring Security User field whether the user account is locked [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByAccountNonLocked(  Boolean  accountNonLocked){
        return principalRepository.findPrincipalByAccountNonLocked( accountNonLocked  );
    }
    /** Find a Principal by accountNonExpired 
        
        * @param accountNonExpired Boolean Spring Security User field whether the user account has expired [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByAccountNonExpired(  Boolean  accountNonExpired){
        return principalRepository.findPrincipalByAccountNonExpired( accountNonExpired  );
    }
    /** Find a Principal by roles 
        
        * @param roles [ List <Role> ](Role) the granted roles (or null if the granted authority cannot be expressed as a String with sufficient precision). [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByRoles(  List<@Valid Role>  roles){
        return principalRepository.findPrincipalByRoles( roles  );
    }
    /** Find a Principal by authorityList 
        
        * @param authorityList [ List <Authority> ](Authority) the granted authorities (or null if the granted authority cannot be expressed as a String with sufficient precision). [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByAuthorityList(  List<@Valid Authority>  authorityList){
        return principalRepository.findPrincipalByAuthorityList( authorityList  );
    }
    /** Find a Principal by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalById(  UUID  id){
        return principalRepository.findPrincipalById( id  );
    }
    /** Find a Principal by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByOwnerId(  UUID  ownerId){
        return principalRepository.findPrincipalByOwnerId( ownerId  );
    }
    /** Find a Principal by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByCreatedDate(  OffsetDateTime  createdDate){
        return principalRepository.findPrincipalByCreatedDate( createdDate  );
    }
    /** Find a Principal by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByKeyHash(  String  keyHash){
        return principalRepository.findPrincipalByKeyHash( keyHash  );
    }
    /** Find a Principal by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByLastAccessedById(  UUID  lastAccessedById){
        return principalRepository.findPrincipalByLastAccessedById( lastAccessedById  );
    }
    /** Find a Principal by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return principalRepository.findPrincipalByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Principal by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByLastModifiedById(  UUID  lastModifiedById){
        return principalRepository.findPrincipalByLastModifiedById( lastModifiedById  );
    }
    /** Find a Principal by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Principal>
    */

    public List<Principal>  findPrincipalByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return principalRepository.findPrincipalByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Principal by ID
    public void deleteById(UUID id) {
        principalRepository.deleteById(id);
    }
}
