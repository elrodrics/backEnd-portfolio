package com.portfolio.molinarodrigo.Security.Service;

import com.portfolio.molinarodrigo.Security.Entity.Rol;
import com.portfolio.molinarodrigo.Security.Enums.RolNombre;
import com.portfolio.molinarodrigo.Security.Repository.RolRepo;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepo rolRepo;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepo.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rolRepo.save(rol);
    }
}
