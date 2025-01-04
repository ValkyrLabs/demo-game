package com.valkyrlabs.api;

import com.valkyrlabs.model.Application;

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
import com.valkyrlabs.model.ContentMediaLink;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: ApplicationRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface ApplicationRepository extends Serializable, JpaRepository<Application, UUID> {

    // ThorAPI Generated search methods for each property on Application
    /** Find a Application by name 
        name ** | **String** | name of the application |  [optional]
        * @param name String name of the application 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByName (  String name);
    /** Find a Application by description 
        description ** | **String** | detailed description of the application |  [optional]
        * @param description String detailed description of the application 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByDescription (  String description);
    /** Find a Application by isTemplate 
        isTemplate ** | **Boolean** | whether this Application is a Template |  [optional]
        * @param isTemplate Boolean whether this Application is a Template 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByIsTemplate (  Boolean isTemplate);
    /** Find a Application by type 
        type ** | [**TypeEnum**](#TypeEnum) | type of application |  [optional]
        * @param type TypeEnum type of application 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByType ( Application.TypeEnum type);
    /** Find a Application by status 
        status ** | [**StatusEnum**](#StatusEnum) | status for event |  [optional]
        * @param status StatusEnum status for event 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByStatus ( Application.StatusEnum status);
    /** Find a Application by entrypointUrl 
        entrypointUrl ** | **String** | the url to the &#39;homepage&#39; or service endpoint |  [optional]
        * @param entrypointUrl String the url to the &#39;homepage&#39; or service endpoint 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByEntrypointUrl (  String entrypointUrl);
    /** Find a Application by contentMedia 
        contentMedia ** | [**List&lt;ContentMediaLink&gt;**](ContentMediaLink.md) |  |  [optional]
        * @param contentMedia List&lt;@Valid ContentMediaLink&gt;  
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByContentMedia (  List<@Valid ContentMediaLink> contentMedia);
    /** Find a Application by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationById (  UUID id);
    /** Find a Application by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByOwnerId (  UUID ownerId);
    /** Find a Application by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Application by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByKeyHash (  String keyHash);
    /** Find a Application by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByLastAccessedById (  UUID lastAccessedById);
    /** Find a Application by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Application by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByLastModifiedById (  UUID lastModifiedById);
    /** Find a Application by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Application>
    */
    // nullable
    public List<Application>  findApplicationByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
