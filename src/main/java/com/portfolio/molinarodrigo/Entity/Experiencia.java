package com.portfolio.molinarodrigo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExp;
    @NotNull
    private String tituloExp;
    @NotNull
    private String subtituloExp;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fechaExp;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fechaFinExp;
    @NotNull
    private String descExp;
    private String imagenExp;

    public Experiencia() {
    }

    public Experiencia(String tituloExp, String subtituloExp, Date fechaExp, Date fechaFinExp, String descExp, String imagenExp) {
        this.tituloExp = tituloExp;
        this.subtituloExp = subtituloExp;
        this.fechaExp = fechaExp;
        this.fechaFinExp = fechaFinExp;
        this.descExp = descExp;
        this.imagenExp = imagenExp;
    }

    public int getIdExp() {
        return idExp;
    }

    public void setIdExp(int idExp) {
        this.idExp = idExp;
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