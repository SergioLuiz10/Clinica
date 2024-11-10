package medfacs.med.medico;

import medfacs.med.endereco.dadosendereco;

public record dadosCadastro(String nome, String email, String telefone, String crm, medfacs.med.medico.especialidade especialidade,
                            dadosendereco dadosendereco) {
}
