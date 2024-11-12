package medfacs.med.controller;


import jakarta.validation.Valid;
import medfacs.med.model.dadosCadastro;
import medfacs.med.model.medico;
import medfacs.med.model.medicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medico")
public class medicoController {

    @Autowired
    private medicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody @Valid dadosCadastro dados){
        repository.save(new medico(dados));
    }
}
