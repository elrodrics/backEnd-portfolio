package com.portfolio.molinarodrigo.Service;

import com.portfolio.molinarodrigo.Entity.Experiencia;
import com.portfolio.molinarodrigo.Repository.ExperienciaRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class ExperienciaService {
    
     @Autowired
     ExperienciaRepo experienciaRepo;
     
     public List<Experiencia> list(){
         return experienciaRepo.findAll();
     }
     
     public Optional<Experiencia> getOne(int id){
         return experienciaRepo.findById(id);
     }
     
     public Optional<Experiencia> getByTituloExp(String tituloExp){
         return experienciaRepo.findByTituloExp(tituloExp);
     }
     
     public void save(Experiencia expe){
         experienciaRepo.save(expe);
     }
     
     public void delete(int id){
         experienciaRepo.deleteById(id);
     }
     
     public boolean existsById(int id){
         return experienciaRepo.existsById(id);
     }
     
     public boolean existsByTituloExp(String tituloExp){
         return experienciaRepo.existsByTituloExp(tituloExp);
     }
}
