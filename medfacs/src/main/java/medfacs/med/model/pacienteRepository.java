package medfacs.med.model;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pacienteRepository extends JpaRepository<paciente,Long> {
    Page<paciente> findAllByativoTrue(Pageable pag);
}
