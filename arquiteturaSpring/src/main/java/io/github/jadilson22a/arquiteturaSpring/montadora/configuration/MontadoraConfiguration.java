package io.github.jadilson22a.arquiteturaSpring.montadora.configuration;

import io.github.jadilson22a.arquiteturaSpring.montadora.Motor;
import io.github.jadilson22a.arquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name= "motorAspirado")
    @Primary
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setModelo("XPTO-0");
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name= "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setModelo("Elétrico");
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(1.4);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name= "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setModelo("Turbo");
        motor.setCavalos(200);
        motor.setCilindros(4);
        motor.setLitragem(2.5);
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor;
    }

}
