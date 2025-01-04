package com.valkyrlabs.api;

import com.valkyrlabs.model.Rating;

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

    AUTO IMPLEMENTED by Spring as bean: RatingRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface RatingPageableRepository extends Serializable, PagingAndSortingRepository<Rating, UUID> {

    // ThorAPI Generated search methods for each property on Rating
    /** Find a Rating by targetType with pagination
        targetType ** | [**TargetTypeEnum**](#TargetTypeEnum) | target object for the rating and comments |  [optional]
        * @param targetType TargetTypeEnum target object for the rating and comments 
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByTargetType(Rating.TargetTypeEnum targetType, Pageable pageable);
    /** Find a Rating by contentId with pagination
        contentId ** | **UUID** | The unique identifier for the content item | 
        * @param contentId UUID The unique identifier for the content item 
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByContentId(UUID contentId, Pageable pageable);
    /** Find a Rating by comments with pagination
        comments ** | **String** |  |  [optional]
        * @param comments String  
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByComments(String comments, Pageable pageable);
    /** Find a Rating by url with pagination
        url ** | **String** |  |  [optional]
        * @param url String  
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByUrl(String url, Pageable pageable);
    /** Find a Rating by rating with pagination
        rating ** | **Long** |  |  [optional]
        * @param rating Long  
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByRating(Long rating, Pageable pageable);
    /** Find a Rating by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findById(UUID id, Pageable pageable);
    /** Find a Rating by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a Rating by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a Rating by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a Rating by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a Rating by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a Rating by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a Rating by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<Rating>
    */
    public Page<Rating> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of Rating as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of Rating instances
     */
    List<Rating> findAll();

    /** 
     * Find all instances of Rating with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Rating instances
     */
    Page<Rating> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<Rating> findAll(Example<Rating> example, Pageable pageable);

    // end search methods
}
