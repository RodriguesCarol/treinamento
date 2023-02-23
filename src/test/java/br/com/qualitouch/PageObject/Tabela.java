package br.com.qualitouch.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Tabela {

    private final WebDriver driver;
    private By lastNameHeader = By.cssSelector("span.last-name");
    private final By itensColunaLastName = By.cssSelector("td.last-name");

    public Tabela(WebDriver driver) {
        this.driver = driver;
    }

    public void clicaNoHeaderLastName() {
        WebElement headerLastName = driver.findElement(lastNameHeader);
        headerLastName.click();
    }

    public List<String> valoresDaColunaLastName() {
        List<String> valores = new ArrayList<>();
        List<WebElement> valoresLastName = driver.findElements(itensColunaLastName);
        for (WebElement element : valoresLastName) {
            valores.add(element.getText());

        }
        return valores;

    }
}
