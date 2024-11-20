package medfacs.med.model;

public record dadosListagemPac(Long id, String name,String email,String cpf) {

    public dadosListagemPac(paciente pac){
        this(pac.getId(),pac.getName(), pac.getEmail(), pac.getCpf());
    }
}
