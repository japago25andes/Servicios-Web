package edu.unilibre.appweb.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorFormulario {

     @GetMapping("/formulario")
    public String mostrarFormulario() {
        return "registro"; // Nombre del archivo HTML (sin la extensión .html)
    }
    
}
