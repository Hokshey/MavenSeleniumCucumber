package org.example.stepDefinitions;
import org.example.pages.P01_register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.And;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.testng.asserts.SoftAssert;

import java.util.Random;


public class D01_registerStepDef {
//    WebDriver driver = Hooks.driver;
//    P01_register register = new  P01_register();
//
//    public void Register(){
//
//        System.out.println("gg");
//    }

    P01_register register=new P01_register();

    static String randomEmail = "myemail"+String.valueOf(new Random().nextInt(5000)) +"@gmail.com";


    @Given("user navigate to home page and click register Tab")
    public void registerClick()
    {

        Hooks.driver.findElement(register.registerClick()).click();


    }
    @When("user enter valid data to Your Personal Details section")
    public void enterPersonalData()
    {

        Hooks.driver.findElement(register.gender()).click();
        Hooks.driver.findElement(register.firstName ()).sendKeys("Mahmoud");
        Hooks.driver.findElement(register.lastName()).sendKeys("Abdalbary");
        Hooks.driver.findElement(register.date("DateOfBirthDay","5")).click();
        Hooks.driver.findElement(register.date("DateOfBirthMonth","5")).click();
        Hooks.driver.findElement(register.date("DateOfBirthYear","2005")).click();
        Hooks.driver.findElement(register.email()).sendKeys(randomEmail);



    }
    @And("user enter valid data to Company Details section")
    public void enterCompanyData()
    {
        Hooks.driver.findElement(register.company()).sendKeys("My Company");


    }
    @And("user enter valid data to Your Password section")
    public void enterPasswordData()
    {
        Hooks.driver.findElement(register.password()).sendKeys("PASSWORD!2005");
        Hooks.driver.findElement(register.confirmPassword()).sendKeys("PASSWORD!2005");

    }
    @And("user click register button")
    public void registerButton()
    {
        Hooks.driver.findElement(register.registerButton()).click();


    }
    @Then("Registration done successfully")
    public void Registration_done()
    {
        String color = Hooks.driver. findElement(By.cssSelector("div[class=\"result\"]")).getCssValue("color");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver. findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]")).isDisplayed());
        soft.assertEquals(color,"rgba(76, 177, 124, 1)");
        soft.assertAll();

    }

}
