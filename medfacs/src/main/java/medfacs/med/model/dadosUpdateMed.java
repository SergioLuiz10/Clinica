package medfacs.med.model;


import jakarta.validation.constraints.NotNull;
import medfacs.med.endereco.enderecoObjBank;

public record dadosUpdateMed(
        @NotNull Long id,
        String nome,
         String telefone,
        enderecoObjBank endereco) {


}
