package org.example.pages;

import org.openqa.selenium.By;

public class P04_Search {
    public By logInClick(){
        return By.className("ico-login");
    }
    public By Email2(){
        return By.id("Email");
    }
    public By PasswordLogIn2(){
        return By.id("Password");
    }
    public By searchBar(){

        return By.id("small-searchterms");
    }
    public By title(){
        return By.className("product-title");

    }
    public By product(){
        return By.className("product-item");
    }
    public By itemInfo(){

        return By.id("sku-17");
    }
}
