package com.aduran.app.hogar;

import com.aduran.app.jardin.Perro;
import static com.aduran.app.hogar.Persona.saludar;

public class EjemploHogar {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		Perro perro= new Perro();
		
		String saludo = persona.saludar();
		
		System.out.println(saludo);
	}

}
