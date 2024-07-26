package br.com.giben.usuario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class UsuarioController {
	@GetMapping("/usuario")
	public String usuario() {
		return "/usuario/usuario";
	}

}
