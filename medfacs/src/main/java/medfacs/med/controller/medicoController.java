package medfacs.med.controller;


import medfacs.med.medico.dadosCadastro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medico")
public class medicoController {

    @PostMapping
    public void cadastro(@RequestBody dadosCadastro dados){
        System.out.println(dados);
    }
}
