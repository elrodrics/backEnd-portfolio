package com.portfolio.molinarodrigo.Controller;

import com.portfolio.molinarodrigo.Dto.dtoUsuario;
import com.portfolio.molinarodrigo.Entity.Proyectos;
import com.portfolio.molinarodrigo.Entity.Usuario;
import com.portfolio.molinarodrigo.Security.Controller.Mensaje;
import com.portfolio.molinarodrigo.Service.UsuarioService;
import java.net.URI;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins={"https://portfolio-frontend-rodrigo.web.app/","http://localhost:4200"})
@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> list(){
        List<Usuario> list = usuarioService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable("id")int id){
        if(!usuarioService.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        Usuario usuario = usuarioService.getOne(id).get();
        return new ResponseEntity(usuario, HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoUsuario dtousuario){
        if(!usuarioService.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(usuarioService.existsByNombre(dtousuario.getNombre()) && usuarioService.getByNombre(dtousuario.getNombre()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtousuario.getNombre())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }
        
        Usuario usuario = usuarioService.getOne(id).get();
        usuario.setNombre(dtousuario.getNombre());
        usuario.setApellido(dtousuario.getApellido());
        usuario.setTitulo(dtousuario.getTitulo());
        usuario.setDescripcion(dtousuario.getDescripcion());
        usuario.setFotoPerfil(dtousuario.getFotoPerfil());
        
        usuarioService.save(usuario);
        
        return new ResponseEntity(new Mensaje("El usuario ha sido actualizado"), HttpStatus.OK);
    }

}
