package com.aduran.poointerfaces.repositorios;

import com.aduran.poointerfaces.repositorios.modelo.CrudRepositorio;
import com.aduran.poointerfaces.repositorios.modelo.OrdebableRepositorio;
import com.aduran.poointerfaces.repositorios.modelo.PaginableRepositorio;

public interface FullRepositorioHerencias extends OrdebableRepositorio, PaginableRepositorio, CrudRepositorio,ContableRepositorio {

}
