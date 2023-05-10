package com.portfolio.molinarodrigo.Security.Repository;

import com.portfolio.molinarodrigo.Security.Entity.UserUsuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserUsuarioRepo extends JpaRepository<UserUsuario, Integer>{
    Optional<UserUsuario> findByNombreUserUsuario(String nombreUserUsuario);
    
    boolean existsByNombreUserUsuario(String nombreUserUsuario);
    boolean existsByEmail(String email);
}
