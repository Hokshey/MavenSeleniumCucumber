package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    //define Before and After annotation for your driver
    public static WebDriver driver = null;
public void waiting() throws InterruptedException {
    Thread.sleep(1000);
}


     @Before
    public void OpenBrowser() throws InterruptedException {

         //1- bridge between test scripts and browsers
         String chromePath = System.getProperty("user.dir")+
                 "\\src\\main\\resources\\chromedriver.exe" ;
         System.out.println(chromePath);
         System.setProperty("webdriver.chrome.driver",chromePath);
         //2-new Object
         driver = new ChromeDriver();
         //3-Configuration to driver

         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
         //4-Navigator to the URL
         driver.navigate().to("https://demo.nopcommerce.com/");
         waiting();


     }

     @After
    public void QuitDriver() throws InterruptedException {
         waiting();
         driver.quit();

     }
//    public class Hooks {
//        public static String Chromepath=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
//        public static WebDriver driver;
//        @Before
//        public static void openBrowser(){
//            System.setProperty("webdriver.chrome.driver",Chromepath);
//            driver=new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.navigate().to("https://demo.nopcommerce.com");
//        }
//        @After
//        public static void quitBrowser()
//        {
//            driver.quit();
//        }

}
