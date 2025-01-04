package com.valkyrlabs.model;

import com.valkyrlabs.api.*;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.valkyrlabs.model.Principal;
import java.time.OffsetDateTime;
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
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerPageableRepository customerPageableRepositoryRepository;

    /** 
     * Find all instances of Customer with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Customer instances
     */
    public Page<Customer> findAll(Pageable pageable){
        return customerPageableRepositoryRepository.findAll(pageable);
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
    public Page<Customer> findAll(Example<Customer> example, Pageable pageable){
        return customerPageableRepositoryRepository.findAll(example, pageable);
    }


    public CustomerRepository getRepository(){
        return customerRepository;
    }

    // Create or Update a Customer
    public Customer saveOrUpdate(Customer customer) {
        return customerRepository.save( customer ); // This method handles both creation and update
        // customerRepository.flush();
        // return ret;
    }

    // Find a Customer by ID
    public Optional<Customer>  findById(UUID id) {
        return customerRepository.findById(id);
    }

    // Find all Customers
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    
    /** Find a Customer by customerId 
        
        * @param customerId UUID Associated customer Principal ID.
        * @return List<Customer>
    */

    public List<Customer>  findCustomerByCustomerId(  UUID  customerId){
        return customerRepository.findCustomerByCustomerId( customerId  );
    }
    /** Find a Customer by customer 
        
        * @param customer [Principal](Principal.md)  [optional]
        * @return List<Customer>
    */

    public List<Customer>  findCustomerByCustomer(  Principal  customer){
        return customerRepository.findCustomerByCustomer( customer  );
    }
    /** Find a Customer by status 
        
        * @param status  StatusEnum  StatusEnum) Status of the customer. [optional]
        * @return List<Customer>
    */

    public List<Customer>  findCustomerByStatus( Customer.StatusEnum status){
        return customerRepository.findCustomerByStatus( status  );
    }
    /** Find a Customer by role 
        
        * @param role  RoleEnum  RoleEnum) Role of the contact person within the customer account (e.g., CEO, Procurement, Technical Lead). [optional]
        * @return List<Customer>
    */

    public List<Customer>  findCustomerByRole( Customer.RoleEnum role){
        return customerRepository.findCustomerByRole( role  );
    }
    /** Find a Customer by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Customer>
    */

    public List<Customer>  findCustomerById(  UUID  id){
        return customerRepository.findCustomerById( id  );
    }
    /** Find a Customer by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Customer>
    */

    public List<Customer>  findCustomerByOwnerId(  UUID  ownerId){
        return customerRepository.findCustomerByOwnerId( ownerId  );
    }
    /** Find a Customer by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Customer>
    */

    public List<Customer>  findCustomerByCreatedDate(  OffsetDateTime  createdDate){
        return customerRepository.findCustomerByCreatedDate( createdDate  );
    }
    /** Find a Customer by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Customer>
    */

    public List<Customer>  findCustomerByKeyHash(  String  keyHash){
        return customerRepository.findCustomerByKeyHash( keyHash  );
    }
    /** Find a Customer by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Customer>
    */

    public List<Customer>  findCustomerByLastAccessedById(  UUID  lastAccessedById){
        return customerRepository.findCustomerByLastAccessedById( lastAccessedById  );
    }
    /** Find a Customer by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Customer>
    */

    public List<Customer>  findCustomerByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return customerRepository.findCustomerByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Customer by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Customer>
    */

    public List<Customer>  findCustomerByLastModifiedById(  UUID  lastModifiedById){
        return customerRepository.findCustomerByLastModifiedById( lastModifiedById  );
    }
    /** Find a Customer by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Customer>
    */

    public List<Customer>  findCustomerByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return customerRepository.findCustomerByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Customer by ID
    public void deleteById(UUID id) {
        customerRepository.deleteById(id);
    }
}
