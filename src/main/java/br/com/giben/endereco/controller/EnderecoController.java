package br.com.giben.endereco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.giben.endereco.model.*;
@Controller
public class EnderecoController {
	
	@GetMapping("/endereco")
	public String endereco(Model model) {
		model.addAttribute("endereco", new Endereco());
		return "/endereco/endereco.html";
	}
	
	@PostMapping("/endereco/salvar")
	public String salvarendereco(@ModelAttribute Endereco endereco, Model model) {
		model.addAttribute("endereco", endereco);
		System.out.println("O endereço é: rua xxx "
		+ endereco.getNumero() + ",  " 
		+ endereco.getCep() + "-"
		+ endereco.getComplemento());
		
		return "/endereco/endereco.html";
		
	}
}
