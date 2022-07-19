package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.util.List;

public class D06_homeSlidersStepDef {
    SoftAssert soft = new SoftAssert();
    P03_homePage p03 = new P03_homePage();
   // Actions action = new Actions(Hooks.driver);
   // List<WebElement> categories = Hooks.driver.findElements(By.cssSelector("#nivo-slider > a:nth-child(2)"));

    @And("user clickable on first slider")
    public void clickOnSlide (){
        Hooks.driver.findElement(p03.slider()).click();
    }

    @Then("user navigate to first product page")
    public void userNavigateToProductPage() {

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        soft.assertAll();
    }

    @And("user clickable on second slider")
    public void userClickableOnSecondSlider() throws InterruptedException {
      /* Hooks.driver.switchTo().frame(categories.get(2));
      //  action.moveToElement(categories.get(0)).perform();
        Thread.sleep(3000)*/
        //Try this code
//        WebElement e = Hooks.driver.findElement(p03.slider());
//        Actions move = new Actions(Hooks.driver);
//        move.moveToElement(e).clickAndHold().moveByOffset(0,250).release().perform();
       Thread.sleep(2250);

        Hooks.driver.findElement(p03.slider()).click();
    }

    @Then("user navigate to second product page")
    public void userNavigateToSecondProductPage() {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"));
        soft.assertAll();
    }
}
