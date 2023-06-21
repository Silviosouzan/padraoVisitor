public class PessoaVisitor implements Visitor {
    @Override
    public String gerarRelatorioVendedor(Vendedor vendedor) {
        return "Relatório do Vendedor:\n" +
                "Código: " + vendedor.getCodigo() + "\n" +
                "Nome: " + vendedor.getNome() + "\n" +
                "Salário: " + vendedor.getSalario();
    }

    @Override
    public String gerarRelatorioComprador(Comprador comprador) {
        return "Relatório do Comprador:\n" +
                "Código: " + comprador.getCodigo() + "\n" +
                "Nome: " + comprador.getNome() + "\n" +
                "Endereço: " + comprador.getEndereco();
    }
    @Override
    public String gerarRelatorioFuncionario(Funcionario funcionario) {
        return "Relatório do Funcionário:\n" +
                "Código: " + funcionario.getCodigo() + "\n" +
                "Nome: " + funcionario.getNome() + "\n" +
                "Salário: " + funcionario.getSalario();
    }
}