package br.com.qualitouch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ElevadorTest {
    @Test
    public void a(){
        Integer capacidadeElevador = 2;
        Integer totalAndares = 2;

        Elevador elevador = new Elevador (totalAndares,capacidadeElevador);
        Assertions.assertEquals(capacidadeElevador, elevador.getCapacidadeElevador());
        Assertions.assertEquals(totalAndares, elevador.getTotalAndares());




    }
}
