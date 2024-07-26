package br.com.giben.tiposegmento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class SegmentoFornecedores {
	@GetMapping("/cadsegmentodefornecedores")
	public String cadsegmentodefornecedores() {
		return "/tiposegmento/cadsegmentodefornecedores";
	}
}
