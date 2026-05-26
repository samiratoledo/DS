public class Comissionado extends Funcionario {
    double totalVendas;
    double taxaComissao;

    public Comissionado(String nome, String cpf, double taxaComissao, int totalVendas) {
        super(nome, cpf);
        this.taxaComissao = taxaComissao;
        this.totalVendas = totalVendas;
    }

    @Override
    public double vencimentos() {
        return totalVendas * taxaComissao;
    }

}
