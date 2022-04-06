package com.aduran.pooclasesabstractas.form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aduran.pooclasesabstractas.form.elementos.*;
import com.aduran.pooclasesabstractas.form.elementos.select.Opcion;
import com.aduran.pooclasesabstractas.form.validador.EmailValidador;
import com.aduran.pooclasesabstractas.form.validador.LargoValidador;
import com.aduran.pooclasesabstractas.form.validador.NoNuloValidador;
import com.aduran.pooclasesabstractas.form.validador.NumeroValidador;
import com.aduran.pooclasesabstractas.form.validador.RequeridoValidador;


public class EjemploFormMain {

	public static void main(String[] args) {
		
		InputForm username= new InputForm("username");
		username.addValidador(new RequeridoValidador());
		
		InputForm password= new InputForm("username","password");
		password.addValidador(new RequeridoValidador());
		password.addValidador(new LargoValidador(6,12));
		
		InputForm email= new InputForm("email","email");
		email.addValidador(new RequeridoValidador());
		email.addValidador(new EmailValidador());
		
		InputForm edad= new InputForm("edad","number");
		edad.addValidador(new NumeroValidador());
		
		
		TextAreaForm experiencia = new TextAreaForm("experiencia",9,5);
		
		SelectForm lenguaje = new SelectForm("Lenguaje");
		lenguaje.addValidador(new NoNuloValidador());
		
		Opcion java = new Opcion("1","Java");
		lenguaje.addOpcion(java)
		.addOpcion(new Opcion("2","Python").setSelected())
		.addOpcion(new Opcion("3","JavaScript"))
		.addOpcion(new Opcion("4","PHP"))
		.addOpcion(new Opcion("5","TypeScript"));
		
		ElementosForm saludar = new ElementosForm("saludo") {
			
			@Override
			public String dibujarHtml() {
				return "<input disabled name=>'"+this.nombre+"+' value=\""+this.valor+"\">";
			}
		};
		saludar.setValor("Hola, este campo se encuentra desabilitado");
		username.setValor("");
		password.setValor("1234");
		email.setValor("jhon.doe@correo.com");
		edad.setValor("28");
		experiencia.setValor("Mas de 10 años de experiencia...");
		java.setSelected(true);
		
		List<ElementosForm> elementos = Arrays.asList(username,
				password,
				experiencia,
				email,
				edad,
				lenguaje,
				saludar);
		
		/*for(ElementosForm ef : elementos) {
			System.out.println(ef.dibujarHtml());
			System.out.println("<br>");
		};*/
		
		//Iterar por medio de expresión lambda
		elementos.forEach(ef ->{
			System.out.println(ef.dibujarHtml());
			System.out.println("<br>");
		});
		
		elementos.forEach(ef ->{
			if(!ef.esValido()) {
				ef.getErrores().forEach(err ->System.out.println(err)
				);
			}
		});
	}

}
