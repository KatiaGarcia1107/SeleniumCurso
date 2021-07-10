package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsLogin
{
    //ELEMENTO BOTON SINGIN
    public By byButtonSignin = By.xpath("//a[@class='login']");
    public WebElement ButtonSignin (WebDriver diver)
    {
        WebElement ButtonSignin = diver.findElement(byButtonSignin);
        return ButtonSignin;
    }

    //ELEMENTO INPUT USUARIO
    public By byInputUser = By.id("email");
    public WebElement InputUser (WebDriver driver)
    {
        WebElement inputUser = driver.findElement(byInputUser);
        return inputUser;
    }

    //ELEMENTO INPUT Pasword
    public By byInputpassword = By.id("password");
    public WebElement InputPassword (WebDriver driver)
    {
        WebElement inputPassword = driver.findElement(byInputpassword);
        return inputPassword;
    }

}
