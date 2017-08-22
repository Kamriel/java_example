package my;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTest {

    private WebDriver driver;
    private WebDriver wait;

    @Before
    public void start () {
        System.setProperty("webdriver.chrome.driver", "c:\\windows\\system32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void MyFirstTest () {
        driver.get("http://google.com/");
        driver.findElement(By.name("q")).sendKeys("Manowar");
        driver.findElement(By.id("lst-ib")).sendKeys("Manowar");
    }

    @After
    public void stop () {
        driver.quit();
        driver = null;
    }
}
