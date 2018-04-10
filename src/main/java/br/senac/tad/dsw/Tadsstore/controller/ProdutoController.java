
package br.senac.tad.dsw.Tadsstore.controller;

import org.springframework.web.servlet.ModelAndView;

public class ProdutoController {
    public ModelAndView listar(){
        return new ModelAndView("lista");
    }
    
    public ModelAndView mostrarDetalhe(){
        return new ModelAndView("detalhe");
    }
}
