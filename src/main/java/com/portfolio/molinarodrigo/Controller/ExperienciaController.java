package com.portfolio.molinarodrigo.Controller;

import com.portfolio.molinarodrigo.Dto.dtoExperiencia;
import com.portfolio.molinarodrigo.Entity.Experiencia;
import com.portfolio.molinarodrigo.Security.Controller.Mensaje;
import com.portfolio.molinarodrigo.Service.ExperienciaService;
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

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {

    @Autowired
    ExperienciaService experienciaService;

    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> list() {
        List<Experiencia> list = experienciaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    
    @GetMapping("/detail/{idExp}")
    public ResponseEntity<Experiencia> getById(@PathVariable("idExp") int idExp) {
        if (!experienciaService.existsById(idExp)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Experiencia experiencia = experienciaService.getOne(idExp).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }

    
    @DeleteMapping("/delete/{idExp}")
    public ResponseEntity<?> delete(@PathVariable("idExp") int idExp) {
        if (!experienciaService.existsById(idExp)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        experienciaService.delete(idExp);
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp){      
        if(StringUtils.isBlank(dtoexp.getTituloExp()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(experienciaService.existsByTituloExp(dtoexp.getTituloExp()))
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = new Experiencia(dtoexp.getTituloExp(), dtoexp.getSubtituloExp(), dtoexp.getFechaExp(), dtoexp.getFechaFinExp(), dtoexp.getDescExp(), dtoexp.getImagenExp());
        experienciaService.save(experiencia);
        
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }

    
    @PutMapping("/update/{idExp}")
    public ResponseEntity<?> update(@PathVariable("idExp") int idExp, @RequestBody dtoExperiencia dtoexp) {
        //Validamos si existe el ID
        if (!experienciaService.existsById(idExp)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //Compara nombre de experiencias
        if (experienciaService.existsByTituloExp(dtoexp.getTituloExp()) && experienciaService.getByTituloExp(dtoexp.getTituloExp()).get().getIdExp() != idExp) {
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(dtoexp.getTituloExp())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Experiencia experiencia = experienciaService.getOne(idExp).get();
        experiencia.setTituloExp(dtoexp.getTituloExp());
        experiencia.setSubtituloExp(dtoexp.getSubtituloExp());
        experiencia.setFechaExp(dtoexp.getFechaExp());
        experiencia.setFechaFinExp(dtoexp.getFechaFinExp());
        experiencia.setDescExp(dtoexp.getDescExp());
        experiencia.setImagenExp(dtoexp.getImagenExp());

        experienciaService.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
    }

}
