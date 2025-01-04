package com.valkyrlabs.api;

import com.valkyrlabs.model.Address;

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
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: AddressRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface AddressRepository extends Serializable, JpaRepository<Address, UUID> {

    // ThorAPI Generated search methods for each property on Address
    /** Find a Address by hasWifi 
        hasWifi ** | **Boolean** |  |  [optional]
        * @param hasWifi Boolean  
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByHasWifi (  Boolean hasWifi);
    /** Find a Address by principalId 
        principalId ** | **UUID** |  |  [optional]
        * @param principalId UUID  
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByPrincipalId (  UUID principalId);
    /** Find a Address by addressType 
        addressType ** | [**AddressTypeEnum**](#AddressTypeEnum) | The type of address |  [optional]
        * @param addressType AddressTypeEnum The type of address 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByAddressType ( Address.AddressTypeEnum addressType);
    /** Find a Address by name 
        name ** | **String** | full name of addressee | 
        * @param name String full name of addressee 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByName (  String name);
    /** Find a Address by street1 
        street1 ** | **String** | street address line 1 | 
        * @param street1 String street address line 1 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByStreet1 (  String street1);
    /** Find a Address by street2 
        street2 ** | **String** | street address line 2 |  [optional]
        * @param street2 String street address line 2 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByStreet2 (  String street2);
    /** Find a Address by city 
        city ** | **String** | full name of city | 
        * @param city String full name of city 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByCity (  String city);
    /** Find a Address by state 
        state ** | **String** | State of residence 2-character code (USA) | 
        * @param state String State of residence 2-character code (USA) 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByState (  String state);
    /** Find a Address by country 
        country ** | **String** | 3 character country code (upper case) |  [optional]
        * @param country String 3 character country code (upper case) 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByCountry (  String country);
    /** Find a Address by postalCode 
        postalCode ** | **String** | 5+4 digit zip code | 
        * @param postalCode String 5+4 digit zip code 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByPostalCode (  String postalCode);
    /** Find a Address by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressById (  UUID id);
    /** Find a Address by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByOwnerId (  UUID ownerId);
    /** Find a Address by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Address by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByKeyHash (  String keyHash);
    /** Find a Address by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByLastAccessedById (  UUID lastAccessedById);
    /** Find a Address by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Address by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByLastModifiedById (  UUID lastModifiedById);
    /** Find a Address by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Address>
    */
    // nullable
    public List<Address>  findAddressByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
