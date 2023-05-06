package com.portfolio.molinarodrigo.Repository;

import com.portfolio.molinarodrigo.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iPersonaRepository extends JpaRepository<Persona, Long>{
    
}
