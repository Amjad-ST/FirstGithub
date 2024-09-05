package GetHubWeb;

import Base.BaseClass;
import Pages.GithubPages;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {


    @Test
    @Epic("Docs flow")
    @Feature("Docs Feature")
    @Story("User shall view documents")
    @Owner("Amjad")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This is a method to verify that user able to view and nev to docs" )
    public void GitPagesMethod() throws InterruptedException {

        GithubPages github = new GithubPages(driver);
        github.openUrl();
        github.DocOption();
        Thread.sleep(5000);
        github.ScrollToPosition(0, 600);
        Thread.sleep(5000);
        github.GetS();
        Thread.sleep(5000);


    }
}