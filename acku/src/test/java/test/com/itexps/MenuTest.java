/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
        driver = new ChromeDriver();
        baseUrl = "https://www.inchinsonline.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() throws InterruptedException {
        
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("Loaded Inchins website");
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[1]/a")).click();
        System.out.println("Clicked Login");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).click();
        System.out.println("Clicked Email");
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("ackuselenium@gmail.com");
        System.out.println("Entered Email");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).click();
        System.out.println("Clicked Password");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("itexperts");
        System.out.println("Entered Password");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Clicked Submit");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"location-list\"]/li[1]/h4/a")).click();
        System.out.println("Selected Schamburg location");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li/h5")).click();
        System.out.println("Clicked Main Menu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"all-categories\"]/ul/li[6]/a")).click();
        System.out.println("Clicked Noodles");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"Noodles\"]/div[1]/ul/li[3]/hs-product-item/div/div/div/div[1]/img")).click();
        System.out.println("Seleceted chicken garlic noodles");
        Thread.sleep(2000);
        driver.findElement(By.id("update-btn")).click();
        System.out.println("Added to cart");
        Thread.sleep(1000);
        
}
}
