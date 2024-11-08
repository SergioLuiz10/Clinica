package medfacs.med.controller;


import medfacs.med.medico.dadosCadastro;
import medfacs.med.medico.medico;
import medfacs.med.medico.medicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medico")
public class medicoController {
   @Autowired
    private medicoRepository repositoryy;

    @PostMapping
    public void cadastro(@RequestBody dadosCadastro dados){
        repositoryy.save(new medico(dados));
    }
}
