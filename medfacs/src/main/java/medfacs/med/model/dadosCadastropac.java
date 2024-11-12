package medfacs.med.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import medfacs.med.endereco.dadosendereco;

public record dadosCadastropac(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
                @Pattern(regexp = "\\d{9,13}")
        String telefone,
        @NotBlank
                @Pattern(regexp = "\\d{11}")
        String cpf,
         @NotNull
         @Valid
        dadosendereco endereco ) {
}