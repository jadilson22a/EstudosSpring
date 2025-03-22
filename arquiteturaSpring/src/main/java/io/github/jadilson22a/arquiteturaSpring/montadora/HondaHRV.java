package io.github.jadilson22a.arquiteturaSpring.montadora;

import java.awt.*;

public class HondaHRV extends Carro {

    //construtor
    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }
}
