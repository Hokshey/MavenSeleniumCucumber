package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.PPlus03_RestPW;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class DPlus03_RestPW {
PPlus03_RestPW pPlus03_restPW = new PPlus03_RestPW();
    D01_registerStepDef d01 = new D01_registerStepDef();
@Given("user navigate to log in page again")
public  void log(){
    Hooks.driver.findElement(pPlus03_restPW.Log()).click();
}
@When("user click forget password button")
    public void forgetPWClick() throws InterruptedException {
    Hooks.driver.findElement(pPlus03_restPW.ForgetPW()).click();
}
@And("user enter valid email")
    public void enterEmail(){
    Hooks.driver.findElement(pPlus03_restPW.setEmail()).sendKeys(d01.randomEmail, Keys.ENTER);
}
    @And("success message is displayed")
    public void display_msg()
    {
        Assert.assertTrue(Hooks.driver.findElement(pPlus03_restPW.massage()).isDisplayed());
        Assert.assertTrue(Hooks.driver.findElement(pPlus03_restPW.massage()).getText().contains("Email with instructions has been sent to you."));


    }
}
