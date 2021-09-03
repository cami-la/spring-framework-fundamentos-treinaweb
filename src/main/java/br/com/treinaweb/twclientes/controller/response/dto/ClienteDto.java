package br.com.treinaweb.twclientes.controller.response.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.treinaweb.twclientes.model.Cliente;

public class ClienteDto {

    private Long id;

    private String nome;

    private LocalDate dataNascimento;

    private String profissao;

    public ClienteDto(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.dataNascimento = cliente.getDataNascimento();
        this.profissao = cliente.getProfissao();

    }

    public static List<ClienteDto> converter (List<Cliente> clientes) {
        return clientes.stream().map(ClienteDto::new).collect(Collectors.toList());
    }

    public ClienteDto() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    
}
