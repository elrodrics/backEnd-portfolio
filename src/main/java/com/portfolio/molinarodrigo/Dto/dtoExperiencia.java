package com.portfolio.molinarodrigo.Dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import java.util.Date;


public class dtoExperiencia {
    @NotBlank
    private String tituloExp;
    @NotBlank
    private String subtituloExp;
    @NotBlank
    @Temporal(TemporalType.DATE)
    private Date fechaExp;
    @NotBlank
    @Temporal(TemporalType.DATE)
    private Date fechaFinExp;
    @NotBlank
    private String descExp;
    @NotBlank
    private String imagenExp;
    @NotBlank
    
    public dtoExperiencia() {
    }
    
    public dtoExperiencia(String tituloExp, String subtituloExp, Date fechaExp, Date fechaFinExp, String descExp, String imagenExp) {
        this.tituloExp = tituloExp;
        this.subtituloExp = subtituloExp;
        this.fechaExp = fechaExp;
        this.fechaFinExp = fechaFinExp;
        this.descExp = descExp;
        this.imagenExp = imagenExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public String getSubtituloExp() {
        return subtituloExp;
    }

    public void setSubtituloExp(String subtituloExp) {
        this.subtituloExp = subtituloExp;
    }

    public Date getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(Date fechaExp) {
        this.fechaExp = fechaExp;
    }
    
    public Date getFechaFinExp() {
        return fechaFinExp;
    }

    public void setFechaFinExp(Date fechaFinExp) {
        this.fechaFinExp = fechaFinExp;
    }
    
    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getImagenExp() {
        return imagenExp;
    }

    public void setImagenExp(String imagenExp) {
        this.imagenExp = imagenExp;
    }
    
    
}
