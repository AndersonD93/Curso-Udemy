package com.aduran.pooHerencia;

public class AlumnoInternacional extends Alumno{

	private String pais;
	private double notaIdiomas;
	
	
	
	public AlumnoInternacional() {
		super();
		System.out.println("Inicializando constructor Alumno internacional...");
	}
	
	public AlumnoInternacional(String nombre, String apellido) {
		super(nombre,apellido);
	}
	
	public AlumnoInternacional(String nombre, String apellido, String palis) {
		super(nombre,apellido);
		this.pais=palis;
	}
	
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public double getNotaIdiomas() {
		return notaIdiomas;
	}
	public void setNotaIdiomas(double notaIdiomas) {
		this.notaIdiomas = notaIdiomas;
	}
	@Override
	public String toString() {
		return super.toString()+"\npais=" + pais + ", notaIdiomas=" + notaIdiomas;
	}

	@Override
	public String saludar() {
		return super.saludar()+"soy alumno internacional y mi pais es :"+ this.getPais();
	}

	@Override
	public double calcularPromedio() {
		System.out.println("calcularPromedio "+ AlumnoInternacional.class.getCanonicalName());
		return ((super.calcularPromedio()*3)+this.notaIdiomas)/4;
	}
	
	
	
}
