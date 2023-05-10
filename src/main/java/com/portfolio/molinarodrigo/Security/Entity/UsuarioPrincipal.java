
package com.portfolio.molinarodrigo.Security.Entity;


import jakarta.persistence.Entity;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class UsuarioPrincipal implements UserDetails{
    private String nombre;
    private String nombreUserUsuario;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;
    
    public UsuarioPrincipal(String nombre, String nombreUserUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUserUsuario = nombreUserUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
    
    public static UsuarioPrincipal build(UserUsuario userUsuario){
        List<GrantedAuthority> authorities = userUsuario.getRoles().stream().map(rol-> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors
                .toList());
        return new UsuarioPrincipal(userUsuario.getNombre(), userUsuario.getNombreUserUsuario(), userUsuario.getEmail(), userUsuario.getPassword(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }
    
   
    public String getEmail() {
        return email;
    }
    
    
    
    @Override
    public String getUsername() {
        return nombreUserUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
    
}
