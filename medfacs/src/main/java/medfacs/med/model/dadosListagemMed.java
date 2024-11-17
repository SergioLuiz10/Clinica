package medfacs.med.model;

public record dadosListagemMed(String nome, String email, String crm, especialidade especialidade){

    public dadosListagemMed(medico med) {
        this(med.getNome(), med.getEmail(), med.getCrm(), med.getEspecialidade());
    }
}
