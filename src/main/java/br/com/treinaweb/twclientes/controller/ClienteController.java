package br.com.treinaweb.twclientes.controller;

import br.com.treinaweb.twclientes.controller.response.dto.ClienteDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.twclientes.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteController {

    private ClienteService clienteService;

    @GetMapping
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("cliente/listar.html");

        List<ClienteDto> clientes = clienteService.listAll();

        modelAndView.addObject("clientes", clientes);

        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView detalhar(@PathVariable Long id) throws Throwable {
        ModelAndView modelAndView = new ModelAndView("cliente/detalhar.html");

        modelAndView.addObject("cliente", clienteService.detalhar(id));

        return modelAndView;
    }

    @GetMapping("/{id}/excluir")
    public ModelAndView excluir(@PathVariable Long id) throws Exception {
        ModelAndView modelAndView = new ModelAndView("redirect:/cliente");

        clienteService.excluir(id);

        return modelAndView;
    }

    
}
