package com.portfolio.molinarodrigo.Dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import java.util.Date;


public class dtoProyectos {
    @NotBlank
    private String tituloProye;
    @NotBlank
    private String subtituloProye;
    @NotBlank
    @Temporal(TemporalType.DATE)
    private Date fechaProye;
    @NotBlank
    private String descProye;
    
    public dtoProyectos() {
    }
    
    public dtoProyectos(String tituloProye, String subtituloProye, Date fechaProye, Date fechaFinProye, String descProye) {
        this.tituloProye = tituloProye;
        this.subtituloProye = subtituloProye;
        this.fechaProye = fechaProye;
        this.descProye = descProye;
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
