package br.com.qualitouch;

import br.com.qualitouch.selenium.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumFeedz {
    public WebDriver  chrome;
    LoginPage paginalogin;
   public String email = "carolinemagalhaes@touchtec.com.br";
   public String passaword = "teste10";


    @BeforeEach
    public  void setup (){
        chrome = new ChromeDriver();
        chrome.get ("https://app.feedz.com.br/inicio");
        chrome.manage().window().maximize();

    }
    @Test
    public void LoginCorreto () throws InterruptedException{
        //Dados

        // Ação
        paginalogin.fazerLogin(email, passaword);
        chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
        WebElement login = chrome.findElement(By.id("dropdownMenuMobile"));
        Assertions.assertTrue(login.isDisplayed());
    }

}
