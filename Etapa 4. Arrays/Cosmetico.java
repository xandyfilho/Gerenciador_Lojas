public class Cosmetico extends Loja {

    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double taxaComercializacao, int tamanhoEstoqueLoja) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoqueLoja);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Loja Cósmeticos [" 
        +"Nome da loja: "+ super.getNome()+
        "\nQuantidade de funcionarios: " + super.getQuantidadeFuncionarios()+
        "\nSalário base dos funcionários: " + super.getSalarioBaseFuncionario()+
        "\nEndereço: "+ super.getEndereco()+
        "\nData de fundação: "+ super.getDataFundacao()+
        "\nValor taxa de comercialização: " +getTaxaComercializacao()+"]";
    }
    
    

    
}