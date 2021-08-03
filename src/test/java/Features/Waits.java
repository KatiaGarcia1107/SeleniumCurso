package Features;

import Common.BaseTest;
import Elements.ElementsLogin;
import Utils.SeleniumUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Waits extends BaseTest  //Extends es Herencia*/


{

    ElementsLogin elementsLogin = new ElementsLogin();
    SeleniumUtils utils = new SeleniumUtils();

    @Test
    public void waits() throws Exception {
        //********IMPLICIT WAIT***********
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //********EXPLICIT WAIT***********
        //explicits : webDriverWait y Thread.Sleep()

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(elementsLogin.byTapWoman));

        utils.ClickButton(elementsLogin.TapWoman(driver));
        utils.Loading(driver, 1000);

        //********FLUENT WAIT***********
        Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement btnSigin = fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(elementsLogin.byTapWoman);
            }
        });

        Assert.assertTrue(driver.findElement(elementsLogin.byTapWoman).isDisplayed());

    }
}







