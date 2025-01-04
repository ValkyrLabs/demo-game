package com.valkyrlabs.api;

import com.valkyrlabs.model.Build;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
public interface BuildPageableRepository extends Serializable, PagingAndSortingRepository<Build, UUID> {

    // ThorAPI Generated search methods for each property on Build
    /** Find a Build by name with pagination
        name ** | **String** |  | 
        * @param name String  
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByName(String name, Pageable pageable);
    /** Find a Build by applicationId with pagination
        applicationId ** | **UUID** |  |  [optional]
        * @param applicationId UUID  
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByApplicationId(UUID applicationId, Pageable pageable);
    /** Find a Build by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) |  | 
        * @param status StatusEnum  
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByStatus(Build.StatusEnum status, Pageable pageable);
    /** Find a Build by projectPath with pagination
        projectPath ** | **String** |  | 
        * @param projectPath String  
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByProjectPath(String projectPath, Pageable pageable);
    /** Find a Build by testEnumCodegen with pagination
        testEnumCodegen ** | [**TestEnumCodegenEnum**](#TestEnumCodegenEnum) |  |  [optional]
        * @param testEnumCodegen TestEnumCodegenEnum  
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByTestEnumCodegen(Build.TestEnumCodegenEnum testEnumCodegen, Pageable pageable);
    /** Find a Build by mavenHome with pagination
        mavenHome ** | **String** |  | 
        * @param mavenHome String  
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByMavenHome(String mavenHome, Pageable pageable);
    /** Find a Build by outputs with pagination
        outputs ** | [**List<BuildOutput>**](BuildOutput.md) |  |  [optional]
        * @param outputs List&lt;@Valid BuildOutput&gt;  
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByOutputs(List<@Valid BuildOutput> outputs, Pageable pageable);
    /** Find a Build by dependencies with pagination
        dependencies ** | [**List<Depend>**](Depend.md) |  |  [optional]
        * @param dependencies List&lt;@Valid Depend&gt;  
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByDependencies(List<@Valid Depend> dependencies, Pageable pageable);
    /** Find a Build by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findById(UUID id, Pageable pageable);
    /** Find a Build by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Build by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Build by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Build by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Build by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Build by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Build by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Build>
    */
    public Page<Build> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Build as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Build instances
     */
    List<Build> findAll();

    /** 
     * Find all instances of Build with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Build instances
     */
    Page<Build> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Build> findAll(Example<Build> example, Pageable pageable);

    // end search methods
}
