package medfacs.med.model;


import jakarta.validation.constraints.NotNull;
import medfacs.med.endereco.enderecoObjBank;

public record dadosUpdatepac(
       @NotNull
        Long id,

        String name,

        String telefone,

        enderecoObjBank ender) {

}
