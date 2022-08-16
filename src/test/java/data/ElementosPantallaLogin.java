package data;

import org.openqa.selenium.By;

public class ElementosPantallaLogin {
	
	private By campoNombreUsuario;
	private By campoContrasena;
	private By botonEntrar;
	private By avisoLoginIncorrecto; 
	private By etiquetaAccesoUsuarios;
	private By etiquetaNombreUsuario;
	private By etiquetaContrasena;
	private By textoBotonEntrar;
	
	public ElementosPantallaLogin() {}
	
	public ElementosPantallaLogin(By campoNombreUsuario, By campoContrasena, By botonEntrar, By avisoLoginIncorrecto, By etiquetaAccesoUsuarios,
			By etiquetaNombreUsuario, By etiquetaContrasena, By textoBotonEntrar) {
		this.campoNombreUsuario = campoNombreUsuario;
		this.campoContrasena = campoContrasena;
		this.botonEntrar = botonEntrar;
		this.avisoLoginIncorrecto = avisoLoginIncorrecto;
		this.etiquetaAccesoUsuarios = etiquetaAccesoUsuarios;
		this.etiquetaNombreUsuario = etiquetaNombreUsuario;
		this.etiquetaContrasena = etiquetaContrasena;
		this.textoBotonEntrar = textoBotonEntrar;
	}

	public By getCampoNombreUsuario() {
		return campoNombreUsuario;
	}

	public void setCampoNombreUsuario(By campoNombreUsuario) {
		this.campoNombreUsuario = campoNombreUsuario;
	}

	public By getCampoContrasena() {
		return campoContrasena;
	}

	public void setCampoContrasena(By campoContrasena) {
		this.campoContrasena = campoContrasena;
	}

	public By getBotonEntrar() {
		return botonEntrar;
	}

	public void setBotonEntrar(By botonEntrar) {
		this.botonEntrar = botonEntrar;
	}

	public By getAvisoLoginIncorrecto() {
		return avisoLoginIncorrecto;
	}

	public void setAvisoLoginIncorrecto(By avisoLoginIncorrecto) {
		this.avisoLoginIncorrecto = avisoLoginIncorrecto;
	}

	public By getEtiquetaAccesoUsuarios() {
		return etiquetaAccesoUsuarios;
	}

	public void setEtiquetaAccesoUsuarios(By etiquetaAccesoUsuarios) {
		this.etiquetaAccesoUsuarios = etiquetaAccesoUsuarios;
	}

	public By getEtiquetaNombreUsuario() {
		return etiquetaNombreUsuario;
	}

	public void setEtiquetaNombreUsuario(By etiquetaNombreUsuario) {
		this.etiquetaNombreUsuario = etiquetaNombreUsuario;
	}

	public By getEtiquetaContrasena() {
		return etiquetaContrasena;
	}

	public void setEtiquetaContrasena(By etiquetaContrasena) {
		this.etiquetaContrasena = etiquetaContrasena;
	}

	public By getTextoBotonEntrar() {
		return textoBotonEntrar;
	}

	public void setTextoBotonEntrar(By textoBotonEntrar) {
		this.textoBotonEntrar = textoBotonEntrar;
	}
	
}
