import graphql.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "c:\\seleniumdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String expected
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.close();
    }
    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "c:\\seleniumdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium book");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.close();
    }
    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "c:\\seleniumdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("homework book");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.close();
    }

    }

