package com.aduran.poointerfaces.repositorios.modelo;

import java.util.List;

import com.aduran.poointerfaces.repositorios.Cliente;

public interface CrudRepositorio {
	
	List<Cliente> listar();
	Cliente porId(Integer id);
	void crear(Cliente cliente);
	void editar (Cliente cliente);
	void eliminar(Integer id);

}
