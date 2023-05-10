package com.portfolio.molinarodrigo.Service;

import com.portfolio.molinarodrigo.Entity.Usuario;
import com.portfolio.molinarodrigo.Exception.UserNotFoundException;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.molinarodrigo.Repository.UsuarioRepo;


@Service
@Transactional
public class PersonaService {
    private final UsuarioRepo usuarioRepo;
    
    @Autowired
    public PersonaService(UsuarioRepo usuarioRepo){
        this.usuarioRepo = usuarioRepo;
    }
    
    public Usuario addUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    
    public List<Usuario> buscarUsuarios(){
        return usuarioRepo.findAll();
    }
    
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    
    public void borrarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }
    
    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElseThrow(() ->new UserNotFoundException("usuario no encontrado"));
    }
}
