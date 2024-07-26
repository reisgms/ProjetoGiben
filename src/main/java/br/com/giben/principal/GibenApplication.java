package br.com.giben.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {
		"br.com.giben.pessoa.fisica.controller",
		"br.com.giben.index.controller",
		"br.com.giben.usuario.controller",
		"br.com.giben.servicoforeqpseg.controller",
		"br.com.giben.cadfornecedor.controller",
		"br.com.giben.contato.controller",
		"br.com.giben.testeprof.controller",	
		"br.com.giben.testeprof.controller",
		"br.com.giben.endereco.controller",
		"br.com.giben.servicosgerais.controller",
		"br.com.giben.contato.controller",
		"br.com.giben.editarperfil.controller",
		"br.com.giben.menu.controller",
		"br.com.giben.decoracao.controller",
		"br.com.giben.fornecedorsomiluminacao.controller",		
		"br.com.giben.preenchercontatos.controller",
		"br.com.giben.fornequipa.controller"
		})

public class GibenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GibenApplication.class, args);
		System.out.println("\n Sistema Giben iniciado com sucesso!!!");
	}
}