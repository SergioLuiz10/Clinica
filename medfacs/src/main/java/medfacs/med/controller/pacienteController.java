package medfacs.med.controller;

import jakarta.validation.Valid;
import medfacs.med.model.dadosCadastropac;
import medfacs.med.model.paciente;
import medfacs.med.model.pacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
