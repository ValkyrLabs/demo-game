package com.valkyrlabs.api;

import com.valkyrlabs.model.BuildOutput;

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
import com.valkyrlabs.model.Solution;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: BuildOutputRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface BuildOutputRepository extends Serializable, JpaRepository<BuildOutput, UUID> {

    // ThorAPI Generated search methods for each property on BuildOutput
    /** Find a BuildOutput by applicationId 
        applicationId ** | **UUID** |  |  [optional]
        * @param applicationId UUID  
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputByApplicationId (  UUID applicationId);
    /** Find a BuildOutput by buildId 
        buildId ** | **UUID** |  | 
        * @param buildId UUID  
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputByBuildId (  UUID buildId);
    /** Find a BuildOutput by lastSuccessfulRun 
        lastSuccessfulRun ** | **OffsetDateTime** |  |  [optional]
        * @param lastSuccessfulRun OffsetDateTime  
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputByLastSuccessfulRun (  OffsetDateTime lastSuccessfulRun);
    /** Find a BuildOutput by success 
        success ** | **Boolean** |  | 
        * @param success Boolean  
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputBySuccess (  Boolean success);
    /** Find a BuildOutput by output 
        output ** | **String** |  | 
        * @param output String  
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputByOutput (  String output);
    /** Find a BuildOutput by solutions 
        solutions ** | [**List&lt;Solution&gt;**](Solution.md) |  |  [optional]
        * @param solutions List&lt;@Valid Solution&gt;  
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputBySolutions (  List<@Valid Solution> solutions);
    /** Find a BuildOutput by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputById (  UUID id);
    /** Find a BuildOutput by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputByOwnerId (  UUID ownerId);
    /** Find a BuildOutput by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputByCreatedDate (  OffsetDateTime createdDate);
    /** Find a BuildOutput by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputByKeyHash (  String keyHash);
    /** Find a BuildOutput by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputByLastAccessedById (  UUID lastAccessedById);
    /** Find a BuildOutput by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a BuildOutput by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputByLastModifiedById (  UUID lastModifiedById);
    /** Find a BuildOutput by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<BuildOutput>
    */
    // nullable
    public List<BuildOutput>  findBuildOutputByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
