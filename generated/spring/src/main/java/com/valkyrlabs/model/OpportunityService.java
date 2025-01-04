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
import com.valkyrlabs.model.Customer;
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
public class OpportunityService {

    @Autowired
    private OpportunityRepository opportunityRepository;

    @Autowired
    private OpportunityPageableRepository opportunityPageableRepositoryRepository;

    /** 
     * Find all instances of Opportunity with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Opportunity instances
     */
    public Page<Opportunity> findAll(Pageable pageable){
        return opportunityPageableRepositoryRepository.findAll(pageable);
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
    public Page<Opportunity> findAll(Example<Opportunity> example, Pageable pageable){
        return opportunityPageableRepositoryRepository.findAll(example, pageable);
    }


    public OpportunityRepository getRepository(){
        return opportunityRepository;
    }

    // Create or Update a Opportunity
    public Opportunity saveOrUpdate(Opportunity opportunity) {
        return opportunityRepository.save( opportunity ); // This method handles both creation and update
        // opportunityRepository.flush();
        // return ret;
    }

    // Find a Opportunity by ID
    public Optional<Opportunity>  findById(UUID id) {
        return opportunityRepository.findById(id);
    }

    // Find all Opportunitys
    public Iterable<Opportunity> findAll() {
        return opportunityRepository.findAll();
    }

    
    /** Find a Opportunity by customerId 
        
        * @param customerId UUID The customer associated with the opportunity.
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByCustomerId(  UUID  customerId){
        return opportunityRepository.findOpportunityByCustomerId( customerId  );
    }
    /** Find a Opportunity by customer 
        
        * @param customer [Customer](Customer.md)  [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByCustomer(  Customer  customer){
        return opportunityRepository.findOpportunityByCustomer( customer  );
    }
    /** Find a Opportunity by description 
        
        * @param description String Description of the opportunity.
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByDescription(  String  description){
        return opportunityRepository.findOpportunityByDescription( description  );
    }
    /** Find a Opportunity by totalValue 
        
        * @param totalValue Double Expected total value of the opportunity. [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByTotalValue(  Double  totalValue){
        return opportunityRepository.findOpportunityByTotalValue( totalValue  );
    }
    /** Find a Opportunity by currentStatus 
        
        * @param currentStatus  CurrentStatusEnum  CurrentStatusEnum) Status of the opportunity. [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByCurrentStatus( Opportunity.CurrentStatusEnum currentStatus){
        return opportunityRepository.findOpportunityByCurrentStatus( currentStatus  );
    }
    /** Find a Opportunity by estimatedCloseDate 
        
        * @param estimatedCloseDate OffsetDateTime Estimated closing date for the opportunity. [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByEstimatedCloseDate(  OffsetDateTime  estimatedCloseDate){
        return opportunityRepository.findOpportunityByEstimatedCloseDate( estimatedCloseDate  );
    }
    /** Find a Opportunity by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityById(  UUID  id){
        return opportunityRepository.findOpportunityById( id  );
    }
    /** Find a Opportunity by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByOwnerId(  UUID  ownerId){
        return opportunityRepository.findOpportunityByOwnerId( ownerId  );
    }
    /** Find a Opportunity by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByCreatedDate(  OffsetDateTime  createdDate){
        return opportunityRepository.findOpportunityByCreatedDate( createdDate  );
    }
    /** Find a Opportunity by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByKeyHash(  String  keyHash){
        return opportunityRepository.findOpportunityByKeyHash( keyHash  );
    }
    /** Find a Opportunity by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByLastAccessedById(  UUID  lastAccessedById){
        return opportunityRepository.findOpportunityByLastAccessedById( lastAccessedById  );
    }
    /** Find a Opportunity by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return opportunityRepository.findOpportunityByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Opportunity by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByLastModifiedById(  UUID  lastModifiedById){
        return opportunityRepository.findOpportunityByLastModifiedById( lastModifiedById  );
    }
    /** Find a Opportunity by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Opportunity>
    */

    public List<Opportunity>  findOpportunityByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return opportunityRepository.findOpportunityByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Opportunity by ID
    public void deleteById(UUID id) {
        opportunityRepository.deleteById(id);
    }
}
