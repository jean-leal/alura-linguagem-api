package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    private LinguagemRepository repositorio;


    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens(){
        return linguagens;
    }
    
}
