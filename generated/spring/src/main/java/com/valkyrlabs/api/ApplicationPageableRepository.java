package com.valkyrlabs.api;

import com.valkyrlabs.model.Application;

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
public interface ApplicationPageableRepository extends Serializable, PagingAndSortingRepository<Application, UUID> {

    // ThorAPI Generated search methods for each property on Application
    /** Find a Application by name with pagination
        name ** | **String** | name of the application |  [optional]
        * @param name String name of the application 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByName(String name, Pageable pageable);
    /** Find a Application by description with pagination
        description ** | **String** | detailed description of the application |  [optional]
        * @param description String detailed description of the application 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByDescription(String description, Pageable pageable);
    /** Find a Application by isTemplate with pagination
        isTemplate ** | **Boolean** | whether this Application is a Template |  [optional]
        * @param isTemplate Boolean whether this Application is a Template 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByIsTemplate(Boolean isTemplate, Pageable pageable);
    /** Find a Application by type with pagination
        type ** | [**TypeEnum**](#TypeEnum) | type of application |  [optional]
        * @param type TypeEnum type of application 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByType(Application.TypeEnum type, Pageable pageable);
    /** Find a Application by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) | status for event |  [optional]
        * @param status StatusEnum status for event 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByStatus(Application.StatusEnum status, Pageable pageable);
    /** Find a Application by entrypointUrl with pagination
        entrypointUrl ** | **String** | the url to the &#39;homepage&#39; or service endpoint |  [optional]
        * @param entrypointUrl String the url to the &#39;homepage&#39; or service endpoint 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByEntrypointUrl(String entrypointUrl, Pageable pageable);
    /** Find a Application by contentMedia with pagination
        contentMedia ** | [**List<ContentMediaLink>**](ContentMediaLink.md) |  |  [optional]
        * @param contentMedia List&lt;@Valid ContentMediaLink&gt;  
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByContentMedia(List<@Valid ContentMediaLink> contentMedia, Pageable pageable);
    /** Find a Application by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findById(UUID id, Pageable pageable);
    /** Find a Application by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Application by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Application by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Application by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Application by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Application by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Application by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Application>
    */
    public Page<Application> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Application as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Application instances
     */
    List<Application> findAll();

    /** 
     * Find all instances of Application with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Application instances
     */
    Page<Application> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Application> findAll(Example<Application> example, Pageable pageable);

    // end search methods
}
