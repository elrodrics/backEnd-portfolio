package com.portfolio.molinarodrigo.Controller;

import com.portfolio.molinarodrigo.Dto.dtoProyectos;
import com.portfolio.molinarodrigo.Entity.Proyectos;
import com.portfolio.molinarodrigo.Security.Controller.Mensaje;
import com.portfolio.molinarodrigo.Service.ProyectosService;
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

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/proyectos")

public class ProyectosController {
    @Autowired
    ProyectosService proyectosService;
    
    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> list(){
        List<Proyectos> list = proyectosService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{idProye}")
    public ResponseEntity<Proyectos> getById(@PathVariable("idProye") int idProye){
        if(!proyectosService.existsById(idProye))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Proyectos proyectos = proyectosService.getOne(idProye).get();
        return new ResponseEntity(proyectos, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idProye}")
    public ResponseEntity<?> delete(@PathVariable("idProye") int idProye) {
        if (!proyectosService.existsById(idProye)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        proyectosService.delete(idProye);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyectos dtoproye){      
        if(StringUtils.isBlank(dtoproye.getTituloProye()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(proyectosService.existsByTituloProye(dtoproye.getTituloProye()))
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        
        Proyectos proyectos = new Proyectos(dtoproye.getTituloProye(), dtoproye.getSubtituloProye(),  dtoproye.getFechaProye(), dtoproye.getDescProye());
        proyectosService.save(proyectos);
        
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{idProye}")
    public ResponseEntity<?> update(@PathVariable("idProye") int idProye, @RequestBody dtoProyectos dtoproye){
        //Validamos si existe el ID
        if(!proyectosService.existsById(idProye))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(proyectosService.existsByTituloProye(dtoproye.getTituloProye()) && proyectosService.getByTituloProye(dtoproye.getTituloProye()).get().getIdProye() != idProye)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoproye.getTituloProye()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Proyectos proyectos = proyectosService.getOne(idProye).get();
        proyectos.setTituloProye(dtoproye.getTituloProye());
        proyectos.setSubtituloProye(dtoproye.getSubtituloProye());
        proyectos.setFechaProye(dtoproye.getFechaProye());
        proyectos.setDescProye((dtoproye.getDescProye()));
        
        proyectosService.save(proyectos);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
             
    }
}
