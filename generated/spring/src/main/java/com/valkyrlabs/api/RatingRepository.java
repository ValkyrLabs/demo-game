package com.valkyrlabs.api;

import com.valkyrlabs.model.Rating;

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

    AUTO IMPLEMENTED by Spring as bean: RatingRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface RatingRepository extends Serializable, JpaRepository<Rating, UUID> {

    // ThorAPI Generated search methods for each property on Rating
    /** Find a Rating by targetType 
        targetType ** | [**TargetTypeEnum**](#TargetTypeEnum) | target object for the rating and comments |  [optional]
        * @param targetType TargetTypeEnum target object for the rating and comments 
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByTargetType ( Rating.TargetTypeEnum targetType);
    /** Find a Rating by contentId 
        contentId ** | **UUID** | The unique identifier for the content item | 
        * @param contentId UUID The unique identifier for the content item 
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByContentId (  UUID contentId);
    /** Find a Rating by comments 
        comments ** | **String** |  |  [optional]
        * @param comments String  
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByComments (  String comments);
    /** Find a Rating by url 
        url ** | **String** |  |  [optional]
        * @param url String  
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByUrl (  String url);
    /** Find a Rating by rating 
        rating ** | **Long** |  |  [optional]
        * @param rating Long  
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByRating (  Long rating);
    /** Find a Rating by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingById (  UUID id);
    /** Find a Rating by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByOwnerId (  UUID ownerId);
    /** Find a Rating by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Rating by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByKeyHash (  String keyHash);
    /** Find a Rating by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByLastAccessedById (  UUID lastAccessedById);
    /** Find a Rating by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Rating by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByLastModifiedById (  UUID lastModifiedById);
    /** Find a Rating by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Rating>
    */
    // nullable
    public List<Rating>  findRatingByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
