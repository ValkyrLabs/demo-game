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
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AddressPageableRepository addressPageableRepositoryRepository;

    /** 
     * Find all instances of Address with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Address instances
     */
    public Page<Address> findAll(Pageable pageable){
        return addressPageableRepositoryRepository.findAll(pageable);
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
    public Page<Address> findAll(Example<Address> example, Pageable pageable){
        return addressPageableRepositoryRepository.findAll(example, pageable);
    }


    public AddressRepository getRepository(){
        return addressRepository;
    }

    // Create or Update a Address
    public Address saveOrUpdate(Address address) {
        return addressRepository.save( address ); // This method handles both creation and update
        // addressRepository.flush();
        // return ret;
    }

    // Find a Address by ID
    public Optional<Address>  findById(UUID id) {
        return addressRepository.findById(id);
    }

    // Find all Addresss
    public Iterable<Address> findAll() {
        return addressRepository.findAll();
    }

    
    /** Find a Address by hasWifi 
        
        * @param hasWifi Boolean  [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByHasWifi(  Boolean  hasWifi){
        return addressRepository.findAddressByHasWifi( hasWifi  );
    }
    /** Find a Address by principalId 
        
        * @param principalId UUID  [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByPrincipalId(  UUID  principalId){
        return addressRepository.findAddressByPrincipalId( principalId  );
    }
    /** Find a Address by addressType 
        
        * @param addressType  AddressTypeEnum  AddressTypeEnum) The type of address [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByAddressType( Address.AddressTypeEnum addressType){
        return addressRepository.findAddressByAddressType( addressType  );
    }
    /** Find a Address by name 
        
        * @param name String full name of addressee
        * @return List<Address>
    */

    public List<Address>  findAddressByName(  String  name){
        return addressRepository.findAddressByName( name  );
    }
    /** Find a Address by street1 
        
        * @param street1 String street address line 1
        * @return List<Address>
    */

    public List<Address>  findAddressByStreet1(  String  street1){
        return addressRepository.findAddressByStreet1( street1  );
    }
    /** Find a Address by street2 
        
        * @param street2 String street address line 2 [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByStreet2(  String  street2){
        return addressRepository.findAddressByStreet2( street2  );
    }
    /** Find a Address by city 
        
        * @param city String full name of city
        * @return List<Address>
    */

    public List<Address>  findAddressByCity(  String  city){
        return addressRepository.findAddressByCity( city  );
    }
    /** Find a Address by state 
        
        * @param state String State of residence 2-character code (USA)
        * @return List<Address>
    */

    public List<Address>  findAddressByState(  String  state){
        return addressRepository.findAddressByState( state  );
    }
    /** Find a Address by country 
        
        * @param country String 3 character country code (upper case) [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByCountry(  String  country){
        return addressRepository.findAddressByCountry( country  );
    }
    /** Find a Address by postalCode 
        
        * @param postalCode String 5+4 digit zip code
        * @return List<Address>
    */

    public List<Address>  findAddressByPostalCode(  String  postalCode){
        return addressRepository.findAddressByPostalCode( postalCode  );
    }
    /** Find a Address by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressById(  UUID  id){
        return addressRepository.findAddressById( id  );
    }
    /** Find a Address by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByOwnerId(  UUID  ownerId){
        return addressRepository.findAddressByOwnerId( ownerId  );
    }
    /** Find a Address by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByCreatedDate(  OffsetDateTime  createdDate){
        return addressRepository.findAddressByCreatedDate( createdDate  );
    }
    /** Find a Address by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByKeyHash(  String  keyHash){
        return addressRepository.findAddressByKeyHash( keyHash  );
    }
    /** Find a Address by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByLastAccessedById(  UUID  lastAccessedById){
        return addressRepository.findAddressByLastAccessedById( lastAccessedById  );
    }
    /** Find a Address by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return addressRepository.findAddressByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Address by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByLastModifiedById(  UUID  lastModifiedById){
        return addressRepository.findAddressByLastModifiedById( lastModifiedById  );
    }
    /** Find a Address by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Address>
    */

    public List<Address>  findAddressByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return addressRepository.findAddressByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Address by ID
    public void deleteById(UUID id) {
        addressRepository.deleteById(id);
    }
}
