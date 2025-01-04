package com.valkyrlabs.api;

import com.valkyrlabs.model.ContentData;

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
// @Transactional(readOnly=false)
public interface ContentDataRepository extends Serializable, JpaRepository<ContentData, UUID> {

    // ThorAPI Generated search methods for each property on ContentData
    /** Find a ContentData by authorName 
        authorName ** | **String** |  |  [optional]
        * @param authorName String  
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByAuthorName (  String authorName);
    /** Find a ContentData by title 
        title ** | **String** |  |  [optional]
        * @param title String  
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByTitle (  String title);
    /** Find a ContentData by subtitle 
        subtitle ** | **String** |  |  [optional]
        * @param subtitle String  
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataBySubtitle (  String subtitle);
    /** Find a ContentData by contentUrl 
        contentUrl ** | **String** |  |  [optional]
        * @param contentUrl String  
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByContentUrl (  String contentUrl);
    /** Find a ContentData by contentData 
        contentData ** | **String** |  |  [optional]
        * @param contentData String  
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByContentData (  String contentData);
    /** Find a ContentData by contentType 
        contentType ** | [**ContentTypeEnum**](#ContentTypeEnum) |  |  [optional]
        * @param contentType ContentTypeEnum  
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByContentType ( ContentData.ContentTypeEnum contentType);
    /** Find a ContentData by thumbnailImage 
        thumbnailImage ** | **String** | The large image (optional) for your content |  [optional]
        * @param thumbnailImage String The large image (optional) for your content 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByThumbnailImage (  String thumbnailImage);
    /** Find a ContentData by largeImage 
        largeImage ** | **String** | The large image (optional) for your content |  [optional]
        * @param largeImage String The large image (optional) for your content 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByLargeImage (  String largeImage);
    /** Find a ContentData by category 
        category ** | [**CategoryEnum**](#CategoryEnum) |  |  [optional]
        * @param category CategoryEnum  
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByCategory ( ContentData.CategoryEnum category);
    /** Find a ContentData by status 
        status ** | [**StatusEnum**](#StatusEnum) |  |  [optional]
        * @param status StatusEnum  
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByStatus ( ContentData.StatusEnum status);
    /** Find a ContentData by releaseDate 
        releaseDate ** | **OffsetDateTime** | the release date (used to automate publishing) |  [optional]
        * @param releaseDate OffsetDateTime the release date (used to automate publishing) 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByReleaseDate (  OffsetDateTime releaseDate);
    /** Find a ContentData by contentMedia 
        contentMedia ** | [**List&lt;ContentMediaLink&gt;**](ContentMediaLink.md) | media contained in or referenced by the content |  [optional]
        * @param contentMedia List&lt;@Valid ContentMediaLink&gt; media contained in or referenced by the content 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByContentMedia (  List<@Valid ContentMediaLink> contentMedia);
    /** Find a ContentData by principalId 
        principalId ** | **UUID** | the author or attibuted entity |  [optional]
        * @param principalId UUID the author or attibuted entity 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByPrincipalId (  UUID principalId);
    /** Find a ContentData by principal 
        principal ** | [**Principal**](Principal.md) |  |  [optional]
        * @param principal Principal  
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByPrincipal (  Principal principal);
    /** Find a ContentData by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataById (  UUID id);
    /** Find a ContentData by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByOwnerId (  UUID ownerId);
    /** Find a ContentData by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByCreatedDate (  OffsetDateTime createdDate);
    /** Find a ContentData by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByKeyHash (  String keyHash);
    /** Find a ContentData by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByLastAccessedById (  UUID lastAccessedById);
    /** Find a ContentData by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a ContentData by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByLastModifiedById (  UUID lastModifiedById);
    /** Find a ContentData by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<ContentData>
    */
    // nullable
    public List<ContentData>  findContentDataByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
