public class Cliente extends Pessoa {

    private String escolaridade;
    private Agencia agencia;

    public Cliente(String cpf, String nome, Endereco endereco, String estadoCivil, String dataNascimento,
            String escolaridade, Agencia agencia) {
        super(cpf, nome, endereco, estadoCivil, dataNascimento);
        this.escolaridade = escolaridade;
        this.agencia = agencia;
    }
    
    public String getEscolaridade() {
        return escolaridade;
    }

    public Agencia getAgencia() {
        return agencia;
    }
    
}