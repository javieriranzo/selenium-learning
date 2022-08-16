package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.CadenasTexto;
import Utils.Utilidades;
import data.ElementosPantallaGenerica;

public class PantallaGenerica {

	private WebDriver webDriver;
	private ElementosPantallaGenerica elementosPantallaGenerica;
	private Utilidades utilidades;

	public PantallaGenerica(WebDriver webDriver) {
		this.webDriver = webDriver;
		utilidades = new Utilidades();
		elementosPantallaGenerica = utilidades.inicializarElementosPantallaGenerica();
	}

	public void comprobarTextoEtiquetasPantallaGenerica() {
		Assert.assertTrue(webDriver.findElement(elementosPantallaGenerica.getBotonEncabezadoAbsentismo()).getText()
				.equals(CadenasTexto.TEXTO_ENCABEZADO_ABSENTISMO));
		Assert.assertTrue(webDriver.findElement(elementosPantallaGenerica.getEtiquetaPuntoMenuInicio()).getText()
				.equals(CadenasTexto.TEXTO_ETIQUETA_PUNTO_MENU_INICIO));
		Assert.assertTrue(webDriver.findElement(elementosPantallaGenerica.getEtiquetaPuntoMenuAdministracion())
				.getText().equals(CadenasTexto.TEXTO_ETIQUETA_PUNTO_MENU_ADMINISTRACION));
		Assert.assertTrue(webDriver.findElement(elementosPantallaGenerica.getEtiquetaPuntoMenuAltasBajasMedicas())
				.getText().equals(CadenasTexto.TEXTO_ETIQUETA_PUNTO_MENU_ALTAS_BAJAS));
		Assert.assertTrue(webDriver.findElement(elementosPantallaGenerica.getEtiquetaPuntoMenuInformesInvestigacion())
				.getText().equals(CadenasTexto.TEXTO_ETIQUETA_PUNTO_MENU_INFORMES_INVESTIGACION));
		Assert.assertTrue(webDriver.findElement(elementosPantallaGenerica.getEtiquetaPuntoMenuPartesResolucion())
				.getText().equals(CadenasTexto.TEXTO_ETIQUETA_PUNTO_MENU_PARTES_RESOLUCION));
		Assert.assertTrue(webDriver.findElement(elementosPantallaGenerica.getEtiquetaPuntoMenuListados()).getText()
				.equals(CadenasTexto.TEXTO_ETIQUETA_PUNTO_MENU_LISTADOS));
	}

}
