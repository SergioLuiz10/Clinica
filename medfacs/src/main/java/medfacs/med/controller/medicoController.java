package medfacs.med.controller;

import jakarta.validation.Valid;
import medfacs.med.model.*;
import medfacs.med.service.dadosCadastroMed;
import medfacs.med.service.dadosListagemMed;
import medfacs.med.service.dadosUpdateMed;
import medfacs.med.service.medicoRepository;
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
    public Page<dadosListagemMed> listagemMed(@PageableDefault(sort = {"nome"},size = 10) Pageable pag) {
        return repository.findAllByativoTrue(pag).map(dadosListagemMed::new);

    }

    @PutMapping
    @Transactional
    public void atualizacao(@RequestBody @Valid dadosUpdateMed up){
     var med = repository.getReferenceById(up.id());
     med.updateInf(up);

    }
    @DeleteMapping("/{id}")
    @Transactional
    public void desativar(@PathVariable Long id){
        var medico = repository.getReferenceById(id);
        medico.delete();

    }


}