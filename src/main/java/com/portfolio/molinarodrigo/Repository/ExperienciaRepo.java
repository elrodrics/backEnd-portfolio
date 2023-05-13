package com.portfolio.molinarodrigo.Repository;

import com.portfolio.molinarodrigo.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByTituloExp(String tituloExp);
    public boolean existsByTituloExp(String tituloExp);
}
