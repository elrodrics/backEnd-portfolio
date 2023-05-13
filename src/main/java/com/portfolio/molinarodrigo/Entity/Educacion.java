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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEdu;
    @NotNull
    private String tituloEdu;
    @NotNull
    private String subtituloEdu;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fechaEdu;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fechaFinEdu;
    private String descEdu;
    private String imagenEdu;

    public Educacion() {
    }

    public Educacion (String tituloEdu, String subtituloEdu, Date fechaEdu, Date fechaFinEdu, String descEdu, String imagenEdu) {
        this.tituloEdu = tituloEdu;
        this.subtituloEdu = subtituloEdu;
        this.fechaEdu = fechaEdu;
        this.fechaFinEdu = fechaFinEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
    }

    public int getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(int idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }
    
    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }
    
    public void setSubtituloEdu(String subtituloEdu){
        this.subtituloEdu = subtituloEdu;
    }
    
    public String getSubtituloEdu() {
        return subtituloEdu;
    }
    
    public Date getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(Date fechaEdu) {
        this.fechaEdu = fechaEdu;
    }
    
    public Date getFechaFinEdu() {
        return fechaFinEdu;
    }

    public void setFechaFinEdu(Date fechaFinEdu) {
        this.fechaFinEdu = fechaFinEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }
    
    
}
