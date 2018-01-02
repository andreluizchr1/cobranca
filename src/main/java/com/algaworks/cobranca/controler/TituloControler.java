package com.algaworks.cobranca.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TituloControler {

	@RequestMapping("/titulos/novo")
	public String novo() {
		return "CadastroTitulo";
	}
}
