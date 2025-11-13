package br.com.projetoescola.escola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoescola.escola.Service.UsuarioService;
import br.com.projetoescola.escola.entity.Usuario;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    
     @Autowired
     private UsuarioService usuarioService;

    //Método para abrir o formulário de usuario
    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuario/formularioUsuario";
      
    }
    // Salva o usuário
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/"; // redireciona para o menu principal
    }
}
