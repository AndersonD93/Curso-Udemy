package com.aduran.pooclasesabstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

import com.aduran.pooclasesabstractas.form.validador.Validador;

abstract public class ElementosForm {
	
	protected String valor;
	protected String nombre;
	
	private List<Validador> validadores;
	private List<String>errores;

	public ElementosForm() {
		this.validadores= new ArrayList<Validador>();
		this.errores= new ArrayList<String>();
	}

	public ElementosForm(String nombre) {
		this();
		this.nombre = nombre;
	}
	public ElementosForm addValidador(Validador validador) {
		this.validadores.add(validador);
		return this;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	public List<String> getErrores() {
		return errores;
	}
	
	public boolean esValido() {
		for (Validador v: validadores) {
			if (!v.esValido(this.valor)) {
				this.errores.add(v.getMensaje());
			}
		}return this.errores.size()==0;
	}
	
	abstract public String dibujarHtml();

	
	
}

