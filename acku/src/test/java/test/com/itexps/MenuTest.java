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
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[title=\"Menu\"]")).click();
        Thread.sleep(2000);
        System.out.println("Selected Menu");
        driver.findElement(By.xpath("//*[@id=\"menu-content\"]/a[1]")).click();
        Thread.sleep(1000);
        System.out.println("Selected Sample Menu");
        Set allWindwHandles = driver.getWindowHandles();
        int winCount = allWindwHandles.size();
        while (true)
        {   
        if (winCount  != 2)
        {
            allWindwHandles = driver.getWindowHandles();
            winCount = allWindwHandles.size();
            System.out.println("Still in loop");
        }
        else
            break;
        }
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Out of loop and on new window");
       
        driver.close();

    }

}
