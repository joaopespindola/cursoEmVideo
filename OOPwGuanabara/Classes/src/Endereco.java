public class Endereco {

    private String cidade;
    private String bairro;
    private String estado;
    
    public Endereco(String cidade, String bairro, String estado) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEstado() {
        return estado;
    }

}