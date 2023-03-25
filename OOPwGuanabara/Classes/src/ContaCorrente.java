public class ContaCorrente extends Conta {

    private double limiteChequeEsp;
    private double taxaAdministrativa;
    
    public ContaCorrente(int numConta, double saldoAtual, String dataAbertura, String dataUltimaMov, Agencia agencia,
            boolean estadoConta, int senha, Cliente donosConta, double limiteChequeEsp, double taxaAdministrativa) {
        super(numConta, saldoAtual, dataAbertura, dataUltimaMov, agencia, estadoConta, senha, donosConta);
        this.limiteChequeEsp = limiteChequeEsp;
        this.taxaAdministrativa = taxaAdministrativa;
    }

    public double getLimiteChequeEsp() {
        return limiteChequeEsp;
    }

    public double getTaxaAdministrativa() {
        return taxaAdministrativa;
    }

}