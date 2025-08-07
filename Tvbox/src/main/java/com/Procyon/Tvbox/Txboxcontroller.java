package com.Procyon.Tvbox;

import com.Procyon.Tvbox.model.Persona;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/api/tvbox")
public class Txboxcontroller {

    @GetMapping("/presentacion")
    public String presentacionGet(@RequestParam String nombre) {
        return "peticion GET: Bienvenido al api-rest "+ nombre;

    }
    @PostMapping("/presentacionPost")
    public String presentacionPost(@RequestBody Persona persona) {
        return "peticion POST : Bienvenido "+persona.getNombre() + " " +persona.getApellido() +
                " con edad de"+persona.getEdad();

        }
    @PutMapping("/presentacion/{nombre}")
    public String presentacion(@PathVariable String nombre){
        return "peticion PUT; Bienvenido" +nombre;

    }
    @DeleteMapping("/presentacion/{nombre}")
    public String presentacionDelete(@PathVariable String nombre){
        return "peticion DELETE: Bienvenido"+nombre;
    }
    }