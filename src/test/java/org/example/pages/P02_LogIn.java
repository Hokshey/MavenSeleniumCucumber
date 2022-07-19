package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_LogIn {
    public By logInClick(){
     return By.className("ico-login");
    }
    public By Email(){
        return By.id("Email");
    }
    public By PasswordLogIn(){
        return By.id("Password");
    }
    public WebElement logInAccount(){
        return Hooks.driver.findElement(By.className( ("ico-account")));
    }
    public By backgroundColor(){
        return By.className("message-error validation-summary-errors");
    }

}
