package br.com.qualitouch;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class DataTest {

        // 0 se forem iguais
        @Test
        public void deveDevolverZeroSeForemIguais() {
            Data data = new Data(1, 1, 2022);
            Data outraData = new Data(1, 1, 2022);

            Assertions.assertEquals(0, data.compara(outraData));
        }

        // 1 se a data corrente Ã© maior
        @Test
        public void deveDevolverUmSeADataCorrenteEhMaior() {
            Data data = new Data(1, 1, 2024);
            Data outraData = new Data(1, 1, 2022);

            Assertions.assertEquals(1, data.compara(outraData));
        }
        @Test
        public void deveDevolverMenosUmSeADataCorrenteEhMenor() {
            Data data = new Data(1, 1, 1990);
            Data outraData = new Data(1, 1, 2022);

            Assertions.assertEquals(-1, data.compara(outraData));
        }
    }



