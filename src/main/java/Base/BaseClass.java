package Base;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    //declares a Web driver object named driver

    public WebDriver driver;


    @BeforeClass
    //Method executed before the first test method in the current class
    public void setUp() {
        //set the system property to use ChromeDriver from the specified location
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");

        //Initializes driver as a new ChromeDriver instance
        driver = new ChromeDriver();
        //maximize the browser window
        driver.manage().window().maximize();
        //sets implicit wait time for web drover operations
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //navigates to the specified URL
        //driver.get("https://github.com/login");


    }
    @AfterClass
    public void tearDown() {
        //Close all browser windows and ends the WebDriver session
        driver.quit();
    }
}