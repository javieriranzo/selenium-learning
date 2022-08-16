package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.ElementosPantallaGenerica;
import data.ElementosPantallaLogin;

public class Utilidades {

	private WebDriver webDriver;
	private ElementosPantallaLogin elementosPantallaLogin;
	private ElementosPantallaGenerica elementosPantallaGenerica;

	public WebDriver inicializarChromeAutomatizado(String url) {
		System.setProperty(DatosAutomatizacion.CHROMEDRIVER, DatosAutomatizacion.CHROMEDRIVER_PATH);
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.navigate().to(url);

		return webDriver;
	}

	public ElementosPantallaLogin inicializarElementosPantallaLogin() {
		elementosPantallaLogin = new ElementosPantallaLogin(By.xpath(RutasXpath.CAMPO_INPUT_NOMBRE_USUARIO),
				By.xpath(RutasXpath.CAMPO_INPUT_CONTRASENA), By.xpath(RutasXpath.BOTON_ENTRAR),
				By.xpath(RutasXpath.MENSAJE_LOGIN_INCORRECTO), By.xpath(RutasXpath.ETIQUETA_ACCESO_USUARIOS),
				By.xpath(RutasXpath.ETIQUETA_CAMPO_NOMBRE_USUARIO), By.xpath(RutasXpath.ETIQUETA_CAMPO_CONTRASENA),
				By.xpath(RutasXpath.ETIQUETA_BOTON_ENTRAR));

		return elementosPantallaLogin;
	}

	public ElementosPantallaGenerica inicializarElementosPantallaGenerica() {
		elementosPantallaGenerica = new ElementosPantallaGenerica(By.xpath(RutasXpath.BOTON_ENCABEZADO_ABSENTISMO),
				By.xpath(RutasXpath.BOTON_ICONO_INICIO), By.xpath(RutasXpath.BOTON_ICONO_CAMPANA),
				By.xpath(RutasXpath.BOTON_ICONO_USUARIO), By.xpath(RutasXpath.BOTON_ICONO_MENU),
				By.xpath(RutasXpath.ETIQUETA_ENCABEZADO_ABSENTISMO), By.xpath(RutasXpath.ETIQUETA_PUNTO_MENU_INICIO),
				By.xpath(RutasXpath.ETIQUETA_PUNTO_MENU_ADMINISTRACION),
				By.xpath(RutasXpath.ETIQUETA_PUNTO_MENU_ALTAS_BAJAS),
				By.xpath(RutasXpath.ETIQUETA_PUNTO_MENU_INFORMES_INVESTIGACION),
				By.xpath(RutasXpath.ETIQUETA_PUNTO_MENU_PARTES_RESOLUCION),
				By.xpath(RutasXpath.ETIQUETA_PUNTO_MENU_LISTADOS), By.xpath(RutasXpath.TEXTO_HOLA_MODULO_ABSENTISMO));

		return elementosPantallaGenerica;
	}

	public void segundosPausa(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
