import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
   if(!isUserLoggedln()){
       login();
        }

    }

    private boolean isUserLoggedln(By by) {
        try {

        }
    }

    @Test
    public void testLogout() {

        clickOnAvatar();
        clickOnLogOutButton();


    }

    private void clickOnLogOutButton() {
        wd.findElement(By.cssSelector("a.js-logout")).click();
    }

    private void clickOnAvatar() {
    }
}
