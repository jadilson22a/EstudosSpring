package io.github.jadilson22a.arquiteturaSpring.montadora.api;

import io.github.jadilson22a.arquiteturaSpring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteFabricaController {

    //Injetamos o bean motor
    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor); //Utilizamos o bean
        return carro.darIgnicao(chave);
    }

}
