package com.portfolio.molinarodrigo.Repository;

import com.portfolio.molinarodrigo.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducacionRepo extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByTituloEdu(String tituloEdu);
    public boolean existsByTituloEdu(String tituloEdu);
}
