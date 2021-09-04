package br.com.treinaweb.twclientes.controller.request.form;

import br.com.treinaweb.twclientes.model.Cliente;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteForm {

    private Long id;

    private String nome;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dataNascimento;

    private String Profissao;

    public Cliente converter() {
        return new Cliente(this.getId(), this.getNome(), this.getDataNascimento(), this.getProfissao());
    }

}
