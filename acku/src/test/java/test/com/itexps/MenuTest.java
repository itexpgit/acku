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
        baseUrl = "https://www.inchinsonline.com/login";
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
        
}
}
