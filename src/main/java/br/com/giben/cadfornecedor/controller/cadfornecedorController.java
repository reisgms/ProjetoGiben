package br.com.giben.cadfornecedor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cadfornecedorController {

	@GetMapping("/fornecedor")
	public String fornecedor() {
		return "/fornecedor/fornecedor.html";
	}
}
