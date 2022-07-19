package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_Search;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class D04_Search {
    P04_Search p04 = new P04_Search();
    D01_registerStepDef d01 = new D01_registerStepDef();
    SoftAssert soft = new SoftAssert();
    @Given("user navigate to log in page again and again")
    public void userNavigateToLogInPageAgainAndAgain() {
        Hooks.driver.findElement(p04.logInClick()).click();
    }
    @When("user enter valid email and password and submit again")
    public void enterEmailAndPasswordAgain(){
        Hooks.driver.findElement(p04.Email2()).sendKeys(d01.randomEmail);
        Hooks.driver.findElement(p04.PasswordLogIn2()).sendKeys("PASSWORD!2005");
        Hooks.driver.findElement(p04.PasswordLogIn2()).sendKeys(Keys.ENTER);}
    @And("search using product name")
    public void search(){
    Hooks.driver.findElement(p04.searchBar()).sendKeys("apple", Keys.ENTER);
}
    @Then("show result")
    public void searchResultShowed(){
       // String actual  ="Apple";
        List<WebElement> webElement = Hooks.driver.findElements(By.className("product-title"));
        int count = Hooks.driver.findElements(By.className("product-title")).size();
        System.out.println(" Count number of search results :" + count);
        for (WebElement element : webElement) {
               String s =element.getText();
               System.out.println(element.getText());
               Assert.assertTrue(s.contains("Apple"),"nvm");
       }
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        soft.assertAll();


}
    @And("search using product sku")
    public void searchUsingProductSku() {

            Hooks.driver.findElement(p04.searchBar()).sendKeys("APPLE_CAM", Keys.ENTER);

    }
    @And("user click product")
    public void userClickProduct() {
        Hooks.driver.findElement(p04.product()).click();
    }
    @Then("assert")
    public void showResultSKU(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/apple-icam"));
        Assert.assertTrue(Hooks.driver.findElement(p04.itemInfo()).getText().contains("APPLE_CAM"));
        //System.out.println(Hooks.driver.findElement(p04.itemInfo()).getText());

    }
}
