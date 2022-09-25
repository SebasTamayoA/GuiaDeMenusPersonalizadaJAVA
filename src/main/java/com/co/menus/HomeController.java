package com.co.menus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/blog")
    public String blog(){ return "blog";}
    @GetMapping("/calculoimc")
    public String calculoimc(){ return "calculoimc";}
    @GetMapping("/contacto")
    public String contacto(){ return "contacto";}
    @GetMapping("/politicas")
    public String politicas(){ return "politicas";}
    @GetMapping("/recetasbajarpeso")
    public String recetasbajarpeso(){ return "recetasbajarpeso";}
    @GetMapping("/recetassubirpeso")
    public String recetassubirpeso(){ return "recetassubirpeso";}
    @GetMapping("/registro")
    public String registro(){ return "registro";}
    @GetMapping("/sobrenosotros")
    public String sobrenosotros(){ return "sobrenosotros";}


}
