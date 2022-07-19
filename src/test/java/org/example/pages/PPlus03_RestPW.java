package org.example.pages;

import org.openqa.selenium.By;

public class PPlus03_RestPW {
    public By Log(){
        return By.className("ico-login");
    }
    public By ForgetPW (){
        return By.className("forgot-password");
    }

    public By setEmail() {
        return By.id("Email");
    }
    public By massage(){
        return By.className("content");
    }
}
