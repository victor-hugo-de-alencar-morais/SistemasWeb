package br.com.projetoescola.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoescola.escola.Service.CidadeService;
import br.com.projetoescola.escola.entity.Cidade;

@Controller
@RequestMapping("/cidades")
public class CidadeController {

    //Injeção de dependência da service de cidade
    @Autowired
    private CidadeService cidadeService;
 
    //Método para salvar uma cidade
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Cidade cidade) {
        cidadeService.save(cidade);
        return "redirect:/cidades/listar";
    }
    //Método para listar todas as casas
    @GetMapping("/listar")
    public String listar(Model model){
        List<Cidade> cidade = cidadeService.findAll();
        model.addAttribute("cidades", cidade);
        return "cidade/listarCidade";
    }
    //Método para abrir o formulário da cidade
    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("cidade", new Cidade());
        return "cidade/formularioCidade";
    }

     //metodo para excluir uma casa 
     @GetMapping("/excluir/{id}")
     public String excluir(@PathVariable("id") Integer id){
     cidadeService.deleteById(id);
     return "redirect:/cidades/listar";
 }
 
     //metodo para abrir o formulario de edição da casa
     @GetMapping("/editar/{id}")
     public String editarForm(@PathVariable("id") Integer id, Model model) {
         Cidade cidade = cidadeService.findById(id);
         model.addAttribute("cidade", cidade);
         return "cidade/formularioCidade";
     }
    
    
}

