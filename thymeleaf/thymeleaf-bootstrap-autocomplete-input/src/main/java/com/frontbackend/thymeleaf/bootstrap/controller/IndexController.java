package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frontbackend.thymeleaf.bootstrap.model.Birthplace;
import com.frontbackend.thymeleaf.bootstrap.model.Deputado;

@Controller
@RequestMapping({"/deputados" })
public class IndexController {

    @GetMapping
    public String main(Model model) {
        model.addAttribute("deputado", new Deputado());
        return "index";
    }

    
    @PostMapping
    public String save(Deputado deputado, Model model) {
        model.addAttribute("deputado", deputado);
        return "saved";
    }
}
