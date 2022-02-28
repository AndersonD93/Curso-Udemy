package com.aduran.appfacturas.modelo;

public class Producto {

	private int codigo;
	private String nombre;
	private int precio;
	private static int ultimoCodigo;
	
	
	public Producto() {
		this.codigo=++ultimoCodigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	@Override
	public String toString() {
		return codigo+ 
				"\t" + nombre + 
				"\t" + precio ;
	}
	
}
