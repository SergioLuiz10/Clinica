package medfacs.med.service;

import medfacs.med.model.medico;

public record dadosListagemMed(Long id, String nome, String email, String crm, medfacs.med.service.especialidade especialidade){

    public dadosListagemMed(medico med) {
        this(med.getId(),med.getNome(), med.getEmail(), med.getCrm(), med.getEspecialidade());
    }
}
