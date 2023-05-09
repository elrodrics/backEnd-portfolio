package com.portfolio.molinarodrigo.Service;

import com.portfolio.molinarodrigo.Entity.Experiencia;
import com.portfolio.molinarodrigo.Repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo){
        this.experienciaRepo = experienciaRepo;
    }
    
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public List<Experiencia> buscarExperiencias(){
        return experienciaRepo.findAll();
    }
    
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
}
