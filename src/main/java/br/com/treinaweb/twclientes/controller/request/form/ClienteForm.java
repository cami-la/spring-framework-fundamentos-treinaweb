package br.com.treinaweb.twclientes.controller.request.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ClienteForm {

    private Long id;

    private String nome;

    private LocalDate dataNascimento;

    private LocalDate Profissao;

}
