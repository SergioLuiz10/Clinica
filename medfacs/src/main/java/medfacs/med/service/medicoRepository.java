package medfacs.med.service;

import medfacs.med.model.medico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

//tipo da entidade e tipo do atributo da chave primaria dela declarou o id como Long
public interface medicoRepository extends JpaRepository<medico,Long> {

    Page <medico>findAllByativoTrue(Pageable pag);
}
