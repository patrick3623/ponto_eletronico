package br.edu.utfpr.pontoeletronico.ponto_eletronico.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.User;
import br.edu.utfpr.pontoeletronico.ponto_eletronico.service.UserService;

@Controller
public class UserController {
		
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public ModelAndView findAll() {
		
		ModelAndView mv = new ModelAndView("/user");
		mv.addObject("users", service.findAll());
		
		return mv;
	}
	
	@GetMapping("/add")
	public ModelAndView add(User user) {
		
		ModelAndView mv = new ModelAndView("/userAdd");
		mv.addObject("user", user);
		
		return mv;
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		
		return add(service.findOne(id));
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		
		return findAll();
	}

	@PostMapping("/save")
	public ModelAndView save(@Valid User user, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(user);
		}
		
		service.save(user);
		
		return findAll();
	}
}
