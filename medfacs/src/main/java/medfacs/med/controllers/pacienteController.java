package medfacs.med.controllers;

import jakarta.validation.Valid;
import medfacs.med.model.*;
import medfacs.med.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("paciente")
public class pacienteController {

    @Autowired
    private pacienteRepository repositorypac;


    @PostMapping
    @Transactional
    public ResponseEntity cadastropac(@RequestBody @Valid dadosCadastropac dados){
        paciente novoPaciente = repositorypac.save(new paciente(dados)); // Salva o novo paciente
        URI location = URI.create("/paciente/" + novoPaciente.getId()); // Cria a URI do novo paciente
        return ResponseEntity.created(location).body(new dadosNov(novoPaciente)); // Retorna 201 Created com o recurso
    }

    @GetMapping
    public ResponseEntity<Page<dadosListagemPac>> listagem(@PageableDefault(size = 10,sort = {"name"}) Pageable pag) {
        var pacc= repositorypac.findAll(pag).map(dadosListagemPac::new);

        return ResponseEntity.ok(pacc);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizacao(@RequestBody @Valid dadosUpdatepac dads){
      var pac = repositorypac.getReferenceById(dads.id());  //aqui vai buscar o paciente pelo id
        pac.updatePac(dads);// aqui vai trocar os dados

        return ResponseEntity.ok(new dadosNov(pac)); // Retorna os dados atualizados
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deletePac(@PathVariable Long id){
        repositorypac.deleteById(id);

            return ResponseEntity.noContent().build();
    }
}

