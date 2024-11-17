package medfacs.med.controller;

import jakarta.validation.Valid;
import medfacs.med.model.dadosCadastropac;
import medfacs.med.model.dadosListagemPac;
import medfacs.med.model.paciente;
import medfacs.med.model.pacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("paciente")
public class pacienteController {

    @Autowired
    private pacienteRepository repositorypac;

   @PostMapping
   @Transactional
   public void cadastropac(@RequestBody @Valid dadosCadastropac dados){
       repositorypac.save(new paciente(dados));
   }

    @GetMapping
    public Page<dadosListagemPac> listagem(@PageableDefault(size = 10,sort = {"name"}) Pageable pag) {
        return repositorypac.findAll(pag).map(dadosListagemPac::new);
    }
}

