package medfacs.med.controller;

import jakarta.validation.Valid;
import medfacs.med.model.dadosCadastroMed;
import medfacs.med.model.dadosListagemMed;
import medfacs.med.model.medico;
import medfacs.med.model.medicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("medico")
public class medicoController {

    @Autowired
    private medicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody @Valid dadosCadastroMed dados) {
        repository.save(new medico(dados));
    }

    @GetMapping
    public Page<dadosListagemMed> listagem(@PageableDefault(sort = {"nome"},size = 10) Pageable pag) {
        return repository.findAll(pag).map(dadosListagemMed::new);

    }


}