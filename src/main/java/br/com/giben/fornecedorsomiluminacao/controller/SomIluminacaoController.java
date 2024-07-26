package br.com.giben.fornecedorsomiluminacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SomIluminacaoController {
	@GetMapping("/fsomiluminacao")
	public String fornecedor() {
		return "fornecedorsomeiluminacao/fornecedorsomiluminacao.html";

	}

}
