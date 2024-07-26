package br.com.giben.servicosgerais.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class servicogeraisController {
@GetMapping("/servicosgerais")
	public String servicosgerais() {
		return "/servicosgerais/servicosgerais";
	}
}