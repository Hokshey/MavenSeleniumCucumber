package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static org.openqa.selenium.By.className;

public class D03_currenciesStepDef {
    P03_homePage p05 = new P03_homePage();




@And("user select Euro currency from the dropdown list on the top left of home page")
public void changeCurrency() throws InterruptedException {
    WebElement currencyElement= Hooks.driver.findElement(p05.currencyList());
    Select currency = new Select(currencyElement);
    currency.selectByVisibleText("Euro");
    Thread.sleep(3000);

}
@Then("to verify Euro Symbol is shown on the 4 products displayed in Home page")
    public void currencyChanged(){
        List<WebElement> listOfPrices = Hooks.driver.findElements(className("prices"));
        int count = Hooks.driver.findElements(className("prices")).size();
//        System.out.println(list);
//        System.out.println(count);
        System.out.println(" Count number of search results :" + count);
        for (WebElement element : listOfPrices) {
        String s =element.getText();
        System.out.println(element.getText());
        Assert.assertTrue(s.contains("€"),"nvm");


}}}
