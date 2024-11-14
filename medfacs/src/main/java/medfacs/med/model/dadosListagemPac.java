package medfacs.med.model;

public record dadosListagemPac(String name,String email,String cpf) {

    public dadosListagemPac(paciente pac){
        this(pac.getCpf(),pac.getEmail(),pac.getName());
    }
}