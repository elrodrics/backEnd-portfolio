package com.portfolio.molinarodrigo.Repository;

import com.portfolio.molinarodrigo.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepo extends JpaRepository<Proyectos, Integer>{
    public Optional<Proyectos> findByTituloProye(String tituloProye);
    public boolean existsByTituloProye(String tituloProye);
}
