package com.portfolio.molinarodrigo.Security.Repository;

import com.portfolio.molinarodrigo.Security.Entity.Rol;
import com.portfolio.molinarodrigo.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepo extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
