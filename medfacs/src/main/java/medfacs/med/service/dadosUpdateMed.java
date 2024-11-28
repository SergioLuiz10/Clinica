package medfacs.med.service;


import jakarta.validation.constraints.NotNull;

public record dadosUpdateMed(
        @NotNull Long id,
        String nome,
         String telefone,
        enderecoObjBank endereco) {


}
