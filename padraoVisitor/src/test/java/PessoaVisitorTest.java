import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveGerarRelatorioFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Relatório do Funcionário:\n" +
                "Código: 1\n" +
                "Nome: Pedro\n" +
                "Salário: 5000.0", visitor.gerarRelatorioFuncionario(funcionario));
    }

    @Test
    void deveGerarRelatorioVendedor() {
        Vendedor vendedor = new Vendedor(1, "João", 3000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Relatório do Vendedor:\n" +
                "Código: 1\n" +
                "Nome: João\n" +
                "Salário: 3000.0", visitor.gerarRelatorioVendedor(vendedor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Relatório do Funcionário:\n" +
                "Código: 1\n" +
                "Nome: Pedro\n" +
                "Salário: 5000.0", visitor.gerarRelatorioFuncionario(funcionario));
    }

    @Test
    void deveGerarRelatorioComprador() {
        Comprador comprador = new Comprador(1, "Ana", "Rua A, 123");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Relatório do Comprador:\n" +
                "Código: 1\n" +
                "Nome: Ana\n" +
                "Endereço: Rua A, 123", visitor.gerarRelatorioComprador(comprador));
    }
}
