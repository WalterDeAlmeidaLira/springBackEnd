package br.com.projeto.api.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.Cliente;



@Repository
public interface Repositorio extends CrudRepository<Cliente,Long> {
    public Cliente findByCodigo(long codigo);
}
