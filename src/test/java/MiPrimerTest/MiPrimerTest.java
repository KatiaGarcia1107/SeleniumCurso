package MiPrimerTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class MiPrimerTest
{
    private WebDriver driver;
    @Before

    public void setUp()
    {
        //Se coloca la direccion del driver,sea chrome, sea mozilla, o edge
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");

        //Crea la instancia del navegador: instancia es una ventana del navegador
        driver = new ChromeDriver();

        //Maximiza el navegador
        driver.manage().window().maximize();

        //Envia la direccion del sistema al navegador
        driver.get("https://www.amazon.com/");
    }

    @Test
    // codigo para los tiempos de espera throws..
    public void TestAmazon () throws InterruptedException
    {
        // webelement interatua con todos los elementos del sistema y se realiza la busqueda con findElement y se busca por ID
        WebElement inputBusqueda = driver.findElement(By.id("twotabsearchtextbox"));
       inputBusqueda.click();
       inputBusqueda.sendKeys("Alexa");
       //inputBusqueda.submit();
        Thread.sleep(7000);//Tiempo de  Espera para el navegador
        WebElement bottonLupa = driver.findElement(By.id("nav-search-submit-text"));
        bottonLupa.click();
        Thread.sleep(7000);//Tiempo de  Espera para el navegador
    }

    @After
    public void tearDown() //Cierre de navegador
    {
        driver.quit();
    }
}
