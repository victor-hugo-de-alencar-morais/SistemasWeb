package br.com.projetoescola.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoescola.escola.Service.CursoService;
import br.com.projetoescola.escola.entity.Curso;

@Controller
@RequestMapping("/cursos")
public class CursoController {

    //Injeção de dependência da service de cursos
    @Autowired
    private CursoService cursoService;
 
    //Método para salvar um curso
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Curso curso) {
        cursoService.save(curso);
        return "redirect:/cursos/listar";
    }
    //Método para listar todos os cursos
    @GetMapping("/listar")
    public String listar(Model model){
        List<Curso> curso = cursoService.findAll();
        model.addAttribute("cursos", curso);
        return "curso/listarCurso";
    }
    //Método para abrir o formulário de curso
    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("curso", new Curso());
        return "curso/formularioCurso";
    }
    
}
