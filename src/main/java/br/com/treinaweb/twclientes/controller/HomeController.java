package br.com.treinaweb.twclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("boasVindas", "Bem-vindo o curso de Spring com Thymeleaf");

        List<String> aulas = Arrays.asList(
                "Aula 01 - Introdução",
                "Aula 02 - Template Engines",
                "Aula 03 - Arquivos Estáticos",
                "Aula 04 - Exibindo Informações"
        );

        modelAndView.addObject("aulas", aulas);

        return modelAndView;
    }

    @GetMapping("/mensagem")
    public ModelAndView mensagem(ModelMap modelMap) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("mensagem");
        modelAndView.addObject("mensagem", "Mensagem vinda do Servidor!");

        return modelAndView;
    }

    @GetMapping("/saudacao")
    public ModelAndView saudacao(
        @RequestParam(required = false, defaultValue ="TreinaWeb") String nome ) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("saudacao");
        modelAndView.addObject("nome", nome);
        return modelAndView;
    }
}
