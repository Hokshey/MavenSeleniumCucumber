package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    P03_homePage p03 = new P03_homePage();
    String actualResult ="";



@And("user could hover on a categories list and select a random item")
 public void wtf() throws InterruptedException {
    Actions action = new Actions(Hooks.driver);
    //create the list of categories and choose a random element for it
    List<WebElement> categories = Hooks.driver.findElements(p03.chooseCategory());
    int countCategories = categories.size();
    int min = 0;
    int max = countCategories-4;
    int selectedUser =  (int)Math.floor(Math.random()*(max-min)+min);
    action.moveToElement(categories.get(selectedUser)).perform();
    Thread.sleep(2000);

    //create the list of items and get test and choose a random item
    List<WebElement> categoryItems = Hooks.driver.findElements(p03.choose(selectedUser));
    int countItems = categoryItems.size();
    int randomItem = new Random().nextInt(countItems);
    actualResult = categoryItems.get(randomItem).getText().toLowerCase().trim();
    categoryItems.get(randomItem).click();

}
@Then("Assert that the sub-category title")
  public void ass(){
    SoftAssert soft = new SoftAssert();
    String expectedResult = Hooks.driver.findElement(p03.pageTitle()).getText();
    soft.assertEquals(expectedResult.toLowerCase().trim(), actualResult); ;
    soft.assertAll();
}

}
