package com.portfolio.molinarodrigo.Service;

import com.portfolio.molinarodrigo.Entity.Usuario;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.molinarodrigo.Repository.UsuarioRepo;
import java.util.Optional;


@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepo usuarioRepo;
    
    public List<Usuario> list(){
         return usuarioRepo.findAll();
     }
     
     public Optional<Usuario> getOne(int id){
         return usuarioRepo.findById(id);
     }
     
     public Optional<Usuario> getByNombre(String nombre){
         return usuarioRepo.findByNombre(nombre);
     }
     
     public void save(Usuario usuario){
         usuarioRepo.save(usuario);
     }
     
     public void delete(int id){
         usuarioRepo.deleteById(id);
     }
     
     public boolean existsById(int id){
         return usuarioRepo.existsById(id);
     }
     
     public boolean existsByNombre(String usuario){
         return usuarioRepo.existsByNombre(usuario);
     }
}