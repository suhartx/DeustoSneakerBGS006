package org.BGS006.cliente.jdo;

import javax.jdo.annotations.*;
import java.util.ArrayList;
import java.util.List;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class Usuario {

	@PrimaryKey
	private String nombre;
	private String contrasenya;
	private String tarjetaPago;
	private String rutaAvatar;

	@Persistent(defaultFetchGroup = "true")
	@Join
	private List<Articulo> carro; // Compra


	@Persistent(mappedBy = "usuario", dependentElement = "true", defaultFetchGroup = "true")
	private List<Compra> pedidos;
	
	
	public Usuario(String nombre, String contrasenya, String tarjetaPago, String rutaAvatar, String a2, String c, String d, int ta, boolean ad) {
		super();
		this.nombre = nombre;
		this.contrasenya = contrasenya;
		this.tarjetaPago = tarjetaPago;
		this.rutaAvatar = rutaAvatar;
	}
	public Usuario() {
		super();
		this.nombre = "";
		this.contrasenya = "";
		this.tarjetaPago = "";
		this.rutaAvatar = "";
	}

	public Usuario(String nombre, String contrasenya,String tarjetaPago,String rutaAvatar) {
		this.nombre = nombre;
		this.contrasenya = contrasenya;
		this.tarjetaPago = tarjetaPago;
		this.rutaAvatar = rutaAvatar;
	}



	public Usuario (String nombre, String contrasenya) {
		this.nombre = nombre;
		this.contrasenya = contrasenya;
}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getContrasenya() {
		return contrasenya;
	}


	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}


	public String getTarjetaPago() {
		return tarjetaPago;
	}


	public void setTarjetaPago(String tarjetaPago) {
		this.tarjetaPago = tarjetaPago;
	}


	public String getRutaAvatar() {
		return rutaAvatar;
	}


	public void setRutaAvatar(String rutaAvatar) {
		this.rutaAvatar = rutaAvatar;
	}


	public List<Articulo> getCarro() {
		return carro;
	}


	public void setCarro(ArrayList<Articulo> carro) {
		this.carro = carro;
	}


	public List<Compra> getPedidos() {
		return pedidos;
	}


	public void setPedidos(ArrayList<Compra> pedidos) {
		this.pedidos = pedidos;
	}
	
	
}
