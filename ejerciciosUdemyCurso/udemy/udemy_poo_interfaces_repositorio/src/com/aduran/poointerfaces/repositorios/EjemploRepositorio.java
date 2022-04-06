package com.aduran.poointerfaces.repositorios;

import java.util.List;

import com.aduran.poointerfaces.repositorios.modelo.ClienteListRepositorio;
import com.aduran.poointerfaces.repositorios.modelo.Direccion;

public class EjemploRepositorio {

	public static void main(String[] args) {
		
		FullRepositorioHerencias repo= new ClienteListRepositorio();
		
		repo.crear(new Cliente("Ander","Duran"));
		repo.crear(new Cliente("Lucas","Torreira"));
		repo.crear(new Cliente("Jenny","Solano"));
		repo.crear(new Cliente("Luis","Duran"));
		repo.crear(new Cliente("Zully","Lopez"));
		
		List<Cliente> clientes=repo.listar();
		for(Cliente cli:clientes) {
			System.out.println(cli);
		}
		System.out.println("===== Paginable =====");
		
		List<Cliente> paginable = repo.listar(1, 4);
		for(Cliente cli: paginable) {
			System.out.println(cli);
		}
		System.out.println("===== Ordenar =====");
		List<Cliente> clientesord = repo.listar("nombre", Direccion.DESC);
	for(Cliente clie: clientesord ) {
		System.out.println(clie);
	}
	System.out.println("===== Editar =====");
	
		Cliente luisAct = new  Cliente("Luis","Sepulveda");
		luisAct.setId(4);
		repo.editar(luisAct);
		Cliente luis= repo.porId(4);
		System.out.println(luis);
		
		System.out.println("===== Eliminar =====");
		
		repo.eliminar(1);
		repo.listar().forEach(System.out::println);// lambda del for each
		
		System.out.println("===== Total =====");
		System.out.println("Total Registros :"+ repo.total());
		
	}	
}

