public abstract class Transacao extends Conta {

    protected String dataTransacao;
    protected double valorTransacao;
    protected String meioTransacao;
    
    public Transacao(int senha, String nomeAgencia, int numAgencia, String dono, boolean estado, int numeroConta,
            double saldo, String dataAbertura, String dataUltimaMov, String dataTransacao, double valorTransacao,
            String meioTransacao) {
        super(senha, nomeAgencia, numAgencia, dono, estado, numeroConta, saldo, dataAbertura, dataUltimaMov);
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
        this.meioTransacao = meioTransacao;
    }

    public void saque(int senha, double valor) {
        if (this.senha == senha && saldo >= valor) {
            saldo =- valor;
            System.out.println("O saque foi realizado!\n\nSALDO ATUAL: " + saldo);
        }
        else if (this.senha == senha)
            System.out.println("O saque não pôde ser realizado!\n\tMOTIVO: Senha Inválida\n");
        else if (saldo < valor)
            System.out.println("O saque não pôde ser realizado!\n\tMOTIVO: Saldo Insuficiente\n");
    }

    public void deposito (int senha, double valor) {

    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public String getMeioTransacao() {
        return meioTransacao;
    }
    
}
