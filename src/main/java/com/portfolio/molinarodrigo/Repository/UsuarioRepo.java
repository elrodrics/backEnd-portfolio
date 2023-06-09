package com.portfolio.molinarodrigo.Repository;

import com.portfolio.molinarodrigo.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{
    public Optional<Usuario> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
