package Pages;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectBath.LoginObjects.*;

public class LoginPages extends BaseClass {
    WebDriver driver = null;

    public LoginPages(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl() {
        driver.get("https://github.com/login");
    }

    public void usernameField() {
        WebElement userName = driver.findElement(username);
        userName.sendKeys("naif.sar1122@gmail.com");
    }

    public void passwordField() {
        WebElement userName = driver.findElement(password);
        userName.sendKeys("N");
    }

    public void loginbtn() {
        WebElement loginbtn = driver.findElement(loginButton);
        loginbtn.click();
    }

}