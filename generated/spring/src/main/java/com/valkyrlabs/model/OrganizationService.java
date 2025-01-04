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
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Autowired
    private OrganizationPageableRepository organizationPageableRepositoryRepository;

    /** 
     * Find all instances of Organization with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Organization instances
     */
    public Page<Organization> findAll(Pageable pageable){
        return organizationPageableRepositoryRepository.findAll(pageable);
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
    public Page<Organization> findAll(Example<Organization> example, Pageable pageable){
        return organizationPageableRepositoryRepository.findAll(example, pageable);
    }


    public OrganizationRepository getRepository(){
        return organizationRepository;
    }

    // Create or Update a Organization
    public Organization saveOrUpdate(Organization organization) {
        return organizationRepository.save( organization ); // This method handles both creation and update
        // organizationRepository.flush();
        // return ret;
    }

    // Find a Organization by ID
    public Optional<Organization>  findById(UUID id) {
        return organizationRepository.findById(id);
    }

    // Find all Organizations
    public Iterable<Organization> findAll() {
        return organizationRepository.findAll();
    }

    
    /** Find a Organization by name 
        
        * @param name String 
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByName(  String  name){
        return organizationRepository.findOrganizationByName( name  );
    }
    /** Find a Organization by homePage 
        
        * @param homePage String  [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByHomePage(  String  homePage){
        return organizationRepository.findOrganizationByHomePage( homePage  );
    }
    /** Find a Organization by phone 
        
        * @param phone String  [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByPhone(  String  phone){
        return organizationRepository.findOrganizationByPhone( phone  );
    }
    /** Find a Organization by addressId 
        
        * @param addressId UUID  [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByAddressId(  UUID  addressId){
        return organizationRepository.findOrganizationByAddressId( addressId  );
    }
    /** Find a Organization by address 
        
        * @param address [Address](Address.md)  [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByAddress(  Address  address){
        return organizationRepository.findOrganizationByAddress( address  );
    }
    /** Find a Organization by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationById(  UUID  id){
        return organizationRepository.findOrganizationById( id  );
    }
    /** Find a Organization by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByOwnerId(  UUID  ownerId){
        return organizationRepository.findOrganizationByOwnerId( ownerId  );
    }
    /** Find a Organization by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByCreatedDate(  OffsetDateTime  createdDate){
        return organizationRepository.findOrganizationByCreatedDate( createdDate  );
    }
    /** Find a Organization by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByKeyHash(  String  keyHash){
        return organizationRepository.findOrganizationByKeyHash( keyHash  );
    }
    /** Find a Organization by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByLastAccessedById(  UUID  lastAccessedById){
        return organizationRepository.findOrganizationByLastAccessedById( lastAccessedById  );
    }
    /** Find a Organization by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return organizationRepository.findOrganizationByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Organization by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByLastModifiedById(  UUID  lastModifiedById){
        return organizationRepository.findOrganizationByLastModifiedById( lastModifiedById  );
    }
    /** Find a Organization by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Organization>
    */

    public List<Organization>  findOrganizationByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return organizationRepository.findOrganizationByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Organization by ID
    public void deleteById(UUID id) {
        organizationRepository.deleteById(id);
    }
}
