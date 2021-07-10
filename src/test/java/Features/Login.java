package Features;

import Common.Config;
import Elements.ElementsLogin;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login
    //*************************INSTANCIAS************************
{
    ElementsLogin elementsLogin = new ElementsLogin();
    SeleniumUtils Utils = new SeleniumUtils();


    public void miLogin(WebDriver driver) throws Exception
    {
        Thread.sleep(2000);
        //SE DA CLIC EN EL BOTON SIGN IN
        Utils.ClickButton(elementsLogin.ButtonSignin(driver));
        Thread.sleep(2000);

       //SE REALIZA EL DESPLAZAMIENTO A LA PARTE INFERIOR
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        Thread.sleep(2000);

        //SE DA CLIC Y SE LLENA EL USUARIO
        Utils.ClickButton(elementsLogin.InputUser(driver));
        Utils.LimpiarYllenarInput(elementsLogin.InputUser(driver),Config.User);
        Thread.sleep(2000);

        //SE DA CLIC Y SE LLENA EL PASSWORD
        Utils.ClickButton(elementsLogin.InputUser(driver));
        Utils.LimpiarYllenarInput(elementsLogin.InputPassword(driver),Config.Password);
        Thread.sleep(2000);

       //SE DA CLIC EN EL BOTON SIGN IN
       WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
       buttonSignIn.click();
       Thread.sleep(2000);
    }

    public void cerrarSesion (WebDriver driver)
    {
        /**********************************NOTA DE ESTUDIO***********************************
        EN CADA CLASE DE FEATURES  PODEMOS COLOCAR MULTIPLES FUNCIONALIDADES
        ES INDISPENSABLE CONTAR PRIMERO CON LOS ELEMENTOS WEB
        POR EJEMPLO: DENTRO DE ESTE METODO PODEMOS CREAR EL PASO A PASO DE CERRAR SESION*/
    }

}