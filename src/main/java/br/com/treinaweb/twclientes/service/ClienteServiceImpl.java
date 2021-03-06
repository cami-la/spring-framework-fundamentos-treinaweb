package br.com.treinaweb.twclientes.service;

import java.util.List;
import java.util.Optional;

import br.com.treinaweb.twclientes.controller.request.form.ClienteForm;
import br.com.treinaweb.twclientes.model.Cliente;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.treinaweb.twclientes.repository.ClienteRepository;

import br.com.treinaweb.twclientes.controller.response.dto.ClienteDto;

import javax.swing.*;


@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository clienteRepository;

    public List<ClienteDto> listAll() {
        List<Cliente> list = clienteRepository.findAll();
        return ClienteDto.converter(list);
    }

    public ClienteDto detalhar(Long id) throws Exception {
        Cliente clienteByid = getClienteByid(id);

        return new ClienteDto(clienteByid);
    }

    public void excluir(Long id) throws Exception {
        Cliente clienteByid = getClienteByid(id);

        clienteRepository.delete(clienteByid);
    }

    public Cliente save(ClienteForm clienteForm) {
        return clienteRepository.save(clienteForm.converter());
    }

    public Cliente update(Long id) throws Exception {
        Cliente clienteByid = getClienteByid(id);

        return clienteByid;
    }

    public Cliente getClienteByid(Long id) throws Exception {
        Optional<Cliente> clienteRepositoryById = clienteRepository.findById(id);
        if (clienteRepositoryById.isPresent())
            return clienteRepositoryById.get();
        throw new Exception();
    }
}
