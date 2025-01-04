package com.valkyrlabs.model;

import com.valkyrlabs.api.*;
import java.util.Optional;
import java.util.List;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
public class KeyMetricService {

    @Autowired
    private KeyMetricRepository keymetricRepository;

    @Autowired
    private KeyMetricPageableRepository keymetricPageableRepositoryRepository;

    /** 
     * Find all instances of KeyMetric with pagination.
     * 
     * Retrieves all entities in a paginated format.
     * 
     * @param pageable the pagination configuration
     * @return Page of KeyMetric instances
     */
    public Page<KeyMetric> findAll(Pageable pageable){
        return keymetricPageableRepositoryRepository.findAll(pageable);
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
    public Page<KeyMetric> findAll(Example<KeyMetric> example, Pageable pageable){
        return keymetricPageableRepositoryRepository.findAll(example, pageable);
    }


    public KeyMetricRepository getRepository(){
        return keymetricRepository;
    }

    // Create or Update a KeyMetric
    public KeyMetric saveOrUpdate(KeyMetric keymetric) {
        return keymetricRepository.save( keymetric ); // This method handles both creation and update
        // keymetricRepository.flush();
        // return ret;
    }

    // Find a KeyMetric by ID
    public Optional<KeyMetric>  findById(UUID id) {
        return keymetricRepository.findById(id);
    }

    // Find all KeyMetrics
    public Iterable<KeyMetric> findAll() {
        return keymetricRepository.findAll();
    }

    
    /** Find a KeyMetric by goalId 
        
        * @param goalId UUID  [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricByGoalId(  UUID  goalId){
        return keymetricRepository.findKeyMetricByGoalId( goalId  );
    }
    /** Find a KeyMetric by metricName 
        
        * @param metricName String  [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricByMetricName(  String  metricName){
        return keymetricRepository.findKeyMetricByMetricName( metricName  );
    }
    /** Find a KeyMetric by metricValue 
        
        * @param metricValue Float actual value of the metric [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricByMetricValue(  Float  metricValue){
        return keymetricRepository.findKeyMetricByMetricValue( metricValue  );
    }
    /** Find a KeyMetric by targetValue 
        
        * @param targetValue Float expected value of the metric [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricByTargetValue(  Float  targetValue){
        return keymetricRepository.findKeyMetricByTargetValue( targetValue  );
    }
    /** Find a KeyMetric by id 
        
        * @param id UUID Unique identifier for object in the system [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricById(  UUID  id){
        return keymetricRepository.findKeyMetricById( id  );
    }
    /** Find a KeyMetric by ownerId 
        
        * @param ownerId UUID UUID of owner of the object in the system [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricByOwnerId(  UUID  ownerId){
        return keymetricRepository.findKeyMetricByOwnerId( ownerId  );
    }
    /** Find a KeyMetric by createdDate 
        
        * @param createdDate OffsetDateTime Date of object creation [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricByCreatedDate(  OffsetDateTime  createdDate){
        return keymetricRepository.findKeyMetricByCreatedDate( createdDate  );
    }
    /** Find a KeyMetric by keyHash 
        
        * @param keyHash String Data, including hash of the key(s) used to encrypt this record. [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricByKeyHash(  String  keyHash){
        return keymetricRepository.findKeyMetricByKeyHash( keyHash  );
    }
    /** Find a KeyMetric by lastAccessedById 
        
        * @param lastAccessedById UUID Last user to access object [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricByLastAccessedById(  UUID  lastAccessedById){
        return keymetricRepository.findKeyMetricByLastAccessedById( lastAccessedById  );
    }
    /** Find a KeyMetric by lastAccessedDate 
        
        * @param lastAccessedDate OffsetDateTime Timestamp of last access of object [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricByLastAccessedDate(  OffsetDateTime  lastAccessedDate){
        return keymetricRepository.findKeyMetricByLastAccessedDate( lastAccessedDate  );
    }
    /** Find a KeyMetric by lastModifiedById 
        
        * @param lastModifiedById UUID Unique identifier for user who last modifed the object in the system [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricByLastModifiedById(  UUID  lastModifiedById){
        return keymetricRepository.findKeyMetricByLastModifiedById( lastModifiedById  );
    }
    /** Find a KeyMetric by lastModifiedDate 
        
        * @param lastModifiedDate OffsetDateTime Date of last object modification [optional]
        * @return List<KeyMetric>
    */

    public List<KeyMetric>  findKeyMetricByLastModifiedDate(  OffsetDateTime  lastModifiedDate){
        return keymetricRepository.findKeyMetricByLastModifiedDate( lastModifiedDate  );
    }

    // Delete a KeyMetric by ID
    public void deleteById(UUID id) {
        keymetricRepository.deleteById(id);
    }
}
