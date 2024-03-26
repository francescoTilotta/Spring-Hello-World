package it.marconi.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;



// stereotype annotation
@Controller
@RequestMapping("/")
public class HelloController {
    
    // CRUD (Create Read Update Delete) -> HTTP (POST, GET, PUT, DELETE)

    @GetMapping
    public String greet() {
        return "hello-world";
    }

    @GetMapping(params = "papero")
    public String getParameter() {
        return "hello-world-param";
    }

    @GetMapping("model")
    public String greetModel() {
        return "hello-world-model";
    }
    
    // passaggio di parametri
    @ModelAttribute("name")
    public String handlerNome(){
        return "Gober";
    }
    
    

}
