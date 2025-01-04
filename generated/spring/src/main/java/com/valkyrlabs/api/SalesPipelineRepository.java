package com.valkyrlabs.api;

import com.valkyrlabs.model.SalesPipeline;

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

    AUTO IMPLEMENTED by Spring as bean: SalesPipelineRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface SalesPipelineRepository extends Serializable, JpaRepository<SalesPipeline, UUID> {

    // ThorAPI Generated search methods for each property on SalesPipeline
    /** Find a SalesPipeline by name 
        name ** | [**NameEnum**](#NameEnum) | Name of the sales stage (e.g., Lead, Qualification, Proposal, Negotiation, Closed). | 
        * @param name NameEnum Name of the sales stage (e.g., Lead, Qualification, Proposal, Negotiation, Closed). 
        * @return List<SalesPipeline>
    */
    // nullable
    public List<SalesPipeline>  findSalesPipelineByName ( SalesPipeline.NameEnum name);
    /** Find a SalesPipeline by sequenceOrder 
        sequenceOrder ** | **Integer** | The order in which the stages are followed in the sales process. |  [optional]
        * @param sequenceOrder Integer The order in which the stages are followed in the sales process. 
        * @return List<SalesPipeline>
    */
    // nullable
    public List<SalesPipeline>  findSalesPipelineBySequenceOrder (  Integer sequenceOrder);
    /** Find a SalesPipeline by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<SalesPipeline>
    */
    // nullable
    public List<SalesPipeline>  findSalesPipelineById (  UUID id);
    /** Find a SalesPipeline by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<SalesPipeline>
    */
    // nullable
    public List<SalesPipeline>  findSalesPipelineByOwnerId (  UUID ownerId);
    /** Find a SalesPipeline by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<SalesPipeline>
    */
    // nullable
    public List<SalesPipeline>  findSalesPipelineByCreatedDate (  OffsetDateTime createdDate);
    /** Find a SalesPipeline by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<SalesPipeline>
    */
    // nullable
    public List<SalesPipeline>  findSalesPipelineByKeyHash (  String keyHash);
    /** Find a SalesPipeline by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<SalesPipeline>
    */
    // nullable
    public List<SalesPipeline>  findSalesPipelineByLastAccessedById (  UUID lastAccessedById);
    /** Find a SalesPipeline by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<SalesPipeline>
    */
    // nullable
    public List<SalesPipeline>  findSalesPipelineByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a SalesPipeline by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<SalesPipeline>
    */
    // nullable
    public List<SalesPipeline>  findSalesPipelineByLastModifiedById (  UUID lastModifiedById);
    /** Find a SalesPipeline by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<SalesPipeline>
    */
    // nullable
    public List<SalesPipeline>  findSalesPipelineByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
