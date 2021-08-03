package Features;

import Common.BaseTestTres;
import Elements.ElementsDragAndDrop;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;


public class DragAndDrop extends BaseTestTres
{

    SeleniumUtils Utils = new SeleniumUtils();
    ElementsDragAndDrop elementsDragAndDrop = new ElementsDragAndDrop();

    @Test
    public void dragAndDrop() throws Exception
    {
        Actions action = new Actions(driver);
        Utils.ClickButton(elementsDragAndDrop.OptionDroppable(driver));
        driver.switchTo().frame(0);
        action.clickAndHold(elementsDragAndDrop.Drag(driver))
                .moveToElement(elementsDragAndDrop.Drop(driver))
                .release()
                .build()
                .perform();

        Utils.Loading(driver,3000);

    }
}
