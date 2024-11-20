package medfacs.med.controller;

import jakarta.validation.Valid;
import medfacs.med.model.*;
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

    @PutMapping
    @Transactional
    public void atualizacao(@RequestBody @Valid dadosUpdatepac dads){
      var pac = repositorypac.getReferenceById(dads.id());
        pac.updatePac(dads);
    }
}

