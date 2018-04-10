
package br.senac.tad.dsw.Tadsstore.controller;

import br.senac.tads4.dsw.tadsstore.common.entity.Produto;
import br.senac.tads4.dsw.tadsstore.common.service.ProdutoService;
import br.senac.tads4.dsw.tadsstore.common.service.fakeimpl.ProdutoServiceFakeImpl;
import java.util.List;
import org.hibernate.validator.internal.util.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class ProdutoController {
    
    private ProdutoService service = new ProdutoServiceFakeImpl();
    
    @GetMapping
    public ModelAndView listar(){
        List<Produto> lista = service.listar(0, 100);
        
        return new ModelAndView("lista").addObject("resultado", lista);
    }
    
    @GetMapping("/{id}")
    public ModelAndView mostrarDetalhe(@PathVariable("id") Log id){
        Produto p = service.obter(id);
        return new ModelAndView("detalhe").addObject("prod", p);
    }
}
