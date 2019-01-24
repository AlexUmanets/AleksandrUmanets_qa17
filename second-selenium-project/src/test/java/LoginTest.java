import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver wd;

    @BeforeClass
        public void setUp() {

     wd = new ChromeDriver();
     wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     wd.manage().window().maximize();
    }

    @Test
        public void testLogin() {
        openSite("https://trello.com");
        clickOnLoginButton();

        fillLoginForm();
        confirmLogin();
    }

    private void clickOnLoginButton() {
        wd.findElement(By.className("header-button-secondary")).click();
    }

    private void fillLoginForm() {
    }
    private void confirmLogin() {
    }

    public void openSite(String url) {
        wd.get(url);
    }
}
