package br.com.giben.decoracao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DecoracaoController {
	@GetMapping("/decoracao")
	public String decoracao() {
		return "/decoracao/decoracao.html";
	}
}
