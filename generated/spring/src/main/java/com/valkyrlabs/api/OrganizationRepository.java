package com.valkyrlabs.api;

import com.valkyrlabs.model.Organization;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: OrganizationRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface OrganizationRepository extends Serializable, JpaRepository<Organization, UUID> {

    // ThorAPI Generated search methods for each property on Organization
    /** Find a Organization by name 
        name ** | **String** |  | 
        * @param name String  
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByName (  String name);
    /** Find a Organization by homePage 
        homePage ** | **String** |  |  [optional]
        * @param homePage String  
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByHomePage (  String homePage);
    /** Find a Organization by phone 
        phone ** | **String** |  |  [optional]
        * @param phone String  
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByPhone (  String phone);
    /** Find a Organization by addressId 
        addressId ** | **UUID** |  |  [optional]
        * @param addressId UUID  
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByAddressId (  UUID addressId);
    /** Find a Organization by address 
        address ** | [**Address**](Address.md) |  |  [optional]
        * @param address Address  
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByAddress (  Address address);
    /** Find a Organization by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationById (  UUID id);
    /** Find a Organization by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByOwnerId (  UUID ownerId);
    /** Find a Organization by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Organization by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByKeyHash (  String keyHash);
    /** Find a Organization by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByLastAccessedById (  UUID lastAccessedById);
    /** Find a Organization by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Organization by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByLastModifiedById (  UUID lastModifiedById);
    /** Find a Organization by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Organization>
    */
    // nullable
    public List<Organization>  findOrganizationByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
