package org.example.pages;

import org.openqa.selenium.By;

public class P03_homePage {
public By currencyList(){return By.id("customerCurrency");}
//    public By currencySymbol(){
//   // return By.className("price actual-price");
//        return By.className("prices");

    public By topMenu(){
    return By.className("sublist-toggle");
    }
    public By chooseCategory()
    {return By.cssSelector("body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(n) > a");
    }
    public By choose(int selectedUser){
    return By.cssSelector("body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child("+(selectedUser+1)+") > ul > li:nth-child(n)");
}
    public By pageTitle(){
    return By.className("page-title");
    }

    //Test Case 8
    public By wishList(){
    return By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button");
    }
    //
    public By backgroundColor(){
    return By.cssSelector("#bar-notification > div");
    }
    public By notificationBar(){
    return By.id("bar-notification");
    }
    public By countOfItems(){
    return By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(3) > a > span.wishlist-qty");
    }

    public By slider() {
    return By.id("nivo-slider");
    }
}

