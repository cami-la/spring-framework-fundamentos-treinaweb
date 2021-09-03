package br.com.treinaweb.twclientes.service;

import java.util.List;

import br.com.treinaweb.twclientes.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treinaweb.twclientes.repository.ClienteRepository;

import br.com.treinaweb.twclientes.controller.response.dto.ClienteDto;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public List<ClienteDto> listAll() {
        List<Cliente> list = clienteRepository.findAll();
        return ClienteDto.converter(list);
    }

    
    
}
