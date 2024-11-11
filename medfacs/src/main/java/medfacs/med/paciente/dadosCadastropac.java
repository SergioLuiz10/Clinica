package medfacs.med.paciente;

import medfacs.med.endereco.dadosendereco;

public record dadosCadastropac(String name, String email, String telefone, String cpf, dadosendereco endereco ) {
}
