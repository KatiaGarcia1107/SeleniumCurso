package Features;

import Common.BaseTestTres;
import Elements.ElementsDragandDrop;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends BaseTestTres


{
    SeleniumUtils Utils = new SeleniumUtils();
    ElementsDragandDrop elementsDragAndDrop = new ElementsDragandDrop();
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
