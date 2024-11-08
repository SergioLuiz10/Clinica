package medfacs.med.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoObjBank {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
    private String cep;


    public EnderecoObjBank(Endereco endereco) {
        this.logradouro=endereco.logradouro();
        this.numero=endereco.numero();
        this.complemento=endereco.complemento();
        this.cidade=endereco.cidade();
        this.uf=endereco.uf();
        this.cep=endereco.cep();

    }
}
