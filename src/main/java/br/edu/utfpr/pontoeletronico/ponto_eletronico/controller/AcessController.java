package br.edu.utfpr.pontoeletronico.ponto_eletronico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.Acess;
import br.edu.utfpr.pontoeletronico.ponto_eletronico.repository.AcessRepository;

@Controller
public class AcessController {

	@Autowired
	private AcessRepository acessRepository;

	@RequestMapping("/a/niveis-de-acesso")
	public ModelAndView listar() {

		ModelAndView mv = new ModelAndView("acess");

		mv.addObject("acesss", acessRepository.findAll());

		mv.addObject(new Acess());

		return mv;
	}

	@RequestMapping(value = "/a/niveis-de-acesso", method = RequestMethod.POST)
	public String salvar(@Validated Acess acess, Errors errors) {

		if (errors.hasErrors()) {
			return "redirect:/a/niveis-de-acesso";
		}

		this.acessRepository.save(acess);

		return "redirect:/a/niveis-de-acesso";
	}

	@RequestMapping("/a/niveis-de-acesso/deletar/{id}")
	public String excluir(@PathVariable Long id) {

		this.acessRepository.delete(id);

		return "redirect:/a/niveis-de-acesso";
	}

	@RequestMapping("/a/niveis-de-acesso/editar/{acess}")
	public ModelAndView editar(@PathVariable Acess acess) {

		ModelAndView mv = new ModelAndView("acessEdit");

		mv.addObject(acess);

		return mv;
	}

	@RequestMapping("/a/niveis-de-acesso/alterar")
	public String editaralterar(@Validated Acess acess) {

		Acess acessNew = acess;

		this.acessRepository.delete(acess.getId());

		this.acessRepository.save(acessNew);

		return "redirect:/a/niveis-de-acesso";
	}
}
