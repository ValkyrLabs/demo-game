package com.valkyrlabs.model;

import com.valkyrlabs.api.*;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Example;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/** 
*
*  ThorAPI Service Methods
*
*/
@Service
// @Transactional(readOnly = false)
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private RatingPageableRepository ratingPageableRepositoryRepository;

    /** 
     * Find all instances of Rating with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Rating instances
     */
    public Page<Rating> findAll(Pageable pageable){
        return ratingPageableRepositoryRepository.findAll(pageable);
    }

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    public Page<Rating> findAll(Example<Rating> example, Pageable pageable){
        return ratingPageableRepositoryRepository.findAll(example, pageable);
    }


    public RatingRepository getRepository(){
        return ratingRepository;
    }

    // Create or Update a Rating
    public Rating saveOrUpdate(Rating rating) {
        return ratingRepository.save( rating ); // This method handles both creation and update
        // ratingRepository.flush();
        // return ret;
    }

    // Find a Rating by ID
    public Optional<Rating>  findById(UUID id) {
        return ratingRepository.findById(id);
    }

    // Find all Ratings
    public Iterable<Rating> findAll() {
        return ratingRepository.findAll();
    }

    
    /** Find a Rating by targetType 
        
        * @param targetType  TargetTypeEnum  TargetTypeEnum) target object for the rating and comments [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingByTargetType( Rating.TargetTypeEnum targetType){
        return ratingRepository.findRatingByTargetType( targetType  );
    }
    /** Find a Rating by contentId 
        
        * @param contentId UUID The unique identifier for the content item
        * @return List<Rating>
    */

    public List<Rating>  findRatingByContentId(  UUID  contentId){
        return ratingRepository.findRatingByContentId( contentId  );
    }
    /** Find a Rating by comments 
        
        * @param comments String  [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingByComments(  String  comments){
        return ratingRepository.findRatingByComments( comments  );
    }
    /** Find a Rating by url 
        
        * @param url String  [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingByUrl(  String  url){
        return ratingRepository.findRatingByUrl( url  );
    }
    /** Find a Rating by rating 
        
        * @param rating Long  [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingByRating(  Long  rating){
        return ratingRepository.findRatingByRating( rating  );
    }
    /** Find a Rating by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingById(  UUID  id){
        return ratingRepository.findRatingById( id  );
    }
    /** Find a Rating by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingByOwnerId(  UUID  ownerId){
        return ratingRepository.findRatingByOwnerId( ownerId  );
    }
    /** Find a Rating by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingByCreatedDate(  OffsetDateTime  createdDate){
        return ratingRepository.findRatingByCreatedDate( createdDate  );
    }
    /** Find a Rating by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingByKeyHash(  String  keyHash){
        return ratingRepository.findRatingByKeyHash( keyHash  );
    }
    /** Find a Rating by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingByLastAccessedById(  UUID  lastAccessedById){
        return ratingRepository.findRatingByLastAccessedById( lastAccessedById  );
    }
    /** Find a Rating by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return ratingRepository.findRatingByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Rating by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingByLastModifiedById(  UUID  lastModifiedById){
        return ratingRepository.findRatingByLastModifiedById( lastModifiedById  );
    }
    /** Find a Rating by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Rating>
    */

    public List<Rating>  findRatingByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return ratingRepository.findRatingByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Rating by ID
    public void deleteById(UUID id) {
        ratingRepository.deleteById(id);
    }
}
