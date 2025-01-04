package com.valkyrlabs.api;

import com.valkyrlabs.model.Customer;

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
import com.valkyrlabs.model.Principal;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: CustomerRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface CustomerPageableRepository extends Serializable, PagingAndSortingRepository<Customer, UUID> {

    // ThorAPI Generated search methods for each property on Customer
    /** Find a Customer by customerId with pagination
        customerId ** | **UUID** | Associated customer Principal ID. | 
        * @param customerId UUID Associated customer Principal ID. 
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findByCustomerId(UUID customerId, Pageable pageable);
    /** Find a Customer by customer with pagination
        customer ** | [**Principal**](Principal.md) |  |  [optional]
        * @param customer Principal  
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findByCustomer(Principal customer, Pageable pageable);
    /** Find a Customer by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) | Status of the customer. |  [optional]
        * @param status StatusEnum Status of the customer. 
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findByStatus(Customer.StatusEnum status, Pageable pageable);
    /** Find a Customer by role with pagination
        role ** | [**RoleEnum**](#RoleEnum) | Role of the contact person within the customer account (e.g., CEO, Procurement, Technical Lead). |  [optional]
        * @param role RoleEnum Role of the contact person within the customer account (e.g., CEO, Procurement, Technical Lead). 
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findByRole(Customer.RoleEnum role, Pageable pageable);
    /** Find a Customer by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findById(UUID id, Pageable pageable);
    /** Find a Customer by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Customer by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Customer by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Customer by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Customer by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Customer by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Customer by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Customer>
    */
    public Page<Customer> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Customer as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Customer instances
     */
    List<Customer> findAll();

    /** 
     * Find all instances of Customer with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Customer instances
     */
    Page<Customer> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Customer> findAll(Example<Customer> example, Pageable pageable);

    // end search methods
}
