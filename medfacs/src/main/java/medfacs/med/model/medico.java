package medfacs.med.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import medfacs.med.endereco.enderecoObjBank;

@Table(name = "medico")
@Entity(name = "medico")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    private String faculdade;
    private Boolean ativo;
    @Enumerated(EnumType.STRING)//enum
    private medfacs.med.model.especialidade especialidade;

    @Embedded//pq o codigo e dividido em mais de um pedaço
    private enderecoObjBank endereco;



    public medico(dadosCadastroMed dados) {
        this.ativo=true;
        this.crm= dados.crm();
        this.nome= dados.nome();
        this.email= dados.email();
        this.telefone= dados.telefone();
        this.faculdade=dados.faculdade();
        this.especialidade= dados.especialidade();
        this.endereco=new enderecoObjBank(dados.dadosendereco());
    }

    public  void updateInf(dadosUpdateMed up) {
        if(up.nome()!=null){
            this.nome= up.nome();
        }
        if(up.telefone()!=null) {
            this.telefone=up.telefone();
        }
        if(up.endereco()!=null){
            this.endereco=new enderecoObjBank(up.endereco());
        }
    }

    public void delete() {
        this.ativo=false;
    }
}
