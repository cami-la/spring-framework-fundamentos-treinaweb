package br.com.treinaweb.twclientes.controller;

import br.com.treinaweb.twclientes.controller.request.form.ClienteForm;
import br.com.treinaweb.twclientes.controller.response.dto.ClienteDto;
import br.com.treinaweb.twclientes.model.Cliente;
import br.com.treinaweb.twclientes.service.ClienteServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/cliente")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteController {

    private ClienteServiceImpl clienteServiceImpl;

    @GetMapping
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("cliente/listar");

        List<ClienteDto> clientes = clienteServiceImpl.listAll();

        modelAndView.addObject("clientes", clientes);

        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView detalhar(@PathVariable Long id) throws Throwable {
        ModelAndView modelAndView = new ModelAndView("cliente/detalhar");

        modelAndView.addObject("cliente", clienteServiceImpl.detalhar(id));

        return modelAndView;
    }

    @GetMapping("/{id}/excluir")
    public ModelAndView excluir(@PathVariable Long id) throws Exception {
        ModelAndView modelAndView = new ModelAndView("redirect:/cliente");

        clienteServiceImpl.excluir(id);

        return modelAndView;
    }

    @GetMapping("/cadastrar")
    public ModelAndView cadastrar() {
        ModelAndView modelAndView = new ModelAndView("cliente/formulario");

        modelAndView.addObject("cliente", new ClienteForm());

        return modelAndView;
    }

    @PostMapping("/cadastrar")
    public ModelAndView cadastrar(ClienteForm clienteForm) {
        ModelAndView modelAndView = new ModelAndView("redirect:/cliente");

        clienteServiceImpl.save(clienteForm);

        return modelAndView;
    }

    @GetMapping("/{id}/editar")
    public ModelAndView update(@PathVariable Long id) throws Exception {
        ModelAndView modelAndView = new ModelAndView("cliente/formulario");

        Cliente cliente = clienteServiceImpl.getClienteByid(id);

        modelAndView.addObject("cliente", cliente);

        return modelAndView;
    }

    @PostMapping("/{id}/editar")
    public ModelAndView update(ClienteForm clienteForm) {
        ModelAndView modelAndView = new ModelAndView("redirect:/cliente");

        clienteServiceImpl.save(clienteForm);

        return modelAndView;
    }
    
}
