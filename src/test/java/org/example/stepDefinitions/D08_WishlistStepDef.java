package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {
    P03_homePage p03 = new P03_homePage();
    @And("user click on wish list item")
    public void userClickOnWishListItem() throws InterruptedException {
        Hooks.driver.findElement(p03.wishList()).click();
        }


    @Then("assert color")
    public void assertColor() throws InterruptedException {
        //System.out.println( Hooks.driver.findElement(By.id("bar-notification")).getText());
    String color = Hooks.driver. findElement(p03.backgroundColor()).getCssValue("background-color");
        System.out.println(color);
    SoftAssert soft =new SoftAssert();
   soft.assertTrue( Hooks.driver.findElement(p03.notificationBar()).isDisplayed(),
           "notification did n`t disable");

        soft.assertEquals(color,"rgba(75, 176, 122, 1)");

        soft.assertAll();}

    @Then("assert count")
    public void assertCount() throws InterruptedException {
        Thread.sleep(5000);
        String st = Hooks.driver.findElement(p03.countOfItems()).getText();
        //get the number from (1)
        int countOfItems =  st.charAt(1);
        //if condition
        boolean bl = countOfItems > 0;
        Assert.assertTrue(bl);
    }
}



