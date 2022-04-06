package com.aduran.pooHerencia;

public class Alumno extends Persona{
	
	private String institucion;
	private double notaMatematica;
	private double notaLenguaje;
	private double notaHistoria;
	
	public Alumno() {
		System.out.println("Incializando constructor Alumno...");
	}
	public Alumno(String nombre, String apellido) {
		super(nombre,apellido);
	}
	
	public Alumno(String nombre, String apellido, int edad) {
		super(nombre,apellido,edad);
	}
	
	public Alumno(String nombre, String apellido, int edad,String institucion) {
		super(nombre,apellido,edad);
		this.institucion=institucion;
	}
	
	public Alumno(String nombre, String apellido, 
			int edad,String institucion, double notaMatematica, double notaLenguaje
			,double notaHistoria) {
		this(nombre,apellido,edad,institucion);
		this.institucion=institucion;
		this.notaHistoria= notaHistoria;
		this.notaLenguaje= notaLenguaje;
		this.notaMatematica= notaMatematica;
	}
	
	
	
	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public double getNotaLenguaje() {
		return notaLenguaje;
	}
	public void setNotaLenguaje(double notaLenguaje) {
		this.notaLenguaje = notaLenguaje;
	}
	public double getNotaHistoria() {
		return notaHistoria;
	}
	public void setNotaHistoria(double notaHistoria) {
		this.notaHistoria = notaHistoria;
	}
	@Override
	public String toString() {
		return super.toString()+"\ninstitucion=" + institucion + ", notaMatematica=" + notaMatematica + ", notaLenguaje="
				+ notaLenguaje + ", notaHistoria=" + notaHistoria 
				+ "promedio ="+ this.calcularPromedio();
	}
	
	@Override
	public String saludar() {
		return super.saludar()+ " mi nombre es:"+ this.getNombre();
	}
	
	public double calcularPromedio() {
		System.out.println("calcularPromedio "+ Alumno.class.getCanonicalName());
		return (this.notaHistoria+this.notaLenguaje+this.notaMatematica)/3;
	}
}
