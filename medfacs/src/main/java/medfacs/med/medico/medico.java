package medfacs.med.medico;

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

    @Enumerated(EnumType.STRING)//enum
    private medfacs.med.medico.especialidade especialidade;

    @Embedded//pq o codigo e dividido em mais de um pedaço
    private enderecoObjBank endereco;


    public medico(dadosCadastro dados) {
        this.crm= dados.crm();
        this.nome= dados.nome();
        this.email= dados.email();
        this.telefone= dados.telefone();
        this.especialidade= dados.especialidade();
        this.endereco=new enderecoObjBank(dados.dadosendereco());
    }
}
