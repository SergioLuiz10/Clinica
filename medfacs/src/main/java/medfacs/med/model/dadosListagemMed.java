package medfacs.med.model;

public record dadosListagemMed(Long id,String nome, String email, String crm, especialidade especialidade){

    public dadosListagemMed(medico med) {
        this(med.getId(),med.getNome(), med.getEmail(), med.getCrm(), med.getEspecialidade());
    }
}
