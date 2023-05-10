package com.portfolio.molinarodrigo.Security.Service;

import com.portfolio.molinarodrigo.Security.Entity.UserUsuario;
import com.portfolio.molinarodrigo.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImp implements UserDetailsService{
    @Autowired
    UserUsuarioService userUsuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUserUsuario) throws UsernameNotFoundException {
        UserUsuario userUsuario = userUsuarioService.getByNombreUserUsuario(nombreUserUsuario).get();
        return UsuarioPrincipal.build(userUsuario);
    }
}
