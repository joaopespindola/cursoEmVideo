public class Gerente extends Funcionario {

    private String dataIngressoGerencia;
    private Agencia agencia;
    private boolean cursoGerencia;
    private double comissao;
    
    public Gerente(String cpf, String nome, Endereco endereco, String estadoCivil, String dataNascimento, int clt,
            int rg, char sexo, String cargo, double salario, int anoIngresso, String dataIngressoGerencia,
            Agencia agencia, boolean cursoGerencia, double comissao) {
        super(cpf, nome, endereco, estadoCivil, dataNascimento, clt, rg, sexo, cargo, salario, anoIngresso);
        this.dataIngressoGerencia = dataIngressoGerencia;
        this.agencia = agencia;
        this.cursoGerencia = cursoGerencia;
        this.comissao = comissao;
    }

    public String getDataIngressoGerencia() {
        return dataIngressoGerencia;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public boolean isCursoGerencia() {
        return cursoGerencia;
    }

    public double getComissao() {
        return comissao;
    }

    

}