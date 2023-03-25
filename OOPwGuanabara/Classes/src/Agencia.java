public class Agencia {

    private int numAg;
    private String nomeAg;
    private Endereco enderecoAg;
    private Gerente gerenteAg;

    public Agencia(int numAg, String nomeAg, Endereco enderecoAg, Gerente gerenteAg) {
        this.numAg = numAg;
        this.nomeAg = nomeAg;
        this.enderecoAg = enderecoAg;
        this.gerenteAg = gerenteAg;
    }
    
    public int getNumAg() {
        return numAg;
    }

    public String getNomeAg() {
        return nomeAg;
    }

    public Endereco getEnderecoAg() {
        return enderecoAg;
    }

    public Gerente getGerenteAg() {
        return gerenteAg;
    }

}