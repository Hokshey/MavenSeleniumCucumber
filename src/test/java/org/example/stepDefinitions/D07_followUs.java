package org.example.stepDefinitions;

import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P07_followUs;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class D07_followUs {
    P07_followUs p07 = new P07_followUs();
    //FaceBook
    @And("user click and navigate on facebook icon")
    public void clickedOnFacebook() throws InterruptedException {
        Hooks.driver.findElement(p07.facebook()).click();
        Thread.sleep(2000);
       //switch between tabs
        ArrayList<String > tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }
    @Then("assert facebook website")
    public void assertionFaceBook(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains( "https://www.facebook.com/nopCommerce"));
        Hooks.driver.close();
    }
    //Twitter
    @And("user click and navigate on twitter icon")
    public void clickedOnTwitter() throws InterruptedException {
        Hooks.driver.findElement(p07.twitter()).click();
        Thread.sleep(2000);
        //switch between tabs
        ArrayList<String > tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    } @Then("assert twitter website")
    public void assertionTwitter(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains( "https://twitter.com/nopCommerce"));
        Hooks.driver.close();
    }
    //RSS
    @And("user click and navigate on RSS icon")
    public void clickedOnRSS() throws InterruptedException {
        Hooks.driver.findElement(p07.rss()).click();
        Thread.sleep(2000);

    } @Then("assert RSS website")
    public void assertionRSS(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains( "https://demo.nopcommerce.com/news/rss/1"));
    }
    //Twitter
    @And("user click and navigate on youtube icon")
    public void clickedOnYoutube() throws InterruptedException {
        Hooks.driver.findElement(p07.youtube()).click();
        Thread.sleep(2000);
        //switch between tabs
        ArrayList<String > tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    } @Then("assert youtube website")
    public void assertionYoutube(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.youtube.com/user/nopCommerce"));
        Hooks.driver.close();
    }



}
