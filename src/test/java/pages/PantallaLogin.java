package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.CadenasTexto;
import Utils.DatosAutomatizacion;
import Utils.Utilidades;
import data.ElementosPantallaLogin;

public class PantallaLogin {

	private WebDriver webDriver;
	private ElementosPantallaLogin elementosPantallaLogin;
	private Utilidades utilidades;

	public PantallaLogin(WebDriver webDriver) {
		this.webDriver = webDriver;
		utilidades = new Utilidades();
		elementosPantallaLogin = utilidades.inicializarElementosPantallaLogin();
	}

	public void login(String user, String password) {
		webDriver.findElement(elementosPantallaLogin.getCampoNombreUsuario()).sendKeys(user);
		webDriver.findElement(elementosPantallaLogin.getCampoContrasena()).sendKeys(password);
		webDriver.findElement(elementosPantallaLogin.getCampoContrasena()).sendKeys(Keys.ENTER);

		if (!(user.equals(DatosAutomatizacion.LOGIN_CORRECTO_NOMBRE_USUARIO)
				&& password.equals(DatosAutomatizacion.LOGIN_CORRECTO_CONTRASENA))) {
			webDriver.findElement(elementosPantallaLogin.getAvisoLoginIncorrecto()).getText()
					.equals(CadenasTexto.TEXTO_MENSAJE_LOGIN_INCORRECTO);
		}
	}

	public void comprobarTextoEtiquetasPantallaLogin() {
		Assert.assertTrue(webDriver.findElement(elementosPantallaLogin.getEtiquetaAccesoUsuarios()).getText()
				.equals(CadenasTexto.TEXTO_ETIQUETA_ACCESO_USUARIOS));
		Assert.assertTrue(webDriver.findElement(elementosPantallaLogin.getEtiquetaNombreUsuario()).getText()
				.equals(CadenasTexto.TEXTO_ETIQUETA_NOMBRE_USUARIO));
		Assert.assertTrue(webDriver.findElement(elementosPantallaLogin.getEtiquetaContrasena()).getText()
				.equals(CadenasTexto.TEXTO_ETIQUETA_CONTRASENA));
		Assert.assertTrue(webDriver.findElement(elementosPantallaLogin.getTextoBotonEntrar()).getText()
				.equals(CadenasTexto.TEXTO_BOTON_ENTRAR));
	}

}
