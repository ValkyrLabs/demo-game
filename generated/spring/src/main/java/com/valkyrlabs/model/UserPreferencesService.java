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
public class UserPreferencesService {

    @Autowired
    private UserPreferencesRepository userpreferencesRepository;

    @Autowired
    private UserPreferencesPageableRepository userpreferencesPageableRepositoryRepository;

    /** 
     * Find all instances of UserPreferences with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of UserPreferences instances
     */
    public Page<UserPreferences> findAll(Pageable pageable){
        return userpreferencesPageableRepositoryRepository.findAll(pageable);
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
    public Page<UserPreferences> findAll(Example<UserPreferences> example, Pageable pageable){
        return userpreferencesPageableRepositoryRepository.findAll(example, pageable);
    }


    public UserPreferencesRepository getRepository(){
        return userpreferencesRepository;
    }

    // Create or Update a UserPreferences
    public UserPreferences saveOrUpdate(UserPreferences userpreferences) {
        return userpreferencesRepository.save( userpreferences ); // This method handles both creation and update
        // userpreferencesRepository.flush();
        // return ret;
    }

    // Find a UserPreferences by ID
    public Optional<UserPreferences>  findById(UUID id) {
        return userpreferencesRepository.findById(id);
    }

    // Find all UserPreferencess
    public Iterable<UserPreferences> findAll() {
        return userpreferencesRepository.findAll();
    }

    
    /** Find a UserPreferences by preference 
        
        * @param preference String The value of the User Preferences [optional]
        * @return List<UserPreferences>
    */

    public List<UserPreferences>  findUserPreferencesByPreference(  String  preference){
        return userpreferencesRepository.findUserPreferencesByPreference( preference  );
    }
    /** Find a UserPreferences by preferenceType 
        
        * @param preferenceType  PreferenceTypeEnum  PreferenceTypeEnum) The type of the preference [optional]
        * @return List<UserPreferences>
    */

    public List<UserPreferences>  findUserPreferencesByPreferenceType( UserPreferences.PreferenceTypeEnum preferenceType){
        return userpreferencesRepository.findUserPreferencesByPreferenceType( preferenceType  );
    }
    /** Find a UserPreferences by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<UserPreferences>
    */

    public List<UserPreferences>  findUserPreferencesById(  UUID  id){
        return userpreferencesRepository.findUserPreferencesById( id  );
    }
    /** Find a UserPreferences by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<UserPreferences>
    */

    public List<UserPreferences>  findUserPreferencesByOwnerId(  UUID  ownerId){
        return userpreferencesRepository.findUserPreferencesByOwnerId( ownerId  );
    }
    /** Find a UserPreferences by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<UserPreferences>
    */

    public List<UserPreferences>  findUserPreferencesByCreatedDate(  OffsetDateTime  createdDate){
        return userpreferencesRepository.findUserPreferencesByCreatedDate( createdDate  );
    }
    /** Find a UserPreferences by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<UserPreferences>
    */

    public List<UserPreferences>  findUserPreferencesByKeyHash(  String  keyHash){
        return userpreferencesRepository.findUserPreferencesByKeyHash( keyHash  );
    }
    /** Find a UserPreferences by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<UserPreferences>
    */

    public List<UserPreferences>  findUserPreferencesByLastAccessedById(  UUID  lastAccessedById){
        return userpreferencesRepository.findUserPreferencesByLastAccessedById( lastAccessedById  );
    }
    /** Find a UserPreferences by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<UserPreferences>
    */

    public List<UserPreferences>  findUserPreferencesByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return userpreferencesRepository.findUserPreferencesByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a UserPreferences by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<UserPreferences>
    */

    public List<UserPreferences>  findUserPreferencesByLastModifiedById(  UUID  lastModifiedById){
        return userpreferencesRepository.findUserPreferencesByLastModifiedById( lastModifiedById  );
    }
    /** Find a UserPreferences by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<UserPreferences>
    */

    public List<UserPreferences>  findUserPreferencesByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return userpreferencesRepository.findUserPreferencesByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a UserPreferences by ID
    public void deleteById(UUID id) {
        userpreferencesRepository.deleteById(id);
    }
}
