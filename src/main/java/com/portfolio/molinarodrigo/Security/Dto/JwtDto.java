package com.portfolio.molinarodrigo.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;


public class JwtDto {
    private String token;
    private String bearer = "Bearer";
    private String nombreUserUsuario;
    private Collection<? extends GrantedAuthority> authorities;

    public JwtDto(String token, String nombreUserUsuario, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.nombreUserUsuario = nombreUserUsuario;
        this.authorities = authorities;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUserUsuario() {
        return nombreUserUsuario;
    }

    public void setNombreUserUsuario(String nombreUserUsuario) {
        this.nombreUserUsuario = nombreUserUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    
    
}
