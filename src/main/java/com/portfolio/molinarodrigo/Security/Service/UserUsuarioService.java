package com.portfolio.molinarodrigo.Security.Service;

import com.portfolio.molinarodrigo.Security.Entity.UserUsuario;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.molinarodrigo.Security.Repository.UserUsuarioRepo;

@Service
@Transactional
public class UserUsuarioService {
    @Autowired
    UserUsuarioRepo userUsuarioRepo;
    
    public Optional<UserUsuario> getByNombreUserUsuario(String nombreUserUsuario){
        return userUsuarioRepo.findByNombreUserUsuario(nombreUserUsuario);
    }
    
    public boolean existsByNombreUserUsuario(String nombreUserUsuario){
        return userUsuarioRepo.existsByNombreUserUsuario(nombreUserUsuario);
    }
    
    public boolean existsByEmail(String email){
        return userUsuarioRepo.existsByEmail(email);
    }
    
    public void save(UserUsuario userUsuario){
        userUsuarioRepo.save(userUsuario);
    }
}
