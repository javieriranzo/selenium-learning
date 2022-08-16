package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.DatosAutomatizacion;
import Utils.Utilidades;
import pages.PantallaLogin;

public class TestPantallaLogin {

	private WebDriver webDriver;
	private Utilidades utilidades;
	private PantallaLogin pantallaLogin;

	@BeforeMethod
	public void beforeStart() {
		utilidades = new Utilidades();
		webDriver = utilidades.inicializarChromeAutomatizado(DatosAutomatizacion.ABSENTISMO_LOGIN);
		pantallaLogin = new PantallaLogin(webDriver);
	}

	@Test
	public void testNombreEtiquetas() {
		pantallaLogin.comprobarTextoEtiquetasPantallaLogin();
		utilidades.segundosPausa(DatosAutomatizacion.SEGUNDOS_PAUSA);
	}

	@Test
	public void testLoginAbsentismoCorrecto() {
		pantallaLogin.login(DatosAutomatizacion.LOGIN_CORRECTO_NOMBRE_USUARIO,
				DatosAutomatizacion.LOGIN_CORRECTO_CONTRASENA);
		utilidades.segundosPausa(DatosAutomatizacion.SEGUNDOS_PAUSA);
	}

	@Test
	public void testLoginAbsentismoIncorrecto() {
		pantallaLogin.login(DatosAutomatizacion.LOGIN_INCORRECTO_NOMBRE_USUARIO,
				DatosAutomatizacion.LOGIN_INCORRECTO_CONTRASENA);
		utilidades.segundosPausa(DatosAutomatizacion.SEGUNDOS_PAUSA);
	}

	@AfterMethod
	public void afterFinish() {
		webDriver.close();
	}

}
