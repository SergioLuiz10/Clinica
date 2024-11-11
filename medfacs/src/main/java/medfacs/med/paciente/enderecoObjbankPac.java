package medfacs.med.paciente;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import medfacs.med.endereco.dadosendereco;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class enderecoObjbankPac {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    public enderecoObjbankPac(dadosendereco endereco) {
        this.logradouro=endereco.logradouro();
        this.complemento=endereco.complemento();
        this.numero=endereco.numero();
        this.bairro=endereco.bairro();
        this.cidade=endereco.cidade();
        this.uf=endereco.uf();
        this.cep=endereco.cep();
    }
}
