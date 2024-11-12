package medfacs.med.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import medfacs.med.endereco.enderecoObjBank;

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
    private enderecoObjBank enderco;

    public paciente(dadosCadastropac dados) {
        this.name=dados.name();
        this.cpf= dados.cpf();
        this.telefone=dados.telefone();
        this.email= dados.email();
        this.enderco=new enderecoObjBank(dados.endereco());
    }
}
