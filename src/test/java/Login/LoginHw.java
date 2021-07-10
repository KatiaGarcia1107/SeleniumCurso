package Login;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHw
{
    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void LoginSinCamposRequeridos () throws InterruptedException
    {
        WebElement ButtonRegistrate= driver.findElement(By.xpath("//*[@class='login' or @tittle='Log in to your customer account']"));//Registrate
        ButtonRegistrate.click();
        Thread.sleep(5000);
        WebElement ButtonSignIn = driver.findElement(By.xpath("//button[@id='SubmitLogin' and @class='button btn btn-default button-medium']"));//Sing In
        ButtonSignIn.click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//div[@class= 'alert alert-danger' and @id='create_account_error']")).getText());
    }

    @Test
    public void LoginSinColocarPassword () throws InterruptedException
    {
        WebElement ButtonRegistrate= driver.findElement(By.xpath("//*[@class='login' or @tittle='Log in to your customer account']"));//Registrate
        ButtonRegistrate.click();
        Thread.sleep(5000);
        WebElement InputEmail = driver.findElement(By.xpath("//input[@id='email']"));//Email
        InputEmail.click();
        InputEmail.sendKeys("test.0@test.com");
        WebElement ButtonSignIn = driver.findElement(By.xpath("//button[@id='SubmitLogin' and @class='button btn btn-default button-medium']"));//Sing In
        ButtonSignIn.click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//div[@class= 'alert alert-danger' and @id='create_account_error']")).getText());
    }

    @Test
    public void LoginPasswordIncorrecta () throws InterruptedException
    {
        WebElement ButtonRegistrate= driver.findElement(By.xpath("//*[@class='login' or @tittle='Log in to your customer account']"));//Registrate
        ButtonRegistrate.click();
        Thread.sleep(5000);
        WebElement InputEmail = driver.findElement(By.xpath("//input[@id='email']"));//Email
        InputEmail.click();
        InputEmail.sendKeys("test.0@test.com");
        WebElement InputPassword = driver.findElement(By.xpath("//input[@id='passwd']"));//Password
        InputPassword.click();
        InputPassword.sendKeys("45781");
        WebElement ButtonSignIn = driver.findElement(By.xpath("//button[@id='SubmitLogin' and @class='button btn btn-default button-medium']"));//Sing In
        ButtonSignIn.click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//div[@class= 'alert alert-danger' and @id='create_account_error']")).getText());
    }

    @Test
    public void LoginOlvideContraseñaBacklogin () throws InterruptedException
    {
        WebElement ButtonRegistrate= driver.findElement(By.xpath("//*[@class='login' or @tittle='Log in to your customer account']"));//Registrate
        ButtonRegistrate.click();
        Thread.sleep(5000);
        WebElement LinkForgotPassword = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=password']"));//Olvide la contraseña
        LinkForgotPassword.click();
        Thread.sleep(5000);
        WebElement ButtonBackToLogin = driver.findElement(By.xpath("//li/a[@class='btn btn-default button button-small']"));
        ButtonBackToLogin.click();
        Thread.sleep(5000);
    }

    @Test
    public void LoginHappyPath () throws InterruptedException
    {
        WebElement ButtonRegistrate= driver.findElement(By.xpath("//*[@class='login' or @tittle='Log in to your customer account']"));//Registrate
        ButtonRegistrate.click();
        Thread.sleep(5000);
        WebElement InputEmail = driver.findElement(By.xpath("//input[@id='email']"));//Email
        InputEmail.sendKeys("test.0@test.com");
        WebElement InputPassword = driver.findElement(By.xpath("//input[@id='passwd']"));//Password
        InputPassword.click();
        InputPassword.sendKeys("test1234");
        WebElement ButtonSignIn = driver.findElement(By.xpath("//button[@id='SubmitLogin' and @class='button btn btn-default button-medium']"));//Sing In
        ButtonSignIn.click();
        Thread.sleep(5000);

        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("Window.scrollby (0,350)");
        Thread.sleep(2000);*/

    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
