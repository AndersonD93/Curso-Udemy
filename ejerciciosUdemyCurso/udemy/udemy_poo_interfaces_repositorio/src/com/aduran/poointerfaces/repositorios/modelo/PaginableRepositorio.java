package com.aduran.poointerfaces.repositorios.modelo;

import java.util.List;

import com.aduran.poointerfaces.repositorios.Cliente;

public interface PaginableRepositorio {
	
	List<Cliente> listar(int desde, int hasta);

}
