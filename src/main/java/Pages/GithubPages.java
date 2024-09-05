package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import javax.print.Doc;

import static ObjectBath.GitHubPaths.*;
import static Pages.GithubPages.*;

public class GithubPages extends BaseClass {
    WebDriver driver = null;

    public GithubPages(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl() {
        driver.get("https://github.com/");
    }

    public void DocOption () {
        WebElement Doc1 = driver.findElement(DOC);
        Doc1.sendKeys(Keys.END);
        Doc1.click();
    }


    public void ScrollToPosition(int x,int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0],arguments[1]);", x, y);
    }

    public void GetS(){

        WebElement g = driver.findElement(GetStart);
        g.sendKeys(Keys.END);
        g.click();
    }
}