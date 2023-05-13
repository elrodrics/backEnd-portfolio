package com.portfolio.molinarodrigo.Service;

import com.portfolio.molinarodrigo.Entity.Proyectos;
import com.portfolio.molinarodrigo.Repository.ProyectosRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService {
    @Autowired
     ProyectosRepo proyectosRepo;
     
     public List<Proyectos> list(){
         return proyectosRepo.findAll();
     }
     
     public Optional<Proyectos> getOne(int idProye){
         return proyectosRepo.findById(idProye);
     }
     
     public Optional<Proyectos> getByTituloProye (String tituloProye){
         return proyectosRepo.findByTituloProye(tituloProye);
     }
     
     public void save(Proyectos proyectos){
         proyectosRepo.save(proyectos);
     }
     
     public void delete(int idProye){
         proyectosRepo.deleteById(idProye);
     }
     
     public boolean existsById(int idProye){
         return proyectosRepo.existsById(idProye);
     }
     
     public boolean existsByTituloProye(String tituloProye){
         return proyectosRepo.existsByTituloProye(tituloProye);
     }
    
}
