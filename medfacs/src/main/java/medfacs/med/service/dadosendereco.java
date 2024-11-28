package medfacs.med.service;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record dadosendereco(
       @NotBlank
        String logradouro,

        String numero,

        String complemento,
        @NotBlank
        String cidade,
         @NotBlank
        String uf,
       @Pattern(regexp = "\\d{8}")
       String cep,
        @NotBlank
        String bairro){


}
