package com.valkyrlabs.api;

import com.valkyrlabs.model.Depend;

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

    AUTO IMPLEMENTED by Spring as bean: DependRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface DependRepository extends Serializable, JpaRepository<Depend, UUID> {

    // ThorAPI Generated search methods for each property on Depend
    /** Find a Depend by groupId 
        groupId ** | **String** |  | 
        * @param groupId String  
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByGroupId (  String groupId);
    /** Find a Depend by artifactId 
        artifactId ** | **String** |  | 
        * @param artifactId String  
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByArtifactId (  String artifactId);
    /** Find a Depend by version 
        version ** | **String** |  | 
        * @param version String  
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByVersion (  String version);
    /** Find a Depend by scope 
        scope ** | **String** |  |  [optional]
        * @param scope String  
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByScope (  String scope);
    /** Find a Depend by status 
        status ** | [**StatusEnum**](#StatusEnum) |  |  [optional]
        * @param status StatusEnum  
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByStatus ( Depend.StatusEnum status);
    /** Find a Depend by buildId 
        buildId ** | **UUID** |  |  [optional]
        * @param buildId UUID  
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByBuildId (  UUID buildId);
    /** Find a Depend by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependById (  UUID id);
    /** Find a Depend by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByOwnerId (  UUID ownerId);
    /** Find a Depend by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Depend by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByKeyHash (  String keyHash);
    /** Find a Depend by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByLastAccessedById (  UUID lastAccessedById);
    /** Find a Depend by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Depend by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByLastModifiedById (  UUID lastModifiedById);
    /** Find a Depend by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Depend>
    */
    // nullable
    public List<Depend>  findDependByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
