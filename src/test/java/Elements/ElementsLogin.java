package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsLogin
{
    //1 ELEMENTO BOTON SINGIN
    public By byButtonSignin = By.xpath("//a[@class='login']");
    public WebElement ButtonSignin (WebDriver diver)
    {
        WebElement ButtonSignin = diver.findElement(byButtonSignin);
        return ButtonSignin;
    }

    //2 ELEMENTO INPUT USUARIO
    public By byInputUser = By.id("email");
    public WebElement InputUser (WebDriver driver)
    {
        WebElement inputUser = driver.findElement(byInputUser);
        return inputUser;
    }

    //3 ELEMENTO INPUT Pasword
    public By byInputpassword = By.id("passwd");
    public WebElement InputPassword (WebDriver driver)
    {
        WebElement inputPassword = driver.findElement(byInputpassword);
        return inputPassword;
    }

    //4 ELEMENTO TAP WOMAN
    public By byTapWoman = By.partialLinkText("Women");
    public WebElement TapWoman (WebDriver driver)
    {
        WebElement TapWoman = driver.findElement(byTapWoman);
        return TapWoman;
    }

    //5 ELEMENTO BOTON PRUEBA
    public By byBotonPrueba = By.xpath("test");
    public WebElement BtnPrueba (WebDriver driver)
    {
        WebElement BtnPrueba = driver.findElement(byBotonPrueba);
        return BtnPrueba;
    }


}
