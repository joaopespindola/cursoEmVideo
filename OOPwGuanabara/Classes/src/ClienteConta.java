public class ClienteConta {

    Conta conta;
    Cliente cliente;

    public ClienteConta(Conta conta, Cliente cliente) {
        this.conta = conta;
        this.cliente = cliente;
    }

    public Conta getConta() {
        return conta;
    }

    public Cliente getCliente() {
        return cliente;
    }

}