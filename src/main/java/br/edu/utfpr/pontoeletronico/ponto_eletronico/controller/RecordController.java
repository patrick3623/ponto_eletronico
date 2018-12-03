package br.edu.utfpr.pontoeletronico.ponto_eletronico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.Record;
import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.User;
import br.edu.utfpr.pontoeletronico.ponto_eletronico.repository.RecordRepository;
import br.edu.utfpr.pontoeletronico.ponto_eletronico.repository.UserRepository;

@Controller
public class RecordController {

	@Autowired
	private RecordRepository recordRepository;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/u/registros")
	public ModelAndView listar() {

		ModelAndView mv = new ModelAndView("record");

		mv.addObject("records", recordRepository.findAll());
		mv.addObject("users", userRepository.findAll());

		mv.addObject(new Record());
		mv.addObject(new User());

		return mv;
	}

	@RequestMapping(value = "/u/registros", method = RequestMethod.POST)
	public String salvar(@Validated Record record, Errors errors) {

		if (errors.hasErrors()) {
			return "redirect:/u/registros";
		}

		this.recordRepository.save(record);

		return "redirect:/u/registros";
	}

	@RequestMapping("/u/registros/deletar/{id}")
	public String excluir(@PathVariable Long id) {

		this.recordRepository.delete(id);

		return "redirect:/u/registros";
	}

	@RequestMapping("/u/registros/editar/{record}")
	public ModelAndView editar(@PathVariable Record record) {

		ModelAndView mv = new ModelAndView("recordEdit");

		mv.addObject(record);

		return mv;
	}

	@RequestMapping("/u/registros/alterar")
	public String editaralterar(@Validated Record record) {

		Record recordnew = record;

		this.recordRepository.delete(record.getId());

		this.recordRepository.save(recordnew);

		return "redirect:/u/registros";
	}
}
