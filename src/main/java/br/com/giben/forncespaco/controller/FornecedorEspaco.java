package br.com.giben.forncespaco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FornecedorEspaco {
	@GetMapping("/cadservicofornecedoresdeespaco")
	public String cadservicofornecedoresdeespaco() {
		return "/FornEspaco/cadservicofornecedoresdeespaco";
	}

}
