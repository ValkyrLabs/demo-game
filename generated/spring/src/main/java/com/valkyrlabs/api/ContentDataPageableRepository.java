package com.valkyrlabs.api;

import com.valkyrlabs.model.ContentData;

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
import com.valkyrlabs.model.Principal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
/** 
    ThorAPI/Spring Data Methods

    AUTO IMPLEMENTED by Spring as bean: ContentDataRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface ContentDataPageableRepository extends Serializable, PagingAndSortingRepository<ContentData, UUID> {

    // ThorAPI Generated search methods for each property on ContentData
    /** Find a ContentData by authorName with pagination
        authorName ** | **String** |  |  [optional]
        * @param authorName String  
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByAuthorName(String authorName, Pageable pageable);
    /** Find a ContentData by title with pagination
        title ** | **String** |  |  [optional]
        * @param title String  
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByTitle(String title, Pageable pageable);
    /** Find a ContentData by subtitle with pagination
        subtitle ** | **String** |  |  [optional]
        * @param subtitle String  
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findBySubtitle(String subtitle, Pageable pageable);
    /** Find a ContentData by contentUrl with pagination
        contentUrl ** | **String** |  |  [optional]
        * @param contentUrl String  
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByContentUrl(String contentUrl, Pageable pageable);
    /** Find a ContentData by contentData with pagination
        contentData ** | **String** |  |  [optional]
        * @param contentData String  
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByContentData(String contentData, Pageable pageable);
    /** Find a ContentData by contentType with pagination
        contentType ** | [**ContentTypeEnum**](#ContentTypeEnum) |  |  [optional]
        * @param contentType ContentTypeEnum  
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByContentType(ContentData.ContentTypeEnum contentType, Pageable pageable);
    /** Find a ContentData by thumbnailImage with pagination
        thumbnailImage ** | **String** | The large image (optional) for your content |  [optional]
        * @param thumbnailImage String The large image (optional) for your content 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByThumbnailImage(String thumbnailImage, Pageable pageable);
    /** Find a ContentData by largeImage with pagination
        largeImage ** | **String** | The large image (optional) for your content |  [optional]
        * @param largeImage String The large image (optional) for your content 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByLargeImage(String largeImage, Pageable pageable);
    /** Find a ContentData by category with pagination
        category ** | [**CategoryEnum**](#CategoryEnum) |  |  [optional]
        * @param category CategoryEnum  
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByCategory(ContentData.CategoryEnum category, Pageable pageable);
    /** Find a ContentData by status with pagination
        status ** | [**StatusEnum**](#StatusEnum) |  |  [optional]
        * @param status StatusEnum  
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByStatus(ContentData.StatusEnum status, Pageable pageable);
    /** Find a ContentData by releaseDate with pagination
        releaseDate ** | **OffsetDateTime** | the release date (used to automate publishing) |  [optional]
        * @param releaseDate OffsetDateTime the release date (used to automate publishing) 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByReleaseDate(OffsetDateTime releaseDate, Pageable pageable);
    /** Find a ContentData by contentMedia with pagination
        contentMedia ** | [**List<ContentMediaLink>**](ContentMediaLink.md) | media contained in or referenced by the content |  [optional]
        * @param contentMedia List&lt;@Valid ContentMediaLink&gt; media contained in or referenced by the content 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByContentMedia(List<@Valid ContentMediaLink> contentMedia, Pageable pageable);
    /** Find a ContentData by principalId with pagination
        principalId ** | **UUID** | the author or attibuted entity |  [optional]
        * @param principalId UUID the author or attibuted entity 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByPrincipalId(UUID principalId, Pageable pageable);
    /** Find a ContentData by principal with pagination
        principal ** | [**Principal**](Principal.md) |  |  [optional]
        * @param principal Principal  
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByPrincipal(Principal principal, Pageable pageable);
    /** Find a ContentData by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findById(UUID id, Pageable pageable);
    /** Find a ContentData by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a ContentData by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a ContentData by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a ContentData by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a ContentData by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a ContentData by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a ContentData by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<ContentData>
    */
    public Page<ContentData> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of ContentData as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of ContentData instances
     */
    List<ContentData> findAll();

    /** 
     * Find all instances of ContentData with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of ContentData instances
     */
    Page<ContentData> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<ContentData> findAll(Example<ContentData> example, Pageable pageable);

    // end search methods
}
