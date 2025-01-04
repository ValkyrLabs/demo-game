package com.valkyrlabs.api;

import com.valkyrlabs.model.UserPreferences;

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

    AUTO IMPLEMENTED by Spring as bean: UserPreferencesRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface UserPreferencesRepository extends Serializable, JpaRepository<UserPreferences, UUID> {

    // ThorAPI Generated search methods for each property on UserPreferences
    /** Find a UserPreferences by preference 
        preference ** | **String** | The value of the User Preferences |  [optional]
        * @param preference String The value of the User Preferences 
        * @return List<UserPreferences>
    */
    // nullable
    public List<UserPreferences>  findUserPreferencesByPreference (  String preference);
    /** Find a UserPreferences by preferenceType 
        preferenceType ** | [**PreferenceTypeEnum**](#PreferenceTypeEnum) | The type of the preference |  [optional]
        * @param preferenceType PreferenceTypeEnum The type of the preference 
        * @return List<UserPreferences>
    */
    // nullable
    public List<UserPreferences>  findUserPreferencesByPreferenceType ( UserPreferences.PreferenceTypeEnum preferenceType);
    /** Find a UserPreferences by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<UserPreferences>
    */
    // nullable
    public List<UserPreferences>  findUserPreferencesById (  UUID id);
    /** Find a UserPreferences by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<UserPreferences>
    */
    // nullable
    public List<UserPreferences>  findUserPreferencesByOwnerId (  UUID ownerId);
    /** Find a UserPreferences by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<UserPreferences>
    */
    // nullable
    public List<UserPreferences>  findUserPreferencesByCreatedDate (  OffsetDateTime createdDate);
    /** Find a UserPreferences by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<UserPreferences>
    */
    // nullable
    public List<UserPreferences>  findUserPreferencesByKeyHash (  String keyHash);
    /** Find a UserPreferences by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<UserPreferences>
    */
    // nullable
    public List<UserPreferences>  findUserPreferencesByLastAccessedById (  UUID lastAccessedById);
    /** Find a UserPreferences by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<UserPreferences>
    */
    // nullable
    public List<UserPreferences>  findUserPreferencesByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a UserPreferences by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<UserPreferences>
    */
    // nullable
    public List<UserPreferences>  findUserPreferencesByLastModifiedById (  UUID lastModifiedById);
    /** Find a UserPreferences by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<UserPreferences>
    */
    // nullable
    public List<UserPreferences>  findUserPreferencesByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
