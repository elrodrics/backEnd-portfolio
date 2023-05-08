package com.portfolio.molinarodrigo.Service;

import com.portfolio.molinarodrigo.Repository.ProyectosRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService {
    private final ProyectosRepo proyectosRepo;
    
    @Autowired
    public ProyectosService(ProyectosRepo proyectosRepo){
        this.proyectosRepo = proyectosRepo;
    }
}
