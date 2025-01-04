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
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RolePageableRepository rolePageableRepositoryRepository;

    /** 
     * Find all instances of Role with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of Role instances
     */
    public Page<Role> findAll(Pageable pageable){
        return rolePageableRepositoryRepository.findAll(pageable);
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
    public Page<Role> findAll(Example<Role> example, Pageable pageable){
        return rolePageableRepositoryRepository.findAll(example, pageable);
    }


    public RoleRepository getRepository(){
        return roleRepository;
    }

    // Create or Update a Role
    public Role saveOrUpdate(Role role) {
        return roleRepository.save( role ); // This method handles both creation and update
        // roleRepository.flush();
        // return ret;
    }

    // Find a Role by ID
    public Optional<Role>  findById(UUID id) {
        return roleRepository.findById(id);
    }

    // Find all Roles
    public Iterable<Role> findAll() {
        return roleRepository.findAll();
    }

    
    /** Find a Role by principalId 
        
        * @param principalId UUID  [optional]
        * @return List<Role>
    */

    public List<Role>  findRoleByPrincipalId(  UUID  principalId){
        return roleRepository.findRoleByPrincipalId( principalId  );
    }
    /** Find a Role by roleName 
        
        * @param roleName  RoleNameEnum  RoleNameEnum) the role [optional]
        * @return List<Role>
    */

    public List<Role>  findRoleByRoleName( Role.RoleNameEnum roleName){
        return roleRepository.findRoleByRoleName( roleName  );
    }
    /** Find a Role by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<Role>
    */

    public List<Role>  findRoleById(  UUID  id){
        return roleRepository.findRoleById( id  );
    }
    /** Find a Role by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<Role>
    */

    public List<Role>  findRoleByOwnerId(  UUID  ownerId){
        return roleRepository.findRoleByOwnerId( ownerId  );
    }
    /** Find a Role by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<Role>
    */

    public List<Role>  findRoleByCreatedDate(  OffsetDateTime  createdDate){
        return roleRepository.findRoleByCreatedDate( createdDate  );
    }
    /** Find a Role by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<Role>
    */

    public List<Role>  findRoleByKeyHash(  String  keyHash){
        return roleRepository.findRoleByKeyHash( keyHash  );
    }
    /** Find a Role by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<Role>
    */

    public List<Role>  findRoleByLastAccessedById(  UUID  lastAccessedById){
        return roleRepository.findRoleByLastAccessedById( lastAccessedById  );
    }
    /** Find a Role by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<Role>
    */

    public List<Role>  findRoleByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return roleRepository.findRoleByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a Role by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<Role>
    */

    public List<Role>  findRoleByLastModifiedById(  UUID  lastModifiedById){
        return roleRepository.findRoleByLastModifiedById( lastModifiedById  );
    }
    /** Find a Role by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<Role>
    */

    public List<Role>  findRoleByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return roleRepository.findRoleByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a Role by ID
    public void deleteById(UUID id) {
        roleRepository.deleteById(id);
    }
}
