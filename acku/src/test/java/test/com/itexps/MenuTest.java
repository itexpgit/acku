/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
        driver = new ChromeDriver();
        baseUrl = "https://bamboo-gardens.com/";
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
        System.out.println("Loaded Bamboo Garden website");
        driver.findElement(By.cssSelector("[title=\"Menu\"]")).click();
        System.out.println("Selected Menu");
        driver.findElement(By.xpath("//*[@id=\"menu-content\"]/a[1]")).click();
        System.out.println("Selected Sample Menu");
        int winCount;
        do {
            Set allWindwHandles = driver.getWindowHandles();
            winCount = allWindwHandles.size();
            Thread.sleep(1000);
        }
        while(winCount !=2);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Focus shifted to second tab");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlToBe("https://bamboo-gardens.com/wp-content/uploads/2019/03/SampleMenu-Mar2019.pdf"));
        System.out.println("Sample Menu Validation completed");
        driver.close();
        driver.switchTo().window(tabs.get(0));
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//*[@id=\"menu-content\"]/a[2]")).click();
        System.out.println("Craft Cocktail Menu Opened");
        int winCount1;
        do {
            Set allWindwHandles1 = driver.getWindowHandles();
            winCount1 = allWindwHandles1.size();
            Thread.sleep(1000);
        }
        while(winCount1 !=2);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println("Focus shifted to second tab");
        wait.until(ExpectedConditions.urlToBe("https://bamboo-gardens.com/wp-content/uploads/2019/03/CraftCocktail_SampleMenu.pdf"));
        System.out.println("Craft Cocktail Validation completed");
        driver.close();
        driver.switchTo().window(tabs.get(0));
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//*[@id=\"menu-content\"]/a[3]")).click();
        System.out.println("Selected Order Online");
        int winCount2;
        do {
            Set allWindwHandles2 = driver.getWindowHandles();
            winCount2 = allWindwHandles2.size();
            Thread.sleep(1000);
        }
        while(winCount2 !=2);
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        wait.until(ExpectedConditions.urlToBe("https://www.inchinsonline.com/products"));
        System.out.println("Inchinsonline order website opened");
        driver.findElement(By.linkText("Select This Location")).click();
        System.out.println("Chicago location selected");
        driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li/h5")).click();
        System.out.println("Main Menu selected");
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a")).click();
        System.out.println("Login Selected");
        driver.findElement(By.id("email")).click();
        System.out.println("Email Selected");
        driver.findElement(By.name("email")).sendKeys("ackuselenium@gmail.com");
        System.out.println("Email Entered");
        driver.findElement(By.name("password")).click();
        System.out.println("Password Selected");
        driver.findElement(By.name("password")).sendKeys("itexperts");
        System.out.println("Password Entered");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Login process completed");
            
        driver.close();

        
    }

}
