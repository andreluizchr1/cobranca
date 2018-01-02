package com.algaworks.cobranca.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.cobranca.model.Titulo;
import com.algaworks.cobranca.repository.Titulos;

@Controller
@RequestMapping("/titulos")
public class TituloControler {

	@Autowired
	private Titulos titulos;

	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo) {
		System.out.println(">>>>" + titulo.getDescricao());
		titulos.save(titulo);
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("mensagem", "Titulo salvo com sucesso!");
		return mv;
	}
}
