package br.com.qualitouch.selenium;


import br.com.qualitouch.SeleniumFeedz;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends SeleniumFeedz {

   private By login = By.id("login_email");
   public By senha = By.id("passInput");
   public By botao = By.id("enter-login");

  public void fazerLogin(String login,String senha){
     WebElement inputEmail = chrome.findElement(By.id(login));
     WebElement inputPassword = chrome.findElement(By.id(senha));
     WebElement submitBotao = chrome.findElement(botao);
     inputEmail.sendKeys(email);
     inputPassword.sendKeys(passaword);
     submitBotao.click();
  }
}
