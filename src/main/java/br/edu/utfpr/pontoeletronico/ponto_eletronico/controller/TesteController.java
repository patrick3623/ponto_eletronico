package br.edu.utfpr.pontoeletronico.ponto_eletronico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TesteController {

	@RequestMapping("/principal")
	public ModelAndView listar() {

		ModelAndView mv = new ModelAndView("/template");

		return mv;
	}

}
