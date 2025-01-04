package com.valkyrlabs.api;

import com.valkyrlabs.model.ContentMediaLink;

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

    AUTO IMPLEMENTED by Spring as bean: ContentMediaLinkRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface ContentMediaLinkRepository extends Serializable, JpaRepository<ContentMediaLink, UUID> {

    // ThorAPI Generated search methods for each property on ContentMediaLink
    /** Find a ContentMediaLink by applicationId 
        applicationId ** | **UUID** | used when linked to an Application |  [optional]
        * @param applicationId UUID used when linked to an Application 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByApplicationId (  UUID applicationId);
    /** Find a ContentMediaLink by contentDataId 
        contentDataId ** | **UUID** | used when linked to ContentData |  [optional]
        * @param contentDataId UUID used when linked to ContentData 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByContentDataId (  UUID contentDataId);
    /** Find a ContentMediaLink by contentUse 
        contentUse ** | [**ContentUseEnum**](#ContentUseEnum) | specialized usage for the media object if any |  [optional]
        * @param contentUse ContentUseEnum specialized usage for the media object if any 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByContentUse ( ContentMediaLink.ContentUseEnum contentUse);
    /** Find a ContentMediaLink by contentType 
        contentType ** | [**ContentTypeEnum**](#ContentTypeEnum) | content type of the media object |  [optional]
        * @param contentType ContentTypeEnum content type of the media object 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByContentType ( ContentMediaLink.ContentTypeEnum contentType);
    /** Find a ContentMediaLink by mediaUrl 
        mediaUrl ** | **String** | url to the media object |  [optional]
        * @param mediaUrl String url to the media object 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByMediaUrl (  String mediaUrl);
    /** Find a ContentMediaLink by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkById (  UUID id);
    /** Find a ContentMediaLink by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByOwnerId (  UUID ownerId);
    /** Find a ContentMediaLink by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByCreatedDate (  OffsetDateTime createdDate);
    /** Find a ContentMediaLink by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByKeyHash (  String keyHash);
    /** Find a ContentMediaLink by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByLastAccessedById (  UUID lastAccessedById);
    /** Find a ContentMediaLink by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a ContentMediaLink by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByLastModifiedById (  UUID lastModifiedById);
    /** Find a ContentMediaLink by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<ContentMediaLink>
    */
    // nullable
    public List<ContentMediaLink>  findContentMediaLinkByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
