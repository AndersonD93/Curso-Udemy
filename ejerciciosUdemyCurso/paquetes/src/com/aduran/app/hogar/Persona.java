package com.aduran.app.hogar;

public class Persona {

 private String nombre;
 private String apellido;
 private ColorPelo colorpelo;

public static final String GENERO_MASCULINO= "Masculino";
public static final String GENERO_FEMENINO= "Femenino";
 
 
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
 
public ColorPelo getColorpelo() {
	return colorpelo;
}
public void setColorpelo(ColorPelo colorpelo) {
	this.colorpelo = colorpelo;
}
public String lanzarPelota () {
	return "Se lanza pelota...";
}

public static String saludar() {
	return "saludando";
}
}
