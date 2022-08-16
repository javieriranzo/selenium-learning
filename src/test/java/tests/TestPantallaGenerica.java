package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.DatosAutomatizacion;
import Utils.Utilidades;
import pages.PantallaGenerica;

public class TestPantallaGenerica {
	
	private WebDriver webDriver;
	private Utilidades utilidades;
	private PantallaGenerica pantallaGenerica;

	@BeforeMethod
	public void beforeStart() {
		utilidades = new Utilidades();
		webDriver = utilidades.inicializarChromeAutomatizado(DatosAutomatizacion.ABSENTISMO_LOGIN);
		pantallaGenerica = new PantallaGenerica(webDriver); 
	}
	
	@Test
	public void testNombreEtiquetas() {
		pantallaGenerica.comprobarTextoEtiquetasPantallaGenerica();
		utilidades.segundosPausa(DatosAutomatizacion.SEGUNDOS_PAUSA);
	}

}
