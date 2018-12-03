package br.edu.utfpr.pontoeletronico.ponto_eletronico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.User;
import br.edu.utfpr.pontoeletronico.ponto_eletronico.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	// private AcessRepository acessRepository;

	@RequestMapping("/a/usuarios")
	public ModelAndView listar() {

		ModelAndView mv = new ModelAndView("user");

		mv.addObject("users", userRepository.findAll());
		// mv.addObject("acess", acessRepository.findAll());

		mv.addObject(new User());
		// mv.addObject(new Acess());

		return mv;
	}

	@RequestMapping(value = "/a/usuarios", method = RequestMethod.POST)
	public String salvar(@Validated User user, Errors errors) {

		if (errors.hasErrors()) {
			return "redirect:/a/usuarios";
		}

		this.userRepository.save(user);

		return "redirect:/a/usuarios";
	}

	@RequestMapping("/a/usuarios/deletar/{id}")
	public String excluir(@PathVariable Long id) {

		this.userRepository.delete(id);

		return "redirect:/a/usuarios";
	}

	@RequestMapping("/a/usuarios/editar/{user}")
	public ModelAndView editar(@PathVariable User user) {

		ModelAndView mv = new ModelAndView("userEdit");

		mv.addObject(user);

		return mv;
	}

	@RequestMapping("/a/usuarios/alterar")
	public String editaralterar(@Validated User user) {

		User usernew = user;

		this.userRepository.delete(user.getId());

		this.userRepository.save(usernew);

		return "redirect:/a/usuarios";
	}
}
