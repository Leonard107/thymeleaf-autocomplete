package com.frontbackend.thymeleaf.bootstrap.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.frontbackend.thymeleaf.bootstrap.model.Deputado;


@RestController
@RequestMapping("listadeputados")
public class DeputadoController {
	
    @GetMapping
    public List<Deputado> listaDeputados(@RequestParam(value = "q", required = false) String query) {
    	
    	List<Deputado> deputados = Arrays.asList(
                new Deputado(1, "joao"),
                new Deputado(2, "marcos"),
                new Deputado(3, "maria"),
                new Deputado(4, "Jéssica Sales"),
                new Deputado(5, "Sibá Machado"),
                new Deputado(6, "Flaviano Melo"),
                new Deputado(7, "Alan Rick"),
                new Deputado(8, "Waldir Guimaraes")
        );
    	
    	 if (StringUtils.isEmpty(query)) {
             return deputados;
         }

    	 return deputados.stream()
                 .filter(s -> s.getText().contains(query))
                 .map(v -> {
                     return v;
                 })
                 .collect(Collectors.toList());
    }
    
}
