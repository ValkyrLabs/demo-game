package com.valkyrlabs.api;

import com.valkyrlabs.model.Organization;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: OrganizationRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface OrganizationPageableRepository extends Serializable, PagingAndSortingRepository<Organization, UUID> {

    // ThorAPI Generated search methods for each property on Organization
    /** Find a Organization by name with pagination
        name ** | **String** |  | 
        * @param name String  
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByName(String name, Pageable pageable);
    /** Find a Organization by homePage with pagination
        homePage ** | **String** |  |  [optional]
        * @param homePage String  
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByHomePage(String homePage, Pageable pageable);
    /** Find a Organization by phone with pagination
        phone ** | **String** |  |  [optional]
        * @param phone String  
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByPhone(String phone, Pageable pageable);
    /** Find a Organization by addressId with pagination
        addressId ** | **UUID** |  |  [optional]
        * @param addressId UUID  
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByAddressId(UUID addressId, Pageable pageable);
    /** Find a Organization by address with pagination
        address ** | [**Address**](Address.md) |  |  [optional]
        * @param address Address  
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByAddress(Address address, Pageable pageable);
    /** Find a Organization by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findById(UUID id, Pageable pageable);
    /** Find a Organization by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Organization by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Organization by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Organization by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Organization by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Organization by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Organization by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Organization>
    */
    public Page<Organization> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Organization as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Organization instances
     */
    List<Organization> findAll();

    /** 
     * Find all instances of Organization with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Organization instances
     */
    Page<Organization> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Organization> findAll(Example<Organization> example, Pageable pageable);

    // end search methods
}
