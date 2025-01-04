package com.valkyrlabs.api;

import com.valkyrlabs.model.Role;

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

    AUTO IMPLEMENTED by Spring as bean: RoleRepository
    
    CRUD is Create, Read, Update, Delete
*/
// @Transactional(readOnly=false)
public interface RoleRepository extends Serializable, JpaRepository<Role, UUID> {

    // ThorAPI Generated search methods for each property on Role
    /** Find a Role by principalId 
        principalId ** | **UUID** |  |  [optional]
        * @param principalId UUID  
        * @return List<Role>
    */
    // nullable
    public List<Role>  findRoleByPrincipalId (  UUID principalId);
    /** Find a Role by roleName 
        roleName ** | [**RoleNameEnum**](#RoleNameEnum) | the role |  [optional]
        * @param roleName RoleNameEnum the role 
        * @return List<Role>
    */
    // nullable
    public List<Role>  findRoleByRoleName ( Role.RoleNameEnum roleName);
    /** Find a Role by id 
        id ** | **UUID** | Unique identifier for object in the system |  [optional]
        * @param id UUID Unique identifier for object in the system 
        * @return List<Role>
    */
    // nullable
    public List<Role>  findRoleById (  UUID id);
    /** Find a Role by ownerId 
        ownerId ** | **UUID** | UUID of owner of the object in the system |  [optional]
        * @param ownerId UUID UUID of owner of the object in the system 
        * @return List<Role>
    */
    // nullable
    public List<Role>  findRoleByOwnerId (  UUID ownerId);
    /** Find a Role by createdDate 
        createdDate ** | **OffsetDateTime** | Date of object creation |  [optional]
        * @param createdDate OffsetDateTime Date of object creation 
        * @return List<Role>
    */
    // nullable
    public List<Role>  findRoleByCreatedDate (  OffsetDateTime createdDate);
    /** Find a Role by keyHash 
        keyHash ** | **String** | Data, including hash of the key(s) used to encrypt this record. |  [optional]
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. 
        * @return List<Role>
    */
    // nullable
    public List<Role>  findRoleByKeyHash (  String keyHash);
    /** Find a Role by lastAccessedById 
        lastAccessedById ** | **UUID** | Last user to access object |  [optional]
        * @param lastAccessedById UUID Last user to access object 
        * @return List<Role>
    */
    // nullable
    public List<Role>  findRoleByLastAccessedById (  UUID lastAccessedById);
    /** Find a Role by lastAccessedDate 
        lastAccessedDate ** | **OffsetDateTime** | Timestamp of last access of object |  [optional]
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object 
        * @return List<Role>
    */
    // nullable
    public List<Role>  findRoleByLastAccessedDate (  OffsetDateTime lastAccessedDate);
    /** Find a Role by lastModifiedById 
        lastModifiedById ** | **UUID** | Unique identifier for user who last modifed the object in the system |  [optional]
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system 
        * @return List<Role>
    */
    // nullable
    public List<Role>  findRoleByLastModifiedById (  UUID lastModifiedById);
    /** Find a Role by lastModifiedDate 
        lastModifiedDate ** | **OffsetDateTime** | Date of last object modification |  [optional]
        * @param lastModifiedDate OffsetDateTime Date of last object modification 
        * @return List<Role>
    */
    // nullable
    public List<Role>  findRoleByLastModifiedDate (  OffsetDateTime lastModifiedDate);

    // end search methods
}
