package medfacs.med.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import medfacs.med.endereco.EnderecoObjBank;

@Table(name = "medico")
@Entity(name = "Medico")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id") //ele ve se o campo id de um objeto é igual ao id do outro.
public class medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)//enum
    private Especialidade especialidade;

    @Embedded//pq o codigo e dividido em mais de um pedaço
    private EnderecoObjBank endereco;


    public medico(dadosCadastro dados) {
        this.nome=dados.nome();
        this.especialidade=dados.especialidade();
        this.crm=dados.crm();
        this.telefone=dados.telefone();
        this.email=dados.email();
        this.endereco=new EnderecoObjBank(dados.endereco());
    }
}
