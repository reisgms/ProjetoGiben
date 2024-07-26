package br.com.giben.fornequipa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.giben.fornequipa.model.FornEquipa;



@Controller
public class FornEquipaController {

	@GetMapping("/fornequipa/equipamentos")
	public String equipamentos(Model model) {
		model.addAttribute("fornEquipa", new FornEquipa());	    
		return "fornequipa/fornequipa.html";
	}
	
	@PostMapping("/fornequipa/salvar")
	public String salvar(@ModelAttribute FornEquipa fornEquipa, Model model) {
		model.addAttribute("fornEquipa", fornEquipa);
		System.out.println("Equipamentos de gravação:"+fornEquipa.getNomeitemservico());
		
		return "fornequipa/fornequipa.html";
	}

}
