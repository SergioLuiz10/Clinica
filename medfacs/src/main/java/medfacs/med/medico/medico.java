package medfacs.med.medico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import medfacs.med.endereco.enderecoobjBank;

@Table(name = "medico")
@Entity(name = "Medico")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class medico {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String telefone;
  private String crm;

  @Enumerated(EnumType.STRING)//pq vem de uma classe enum e tipo string pq no enum tem strings
  private Especialidade especialidade;

  @Embedded //dar uma olhada
  private enderecoobjBank endereco;

}
