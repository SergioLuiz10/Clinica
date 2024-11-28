package medfacs.med.service;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class enderecoObjBank {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
    private String cep;


    public enderecoObjBank(dadosendereco endereco) {
        this.logradouro=endereco.logradouro();
        this.numero=endereco.numero();
        this.complemento=endereco.complemento();
        this.cidade=endereco.cidade();
        this.uf=endereco.uf();
        this.cep=endereco.cep();
    }

    public enderecoObjBank(enderecoObjBank endd) {
        if(endd.logradouro!=null){
            this.logradouro=endd.getLogradouro();
        }
        if(endd.numero!=null){
            this.numero=endd.getNumero();
        }if(endd.complemento!=null){
            this.complemento=endd.getComplemento();
        }if(endd.cidade!=null){
            this.cidade=endd.getCidade();
        }if(endd.uf!=null){
            this.uf=endd.getUf();
        }
        if(endd.cep!=null){
            this.cep=endd.getCep();
        }
    }
}
