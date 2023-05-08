package com.portfolio.molinarodrigo.Repository;

import com.portfolio.molinarodrigo.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
    
}
