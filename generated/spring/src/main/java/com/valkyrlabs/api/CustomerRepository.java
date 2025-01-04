package com.valkyrlabs.api;

import com.valkyrlabs.model.Customer;

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
import com.valkyrlabs.model.Principal;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: CustomerRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface CustomerRepository extends Serializable, JpaRepository<Customer, UUID> {

    // ThorAPI Generated search methods for each property on Customer
    /** Find a Customer by customerId 
        customerId ** | **UUID** | Associated customer Principal ID. | 
        * @param customerId UUID Associated customer Principal ID. 
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerByCustomerId (  UUID customerId);
    /** Find a Customer by customer 
        customer ** | [**Principal**](Principal.md) |  |  [optional]
        * @param customer Principal  
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerByCustomer (  Principal customer);
    /** Find a Customer by status 
        status ** | [**StatusEnum**](#StatusEnum) | Status of the customer. |  [optional]
        * @param status StatusEnum Status of the customer. 
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerByStatus ( Customer.StatusEnum status);
    /** Find a Customer by role 
        role ** | [**RoleEnum**](#RoleEnum) | Role of the contact person within the customer account (e.g., CEO, Procurement, Technical Lead). |  [optional]
        * @param role RoleEnum Role of the contact person within the customer account (e.g., CEO, Procurement, Technical Lead). 
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerByRole ( Customer.RoleEnum role);
    /** Find a Customer by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerById (  UUID id);
    /** Find a Customer by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerByOwnerId (  UUID ownerId);
    /** Find a Customer by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Customer by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerByKeyHash (  String keyHash);
    /** Find a Customer by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerByLastAccessedById (  UUID lastAccessedById);
    /** Find a Customer by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Customer by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerByLastModifiedById (  UUID lastModifiedById);
    /** Find a Customer by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Customer>
    */
    // nullable
    public List<Customer>  findCustomerByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
