package com.valkyrlabs.api;

import com.valkyrlabs.model.ThorUser;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


/** 
    NOT a standard generated Repository

    UserRepository for the reserved user class required for Spring Web Security

*/
// @Transactional(readOnly = false)
public interface ThorUserRepository extends JpaRepository<ThorUser, UUID> {

    ThorUser findThorUserById(UUID uuid);

    ThorUser findThorUserByUsername(String username);

    ThorUser findThorUserByEmail(String username);

}