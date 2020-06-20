/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Uma
 */
public class MenuTest {
    
    
    private WebDriver driver;
    private String baseUrl;

    
    public MenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        baseUrl = "https://www.inchinsonline.com/login";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }

    /* TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    /*/
    @Test
    public void hello() throws Exception {
        
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.id("email")).click();
        System.out.println("Email field selected");
        driver.findElement(By.name("email")).sendKeys("ackuselenium5@gmail.com");
        System.out.println("Email Entered");
        driver.findElement(By.name("password")).click();
        System.out.println("Password field selected");
        driver.findElement(By.name("password")).sendKeys("itexperts");
        System.out.println("Password entered");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Login completed");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"location-list\"]/li[1]/h4/a")).click();
        System.out.println("Chicago location selected");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li/h5")).click();
        System.out.println("Main Menu selected");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"all-categories\"]/ul/li[6]/a")).click();
        System.out.println("Clicked Noodles Section");
        driver.findElement(By.xpath("//img[@src='https://s3-us-west-2.amazonaws.com/www.gethomesome.com/productimages/ibg-noodles-hakka-mod.jpg']")).click();
        System.out.println("Selected Hakka Noodles");
        driver.findElement(By.id("update-btn")).click();
        System.out.println("Added to cart");
        Thread.sleep(2000);
        driver.close();

        
    }

}


