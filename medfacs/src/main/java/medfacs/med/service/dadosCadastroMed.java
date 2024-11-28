package medfacs.med.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record dadosCadastroMed(
        @NotBlank
        String faculdade,
        @NotBlank
        String nome,
       @NotBlank
               @Email
       String email,
        @NotBlank
       @Pattern(regexp = "\\d{9,13}")
        String telefone,
        @NotBlank
       @Pattern(regexp = "\\d{6}")
       String crm,
       @NotNull
        medfacs.med.service.especialidade especialidade,
       @NotNull
       @Valid
       dadosendereco dadosendereco) {
}
