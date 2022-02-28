package com.aduran.app.jardin;


import com.aduran.app.hogar.Persona;
//importo todos los metodos y atributos estaticos
import static com.aduran.app.hogar.Persona.*;

import static com.aduran.app.hogar.ColorPelo.*;

//importo de forma individual los metodos y atributos
/*import static com.aduran.app.hogar.Persona.saludar;
import static com.aduran.app.hogar.Persona.GENERO_FEMENINO;
import static com.aduran.app.hogar.Persona.GENERO_MASCULINO;*/

public class EjemploPaquetes {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		persona.setNombre("Johao");
		System.out.println(persona.getNombre());
		persona.setColorpelo(NEGRO);
		
		Perro perro = new Perro();
		perro.nombre="Lucas Torreira";
		perro.raza="Cocker";
				
		String jugando = perro.jugar(persona);
		System.out.println("El perro "+perro.nombre+" Jugando ="+ jugando+ " con "+persona.getNombre());
		
		String saludo= saludar();
		System.out.println(saludo);
		
		String generoMujer= GENERO_FEMENINO;
		String generoMasculino= GENERO_MASCULINO;
		System.out.println(generoMujer);
		System.out.println(generoMasculino);
	}

}
