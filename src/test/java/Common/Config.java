package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Config
{
    public static String URL_QA = "http://automationpractice.com/index.php";
    public static String URL_DEV = "http://automationpractice.com/index.php";
    public static String URL_DRAGANDDROP = "https://jqueryui.com/droppable/";
    public static String User = "test.0@test.com";
    public static String Password = "test1234";


    public static WebDriver navegadorChrome ()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");
        return new ChromeDriver();
    }

    public static WebDriver navegadorFirefox ()
    {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/Drivers/FirefoxDriver/geckodriver.exe");
        return new FirefoxDriver();
    }
}

