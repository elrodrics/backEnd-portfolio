package com.portfolio.molinarodrigo.Security.Dto;

import jakarta.validation.constraints.NotBlank;


public class LoginUserUsuario {
    @NotBlank
    private String nombreUserUsuario;
    @NotBlank
    private String password;

    public String getNombreUserUsuario() {
        return nombreUserUsuario;
    }

    public void setNombreUserUsuario(String nombreUserUsuario) {
        this.nombreUserUsuario = nombreUserUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
