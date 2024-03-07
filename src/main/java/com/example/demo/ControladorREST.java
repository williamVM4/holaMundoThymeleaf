package com.example.demo;

import com.example.demo.domain.Persona;
import java.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorREST {
    
    @GetMapping("/")
    public String comienzo(Model model){
        
        Persona persona = new Persona();
        persona.setNombre("William");
        
        Persona persona2 = new Persona();
        persona2.setNombre("Enrique");
        
        List personas = Arrays.asList(persona, persona2);
        
        log.info("Estoy ejecutando el controlador MVC");
        String mensaje = "Este es mi mensaje";
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("personas", personas);
        return "index";
    }
}
