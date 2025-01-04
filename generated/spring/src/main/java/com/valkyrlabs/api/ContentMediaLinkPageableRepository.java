package com.valkyrlabs.api;

import com.valkyrlabs.model.ContentMediaLink;

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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: ContentMediaLinkRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface ContentMediaLinkPageableRepository extends Serializable, PagingAndSortingRepository<ContentMediaLink, UUID> {

    // ThorAPI Generated search methods for each property on ContentMediaLink
    /** Find a ContentMediaLink by applicationId with pagination
        applicationId ** | **UUID** | used when linked to an Application |  [optional]
        * @param applicationId UUID used when linked to an Application 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByApplicationId(UUID applicationId, Pageable pageable);
    /** Find a ContentMediaLink by contentDataId with pagination
        contentDataId ** | **UUID** | used when linked to ContentData |  [optional]
        * @param contentDataId UUID used when linked to ContentData 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByContentDataId(UUID contentDataId, Pageable pageable);
    /** Find a ContentMediaLink by contentUse with pagination
        contentUse ** | [**ContentUseEnum**](#ContentUseEnum) | specialized usage for the media object if any |  [optional]
        * @param contentUse ContentUseEnum specialized usage for the media object if any 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByContentUse(ContentMediaLink.ContentUseEnum contentUse, Pageable pageable);
    /** Find a ContentMediaLink by contentType with pagination
        contentType ** | [**ContentTypeEnum**](#ContentTypeEnum) | content type of the media object |  [optional]
        * @param contentType ContentTypeEnum content type of the media object 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByContentType(ContentMediaLink.ContentTypeEnum contentType, Pageable pageable);
    /** Find a ContentMediaLink by mediaUrl with pagination
        mediaUrl ** | **String** | url to the media object |  [optional]
        * @param mediaUrl String url to the media object 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByMediaUrl(String mediaUrl, Pageable pageable);
    /** Find a ContentMediaLink by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findById(UUID id, Pageable pageable);
    /** Find a ContentMediaLink by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a ContentMediaLink by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a ContentMediaLink by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a ContentMediaLink by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a ContentMediaLink by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a ContentMediaLink by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a ContentMediaLink by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<ContentMediaLink>
    */
    public Page<ContentMediaLink> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of ContentMediaLink as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of ContentMediaLink instances
     */
    List<ContentMediaLink> findAll();

    /** 
     * Find all instances of ContentMediaLink with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of ContentMediaLink instances
     */
    Page<ContentMediaLink> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<ContentMediaLink> findAll(Example<ContentMediaLink> example, Pageable pageable);

    // end search methods
}
