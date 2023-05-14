package com.portfolio.molinarodrigo.Controller;

import com.portfolio.molinarodrigo.Dto.dtoEducacion;
import com.portfolio.molinarodrigo.Entity.Educacion;
import com.portfolio.molinarodrigo.Security.Controller.Mensaje;
import com.portfolio.molinarodrigo.Service.EducacionService;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/educacion")

public class EducacionController {
   @Autowired
    EducacionService educacionService;
    
    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = educacionService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @GetMapping("/detail/{idEdu}")
    public ResponseEntity<Educacion> getById(@PathVariable("idEdu")int idEdu){
        if(!educacionService.existsById(idEdu)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        Educacion educacion = educacionService.getOne(idEdu).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idEdu}")
    public ResponseEntity<?> delete(@PathVariable("idEdu") int idEdu){
        if(!educacionService.existsById(idEdu)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        educacionService.delete(idEdu);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoeducacion){
        if(StringUtils.isBlank(dtoeducacion.getTituloEdu())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(educacionService.existsByTituloEdu(dtoeducacion.getTituloEdu())){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        Educacion educacion = new Educacion(dtoeducacion.getTituloEdu(), dtoeducacion.getSubtituloEdu(), dtoeducacion.getFechaEdu(), dtoeducacion.getFechaFinEdu(), dtoeducacion.getDescEdu(), dtoeducacion.getImagenEdu());
        educacionService.save(educacion);
        return new ResponseEntity(new Mensaje("Educacion creada"), HttpStatus.OK);
                
    }
    
    @PutMapping("/update/{idEdu}")
    public ResponseEntity<?> update(@PathVariable("idEdu") int idEdu, @RequestBody dtoEducacion dtoeducacion){
        if(!educacionService.existsById(idEdu)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(educacionService.existsByTituloEdu(dtoeducacion.getTituloEdu()) && educacionService.getByTituloEdu(dtoeducacion.getTituloEdu()).get().getIdEdu()!= idEdu){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoeducacion.getTituloEdu())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }
        
        Educacion educacion = educacionService.getOne(idEdu).get();
        educacion.setTituloEdu(dtoeducacion.getTituloEdu());
        educacion.setSubtituloEdu(dtoeducacion.getSubtituloEdu());
        educacion.setFechaEdu(dtoeducacion.getFechaEdu());
        educacion.setFechaFinEdu(dtoeducacion.getFechaFinEdu());
        educacion.setImagenEdu(dtoeducacion.getImagenEdu());
        educacion.setDescEdu(dtoeducacion.getDescEdu());
        
        educacionService.save(educacion);
        
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
    }
}
