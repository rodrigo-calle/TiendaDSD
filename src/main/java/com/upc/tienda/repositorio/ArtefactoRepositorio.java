package com.upc.tienda.repositorio;

import com.upc.tienda.entidades.Artefacto;
import org.springframework.data.repository.CrudRepository;
//agnostico
public interface ArtefactoRepositorio extends CrudRepository<Artefacto, Long> {
}
