package Features;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    /*@Test
    // codigo para los tiempos de espera
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

    }*/

   @Test
public void UsoXpath () throws InterruptedException
    {
        /*// Este Xpath es absoluto por buenas practicas no se debe utilizar
        WebElement bottonCompar = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div[3]/div/a[3]/div[2]/span[2]"));
        bottonCompar.click();
        Thread.sleep(5000);*/

        //Utilizando Xpath con Tag (Tag: span,img,button,input,select) y un atributo
       /* WebElement buttonCompras= driver.findElement(By.xpath("//span[@id=\"nav-cart-count\"]"));
        buttonCompras.click();
        Thread.sleep(50000);*/
        //Utilizando Xpath por contains usando "*", el asterisco se puede reemplazar por el tag o tipo de elemento
        //WebElement CuentasYListas = driver.findElement(By.xpath("//*[contains(text(), 'Cuenta y Listas')]"));
        //CuentasYListas.click();
        //Thread.sleep(50000);

        //Uso de Xpath con multiple atributo
       /* WebElement inputBusqueda = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @dir='auto']"));
        inputBusqueda.click();
        inputBusqueda.clear();
        inputBusqueda.sendKeys("Celulares");
        inputBusqueda.submit();
        Thread.sleep(5000);*/
//Uso de Xpath por relationship
      /*  WebElement inputBusqueda = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @dir='auto']"));
        inputBusqueda.click();
        inputBusqueda.clear();
        inputBusqueda.sendKeys("Celulares");
        inputBusqueda.submit();
        Thread.sleep(5000);*/



    }

    @After
    public void tearDown() //Cierre de navegador
    {
        driver.quit();
    }
}
