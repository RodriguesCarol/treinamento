package br.com.qualitouch;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    //// Métodos de fixtures - Configura o ambiente de testes

    @BeforeAll
    public static void setupall(){
        System.out.println("Testes iniciados");
    }
    @BeforeEach
    public void setup(){
        calculadora = new Calculadora();
    }
    @AfterAll
    public static void teardownAll(){
        System.out.println("Testes finalizados");
    }
    //@AfterEach
    //public void tearDown(){
       // System.out.println("Execuntado apos cada método");
    //}


    @Test
    @DisplayName("Validando teste de Adição")
    public void testeAdicao(){
        // Dados
        double valorA = 5.0;
        double valorB = 2.0;
        //Ação

        double somaAB = calculadora.adicao(valorA,valorB);

        // Verificação
       assertEquals(7.0,somaAB);
    }

    @Test
    @DisplayName("Validando teste de Subtração")
    public void TesteSubtracao(){

        double valorA = 5.0;
        double valorB = 2.0;
        double subtracaoAB = calculadora.subtracao(valorA,valorB);

        assertEquals(3.0,subtracaoAB);

    }

    @Test
    @DisplayName("Validando teste de Multiplicação")
    public void TesteMultiplicacao(){

        double valorA = 5.00;
        double valorB = 2.00;
        double multiplicacaoAB = calculadora.multiplicacao(valorA,valorB);

        assertEquals(10.0,multiplicacaoAB);

    }

    @Test
    @DisplayName("Validando teste de Divisão")
    public void TesteDivisao() {

        double valorA = 5.0;
        double valorB = 2.0;
        double divisaoAB = calculadora.divisao(valorA, valorB);

        assertEquals(2.5, divisaoAB);


    }
}

