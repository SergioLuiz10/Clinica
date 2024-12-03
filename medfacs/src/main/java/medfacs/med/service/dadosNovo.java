package medfacs.med.service;

import medfacs.med.model.medico;

public record dadosNovo(Long id,String nome, String email,String telefone,String crm,especialidade especialidade, String faculdade, enderecoObjBank dadosendereco) {
    public dadosNovo(medico med) {
        this(
                med.getId(),
                med.getNome(),
                med.getEmail(),
                med.getTelefone(),
                med.getCrm(),
                med.getEspecialidade(),
                med.getFaculdade(),
                med.getEndereco()
        );
    }
}
