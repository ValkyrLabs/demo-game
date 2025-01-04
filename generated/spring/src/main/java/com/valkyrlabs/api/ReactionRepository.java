package com.valkyrlabs.api;

import com.valkyrlabs.model.Reaction;

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

    AUTO IMPLEMENTED by Spring as bean: ReactionRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface ReactionRepository extends Serializable, JpaRepository<Reaction, UUID> {

    // ThorAPI Generated search methods for each property on Reaction
    /** Find a Reaction by targetObject 
        targetObject ** | **UUID** | UUID of the system object |  [optional]
        * @param targetObject UUID UUID of the system object 
        * @return List<Reaction>
    */
    // nullable
    public List<Reaction>  findReactionByTargetObject (  UUID targetObject);
    /** Find a Reaction by reaction 
        reaction ** | [**ReactionEnum**](#ReactionEnum) | the reaction to the item |  [optional]
        * @param reaction ReactionEnum the reaction to the item 
        * @return List<Reaction>
    */
    // nullable
    public List<Reaction>  findReactionByReaction ( Reaction.ReactionEnum reaction);
    /** Find a Reaction by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Reaction>
    */
    // nullable
    public List<Reaction>  findReactionById (  UUID id);
    /** Find a Reaction by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Reaction>
    */
    // nullable
    public List<Reaction>  findReactionByOwnerId (  UUID ownerId);
    /** Find a Reaction by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Reaction>
    */
    // nullable
    public List<Reaction>  findReactionByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Reaction by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Reaction>
    */
    // nullable
    public List<Reaction>  findReactionByKeyHash (  String keyHash);
    /** Find a Reaction by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Reaction>
    */
    // nullable
    public List<Reaction>  findReactionByLastAccessedById (  UUID lastAccessedById);
    /** Find a Reaction by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Reaction>
    */
    // nullable
    public List<Reaction>  findReactionByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Reaction by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Reaction>
    */
    // nullable
    public List<Reaction>  findReactionByLastModifiedById (  UUID lastModifiedById);
    /** Find a Reaction by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Reaction>
    */
    // nullable
    public List<Reaction>  findReactionByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
