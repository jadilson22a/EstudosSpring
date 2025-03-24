package io.github.jadilson22a.arquiteturaSpring.montadora.api;

import io.github.jadilson22a.arquiteturaSpring.montadora.*;
import io.github.jadilson22a.arquiteturaSpring.montadora.configuration.Aspirado;
import io.github.jadilson22a.arquiteturaSpring.montadora.configuration.Eletrico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteFabricaController {

    //Injetamos o bean motor
    @Autowired
    @Eletrico
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor); //Utilizamos o bean
        return carro.darIgnicao(chave);
    }

}
