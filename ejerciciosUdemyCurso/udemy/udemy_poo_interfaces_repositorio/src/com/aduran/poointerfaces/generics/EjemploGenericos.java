package com.aduran.poointerfaces.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aduran.poointerfaces.repositorios.Cliente;

public class EjemploGenericos {

	public static void main(String[] args) {
		
		List<Cliente> clientes= new ArrayList<>();
		clientes.add(new Cliente("Anderson", "Duran"));
		
		Cliente johao = clientes.iterator().next();
		
		
	}
	
	public static List<Cliente> fromArrayToList(Cliente[]clientes){
		return Arrays.asList(clientes);
	}

}
