package br.com.giben.professorgolbery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteProfController {
	@GetMapping("testeprof/teste")
	public String testar() {
		return "testeprof/teste.html";
	}
}
