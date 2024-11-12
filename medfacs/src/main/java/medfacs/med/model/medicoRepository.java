package medfacs.med.model;

import org.springframework.data.jpa.repository.JpaRepository;

//tipo da entidade e tipo do atributo da chave primaria dela declarou o id como Long
public interface medicoRepository extends JpaRepository<medico,Long> {
}
