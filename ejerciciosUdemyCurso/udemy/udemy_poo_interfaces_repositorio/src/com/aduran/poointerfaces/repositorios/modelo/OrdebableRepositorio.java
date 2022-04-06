package com.aduran.poointerfaces.repositorios.modelo;

import java.util.List;

import com.aduran.poointerfaces.repositorios.Cliente;

public interface OrdebableRepositorio {
	List<Cliente>listar(String campo,Direccion direccion);
	

}
