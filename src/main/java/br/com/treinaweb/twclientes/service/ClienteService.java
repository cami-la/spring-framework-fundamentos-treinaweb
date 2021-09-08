package br.com.treinaweb.twclientes.service;

import br.com.treinaweb.twclientes.controller.request.form.ClienteForm;
import br.com.treinaweb.twclientes.controller.response.dto.ClienteDto;
import br.com.treinaweb.twclientes.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<ClienteDto> listAll();

    ClienteDto detalhar(Long id) throws Exception;

    void excluir(Long id) throws Exception;

    Cliente save(ClienteForm clienteForm);

    Cliente update(Long id) throws Exception;

}
