package Features;

import Common.BaseTest;
import Elements.ElementsSelects;
import Utils.SeleniumUtils;
import jdk.jshell.execution.Util;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selects extends BaseTest {

    //*********INSTANCIAS********
    SeleniumUtils Utils = new SeleniumUtils();
    ElementsSelects elementsSelects = new ElementsSelects();

    @Test
    public void ListaConClicks() throws Exception {
        //SE VALIDA LA PRESENCIA DEL ELEMENTO
        Utils.waitElement(driver, elementsSelects.byTapWoman);

        //SE DA CLIC EN EL ELEMENTO TAP WOMAN
        Utils.ClickButton(elementsSelects.TapWoman(driver));
        Utils.Loading(driver, 30000);

        //SE VALIDA LA PRESENCIA DEL ELEMENTO MAS LA OPCION TOPS
        Utils.waitElement(driver, elementsSelects.bybottonMasTops);

        //SE DA CLIC EN EL ELEMENTO OPCION  TOPS
        Utils.ClickButton(elementsSelects.BottonMasTops(driver));
        Utils.Loading(driver, 30000);

        //SE VALIDA LA PRESENCIA DEL ELEMENTO  T SHIRTS
        Utils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //SE DA CLIC EN EL ELEMENTO T SHIRTS
        Utils.ClickButton(elementsSelects.BottonTSshirts(driver));


        //SELECCIONAR OPCIONES DE LA LISTA CON CLICKS
        /*ESTA OPCION POR BUENAS PRACTICAS NO SE UTILIZA*/

        //SE VALIDA LA PRESENCIA DEL ELEMENTO "LISTA SORT"
        Utils.waitElement(driver, elementsSelects.bySelectSort);


        //SE DA CLIC EN "LISTA SORT"
        Utils.ClickButton(elementsSelects.SelectSort(driver));
        Utils.Loading(driver, 2000);

        String opcionEsperada = "In stock";
        String opcionBuscar = String.format("//option[text()='%s']",opcionEsperada);
        WebElement option = driver.findElement(By.xpath(opcionBuscar));
        option.click();
        Utils.Loading(driver,3000);
    }

    @Test
    public void  ListaConSendKeys () throws Exception
    {
        //1SE VALIDA LA PRESENCIA DEL ELEMENTO
        Utils.waitElement(driver, elementsSelects.byTapWoman);

        //2SE DA CLIC EN EL ELEMENTO TAP WOMAN
        Utils.ClickButton(elementsSelects.TapWoman(driver));
        Utils.Loading(driver, 30000);

        //3SE VALIDA LA PRESENCIA DEL ELEMENTO MAS LA OPCION TOPS
        Utils.waitElement(driver, elementsSelects.bybottonMasTops);

        //4SE DA CLIC EN EL ELEMENTO OPCION  TOPS
        Utils.ClickButton(elementsSelects.BottonMasTops(driver));
        Utils.Loading(driver, 30000);

        //5SE VALIDA LA PRESENCIA DEL ELEMENTO  T SHIRTS
        Utils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //6SE DA CLIC EN EL ELEMENTO T SHIRTS
        Utils.ClickButton(elementsSelects.BottonTSshirts(driver));

        //*********MANEJO DE LISTAS CON SENDKEYS*********
        //ESTA OPCION ES ACEPTABLE

        Utils.waitElement(driver, elementsSelects.bySelectSort);
        Utils.Loading(driver, 2000);

        String opcionEsperada = "Product Name: A to Z";
        elementsSelects.SelectSort(driver).sendKeys(opcionEsperada);
        Utils.Loading(driver,3000);

    }

    @Test
    public void ListaUsandoClaseSelect () throws Exception
    {
        //1SE VALIDA LA PRESENCIA DEL ELEMENTO
        Utils.waitElement(driver, elementsSelects.byTapWoman);

        //2SE DA CLIC EN EL ELEMENTO TAP WOMAN
        Utils.ClickButton(elementsSelects.TapWoman(driver));
        Utils.Loading(driver, 30000);

        //3SE VALIDA LA PRESENCIA DEL ELEMENTO MAS LA OPCION TOPS
        Utils.waitElement(driver, elementsSelects.bybottonMasTops);

        //4SE DA CLIC EN EL ELEMENTO OPCION  TOPS
        Utils.ClickButton(elementsSelects.BottonMasTops(driver));
        Utils.Loading(driver, 30000);

        //5SE VALIDA LA PRESENCIA DEL ELEMENTO  T SHIRTS
        Utils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //6SE DA CLIC EN EL ELEMENTO T SHIRTS
        Utils.ClickButton(elementsSelects.BottonTSshirts(driver));

        //*********MANEJO DE LISTAS CON CLASE SELECT*********
        //OPCION RECOMENDADA
        JavascriptExecutor js = (JavascriptExecutor) driver; //Permite hacer un scroll en el navegador
        js.executeScript("window.scrollBy (0,350)");
        Utils.Loading(driver, 1000);

        Utils.waitElement(driver, elementsSelects.bySelectSort);
        Utils.Loading(driver, 1000);
        String opcionEsperada = "In stock";
        elementsSelects.SelectSort(driver);
        Select SelectList = new Select(elementsSelects.SelectSort(driver));
        SelectList.selectByVisibleText(opcionEsperada);

    }

}