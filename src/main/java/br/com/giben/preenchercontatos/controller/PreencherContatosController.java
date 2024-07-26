package br.com.giben.preenchercontatos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PreencherContatosController {
	
	@GetMapping("/preenchercontatos")
	public String preenchercontatos() {
		return "/preenchercontatos/preenchercontatos.html";
	}

}
