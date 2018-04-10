/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tad.dsw.Tadsstore.controller;

import br.senac.tads4.dsw.tadsstore.common.entity.Produto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author vinicius.vsilva8
 */
@Controller
@RequestMapping("/carrinho")
@Scope("session")
public class CarrinhoController implements Serializable{
    
    private List<Produto> produtosAdicionados = new ArrayList<>();
    
    public List<Produto> getProdutosAdicionados(){
        return ProdutosAdicionados;
    }
    
    @GetMapping
        public ModelAndView mostrarCarrinho(){
        return new ModelAndView("carrinho");
    }
        
@PostMapping("/(id)")
public ModelAndView adicionaProduto(@PathVariable("id") Long id, RedirectAttributes redirectAttributes){
    Produto p service.obter(id);
    produtosAdicionados.add(p);

}
    
}
