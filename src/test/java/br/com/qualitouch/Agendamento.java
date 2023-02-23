package br.com.qualitouch;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Agendamento {

    @Test
    public void a() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://qa-vedocs.vm.touchtec.com.br/");
        Thread.sleep(5000);
        driver.findElements(By.cssSelector("#buttonGroupMedicoPaciente > .btn-primary.btn.btn-primary")).get(1).click();
        driver.findElement(By.cssSelector(".btn.btn-primary.btn-block")).click();
        driver.findElement(By.id("formBasicEmail")).sendKeys("matilde");
        driver.findElement(By.id("formBasicPassword")).sendKeys("teste10");
        driver.findElement(By.id("formCheckTermoResponsabilidade")).click();
        //botão continuar
        driver.findElement(By.cssSelector("#app > div > div > div > div > div.cardBody.card-body > div > div > div > form > button > p")).click();
        //erro 107 , aumentar o tempo!
        Thread.sleep(5000);
        //campo buscar paciente
        driver.findElement(By.id("inputCaixaBusca")).sendKeys("Joao");
        Thread.sleep(3000);
        driver.findElement((By.xpath("//td[contains(text(),'Joao Friday')]"))).click();
        driver.findElements(By.cssSelector(".primary-color-background.iconeDocumento.document-28963")).click();
        Thread.sleep(3000);

//
//
}
}
