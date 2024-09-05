package GetHubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseClass {


    @Test
   // @Epic("Docs flow")
   // @Feature("Docs Feature")
    //@Story("User shall view documents")
    //@Owner("Amjad")
   // @Severity(SeverityLevel.CRITICAL)
    //@Description("This is a method to verify that user able to view and nev to docs" )
    public void loginPagesMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);
        login.openUrl();
        login.usernameField();
        login.passwordField();
        login.loginbtn();
        Thread.sleep(5000);

    }
}