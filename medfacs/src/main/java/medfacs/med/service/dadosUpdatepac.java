package medfacs.med.service;


import jakarta.validation.constraints.NotNull;

public record dadosUpdatepac(
       @NotNull
        Long id,

        String name,

        String telefone,

        enderecoObjBank ender) {

}
