package com.valkyrlabs.api;

import com.valkyrlabs.model.UserPreferences;

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

    AUTO IMPLEMENTED by Spring as bean: UserPreferencesRepository
    
    CRUD is Create, Read, Update, Delete
*/
public interface UserPreferencesPageableRepository extends Serializable, PagingAndSortingRepository<UserPreferences, UUID> {

    // ThorAPI Generated search methods for each property on UserPreferences
    /** Find a UserPreferences by preference with pagination
        preference ** | **String** | The value of the User Preferences |  [optional]
        * @param preference String The value of the User Preferences 
        * @param pageable pagination configuration
        * @return Page<UserPreferences>
    */
    public Page<UserPreferences> findByPreference(String preference, Pageable pageable);
    /** Find a UserPreferences by preferenceType with pagination
        preferenceType ** | [**PreferenceTypeEnum**](#PreferenceTypeEnum) | The type of the preference |  [optional]
        * @param preferenceType PreferenceTypeEnum The type of the preference 
        * @param pageable pagination configuration
        * @return Page<UserPreferences>
    */
    public Page<UserPreferences> findByPreferenceType(UserPreferences.PreferenceTypeEnum preferenceType, Pageable pageable);
    /** Find a UserPreferences by id with pagination
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @param pageable pagination configuration
        * @return Page<UserPreferences>
    */
    public Page<UserPreferences> findById(UUID id, Pageable pageable);
    /** Find a UserPreferences by ownerId with pagination
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @param pageable pagination configuration
        * @return Page<UserPreferences>
    */
    public Page<UserPreferences> findByOwnerId(UUID ownerId, Pageable pageable);
    /** Find a UserPreferences by createdDate with pagination
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @param pageable pagination configuration
        * @return Page<UserPreferences>
    */
    public Page<UserPreferences> findByCreatedDate(OffsetDateTime createdDate, Pageable pageable);
    /** Find a UserPreferences by keyHash with pagination
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @param pageable pagination configuration
        * @return Page<UserPreferences>
    */
    public Page<UserPreferences> findByKeyHash(String keyHash, Pageable pageable);
    /** Find a UserPreferences by lastAccessedById with pagination
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @param pageable pagination configuration
        * @return Page<UserPreferences>
    */
    public Page<UserPreferences> findByLastAccessedById(UUID lastAccessedById, Pageable pageable);
    /** Find a UserPreferences by lastAccessedDate with pagination
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @param pageable pagination configuration
        * @return Page<UserPreferences>
    */
    public Page<UserPreferences> findByLastAccessedDate(OffsetDateTime lastAccessedDate, Pageable pageable);
    /** Find a UserPreferences by lastModifiedById with pagination
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @param pageable pagination configuration
        * @return Page<UserPreferences>
    */
    public Page<UserPreferences> findByLastModifiedById(UUID lastModifiedById, Pageable pageable);
    /** Find a UserPreferences by lastModifiedDate with pagination
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @param pageable pagination configuration
        * @return Page<UserPreferences>
    */
    public Page<UserPreferences> findByLastModifiedDate(OffsetDateTime lastModifiedDate, Pageable pageable);


    /** 
     * Find all instances of UserPreferences as a list.
     * 
     * Retrieves all entities without pagination.
     * 
     * @return List of UserPreferences instances
     */
    List<UserPreferences> findAll();

    /** 
     * Find all instances of UserPreferences with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of UserPreferences instances
     */
    Page<UserPreferences> findAll(Pageable pageable);

    /** 
     * Find all instances of AclEntry with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param eample an example object to use for search
     * @param pageable the pagination configuration
     * @return Page of AclEntry instances
     */
    Page<UserPreferences> findAll(Example<UserPreferences> example, Pageable pageable);

    // end search methods
}
