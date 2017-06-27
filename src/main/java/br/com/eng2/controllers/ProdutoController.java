package br.com.eng2.controllers;

import br.com.eng2.entities.Produto;
import br.com.eng2.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProdutoController {

    private ProdutoService produtoService;

    @Autowired
    public void setProdutoService(ProdutoService produtoService) {
        this.produtoService = produtoService;

    }

    @RequestMapping(value = "/produtos", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("Produtos", produtoService.listarProdutos());
        System.out.println("Retorna produtos:");
        return "produtos";
    }

    @RequestMapping("produto/{id}")
    public String showProduto(@PathVariable Integer id, Model model) {
        model.addAttribute("produto", produtoService.getProdutoById(id));
        return "produtoshow";
    }

    @RequestMapping("produto/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("produto", produtoService.getProdutoById(id));
        return "produtoform";
    }

    @RequestMapping("produto/novo")
    public String novoProduto(Model model) {
        model.addAttribute("produto", new Produto());
        return "produtoform";
    }

    @RequestMapping(value = "produto", method = RequestMethod.POST)
    public String salvarProduto(Produto produto) {
        produtoService.salvarProduto(produto);
        return "redirect:/produto/" + produto.getId();
    }

    @RequestMapping("produto/deletar/id")
    public String deletar(@PathVariable Integer id) {
        produtoService.deletarProduto(id);
        return "redirect:/produtos";
    }
}
