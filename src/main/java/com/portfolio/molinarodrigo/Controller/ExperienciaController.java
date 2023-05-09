package com.portfolio.molinarodrigo.Controller;

import com.portfolio.molinarodrigo.Entity.Experiencia;
import com.portfolio.molinarodrigo.Service.ExperienciaService;
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
@RequestMapping("/experiencia")
public class ExperienciaController {
    private final ExperienciaService experienciaService;
    
    public ExperienciaController(ExperienciaService experienciaService){
        this.experienciaService = experienciaService;
    }
    
    @PutMapping("/update")
    public ResponseEntity<Experiencia> editarUsuario(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia= experienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> obtenerEducacion(){
        List<Experiencia> experiencias=experienciaService.buscarExperiencias();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Experiencia> crearEducacion(@RequestBody Experiencia experiencia){
        Experiencia nuevaExperiencia=experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
            
}
