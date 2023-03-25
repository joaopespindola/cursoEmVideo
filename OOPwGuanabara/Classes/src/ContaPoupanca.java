public class ContaPoupanca extends Conta {

    private double rendimentoMensal;

    public ContaPoupanca(int numConta, double saldoAtual, String dataAbertura, String dataUltimaMov, Agencia agencia,
            boolean estadoConta, int senha, Cliente donosConta, double rendimentoMensal) {
        super(numConta, saldoAtual, dataAbertura, dataUltimaMov, agencia, estadoConta, senha, donosConta);
        this.rendimentoMensal = rendimentoMensal;
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

}