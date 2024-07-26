package br.com.giben.servicoforeqpseg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class ServicoforeqpsegController {
	@GetMapping("/servicoforneqpseg")
	public String servicoforneqpseg() {
		return "/servicoforneqpseg/servicoforneqpseg";
	}
}
