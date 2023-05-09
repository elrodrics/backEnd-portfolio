package com.portfolio.molinarodrigo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private String subtituloEdu;
    private int fechaEdu;
    private int fechaFinEdu;
    private String descEdu;
    private String imagenEdu;

    public Educacion() {
    }

    public Educacion (Long idEdu, String tituloEdu, String subtituloEdu, int fechaEdu, int fechaFinEdu, String descEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.subtituloEdu = subtituloEdu;
        this.fechaEdu = fechaEdu;
        this.fechaFinEdu = fechaFinEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
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
    
    public int getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(int fechaEdu) {
        this.fechaEdu = fechaEdu;
    }
    
    public int getFechaFinEdu() {
        return fechaFinEdu;
    }

    public void setFechaFinEdu(int fechaFinEdu) {
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
