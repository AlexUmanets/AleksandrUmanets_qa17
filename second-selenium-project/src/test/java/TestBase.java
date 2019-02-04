import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
        public void setUp() {

     wd = new ChromeDriver();
     wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     wd.manage().window().maximize();
    }

    protected void clickOnLoginButton() {
        wd.findElement(By.className("header-button-secondary")).click();
    }



    protected void fillLoginForm() {
        wd.findElement(By.cssSelector("input[type=email")).click();
        wd.findElement(By.cssSelector("input[type=email")).clear();
        wd.findElement(By.cssSelector("input[type=email")).sendKeys("elena.telran@yahoo.com");
    }

    protected void confirmLogin() {
        click(By.cssSelector("#login"));
    }

    public void openSite(String url) {
        wd.get(url);
    }
}
