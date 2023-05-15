package com.portfolio.molinarodrigo.Dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import java.util.Date;


public class dtoEducacion {
    @NotBlank
    private String tituloEdu;
    @NotBlank
    private String subtituloEdu;
    @NotBlank
    @Temporal(TemporalType.DATE)
    private Date fechaEdu;
    @NotBlank
    @Temporal(TemporalType.DATE)
    private Date fechaFinEdu;
    @NotBlank
    private String descEdu;
    @NotBlank
    private String imagenEdu;

    public dtoEducacion(String tituloEdu, String subtituloEdu, Date fechaEdu, Date fechaFinEdu, String descEdu, String imagenEdu) {
        this.tituloEdu = tituloEdu;
        this.subtituloEdu = subtituloEdu;
        this.fechaEdu = fechaEdu;
        this.fechaFinEdu = fechaFinEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
    }

    public dtoEducacion() {
    }
    
    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getSubtituloEdu() {
        return subtituloEdu;
    }

    public void setSubtituloEdu(String subtituloEdu) {
        this.subtituloEdu = subtituloEdu;
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
