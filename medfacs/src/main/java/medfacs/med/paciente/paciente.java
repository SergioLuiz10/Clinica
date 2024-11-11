package medfacs.med.paciente;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name ="paciente")
@Entity(name ="paciente")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String telefone;
    private String cpf;

   @Embedded
    private enderecoObjbankPac enderco;

    public paciente(dadosCadastropac dados) {
        this.name=dados.name();
        this.cpf= dados.cpf();
        this.telefone=dados.telefone();
        this.email= dados.email();
        this.enderco=new enderecoObjbankPac(dados.endereco());
    }
}
