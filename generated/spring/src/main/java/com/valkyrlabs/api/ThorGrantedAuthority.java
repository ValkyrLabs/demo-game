package com.valkyrlabs.api;

import org.springframework.security.core.GrantedAuthority;

import com.valkyrlabs.model.Authority;

public class ThorGrantedAuthority implements GrantedAuthority{
    
    private Authority delegate = new Authority();

    public ThorGrantedAuthority(Authority delegate){
        this.delegate = delegate;
    }

    @Override
    public String getAuthority() {
        return delegate.getAuthority();
    }

}
