package com.aduran.ejemplo;

import com.aduran.pooHerencia.*;

public class EjemploHerencia {

	public static void main(String[] args) {

		Alumno alumno= new Alumno();
		Profesor profesor= new Profesor();
		AlumnoInternacional aluin=new AlumnoInternacional();

		System.out.println("===Creando la instancia de la clase Alumno=====");
		alumno.setNombre("Anderson");
		alumno.setApellido("Duran");
		alumno.setInstitucion("Serrano");
		alumno.setNotaLenguaje(7.5);
		alumno.setNotaHistoria(6.3);
		alumno.setNotaMatematica(9.2);
	
		System.out.println("===Creando la instancia de la clase Profesor=====");  
		profesor.setNombre("Luis");
		profesor.setApellido("Duran");
		profesor.setAsignatura("Poo");
		
		
		System.out.println("===Creando la instancia de la clase Alumno Internacional=====");  
		aluin.setNombre("elois");
		aluin.setApellido("dao");
		aluin.setPais("UK");
		aluin.setEdad(0);
		aluin.setNotaHistoria(8.2);
		aluin.setNotaIdiomas(7.5);
		aluin.setNotaMatematica(8.2);
		aluin.setNotaLenguaje(6.3);
		
		
		
		System.out.println(profesor);
		System.out.println("\n "+alumno);
		System.out.println("\n "+aluin);
		
		
		System.out.println("================");
		
		Class clase =aluin.getClass();
		while (clase.getSuperclass()!=null) {
			String hija= clase.getName();
			String padre=clase.getSuperclass().getName();
			System.out.println(hija+" es una clase hija de la clase padre:  "+padre);
			clase= clase.getSuperclass();
		}
	}

}
