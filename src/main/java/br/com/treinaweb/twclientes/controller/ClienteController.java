package br.com.treinaweb.twclientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.twclientes.service.ClienteService;

@RestController
@RequestMapping(value ="/")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("cliente/listar.html");

    

        return modelAndView;
    }
    
}
