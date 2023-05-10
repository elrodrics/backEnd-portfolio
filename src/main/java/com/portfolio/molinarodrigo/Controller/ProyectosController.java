package com.portfolio.molinarodrigo.Controller;

import com.portfolio.molinarodrigo.Entity.Proyectos;
import com.portfolio.molinarodrigo.Service.ProyectosService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    private final ProyectosService proyectosService;
    
    public ProyectosController(ProyectosService proyectosService){
        this.proyectosService = proyectosService;
    }
    
    @PutMapping("/update")
    public ResponseEntity<Proyectos> editarUsuario(@RequestBody Proyectos proyectos){
        Proyectos updateProyectos= proyectosService.editarProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> obtenerEducacion(){
        List<Proyectos> experiencias=proyectosService.buscarProyectos();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Proyectos> crearEducacion(@RequestBody Proyectos proyectos){
        Proyectos nuevaProyectos=proyectosService.addProyectos(proyectos);
        return new ResponseEntity<>(nuevaProyectos,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        proyectosService.borrarProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
