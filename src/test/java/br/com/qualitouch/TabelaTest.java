package br.com.qualitouch;

import br.com.qualitouch.PageObject.Tabela;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;

public class TabelaTest {
    private WebDriver driver;
    private Tabela tabela;

    @BeforeEach
    public void a() {
        this.driver = new ChromeDriver();

        // vai pra url
        this.driver.get("http://the-internet.herokuapp.com/tables");
        this.tabela = new Tabela(this.driver);

    }

    @AfterEach
    public void b() {
        this.driver.quit();
    }
    // Comunica com browser

    @ParameterizedTest // ou @teste ou @ParameterizedTest
    @ValueSource(ints = {1, 3, 5}) //Dados
    public void verificaOrdenacaoAZ(int numeroDeClicks) {


        List<String> listaAntesDoClick = tabela.valoresDaColunaLastName();
        //Ação
        for (; numeroDeClicks > 0; numeroDeClicks--) {
            tabela.clicaNoHeaderLastName();

        }

        //Verificação
        List<String> listaDepoisDoClick = tabela.valoresDaColunaLastName();
        Collections.sort(listaAntesDoClick);
        Assertions.assertEquals(listaAntesDoClick, listaDepoisDoClick);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    public void verificaOrdenacaoZA(int numeroDeClicks) {

        List<String> listaAntesDoClick = tabela.valoresDaColunaLastName();
        //Ação
        for (; numeroDeClicks > 0; numeroDeClicks--) {
            tabela.clicaNoHeaderLastName();

            //Verificação
            List<String> listaDepoisDoClick = tabela.valoresDaColunaLastName();
            Collections.sort(listaAntesDoClick); // Ordena
            Collections.reverse(listaAntesDoClick); // Inverte
            // A gente compara a primeira lista com a segunda lista ordenada
            Assertions.assertEquals(listaAntesDoClick, listaDepoisDoClick);
        }

    }
}