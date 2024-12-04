package medfacs.med.service;

import medfacs.med.model.paciente;

public record dadosNovoPac(Long id, String name, String email, String telefone, String cpf, enderecoObjBank endereco) {


    public dadosNovoPac(paciente pac) {
        this(pac.getId(), pac.getName(), pac.getEmail(), pac.getTelefone(), pac.getCpf(), pac.getEnderco());
    }
}
