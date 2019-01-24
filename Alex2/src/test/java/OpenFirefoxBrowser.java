import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenFirefoxBrowser {
    WebDriver wd;


    @BeforeMethod
    public void setUp() {

        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testeBaySearch() {

        openSite();

        type();

        clickSearchButton();

    }

    @Test
    public void testeBayFilter(){

        openSite();
        type();
        clickSearchButton();
        filterItems();

    }


    public void type() {
        wd.findElement(By.id("gh-ac")).click();
        wd.findElement(By.id("gh-ac")).clear();
        wd.findElement(By.id("gh-ac")).sendKeys("glasses");
    }

    public void openSite() {
        wd.get("https://www.ebay.com/");
    }

        public void clickSearchButton() {
            wd.findElement(By.id("gh-ac")).click();
    }

    public void filterItems(){
        wd.findElement(By.linkText("Auction")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
