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
import com.valkyrlabs.model.ContentMediaLink;
import com.valkyrlabs.model.Principal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class ContentDataService {

    @Autowired
    private ContentDataRepository contentdataRepository;

    @Autowired
    private ContentDataPageableRepository contentdataPageableRepositoryRepository;

    /** 
     * Find all instances of ContentData with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of ContentData instances
     */
    public Page<ContentData> findAll(Pageable pageable){
        return contentdataPageableRepositoryRepository.findAll(pageable);
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
    public Page<ContentData> findAll(Example<ContentData> example, Pageable pageable){
        return contentdataPageableRepositoryRepository.findAll(example, pageable);
    }


    public ContentDataRepository getRepository(){
        return contentdataRepository;
    }

    // Create or Update a ContentData
    public ContentData saveOrUpdate(ContentData contentdata) {
        return contentdataRepository.save( contentdata ); // This method handles both creation and update
        // contentdataRepository.flush();
        // return ret;
    }

    // Find a ContentData by ID
    public Optional<ContentData>  findById(UUID id) {
        return contentdataRepository.findById(id);
    }

    // Find all ContentDatas
    public Iterable<ContentData> findAll() {
        return contentdataRepository.findAll();
    }

    
    /** Find a ContentData by authorName 
        
        * @param authorName String  [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByAuthorName(  String  authorName){
        return contentdataRepository.findContentDataByAuthorName( authorName  );
    }
    /** Find a ContentData by title 
        
        * @param title String  [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByTitle(  String  title){
        return contentdataRepository.findContentDataByTitle( title  );
    }
    /** Find a ContentData by subtitle 
        
        * @param subtitle String  [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataBySubtitle(  String  subtitle){
        return contentdataRepository.findContentDataBySubtitle( subtitle  );
    }
    /** Find a ContentData by contentUrl 
        
        * @param contentUrl String  [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByContentUrl(  String  contentUrl){
        return contentdataRepository.findContentDataByContentUrl( contentUrl  );
    }
    /** Find a ContentData by contentData 
        
        * @param contentData String  [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByContentData(  String  contentData){
        return contentdataRepository.findContentDataByContentData( contentData  );
    }
    /** Find a ContentData by contentType 
        
        * @param contentType  ContentTypeEnum  ContentTypeEnum)  [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByContentType( ContentData.ContentTypeEnum contentType){
        return contentdataRepository.findContentDataByContentType( contentType  );
    }
    /** Find a ContentData by thumbnailImage 
        
        * @param thumbnailImage String The large image (optional) for your content [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByThumbnailImage(  String  thumbnailImage){
        return contentdataRepository.findContentDataByThumbnailImage( thumbnailImage  );
    }
    /** Find a ContentData by largeImage 
        
        * @param largeImage String The large image (optional) for your content [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByLargeImage(  String  largeImage){
        return contentdataRepository.findContentDataByLargeImage( largeImage  );
    }
    /** Find a ContentData by category 
        
        * @param category  CategoryEnum  CategoryEnum)  [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByCategory( ContentData.CategoryEnum category){
        return contentdataRepository.findContentDataByCategory( category  );
    }
    /** Find a ContentData by status 
        
        * @param status  StatusEnum  StatusEnum)  [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByStatus( ContentData.StatusEnum status){
        return contentdataRepository.findContentDataByStatus( status  );
    }
    /** Find a ContentData by releaseDate 
        
        * @param releaseDate OffsetDateTime the release date (used to automate publishing) [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByReleaseDate(  OffsetDateTime  releaseDate){
        return contentdataRepository.findContentDataByReleaseDate( releaseDate  );
    }
    /** Find a ContentData by contentMedia 
        
        * @param contentMedia [ List <ContentMediaLink> ](ContentMediaLink) media contained in or referenced by the content [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByContentMedia(  List<@Valid ContentMediaLink>  contentMedia){
        return contentdataRepository.findContentDataByContentMedia( contentMedia  );
    }
    /** Find a ContentData by principalId 
        
        * @param principalId UUID the author or attibuted entity [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByPrincipalId(  UUID  principalId){
        return contentdataRepository.findContentDataByPrincipalId( principalId  );
    }
    /** Find a ContentData by principal 
        
        * @param principal [Principal](Principal.md)  [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByPrincipal(  Principal  principal){
        return contentdataRepository.findContentDataByPrincipal( principal  );
    }
    /** Find a ContentData by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataById(  UUID  id){
        return contentdataRepository.findContentDataById( id  );
    }
    /** Find a ContentData by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByOwnerId(  UUID  ownerId){
        return contentdataRepository.findContentDataByOwnerId( ownerId  );
    }
    /** Find a ContentData by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByCreatedDate(  OffsetDateTime  createdDate){
        return contentdataRepository.findContentDataByCreatedDate( createdDate  );
    }
    /** Find a ContentData by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByKeyHash(  String  keyHash){
        return contentdataRepository.findContentDataByKeyHash( keyHash  );
    }
    /** Find a ContentData by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByLastAccessedById(  UUID  lastAccessedById){
        return contentdataRepository.findContentDataByLastAccessedById( lastAccessedById  );
    }
    /** Find a ContentData by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return contentdataRepository.findContentDataByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a ContentData by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByLastModifiedById(  UUID  lastModifiedById){
        return contentdataRepository.findContentDataByLastModifiedById( lastModifiedById  );
    }
    /** Find a ContentData by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<ContentData>
    */

    public List<ContentData>  findContentDataByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return contentdataRepository.findContentDataByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a ContentData by ID
    public void deleteById(UUID id) {
        contentdataRepository.deleteById(id);
    }
}
