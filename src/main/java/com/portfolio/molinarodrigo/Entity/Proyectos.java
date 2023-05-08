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
    private int fechaProye;
    private String descProye;

    public Proyectos() {
    }

    public Proyectos(Long idProye, String tituloProye, int fechaProye, String descProye) {
        this.idProye = idProye;
        this.tituloProye = tituloProye;
        this.fechaProye = fechaProye;
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

    public int getFechaProye() {
        return fechaProye;
    }

    public void setFechaProye(int fechaProye) {
        this.fechaProye = fechaProye;
    }

    public String getDescProye() {
        return descProye;
    }

    public void setDescProye(String descProye) {
        this.descProye = descProye;
    }
    
    
}