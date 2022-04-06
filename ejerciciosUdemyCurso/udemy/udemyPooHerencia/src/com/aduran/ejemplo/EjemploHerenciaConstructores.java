package com.aduran.ejemplo;

import com.aduran.pooHerencia.*;

public class EjemploHerenciaConstructores {

	public static void main(String[] args) {

		Alumno alumno= new Alumno("Anderson","Duran",28,"Serrano");
		Profesor profesor= new Profesor("elois","dao","Poo");
		AlumnoInternacional aluin=new AlumnoInternacional("Luis","Duran","Australia");

		System.out.println("===Creando la instancia de la clase Alumno=====");
		alumno.setNotaLenguaje(9.5);
		alumno.setNotaHistoria(9.3);
		alumno.setNotaMatematica(9.2);
		alumno.setCorreo(alumno.getNombre()+"@lucastorreia.org");
	
		System.out.println("===Creando la instancia de la clase Profesor=====");  
		profesor.setEdad(38);
		
		
		System.out.println("===Creando la instancia de la clase Alumno Internacional=====");  
		aluin.setEdad(15);
		aluin.setInstitucion("Harvard");
		aluin.setNotaHistoria(8.2);
		aluin.setNotaIdiomas(7.5);
		aluin.setNotaMatematica(8.2);
		aluin.setNotaLenguaje(6.3);
		
		imprimir(aluin);
		imprimir(alumno);
		//imprimir(profesor);
		
		
	}
	
	public static void imprimir (Persona persona) {
		System.out.println(persona.toString());
		
		if (persona.getClass().getCanonicalName()=="com.aduran.pooHerencia.Alumno") {
			System.out.println("-------Imprimiendo datos de Alumno Criollo Ejemplo Instanceof---------");
			System.out.println("Institucion Alumno criollo : "+ ((Alumno)persona).getInstitucion());
			System.out.println("El promedio del criollo es :"+ ((Alumno)persona).calcularPromedio());
		}
		
		if (persona.getClass().getCanonicalName()=="com.aduran.pooHerencia.AlumnoInternacional") {
			System.out.println("-------Imprimiendo datos de Alumno Internacional Ejemplo Instanceof---------");
			System.out.println("Nota Matematica Alumno Internacional :"+((AlumnoInternacional)persona).getPais());
			System.out.println("El promedio del internacional es :"+ ((AlumnoInternacional)persona).calcularPromedio());
		}
		
		if (persona instanceof Profesor) {
			System.out.println("Asignatura del profe es :"+((Profesor)persona).getAsignatura());
		}
				
		System.out.println("================Sobre escritura del metodo saludar===============");
		System.out.println(persona.saludar());
		System.out.println("================");
		
	}

}
