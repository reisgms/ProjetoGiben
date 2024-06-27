package br.com.giben.pessoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/fisica")
public class Fisica {
	@GetMapping ("/fisica")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		//return String.format("Hello %s!", name);
		return "home/teste";
	}
}
