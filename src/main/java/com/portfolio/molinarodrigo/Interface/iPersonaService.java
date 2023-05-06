package com.portfolio.molinarodrigo.Interface;

import com.portfolio.molinarodrigo.Entity.Persona;
import java.util.List;


public interface iPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();
    
    //Guardar persona
    public void savePersona(Persona persona);
    
    //Eliminar por id
    public void deletePersona(Long id);
    
    //Buscar por id
    public Persona findPersona(Long id);
}
