package medfacs.med.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
        @NotBlank
                @Pattern(regexp = "\\d{11}")
        String cep,
        @NotBlank
        String bairro){


}
