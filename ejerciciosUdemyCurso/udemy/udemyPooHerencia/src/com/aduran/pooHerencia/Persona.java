package com.aduran.pooHerencia;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private String correo;
	

	public Persona() {
		System.out.println("Persona inicilizando constructor...");
		
	}
	public Persona(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public Persona(String nombre, String apellido, int edad) {
		this(nombre,apellido);
		this.edad= edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ","
				+ " correo=" + correo
				+ " Saludo ="+ this.saludar();
	}
	
	public String saludar() {
		return "Hola Que tal";
	}
	
}
