public class ContaSalario extends Conta {

    private double limiteSaque;
    private double limiteTransferencia;
    
    public ContaSalario(int numConta, double saldoAtual, String dataAbertura, String dataUltimaMov, Agencia agencia,
            boolean estadoConta, int senha, Cliente donosConta, double limiteSaque, double limiteTransferencia) {
        super(numConta, saldoAtual, dataAbertura, dataUltimaMov, agencia, estadoConta, senha, donosConta);
        this.limiteSaque = limiteSaque;
        this.limiteTransferencia = limiteTransferencia;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public double getLimiteTransferencia() {
        return limiteTransferencia;
    }

}