package com.valkyrlabs.model;

import java.net.URI;
import java.util.Objects;

import jakarta.persistence.FetchType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.transaction.annotation.Transactional;
import com.valkyrlabs.valkyrai.audit.AuditedField;
import com.valkyrlabs.valkyrai.audit.AuditedClass;
import com.valkyrlabs.valkyrai.audit.AuditingField;
import com.valkyrlabs.thorapi.data.DataField;

import com.valkyrlabs.valkyrai.service.SecureField;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.valkyrlabs.model.Address;
import com.valkyrlabs.model.Authority;
import com.valkyrlabs.model.Organization;
import com.valkyrlabs.model.Role;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

// BEGIN POJO.MUSTACHE
/**
* The Valkyr Principal. Represents a user, service, or agent in the system with preferences and privileges.
*/

@Schema(name = "Principal", description = "The Valkyr Principal. Represents a user, service, or agent in the system with preferences and privileges.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:22:46.987665-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    
@Entity
@JsonIgnoreProperties({"workflowStateId", "keyHash", "ownerId", "lastAccessedDate","lastAccessedById"})
@Transactional
@AuditedClass // required to populate audit fields (CreatedBy, CreatedDate, LastModifiedBy, LastModifiedDate)
public class Principal  implements DataObject   {
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="fieldGroup=personal-details")
@SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String firstName;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="fieldGroup=personal-details")
@SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String middleName;
    
    @AuditedField
        @SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String lastName;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="fieldGroup=personal-details, unique=true")
@Column(length = 60)
        private String username;
    
    @AuditedField
        @SecureField(encryptionType = SecureField.EncryptionType.HASHED, strength = 10)
        private String password;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true")
@SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String fingerprint;
    
    @AuditedField
        @SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String federalIdentification = "333-22-4444";
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true")
@SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String residenceCountry;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true")
@SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String stateIdentification = "2222222222";
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true")
@SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String residenceState;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="unique=true")
        private String email;
    
    @AuditedField
        @SecureField(encryptionType = SecureField.EncryptionType.SYMMETRIC, strength = 5)
        private String social;
    
    @AuditedField
        @Column(length = 100000)
        private String bio;
    
    @AuditedField
        @Column(length = 100000)
        private String notes;
    
    @AuditedField
        private String avatarUrl;
    
    @AuditedField
        private UUID organizationId;
    
    @AuditedField
        @OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
        @PrimaryKeyJoinColumn()
        private Organization organization;
    
    @AuditedField
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "principalId",
            orphanRemoval = false
        )
        
        private List<@Valid Address> addresses = new ArrayList<>();
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true, fieldGroup=signup")
        private Boolean acceptedCookies = false;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true, fieldGroup=signup")
        private Boolean acceptedTos = false;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true, fieldGroup=accountStatus")
        private Boolean enabled = true;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true, fieldGroup=accountStatus")
        private Boolean credentialNonExpired = true;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true, fieldGroup=accountStatus")
        private Boolean accountEnabled = true;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true, fieldGroup=accountStatus")
        private Boolean accountNonLocked = true;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true, fieldGroup=accountStatus")
        private Boolean accountNonExpired = false;
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true, fieldGroup=accountStatus")
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "principalId",
            orphanRemoval = false
        )
        
        private List<@Valid Role> roles = new ArrayList<>();
    
    @AuditedField
        @DataField(unique = false, hidden = false, advanced = false, relationshipTable="advanced=true, fieldGroup=accountStatus")
        @Valid
        @OneToMany( 
            fetch = FetchType.EAGER, 
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH},
            mappedBy = "principalId",
            orphanRemoval = false
        )
        
        private List<@Valid Authority> authorityList = new ArrayList<>();
    
    @AuditedField
        @Id  
        @GeneratedValue(generator = "UUID")

        private UUID id;
    
    @AuditedField
                @AuditingField(fieldType = AuditingField.FieldType.CREATED_BY, enabled = true)
        private UUID ownerId;
    
    @AuditedField
                @AuditingField(fieldType = AuditingField.FieldType.CREATED_DATE, enabled = true)
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private OffsetDateTime createdDate;
    
    @AuditedField
        private String keyHash;
    
    @AuditedField
                @AuditingField(fieldType = AuditingField.FieldType.LAST_ACCESSED_BY, enabled = true)
        private UUID lastAccessedById;
    
    @AuditedField
                @AuditingField(fieldType = AuditingField.FieldType.LAST_ACCESSED_DATE, enabled = true)
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private OffsetDateTime lastAccessedDate;
    
    @AuditedField
                @AuditingField(fieldType = AuditingField.FieldType.LAST_MODIFIED_BY, enabled = true)
        private UUID lastModifiedById;
    
    @AuditedField
            @AuditingField(fieldType = AuditingField.FieldType.LAST_MODIFIED_DATE, enabled = true)
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private OffsetDateTime lastModifiedDate;
        public Principal() {
        super();
        }
        /**
        * Constructor with only required parameters
        */
        public Principal(String username, String password, String email) {
                            this.username = username;
                            this.password = password;
                            this.email = email;
                }
        public Principal firstName(String firstName) {
            this.firstName = firstName;
        return this;
        }
            /**
                * first name of user (encrypted)
            * @return firstName
            */
                
                @Schema(name = "firstName", example = "Peace", description = "first name of user (encrypted)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("firstName")
            public String getFirstName() {
            return firstName;
            }
            public void setFirstName(String firstName) {
            this.firstName = firstName;
            }
        public Principal middleName(String middleName) {
            this.middleName = middleName;
        return this;
        }
            /**
                * middle name of user
            * @return middleName
            */
                
                @Schema(name = "middleName", example = "Love", description = "middle name of user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("middleName")
            public String getMiddleName() {
            return middleName;
            }
            public void setMiddleName(String middleName) {
            this.middleName = middleName;
            }
        public Principal lastName(String lastName) {
            this.lastName = lastName;
        return this;
        }
            /**
                * last name of user (encrypted)
            * @return lastName
            */
                
                @Schema(name = "lastName", example = "Harmony", description = "last name of user (encrypted)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastName")
            public String getLastName() {
            return lastName;
            }
            public void setLastName(String lastName) {
            this.lastName = lastName;
            }
        public Principal username(String username) {
            this.username = username;
        return this;
        }
            /**
                * Your account user name
            * @return username
            */
                @NotNull @Size(min = 5, max = 60) 
                @Schema(name = "username", example = "Sparky", description = "Your account user name", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("username")
            public String getUsername() {
            return username;
            }
            public void setUsername(String username) {
            this.username = username;
            }
        public Principal password(String password) {
            this.password = password;
        return this;
        }
            /**
                * Your account password
            * @return password
            */
                @NotNull @Size(min = 8) 
                @Schema(name = "password", example = "HardToGuess1980", description = "Your account password", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("password")
            public String getPassword() {
            return password;
            }
            public void setPassword(String password) {
            this.password = password;
            }
        public Principal fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
        return this;
        }
            /**
                * Encrypted identity (Facial Recognition, Fingerprint Scanner, etc.)
            * @return fingerprint
            */
                
                @Schema(name = "fingerprint", accessMode = Schema.AccessMode.READ_ONLY, example = "DK$DFSJaraDD", description = "Encrypted identity (Facial Recognition, Fingerprint Scanner, etc.)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("fingerprint")
            public String getFingerprint() {
            return fingerprint;
            }
            public void setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            }
        public Principal federalIdentification(String federalIdentification) {
            this.federalIdentification = federalIdentification;
        return this;
        }
            /**
                * SSN or a 10 digit federal government ID (encrypted)
            * @return federalIdentification
            */
                @Pattern(regexp = "^\\d{3}-\\d{2}-\\d{4}$") 
                @Schema(name = "federalIdentification", example = "111-22-3333", description = "SSN or a 10 digit federal government ID (encrypted)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("federalIdentification")
            public String getFederalIdentification() {
            return federalIdentification;
            }
            public void setFederalIdentification(String federalIdentification) {
            this.federalIdentification = federalIdentification;
            }
        public Principal residenceCountry(String residenceCountry) {
            this.residenceCountry = residenceCountry;
        return this;
        }
            /**
                * Country of residence 3-character code
            * @return residenceCountry
            */
                @Size(min = 3) 
                @Schema(name = "residenceCountry", example = "USA", description = "Country of residence 3-character code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("residenceCountry")
            public String getResidenceCountry() {
            return residenceCountry;
            }
            public void setResidenceCountry(String residenceCountry) {
            this.residenceCountry = residenceCountry;
            }
        public Principal stateIdentification(String stateIdentification) {
            this.stateIdentification = stateIdentification;
        return this;
        }
            /**
                * Driver's License or a 10 digit state government ID
            * @return stateIdentification
            */
                @Pattern(regexp = "^\\d{10}$") @Size(min = 10) 
                @Schema(name = "stateIdentification", example = "3333333333", description = "Driver's License or a 10 digit state government ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("stateIdentification")
            public String getStateIdentification() {
            return stateIdentification;
            }
            public void setStateIdentification(String stateIdentification) {
            this.stateIdentification = stateIdentification;
            }
        public Principal residenceState(String residenceState) {
            this.residenceState = residenceState;
        return this;
        }
            /**
                * State of residence 2-character code (USA)
            * @return residenceState
            */
                @Size(min = 2) 
                @Schema(name = "residenceState", example = "CA", description = "State of residence 2-character code (USA)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("residenceState")
            public String getResidenceState() {
            return residenceState;
            }
            public void setResidenceState(String residenceState) {
            this.residenceState = residenceState;
            }
        public Principal email(String email) {
            this.email = email;
        return this;
        }
            /**
                * The main email address for the user (encrypted)
            * @return email
            */
                @NotNull @Pattern(regexp = "^.+@[^.].*.[a-z]{2,}$") @jakarta.validation.constraints.Email 
                @Schema(name = "email", example = "wiley.coyote@acme-corp.com", description = "The main email address for the user (encrypted)", requiredMode = Schema.RequiredMode.REQUIRED)
                @JsonProperty("email")
            public String getEmail() {
            return email;
            }
            public void setEmail(String email) {
            this.email = email;
            }
        public Principal social(String social) {
            this.social = social;
        return this;
        }
            /**
                * The username for your primary social account (if any)
            * @return social
            */
                
                @Schema(name = "social", example = "https://twitter.com/ValkyrAI", description = "The username for your primary social account (if any)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("social")
            public String getSocial() {
            return social;
            }
            public void setSocial(String social) {
            this.social = social;
            }
        public Principal bio(String bio) {
            this.bio = bio;
        return this;
        }
            /**
                * More in-depth information about you and your account
            * @return bio
            */
                @Size(max = 100000) 
                @Schema(name = "bio", description = "More in-depth information about you and your account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("bio")
            public String getBio() {
            return bio;
            }
            public void setBio(String bio) {
            this.bio = bio;
            }
        public Principal notes(String notes) {
            this.notes = notes;
        return this;
        }
            /**
                * Get notes
            * @return notes
            */
                @Size(max = 100000) 
                @Schema(name = "notes", example = "Notes about this account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("notes")
            public String getNotes() {
            return notes;
            }
            public void setNotes(String notes) {
            this.notes = notes;
            }
        public Principal avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        return this;
        }
            /**
                * URL for the user avatar image
            * @return avatarUrl
            */
                
                @Schema(name = "avatarUrl", example = "https://img.com/mypic.png", description = "URL for the user avatar image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("avatarUrl")
            public String getAvatarUrl() {
            return avatarUrl;
            }
            public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            }
        public Principal organizationId(UUID organizationId) {
            this.organizationId = organizationId;
        return this;
        }
            /**
                * Get organizationId
            * @return organizationId
            */
                @Valid 
                @Schema(name = "organizationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("organizationId")
            public UUID getOrganizationId() {
            return organizationId;
            }
            public void setOrganizationId(UUID organizationId) {
            this.organizationId = organizationId;
            }
        public Principal organization(Organization organization) {
            this.organization = organization;
        return this;
        }
            /**
                * Get organization
            * @return organization
            */
                @Valid 
                @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("organization")
            public Organization getOrganization() {
            return organization;
            }
            public void setOrganization(Organization organization) {
            this.organization = organization;
            }
        public Principal addresses(List<@Valid Address> addresses) {
            this.addresses = addresses;
        return this;
        }
            public Principal addAddressesItem(Address addressesItem) {
                if (this.addresses == null) {
                this.addresses = new ArrayList<>();
                }
                this.addresses.add(addressesItem);
            return this;
            }
            /**
                * Get addresses
            * @return addresses
            */
                @Valid 
                @Schema(name = "addresses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("addresses")
            public List<@Valid Address> getAddresses() {
            return addresses;
            }
            public void setAddresses(List<@Valid Address> addresses) {
            this.addresses = addresses;
            }
        public Principal acceptedCookies(Boolean acceptedCookies) {
            this.acceptedCookies = acceptedCookies;
        return this;
        }
            /**
                * Whether the user accepted the use of cookies
            * @return acceptedCookies
            */
                
                @Schema(name = "acceptedCookies", description = "Whether the user accepted the use of cookies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("acceptedCookies")
            public Boolean getAcceptedCookies() {
            return acceptedCookies;
            }
            public void setAcceptedCookies(Boolean acceptedCookies) {
            this.acceptedCookies = acceptedCookies;
            }
        public Principal acceptedTos(Boolean acceptedTos) {
            this.acceptedTos = acceptedTos;
        return this;
        }
            /**
                * Whether the user accepted the terms of service
            * @return acceptedTos
            */
                
                @Schema(name = "acceptedTos", description = "Whether the user accepted the terms of service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("acceptedTos")
            public Boolean getAcceptedTos() {
            return acceptedTos;
            }
            public void setAcceptedTos(Boolean acceptedTos) {
            this.acceptedTos = acceptedTos;
            }
        public Principal enabled(Boolean enabled) {
            this.enabled = enabled;
        return this;
        }
            /**
                * Spring Security User field whether the user is enabled
            * @return enabled
            */
                
                @Schema(name = "enabled", description = "Spring Security User field whether the user is enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("enabled")
            public Boolean getEnabled() {
            return enabled;
            }
            public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
            }
        public Principal credentialNonExpired(Boolean credentialNonExpired) {
            this.credentialNonExpired = credentialNonExpired;
        return this;
        }
            /**
                * Spring Security User field whether the user's login credentials have expired
            * @return credentialNonExpired
            */
                
                @Schema(name = "credentialNonExpired", description = "Spring Security User field whether the user's login credentials have expired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("credentialNonExpired")
            public Boolean getCredentialNonExpired() {
            return credentialNonExpired;
            }
            public void setCredentialNonExpired(Boolean credentialNonExpired) {
            this.credentialNonExpired = credentialNonExpired;
            }
        public Principal accountEnabled(Boolean accountEnabled) {
            this.accountEnabled = accountEnabled;
        return this;
        }
            /**
                * Spring Security User field whether the user account is enabled
            * @return accountEnabled
            */
                
                @Schema(name = "accountEnabled", description = "Spring Security User field whether the user account is enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("accountEnabled")
            public Boolean getAccountEnabled() {
            return accountEnabled;
            }
            public void setAccountEnabled(Boolean accountEnabled) {
            this.accountEnabled = accountEnabled;
            }
        public Principal accountNonLocked(Boolean accountNonLocked) {
            this.accountNonLocked = accountNonLocked;
        return this;
        }
            /**
                * Spring Security User field whether the user account is locked
            * @return accountNonLocked
            */
                
                @Schema(name = "accountNonLocked", description = "Spring Security User field whether the user account is locked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("accountNonLocked")
            public Boolean getAccountNonLocked() {
            return accountNonLocked;
            }
            public void setAccountNonLocked(Boolean accountNonLocked) {
            this.accountNonLocked = accountNonLocked;
            }
        public Principal accountNonExpired(Boolean accountNonExpired) {
            this.accountNonExpired = accountNonExpired;
        return this;
        }
            /**
                * Spring Security User field whether the user account has expired
            * @return accountNonExpired
            */
                
                @Schema(name = "accountNonExpired", description = "Spring Security User field whether the user account has expired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("accountNonExpired")
            public Boolean getAccountNonExpired() {
            return accountNonExpired;
            }
            public void setAccountNonExpired(Boolean accountNonExpired) {
            this.accountNonExpired = accountNonExpired;
            }
        public Principal roles(List<@Valid Role> roles) {
            this.roles = roles;
        return this;
        }
            public Principal addRolesItem(Role rolesItem) {
                if (this.roles == null) {
                this.roles = new ArrayList<>();
                }
                this.roles.add(rolesItem);
            return this;
            }
            /**
                * the granted roles (or null if the granted authority cannot be expressed as a String with sufficient precision).
            * @return roles
            */
                @Valid 
                @Schema(name = "roles", description = "the granted roles (or null if the granted authority cannot be expressed as a String with sufficient precision).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("roles")
            public List<@Valid Role> getRoles() {
            return roles;
            }
            public void setRoles(List<@Valid Role> roles) {
            this.roles = roles;
            }
        public Principal authorityList(List<@Valid Authority> authorityList) {
            this.authorityList = authorityList;
        return this;
        }
            public Principal addAuthorityListItem(Authority authorityListItem) {
                if (this.authorityList == null) {
                this.authorityList = new ArrayList<>();
                }
                this.authorityList.add(authorityListItem);
            return this;
            }
            /**
                * the granted authorities (or null if the granted authority cannot be expressed as a String with sufficient precision).
            * @return authorityList
            */
                @Valid 
                @Schema(name = "authorityList", description = "the granted authorities (or null if the granted authority cannot be expressed as a String with sufficient precision).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("authorityList")
            public List<@Valid Authority> getAuthorityList() {
            return authorityList;
            }
            public void setAuthorityList(List<@Valid Authority> authorityList) {
            this.authorityList = authorityList;
            }
        public Principal id(UUID id) {
            this.id = id;
        return this;
        }
            /**
                * Unique identifier for object in the system
            * @return id
            */
                @Valid 
                @Schema(name = "id", example = "c62b9065-3bc5-445c-88ee-efeee05f207c", description = "Unique identifier for object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("id")
            public UUID getId() {
            return id;
            }
            public void setId(UUID id) {
            this.id = id;
            }
        public Principal ownerId(UUID ownerId) {
            this.ownerId = ownerId;
        return this;
        }
            /**
                * UUID of owner of the object in the system
            * @return ownerId
            */
                @Valid 
                @Schema(name = "ownerId", example = "ed29628e-caf1-419f-9985-f8ecc6394b1e", description = "UUID of owner of the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("ownerId")
            public UUID getOwnerId() {
            return ownerId;
            }
            public void setOwnerId(UUID ownerId) {
            this.ownerId = ownerId;
            }
        public Principal createdDate(OffsetDateTime createdDate) {
            this.createdDate = createdDate;
        return this;
        }
            /**
                * Date of object creation
            * @return createdDate
            */
                @Valid 
                @Schema(name = "createdDate", description = "Date of object creation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("createdDate")
            public OffsetDateTime getCreatedDate() {
            return createdDate;
            }
            public void setCreatedDate(OffsetDateTime createdDate) {
            this.createdDate = createdDate;
            }
        public Principal keyHash(String keyHash) {
            this.keyHash = keyHash;
        return this;
        }
            /**
                * Data, including hash of the key(s) used to encrypt this record.
            * @return keyHash
            */
                
                @Schema(name = "keyHash", description = "Data, including hash of the key(s) used to encrypt this record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("keyHash")
            public String getKeyHash() {
            return keyHash;
            }
            public void setKeyHash(String keyHash) {
            this.keyHash = keyHash;
            }
        public Principal lastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
        return this;
        }
            /**
                * Last user to access object
            * @return lastAccessedById
            */
                @Valid 
                @Schema(name = "lastAccessedById", example = "1417708a-45ad-43cd-a294-521766640255", description = "Last user to access object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedById")
            public UUID getLastAccessedById() {
            return lastAccessedById;
            }
            public void setLastAccessedById(UUID lastAccessedById) {
            this.lastAccessedById = lastAccessedById;
            }
        public Principal lastAccessedDate(OffsetDateTime lastAccessedDate) {
            this.lastAccessedDate = lastAccessedDate;
        return this;
        }
            /**
                * Timestamp of last access of object
            * @return lastAccessedDate
            */
                @Valid 
                @Schema(name = "lastAccessedDate", description = "Timestamp of last access of object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastAccessedDate")
            public OffsetDateTime getLastAccessedDate() {
            return lastAccessedDate;
            }
            public void setLastAccessedDate(OffsetDateTime lastAccessedDate) {
            this.lastAccessedDate = lastAccessedDate;
            }
        public Principal lastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
        return this;
        }
            /**
                * Unique identifier for user who last modifed the object in the system
            * @return lastModifiedById
            */
                @Valid 
                @Schema(name = "lastModifiedById", example = "b3bcecd5-3344-46c0-90c5-f1bfabee65b6", description = "Unique identifier for user who last modifed the object in the system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedById")
            public UUID getLastModifiedById() {
            return lastModifiedById;
            }
            public void setLastModifiedById(UUID lastModifiedById) {
            this.lastModifiedById = lastModifiedById;
            }
        public Principal lastModifiedDate(OffsetDateTime lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
        return this;
        }
            /**
                * Date of last object modification
            * @return lastModifiedDate
            */
                @Valid 
                @Schema(name = "lastModifiedDate", description = "Date of last object modification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
                @JsonProperty("lastModifiedDate")
            public OffsetDateTime getLastModifiedDate() {
            return lastModifiedDate;
            }
            public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            Principal principal = (Principal) o;
            return Objects.equals(this.firstName, principal.firstName) &&
            Objects.equals(this.middleName, principal.middleName) &&
            Objects.equals(this.lastName, principal.lastName) &&
            Objects.equals(this.username, principal.username) &&
            Objects.equals(this.password, principal.password) &&
            Objects.equals(this.fingerprint, principal.fingerprint) &&
            Objects.equals(this.federalIdentification, principal.federalIdentification) &&
            Objects.equals(this.residenceCountry, principal.residenceCountry) &&
            Objects.equals(this.stateIdentification, principal.stateIdentification) &&
            Objects.equals(this.residenceState, principal.residenceState) &&
            Objects.equals(this.email, principal.email) &&
            Objects.equals(this.social, principal.social) &&
            Objects.equals(this.bio, principal.bio) &&
            Objects.equals(this.notes, principal.notes) &&
            Objects.equals(this.avatarUrl, principal.avatarUrl) &&
            Objects.equals(this.organizationId, principal.organizationId) &&
            Objects.equals(this.organization, principal.organization) &&
            Objects.equals(this.addresses, principal.addresses) &&
            Objects.equals(this.acceptedCookies, principal.acceptedCookies) &&
            Objects.equals(this.acceptedTos, principal.acceptedTos) &&
            Objects.equals(this.enabled, principal.enabled) &&
            Objects.equals(this.credentialNonExpired, principal.credentialNonExpired) &&
            Objects.equals(this.accountEnabled, principal.accountEnabled) &&
            Objects.equals(this.accountNonLocked, principal.accountNonLocked) &&
            Objects.equals(this.accountNonExpired, principal.accountNonExpired) &&
            Objects.equals(this.roles, principal.roles) &&
            Objects.equals(this.authorityList, principal.authorityList) &&
            Objects.equals(this.id, principal.id) &&
            Objects.equals(this.ownerId, principal.ownerId) &&
            Objects.equals(this.createdDate, principal.createdDate) &&
            Objects.equals(this.keyHash, principal.keyHash) &&
            Objects.equals(this.lastAccessedById, principal.lastAccessedById) &&
            Objects.equals(this.lastAccessedDate, principal.lastAccessedDate) &&
            Objects.equals(this.lastModifiedById, principal.lastModifiedById) &&
            Objects.equals(this.lastModifiedDate, principal.lastModifiedDate);
        }

            @Override
            public int hashCode() {
            return Objects.hash(firstName, middleName, lastName, username, password, fingerprint, federalIdentification, residenceCountry, stateIdentification, residenceState, email, social, bio, notes, avatarUrl, organizationId, organization, addresses, acceptedCookies, acceptedTos, enabled, credentialNonExpired, accountEnabled, accountNonLocked, accountNonExpired, roles, authorityList, id, ownerId, createdDate, keyHash, lastAccessedById, lastAccessedDate, lastModifiedById, lastModifiedDate);
            }
            @Override
            public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Principal {\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append("*").append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    federalIdentification: ").append(toIndentedString(federalIdentification)).append("\n");
        sb.append("    residenceCountry: ").append(toIndentedString(residenceCountry)).append("\n");
        sb.append("    stateIdentification: ").append(toIndentedString(stateIdentification)).append("\n");
        sb.append("    residenceState: ").append(toIndentedString(residenceState)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    social: ").append(toIndentedString(social)).append("\n");
        sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    acceptedCookies: ").append(toIndentedString(acceptedCookies)).append("\n");
        sb.append("    acceptedTos: ").append(toIndentedString(acceptedTos)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    credentialNonExpired: ").append(toIndentedString(credentialNonExpired)).append("\n");
        sb.append("    accountEnabled: ").append(toIndentedString(accountEnabled)).append("\n");
        sb.append("    accountNonLocked: ").append(toIndentedString(accountNonLocked)).append("\n");
        sb.append("    accountNonExpired: ").append(toIndentedString(accountNonExpired)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    authorityList: ").append(toIndentedString(authorityList)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    keyHash: ").append(toIndentedString(keyHash)).append("\n");
        sb.append("    lastAccessedById: ").append(toIndentedString(lastAccessedById)).append("\n");
        sb.append("    lastAccessedDate: ").append(toIndentedString(lastAccessedDate)).append("\n");
        sb.append("    lastModifiedById: ").append(toIndentedString(lastModifiedById)).append("\n");
        sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
        sb.append("}");
            return sb.toString();
            }

            /**
            * Convert the given object to string with each line indented by 4 spaces
            * (except the first line).
            */
            private String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
                return o.toString().replace("\n", "\n    ");
            }
    }

