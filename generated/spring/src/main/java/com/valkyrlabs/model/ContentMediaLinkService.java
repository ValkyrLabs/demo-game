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
public class ContentMediaLinkService {

    @Autowired
    private ContentMediaLinkRepository contentmedialinkRepository;

    @Autowired
    private ContentMediaLinkPageableRepository contentmedialinkPageableRepositoryRepository;

    /** 
     * Find all instances of ContentMediaLink with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of ContentMediaLink instances
     */
    public Page<ContentMediaLink> findAll(Pageable pageable){
        return contentmedialinkPageableRepositoryRepository.findAll(pageable);
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
    public Page<ContentMediaLink> findAll(Example<ContentMediaLink> example, Pageable pageable){
        return contentmedialinkPageableRepositoryRepository.findAll(example, pageable);
    }


    public ContentMediaLinkRepository getRepository(){
        return contentmedialinkRepository;
    }

    // Create or Update a ContentMediaLink
    public ContentMediaLink saveOrUpdate(ContentMediaLink contentmedialink) {
        return contentmedialinkRepository.save( contentmedialink ); // This method handles both creation and update
        // contentmedialinkRepository.flush();
        // return ret;
    }

    // Find a ContentMediaLink by ID
    public Optional<ContentMediaLink>  findById(UUID id) {
        return contentmedialinkRepository.findById(id);
    }

    // Find all ContentMediaLinks
    public Iterable<ContentMediaLink> findAll() {
        return contentmedialinkRepository.findAll();
    }

    
    /** Find a ContentMediaLink by applicationId 
        
        * @param applicationId UUID used when linked to an Application [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByApplicationId(  UUID  applicationId){
        return contentmedialinkRepository.findContentMediaLinkByApplicationId( applicationId  );
    }
    /** Find a ContentMediaLink by contentDataId 
        
        * @param contentDataId UUID used when linked to ContentData [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByContentDataId(  UUID  contentDataId){
        return contentmedialinkRepository.findContentMediaLinkByContentDataId( contentDataId  );
    }
    /** Find a ContentMediaLink by contentUse 
        
        * @param contentUse  ContentUseEnum  ContentUseEnum) specialized usage for the media object if any [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByContentUse( ContentMediaLink.ContentUseEnum contentUse){
        return contentmedialinkRepository.findContentMediaLinkByContentUse( contentUse  );
    }
    /** Find a ContentMediaLink by contentType 
        
        * @param contentType  ContentTypeEnum  ContentTypeEnum) content type of the media object [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByContentType( ContentMediaLink.ContentTypeEnum contentType){
        return contentmedialinkRepository.findContentMediaLinkByContentType( contentType  );
    }
    /** Find a ContentMediaLink by mediaUrl 
        
        * @param mediaUrl String url to the media object [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByMediaUrl(  String  mediaUrl){
        return contentmedialinkRepository.findContentMediaLinkByMediaUrl( mediaUrl  );
    }
    /** Find a ContentMediaLink by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkById(  UUID  id){
        return contentmedialinkRepository.findContentMediaLinkById( id  );
    }
    /** Find a ContentMediaLink by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByOwnerId(  UUID  ownerId){
        return contentmedialinkRepository.findContentMediaLinkByOwnerId( ownerId  );
    }
    /** Find a ContentMediaLink by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByCreatedDate(  OffsetDateTime  createdDate){
        return contentmedialinkRepository.findContentMediaLinkByCreatedDate( createdDate  );
    }
    /** Find a ContentMediaLink by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByKeyHash(  String  keyHash){
        return contentmedialinkRepository.findContentMediaLinkByKeyHash( keyHash  );
    }
    /** Find a ContentMediaLink by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByLastAccessedById(  UUID  lastAccessedById){
        return contentmedialinkRepository.findContentMediaLinkByLastAccessedById( lastAccessedById  );
    }
    /** Find a ContentMediaLink by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return contentmedialinkRepository.findContentMediaLinkByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a ContentMediaLink by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByLastModifiedById(  UUID  lastModifiedById){
        return contentmedialinkRepository.findContentMediaLinkByLastModifiedById( lastModifiedById  );
    }
    /** Find a ContentMediaLink by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<ContentMediaLink>
    */

    public List<ContentMediaLink>  findContentMediaLinkByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return contentmedialinkRepository.findContentMediaLinkByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a ContentMediaLink by ID
    public void deleteById(UUID id) {
        contentmedialinkRepository.deleteById(id);
    }
}
