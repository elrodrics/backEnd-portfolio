package com.portfolio.molinarodrigo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProye;
    private String tituloProye;
    private String subtituloProye;
    private int fechaProye;
    private int fechaFinProye;
    private String descProye;

    public Proyectos() {
    }

    public Proyectos(Long idProye, String tituloProye, String subtituloProye, int fechaProye, int fechaFinProye, String descProye) {
        this.idProye = idProye;
        this.tituloProye = tituloProye;
        this.subtituloProye = subtituloProye;
        this.fechaProye = fechaProye;
        this.fechaFinProye = fechaFinProye;
        this.descProye = descProye;
    }

    public Long getIdProye() {
        return idProye;
    }

    public void setIdProye(Long idProye) {
        this.idProye = idProye;
    }

    public String getTituloProye() {
        return tituloProye;
    }

    public void setTituloProye(String tituloProye) {
        this.tituloProye = tituloProye;
    }
    
    public String getSubtituloProye() {
        return subtituloProye;
    }

    public void setSubtituloProye(String subtituloProye) {
        this.subtituloProye = subtituloProye;
    }
    
    public int getFechaProye() {
        return fechaProye;
    }

    public void setFechaProye(int fechaProye) {
        this.fechaProye = fechaProye;
    }
    
    public int getFechaFinProye() {
        return fechaFinProye;
    }

    public void setFechaFinProye(int fechaFinProye) {
        this.fechaFinProye = fechaFinProye;
    }
    
    public String getDescProye() {
        return descProye;
    }

    public void setDescProye(String descProye) {
        this.descProye = descProye;
    }
    
    
}