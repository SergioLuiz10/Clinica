package medfacs.med.medico;

import medfacs.med.endereco.Endereco;

public record dadosCadastro(String nome, String email, String telefone, String crm, Especialidade especialidade,
                            Endereco endereco) {
}
