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
        driver.findElement(By.name("email")).sendKeys("ackuselenium5@gmail.com");
        System.out.println("Email Entered");
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
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src='https://s3-us-west-2.amazonaws.com/www.gethomesome.com/productimages/ibg-noodles-hakka-mod.jpg']")).click();
        System.out.println("Selected Hakka Noodles");
        Thread.sleep(2000);
        driver.findElement(By.id("update-btn")).click();
        Thread.sleep(2000);
        System.out.println("Added to cart");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        driver.switchTo().activeElement().sendKeys(Keys.SPACE);
        System.out.println("Selected Cart");
        Thread.sleep(2000);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        System.out.println("Check out process started");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[tabindex=\"1\"]")).click();
        driver.findElement(By.cssSelector("input[tabindex=\"1\"]")).sendKeys("2345678901234567");
        System.out.println("Credit Card number entered");
        
        Thread.sleep(1000);
        /*driver.findElement(By.name("ccExpiry")).click();
        driver.findElement(By.name("ccExpiry")).clear();
        driver.findElement(By.name("ccExpiry")).sendKeys("10/23");
        System.out.println("Credit card expire entered");
        Thread.sleep(1000);
        driver.findElement(By.name("ccCvc")).click();
        driver.findElement(By.name("ccCvc")).clear();
        driver.findElement(By.name("ccCvc")).sendKeys("203");
        System.out.println("Credit card CVC entered");
        Thread.sleep(1000);
        driver.findElement(By.name("phoneUS")).click();
        driver.findElement(By.name("phoneUS")).clear();
        driver.findElement(By.name("phoneUS")).sendKeys("4029067731");
        System.out.println("Phone Number Entered");
        Thread.sleep(1000);
        Thread.sleep(1000);*/
        
        driver.close();

        
    }

}


