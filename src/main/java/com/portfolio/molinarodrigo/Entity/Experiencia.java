package com.portfolio.molinarodrigo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private String subtituloExp;
    private int fechaExp;
    private int fechaFinExp;
    private String descExp;
    private String imagenExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, String subtituloExp, int fechaExp, int fechaFinExp, String descExp, String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.subtituloExp = subtituloExp;
        this.fechaExp = fechaExp;
        this.fechaFinExp = fechaExp;
        this.descExp = descExp;
        this.imagenExp = imagenExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
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

    public void setSubituloExp(String subtituloExp) {
        this.subtituloExp = subtituloExp;
    }

    public int getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(int fechaExp) {
        this.fechaExp = fechaExp;
    }
    
    public int getFechaFinExp() {
        return fechaFinExp;
    }

    public void setFechaFinExp(int fechaFinExp) {
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