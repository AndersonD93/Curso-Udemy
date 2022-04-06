package com.aduran.pooHerencia;

public class Profesor extends Persona{
	
	private String asignatura;
	
	

	public Profesor() {
		super();
		System.out.println("Inicializando construtor profesor...");
	}
	
	public Profesor(String nombre, String apellido) {
		super(nombre,apellido);
	}
	
	public Profesor(String nombre, String apellido, String asignatura) {
		super(nombre,apellido);
		this.asignatura=asignatura;
	}
	

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nasignatura=" + asignatura;
	}

	@Override
	public String saludar() {
		return super.saludar()+" soy el profesor de la asignatura :"+ this.getAsignatura();
	}
	
	
	
	
}
