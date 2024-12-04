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
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("medico")
public class medicoController {

    @Autowired
    private medicoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastro(@RequestBody @Valid dadosCadastroMed dados, UriComponentsBuilder urib) {
        var medico = repository.save(new medico(dados)); // Salva o novo médico
        var uri = urib.path("/medico/{id}").buildAndExpand(medico.getId()).toUri(); // Cria a URI do médico criado
        return ResponseEntity.created(uri).build(); // Retorna 201 Created com a URI
    }

    @GetMapping
    public ResponseEntity<Page<dadosListagemMed>> listagemMed(@PageableDefault(sort = {"nome"},size = 10) Pageable pag) {//200 ok retornando os nomes 10 por pag e por ordem crescente nome

      var pagina= repository.findAllByativoTrue(pag).map(dadosListagemMed::new);
        return ResponseEntity.ok(pagina);

    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizacao(@RequestBody @Valid dadosUpdateMed up){ //error 200 ok e vai mostrar o medico inteiro com as novas mudanças
     var med = repository.getReferenceById(up.id());
     med.updateInf(up);

     return ResponseEntity.ok(new dadosNovo(med));

    }
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity desativar(@PathVariable Long id){ //error 204 sem conteudo
        var medico = repository.getReferenceById(id);
        medico.delete();


     return ResponseEntity.noContent().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity detalhamento(@PathVariable Long id){
        var mee=repository.getReferenceById(id);

                return ResponseEntity.ok(new dadosNovo(mee));
    }


}