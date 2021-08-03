package Features;

import Common.BaseTest;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertas extends BaseTest
{
    //********Instancias*********
    WebDriverWait wait;
    SeleniumUtils utils = new SeleniumUtils();

    @Test
    public void alerts () throws Exception
    {
        //INSTANCIA DE OBJETO JAVA SCRIPT
        JavascriptExecutor js = (JavascriptExecutor)  driver;

        //ACEPTAR ALERTA
        js.executeScript("alert('Saludos pal Amigo Raul');");
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.alertIsPresent());
        utils.Loading(driver, 300);
        /*driver.switchTo().alert().accept();
        utils.Loading(driver, 300);*/

        //DISMIS ALERTA --> LO QUE HACE ESTA FUNCION ES CANCELAR LAS ALERTAS,se cumple cuando se tiene un botón cancelar,diferentes a positivo
        String Alert = driver.switchTo().alert().getText();
        System.out.println("El texto es" + Alert);
        driver.switchTo().alert().dismiss();
    }
}

