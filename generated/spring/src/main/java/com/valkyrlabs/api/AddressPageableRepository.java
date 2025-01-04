package com.valkyrlabs.api;

import com.valkyrlabs.model.Address;

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
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: AddressRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface AddressPageableRepository extends Serializable, PagingAndSortingRepository<Address, UUID> {

    // ThorAPI Generated search methods for each property on Address
    /** Find a Address by hasWifi with pagination
        hasWifi ** | **Boolean** |  |  [optional]
        * @param hasWifi Boolean  
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByHasWifi(Boolean hasWifi, Pageable pageable);
    /** Find a Address by principalId with pagination
        principalId ** | **UUID** |  |  [optional]
        * @param principalId UUID  
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByPrincipalId(UUID principalId, Pageable pageable);
    /** Find a Address by addressType with pagination
        addressType ** | [**AddressTypeEnum**](#AddressTypeEnum) | The type of address |  [optional]
        * @param addressType AddressTypeEnum The type of address 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByAddressType(Address.AddressTypeEnum addressType, Pageable pageable);
    /** Find a Address by name with pagination
        name ** | **String** | full name of addressee | 
        * @param name String full name of addressee 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByName(String name, Pageable pageable);
    /** Find a Address by street1 with pagination
        street1 ** | **String** | street address line 1 | 
        * @param street1 String street address line 1 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByStreet1(String street1, Pageable pageable);
    /** Find a Address by street2 with pagination
        street2 ** | **String** | street address line 2 |  [optional]
        * @param street2 String street address line 2 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByStreet2(String street2, Pageable pageable);
    /** Find a Address by city with pagination
        city ** | **String** | full name of city | 
        * @param city String full name of city 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByCity(String city, Pageable pageable);
    /** Find a Address by state with pagination
        state ** | **String** | State of residence 2-character code (USA) | 
        * @param state String State of residence 2-character code (USA) 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByState(String state, Pageable pageable);
    /** Find a Address by country with pagination
        country ** | **String** | 3 character country code (upper case) |  [optional]
        * @param country String 3 character country code (upper case) 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByCountry(String country, Pageable pageable);
    /** Find a Address by postalCode with pagination
        postalCode ** | **String** | 5+4 digit zip code | 
        * @param postalCode String 5+4 digit zip code 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByPostalCode(String postalCode, Pageable pageable);
    /** Find a Address by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findById(UUID id, Pageable pageable);
    /** Find a Address by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Address by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Address by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Address by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Address by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Address by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Address by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Address>
    */
    public Page<Address> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Address as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Address instances
     */
    List<Address> findAll();

    /** 
     * Find all instances of Address with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Address instances
     */
    Page<Address> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Address> findAll(Example<Address> example, Pageable pageable);

    // end search methods
}
