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
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private ApplicationPageableRepository applicationPageableRepositoryRepository;

    /** 
     * Find all instances of Application with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Application instances
     */
    public Page<Application> findAll(Pageable pageable){
        return applicationPageableRepositoryRepository.findAll(pageable);
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
    public Page<Application> findAll(Example<Application> example, Pageable pageable){
        return applicationPageableRepositoryRepository.findAll(example, pageable);
    }


    public ApplicationRepository getRepository(){
        return applicationRepository;
    }

    // Create or Update a Application
    public Application saveOrUpdate(Application application) {
        return applicationRepository.save( application ); // This method handles both creation and update
        // applicationRepository.flush();
        // return ret;
    }

    // Find a Application by ID
    public Optional<Application>  findById(UUID id) {
        return applicationRepository.findById(id);
    }

    // Find all Applications
    public Iterable<Application> findAll() {
        return applicationRepository.findAll();
    }

    
    /** Find a Application by name 
        
        * @param name String name of the application [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByName(  String  name){
        return applicationRepository.findApplicationByName( name  );
    }
    /** Find a Application by description 
        
        * @param description String detailed description of the application [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByDescription(  String  description){
        return applicationRepository.findApplicationByDescription( description  );
    }
    /** Find a Application by isTemplate 
        
        * @param isTemplate Boolean whether this Application is a Template [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByIsTemplate(  Boolean  isTemplate){
        return applicationRepository.findApplicationByIsTemplate( isTemplate  );
    }
    /** Find a Application by type 
        
        * @param type  TypeEnum  TypeEnum) type of application [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByType( Application.TypeEnum type){
        return applicationRepository.findApplicationByType( type  );
    }
    /** Find a Application by status 
        
        * @param status  StatusEnum  StatusEnum) status for event [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByStatus( Application.StatusEnum status){
        return applicationRepository.findApplicationByStatus( status  );
    }
    /** Find a Application by entrypointUrl 
        
        * @param entrypointUrl String the url to the &#39;homepage&#39; or service endpoint [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByEntrypointUrl(  String  entrypointUrl){
        return applicationRepository.findApplicationByEntrypointUrl( entrypointUrl  );
    }
    /** Find a Application by contentMedia 
        
        * @param contentMedia [ List <ContentMediaLink> ](ContentMediaLink)  [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByContentMedia(  List<@Valid ContentMediaLink>  contentMedia){
        return applicationRepository.findApplicationByContentMedia( contentMedia  );
    }
    /** Find a Application by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationById(  UUID  id){
        return applicationRepository.findApplicationById( id  );
    }
    /** Find a Application by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByOwnerId(  UUID  ownerId){
        return applicationRepository.findApplicationByOwnerId( ownerId  );
    }
    /** Find a Application by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByCreatedDate(  OffsetDateTime  createdDate){
        return applicationRepository.findApplicationByCreatedDate( createdDate  );
    }
    /** Find a Application by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByKeyHash(  String  keyHash){
        return applicationRepository.findApplicationByKeyHash( keyHash  );
    }
    /** Find a Application by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByLastAccessedById(  UUID  lastAccessedById){
        return applicationRepository.findApplicationByLastAccessedById( lastAccessedById  );
    }
    /** Find a Application by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return applicationRepository.findApplicationByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Application by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByLastModifiedById(  UUID  lastModifiedById){
        return applicationRepository.findApplicationByLastModifiedById( lastModifiedById  );
    }
    /** Find a Application by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Application>
    */

    public List<Application>  findApplicationByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return applicationRepository.findApplicationByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Application by ID
    public void deleteById(UUID id) {
        applicationRepository.deleteById(id);
    }
}
