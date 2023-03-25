import java.time.LocalDate;

public abstract class Conta implements Transacoes {

    protected int numConta;
    protected double saldoAtual;
    protected LocalDate dataAbertura;
    protected LocalDate dataUltimaMov;
    protected Agencia agencia;
    protected boolean estadoConta;
    protected int senha;
    protected Cliente donosConta;
    
    public Conta(int numConta, double saldoAtual, LocalDate dataAbertura, LocalDate dataUltimaMov, Agencia agencia,
            boolean estadoConta, int senha, Cliente donosConta) {
        this.numConta = numConta;
        this.saldoAtual = saldoAtual;
        this.dataAbertura = dataAbertura;
        this.dataUltimaMov = dataUltimaMov;
        this.agencia = agencia;
        this.estadoConta = estadoConta;
        this.senha = senha;
        this.donosConta = donosConta;
    }

    public boolean consultaSaldo() {

        if (validadorSenha(getSenha()) == true && isEstadoConta() == true) {
            System.out.println("SALDO ATUAL:  R$" + getSaldoAtual());
            return true;
        }

        else {
            System.out.println("\nSENHA INVÁLIDA! Tente novamente\n");
            return false;
        }
    }

    public boolean deposito(double valor) {

        if (validadorSenha(getSenha()) == true && isEstadoConta() == true) {
            setSaldoAtual(getSaldoAtual() + valor);
            System.out.println("\nDEPOSITO REALIZADO COM SUCESSO!\nSaldo Atual: R$" + getSaldoAtual());
            return true;
        }
        else if (validadorSenha(getSenha()) == false)
            System.out.println("\nSENHA INVÁLIDA! Tente novamente\n");


        else if (isEstadoConta() == false)
            System.out.println("CONTA INATIVA! Nao foi possivel realizar a operacao");
        
        return false;

    }

    public boolean saque(double valor) {
        
        if (validadorSenha(getSenha()) == true && isEstadoConta() == true && getSaldoAtual() >= valor) {
            setSaldoAtual(getSaldoAtual() - valor);
            System.out.println("\nSAQUE REALIZADO COM SUCESSO!\nSaldo Atual: R$" + getSaldoAtual());
            return true;
        }
        else if (validadorSenha(getSenha()) == false)
            System.out.println("\nSENHA INVÁLIDA! Tente novamente\n");

        else if (isEstadoConta() == false)
            System.out.println("CONTA INATIVA! Nao foi possivel realizar a operacao");

        return false;
    }

    public boolean pagamento(double valor) {

        if (validadorSenha(getSenha()) == true && isEstadoConta() == true) {
            setSaldoAtual(getSaldoAtual() + valor);
            System.out.println("\nPAGAMENTO REALIZADO COM SUCESSO!\nSaldo Atual: R$" + getSaldoAtual());
            return true;
        }
        else if (validadorSenha(getSenha()) == false)
            System.out.println("\nSENHA INVÁLIDA! Tente novamente\n");


        else if (isEstadoConta() == false)
            System.out.println("CONTA INATIVA! Nao foi possivel realizar a operacao");
        
        return false;

    }

    public boolean validadorSenha(int senha) {
        if (this.senha == senha)
            return true;
        else 
            return false;
    }

    public abstract void corCartao();

    public int getNumConta() {
        return numConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public LocalDate getDataUltimaMov() {
        return dataUltimaMov;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public boolean isEstadoConta() {
        return estadoConta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public Cliente getDonosConta() {
        return donosConta;
    }
}   