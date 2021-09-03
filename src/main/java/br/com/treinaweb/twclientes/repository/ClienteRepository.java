package br.com.treinaweb.twclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.treinaweb.twclientes.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    

}
