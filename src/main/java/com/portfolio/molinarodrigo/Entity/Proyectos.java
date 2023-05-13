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
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProye;
    @NotNull
    private String tituloProye;
    @NotNull
    private String subtituloProye;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fechaProye;
    @NotNull
    private String descProye;

    public Proyectos() {
    }

    public Proyectos(String tituloProye, String subtituloProye, Date fechaProye, String descProye) {
        this.tituloProye = tituloProye;
        this.subtituloProye = subtituloProye;
        this.fechaProye = fechaProye;
        this.descProye = descProye;
    }

    public int getIdProye() {
        return idProye;
    }

    public void setIdProye(int idProye) {
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
    
    public Date getFechaProye() {
        return fechaProye;
    }

    public void setFechaProye(Date fechaProye) {
        this.fechaProye = fechaProye;
    }
    
    public String getDescProye() {
        return descProye;
    }

    public void setDescProye(String descProye) {
        this.descProye = descProye;
    }
    
    
}