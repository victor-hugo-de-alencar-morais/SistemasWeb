package br.com.projetoescola.escola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.projetoescola.escola.Service.UsuarioService;
import br.com.projetoescola.escola.entity.Usuario;

@Controller
public class UsuarioController {
    
     @Autowired
     private UsuarioService usuarioService;

    //  Exibe o formulário
    @GetMapping("/formularioUsuario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "formularioUsuario"; // nome do arquivo em templates/
    }
    // Salva o usuário
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/"; // redireciona para o menu principal
    }
}
