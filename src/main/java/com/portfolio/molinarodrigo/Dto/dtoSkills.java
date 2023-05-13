package com.portfolio.molinarodrigo.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoSkills {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    private String imagenSkill;

    public dtoSkills() {
    }

    public dtoSkills(String nombre, int porcentaje, String imagenSkill) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.imagenSkill = imagenSkill;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public String getImagenSkill() {
        return imagenSkill;
    }

    public void setImagenSkill(String imagenSkill) {
        this.imagenSkill = imagenSkill;
    }

}
