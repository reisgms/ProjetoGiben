package br.com.giben.editarperfil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EditarPerfilController {
	@GetMapping ("/editarperfil")
	public String index() {
		return "editarperfil/editarperfil";
	}
}