package com.valkyrlabs.api;

import com.valkyrlabs.model.Build;

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
import com.valkyrlabs.model.BuildOutput;
import com.valkyrlabs.model.Depend;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: BuildRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface BuildRepository extends Serializable, JpaRepository<Build, UUID> {

    // ThorAPI Generated search methods for each property on Build
    /** Find a Build by name 
        name ** | **String** |  | 
        * @param name String  
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByName (  String name);
    /** Find a Build by applicationId 
        applicationId ** | **UUID** |  |  [optional]
        * @param applicationId UUID  
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByApplicationId (  UUID applicationId);
    /** Find a Build by status 
        status ** | [**StatusEnum**](#StatusEnum) |  | 
        * @param status StatusEnum  
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByStatus ( Build.StatusEnum status);
    /** Find a Build by projectPath 
        projectPath ** | **String** |  | 
        * @param projectPath String  
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByProjectPath (  String projectPath);
    /** Find a Build by testEnumCodegen 
        testEnumCodegen ** | [**TestEnumCodegenEnum**](#TestEnumCodegenEnum) |  |  [optional]
        * @param testEnumCodegen TestEnumCodegenEnum  
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByTestEnumCodegen ( Build.TestEnumCodegenEnum testEnumCodegen);
    /** Find a Build by mavenHome 
        mavenHome ** | **String** |  | 
        * @param mavenHome String  
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByMavenHome (  String mavenHome);
    /** Find a Build by outputs 
        outputs ** | [**List&lt;BuildOutput&gt;**](BuildOutput.md) |  |  [optional]
        * @param outputs List&lt;@Valid BuildOutput&gt;  
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByOutputs (  List<@Valid BuildOutput> outputs);
    /** Find a Build by dependencies 
        dependencies ** | [**List&lt;Depend&gt;**](Depend.md) |  |  [optional]
        * @param dependencies List&lt;@Valid Depend&gt;  
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByDependencies (  List<@Valid Depend> dependencies);
    /** Find a Build by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildById (  UUID id);
    /** Find a Build by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByOwnerId (  UUID ownerId);
    /** Find a Build by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Build by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByKeyHash (  String keyHash);
    /** Find a Build by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByLastAccessedById (  UUID lastAccessedById);
    /** Find a Build by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Build by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByLastModifiedById (  UUID lastModifiedById);
    /** Find a Build by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Build>
    */
    // nullable
    public List<Build>  findBuildByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
