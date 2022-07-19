package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import org.example.pages.P02_LogIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_LogIn {
    P02_LogIn p02_logIn = new P02_LogIn();

    D01_registerStepDef d01 = new D01_registerStepDef();

    @Given("user navigate to log in page")
    public void logInClick(){
        Hooks.driver.findElement(p02_logIn.logInClick()).click();
    }
  
    @When("user enter valid email and password and submit")
    public void enterEmailAndPassword(){
        Hooks.driver.findElement(p02_logIn.Email()).sendKeys(d01.randomEmail);
        Hooks.driver.findElement(p02_logIn.PasswordLogIn()).sendKeys("PASSWORD!2005");
        Hooks.driver.findElement(p02_logIn.PasswordLogIn()).sendKeys(Keys.ENTER);
    }

   @Then("user log in successfully")
    public void LogIn_Done(){
    SoftAssert soft = new SoftAssert();
    soft.assertEquals(p02_logIn.logInAccount().isDisplayed(),true);
    soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
    soft.assertAll();
}

    @When("user enter invalid email and password and submit")
    public void userEnterInvalidEmailAndPasswordAndSubmit() {
        Hooks.driver.findElement(p02_logIn.Email()).sendKeys("myInvalidEmail@gmail.com");
        Hooks.driver.findElement(p02_logIn.PasswordLogIn()).sendKeys("PASSWORD!");
        Hooks.driver.findElement(p02_logIn.PasswordLogIn()).sendKeys(Keys.ENTER);
    }

    @Then("user log in unsuccessfully")
    public void userLogInUnsuccessfully() {
        String color = Hooks.driver. findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getCssValue("color");

        SoftAssert soft =new SoftAssert();
        soft.assertEquals(color,"rgba(228, 67, 75, 1)");
        soft.assertAll();

    }
}
