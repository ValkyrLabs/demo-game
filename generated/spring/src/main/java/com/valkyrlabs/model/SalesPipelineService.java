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
public class SalesPipelineService {

    @Autowired
    private SalesPipelineRepository salespipelineRepository;

    @Autowired
    private SalesPipelinePageableRepository salespipelinePageableRepositoryRepository;

    /** 
     * Find all instances of SalesPipeline with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of SalesPipeline instances
     */
    public Page<SalesPipeline> findAll(Pageable pageable){
        return salespipelinePageableRepositoryRepository.findAll(pageable);
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
    public Page<SalesPipeline> findAll(Example<SalesPipeline> example, Pageable pageable){
        return salespipelinePageableRepositoryRepository.findAll(example, pageable);
    }


    public SalesPipelineRepository getRepository(){
        return salespipelineRepository;
    }

    // Create or Update a SalesPipeline
    public SalesPipeline saveOrUpdate(SalesPipeline salespipeline) {
        return salespipelineRepository.save( salespipeline ); // This method handles both creation and update
        // salespipelineRepository.flush();
        // return ret;
    }

    // Find a SalesPipeline by ID
    public Optional<SalesPipeline>  findById(UUID id) {
        return salespipelineRepository.findById(id);
    }

    // Find all SalesPipelines
    public Iterable<SalesPipeline> findAll() {
        return salespipelineRepository.findAll();
    }

    
    /** Find a SalesPipeline by name 
        
        * @param name  NameEnum  NameEnum) Name of the sales stage (e.g., Lead, Qualification, Proposal, Negotiation, Closed).
        * @return List<SalesPipeline>
    */

    public List<SalesPipeline>  findSalesPipelineByName( SalesPipeline.NameEnum name){
        return salespipelineRepository.findSalesPipelineByName( name  );
    }
    /** Find a SalesPipeline by sequenceOrder 
        
        * @param sequenceOrder Integer The order in which the stages are followed in the sales process. [optional]
        * @return List<SalesPipeline>
    */

    public List<SalesPipeline>  findSalesPipelineBySequenceOrder(  Integer  sequenceOrder){
        return salespipelineRepository.findSalesPipelineBySequenceOrder( sequenceOrder  );
    }
    /** Find a SalesPipeline by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<SalesPipeline>
    */

    public List<SalesPipeline>  findSalesPipelineById(  UUID  id){
        return salespipelineRepository.findSalesPipelineById( id  );
    }
    /** Find a SalesPipeline by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<SalesPipeline>
    */

    public List<SalesPipeline>  findSalesPipelineByOwnerId(  UUID  ownerId){
        return salespipelineRepository.findSalesPipelineByOwnerId( ownerId  );
    }
    /** Find a SalesPipeline by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<SalesPipeline>
    */

    public List<SalesPipeline>  findSalesPipelineByCreatedDate(  OffsetDateTime  createdDate){
        return salespipelineRepository.findSalesPipelineByCreatedDate( createdDate  );
    }
    /** Find a SalesPipeline by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<SalesPipeline>
    */

    public List<SalesPipeline>  findSalesPipelineByKeyHash(  String  keyHash){
        return salespipelineRepository.findSalesPipelineByKeyHash( keyHash  );
    }
    /** Find a SalesPipeline by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<SalesPipeline>
    */

    public List<SalesPipeline>  findSalesPipelineByLastAccessedById(  UUID  lastAccessedById){
        return salespipelineRepository.findSalesPipelineByLastAccessedById( lastAccessedById  );
    }
    /** Find a SalesPipeline by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<SalesPipeline>
    */

    public List<SalesPipeline>  findSalesPipelineByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return salespipelineRepository.findSalesPipelineByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a SalesPipeline by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<SalesPipeline>
    */

    public List<SalesPipeline>  findSalesPipelineByLastModifiedById(  UUID  lastModifiedById){
        return salespipelineRepository.findSalesPipelineByLastModifiedById( lastModifiedById  );
    }
    /** Find a SalesPipeline by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<SalesPipeline>
    */

    public List<SalesPipeline>  findSalesPipelineByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return salespipelineRepository.findSalesPipelineByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a SalesPipeline by ID
    public void deleteById(UUID id) {
        salespipelineRepository.deleteById(id);
    }
}
