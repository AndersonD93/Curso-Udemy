package com.aduran.poointerfaces.repositorios.modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.aduran.poointerfaces.repositorios.Cliente;
import com.aduran.poointerfaces.repositorios.FullRepositorioHerencias;

public class ClienteListRepositorio implements FullRepositorioHerencias {
	
	private List<Cliente> dataSource;
	
	
	
	public ClienteListRepositorio() {
		this.dataSource= new ArrayList<Cliente>();
	}

	@Override
	public List<Cliente> listar() {
		return dataSource;
	}

	@Override
	public Cliente porId(Integer id) {
		Cliente resultado = null;
		for(Cliente cli: dataSource) {
			if(cli.getId()!=null && cli.getId().equals(id)) {
				resultado=cli;
				break;
			}
		}
		return resultado;
	}

	@Override
	public void crear(Cliente cliente) {
		this.dataSource.add(cliente);
	}

	@Override
	public void editar(Cliente cliente) {
		Cliente clie= this.porId(cliente.getId());
		clie.setNombre(cliente.getNombre());
		clie.setApellido(cliente.getApellido());
	}

	@Override
	public void eliminar(Integer id) {
		Cliente clie = this.porId(id);
		this.dataSource.remove(clie);
	}

	@Override
	public List<Cliente> listar(String campo, Direccion direccion) {
		List<Cliente> listaOrdenada= new ArrayList<Cliente>(this.dataSource);
		listaOrdenada.sort(new Comparator<Cliente>(){
			@Override
			public int compare(Cliente a, Cliente b) {
				int resultado=0;
				if(direccion== Direccion.ASC) {
					resultado=this.ordenar(a,b);
				}
				else if (direccion== Direccion.DESC) {		
					resultado=this.ordenar(b,a);
				}
				return resultado;
			}	
				private int ordenar(Cliente a, Cliente b) {
				int resultado=0;
				switch (campo) {
				case "id":
					resultado= a.getId().compareTo(b.getId());
					break;
				case "nombre":
					resultado=a.getNombre().compareTo(b.getNombre());
					break;
				case "apellido":
					resultado= a.getApellido().compareTo(b.getApellido());
					break;
			}
				return resultado;
				}
			
				});
		
		return listaOrdenada;
	}

	@Override
	public List<Cliente> listar(int desde, int hasta) {
		return dataSource.subList(desde, hasta);
	}

	@Override
	public int total() {
		return this.dataSource.size();
	}

}
