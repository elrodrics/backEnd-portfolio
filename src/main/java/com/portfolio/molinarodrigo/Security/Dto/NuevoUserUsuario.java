package com.portfolio.molinarodrigo.Security.Dto;

import java.util.HashSet;
import java.util.Set;


public class NuevoUserUsuario {
    private String nombre;
    private String nombreUserUsuario;
    private String email;
    private String password;
    private Set<String> roles = new HashSet<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUserUsuario() {
        return nombreUserUsuario;
    }

    public void setNombreUserUsuario(String nombreUserUsuario) {
        this.nombreUserUsuario = nombreUserUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
    
    
}
