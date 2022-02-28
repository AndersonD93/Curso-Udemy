package com.aduran.app.jardin;

import com.aduran.app.hogar.Persona;

public class Perro {
	
	protected String nombre;
	protected String raza;
	
	String jugar(Persona persona) {
		return persona.lanzarPelota();
	}
}
