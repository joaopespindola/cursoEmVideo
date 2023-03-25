public abstract class Pessoa {

    protected String cpf;
    protected String nome;
    protected Endereco endereco;
    protected String estadoCivil;
    protected String dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, Endereco endereco, String estadoCivil, String dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public validadorCPF() {
    }

}