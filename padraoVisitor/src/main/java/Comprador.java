public class Comprador implements Pessoa {
    private int codigo;
    private String nome;
    private String endereco;

    public Comprador(int codigo, String nome, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.gerarRelatorioComprador(this);
    }
}