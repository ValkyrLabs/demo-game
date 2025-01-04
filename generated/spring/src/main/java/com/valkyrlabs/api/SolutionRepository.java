package com.valkyrlabs.api;

import com.valkyrlabs.model.Solution;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: SolutionRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface SolutionRepository extends Serializable, JpaRepository<Solution, UUID> {

    // ThorAPI Generated search methods for each property on Solution
    /** Find a Solution by buildOutputId 
        buildOutputId ** | **UUID** |  | 
        * @param buildOutputId UUID  
        * @return List<Solution>
    */
    // nullable
    public List<Solution>  findSolutionByBuildOutputId (  UUID buildOutputId);
    /** Find a Solution by description 
        description ** | **String** |  | 
        * @param description String  
        * @return List<Solution>
    */
    // nullable
    public List<Solution>  findSolutionByDescription (  String description);
    /** Find a Solution by appliedFix 
        appliedFix ** | **Boolean** |  | 
        * @param appliedFix Boolean  
        * @return List<Solution>
    */
    // nullable
    public List<Solution>  findSolutionByAppliedFix (  Boolean appliedFix);
    /** Find a Solution by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Solution>
    */
    // nullable
    public List<Solution>  findSolutionById (  UUID id);
    /** Find a Solution by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Solution>
    */
    // nullable
    public List<Solution>  findSolutionByOwnerId (  UUID ownerId);
    /** Find a Solution by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Solution>
    */
    // nullable
    public List<Solution>  findSolutionByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Solution by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Solution>
    */
    // nullable
    public List<Solution>  findSolutionByKeyHash (  String keyHash);
    /** Find a Solution by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Solution>
    */
    // nullable
    public List<Solution>  findSolutionByLastAccessedById (  UUID lastAccessedById);
    /** Find a Solution by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Solution>
    */
    // nullable
    public List<Solution>  findSolutionByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Solution by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Solution>
    */
    // nullable
    public List<Solution>  findSolutionByLastModifiedById (  UUID lastModifiedById);
    /** Find a Solution by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Solution>
    */
    // nullable
    public List<Solution>  findSolutionByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
