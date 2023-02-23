package br.com.qualitouch;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    @Test
    public void a() {
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.w3schools.com/cssref/trysel.php");
        WebElement inputName = chrome.findElement(By.cssSelector("input.markup[type=text]"));

        inputName.sendKeys("Carolinemagalhaes");

    }

}




