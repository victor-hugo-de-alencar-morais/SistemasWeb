package br.com.projetoescola.escola.controller;

@Controller
@RequestMapping("/cidades")
public class CidadeController {

    //Injeção de dependência da service de cursos
    @Autowired
    private CidadeService cidadeService;
 
    //Método para salvar um curso
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Cidade cidade) {
        cidadeService.save(cidade);
        return "redirect:/cidades/listar";
    }
    //Método para listar todos os cursos
    @GetMapping("/listar")
    public String listar(Model model){
        List<Cidade> cidade = cidadeService.findAll();
        model.addAttribute("cidades", cidade);
        return "curso/listarCidade";
    }
    //Método para abrir o formulário de curso
    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("cidade", new Cidade());
        return "cidade/formularioCidade";
    }

     //metodo para excluir um curso 
     @GetMapping("/excluir/{id}")
     public String excluir(@PathVariable("id") Integer id){
     cidadeService.deleteById(id);
     return "redirect:/cidades/listar";
 }
 
     //metodo para abrir o formulario de edição de curso
     @GetMapping("/editar/{id}")
     public String editarForm(@PathVariable("id") Integer id, Model model) {
         Cidade cidade = cidadeService.findById(id);
         model.addAttribute("cidade", cidade);
         return "cidade/formularioCidade";
     }
    
    
}

