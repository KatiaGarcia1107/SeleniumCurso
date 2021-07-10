package Common;

import Features.Login;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;


//CLASE CON DATOS REPETITIVOS
public class BaseTest
{
 //*****************INSTANCIAS*****************************
 public static WebDriver driver = null;
 Login Login = new Login();


 @Before
 public void Login () throws Exception
 {
  //CREAR DRIVER
  driver = Config.navegadorChrome();

  //MAXIMIXA VENTANA
  driver.manage().window().maximize();

  //lA FUNCION "driver.get", NOS SIRVE PARA MANDAR LA URL AL NAVEGADOR
  driver.get(Config.URL_QA);

  //POR MEDIO DEL OBJETO "login", MANDAMOS TRAER (INSTANCIAMOS) EL PROCESO DE INICIAR SESION
  Login.miLogin(driver);
 }

 @After
 public void tearDown()
  {
  //LA FUNCION "driver.quit",NOS SIRVE PARA CERRAR EL NAVEGADOR
   driver.quit();
  }

}
