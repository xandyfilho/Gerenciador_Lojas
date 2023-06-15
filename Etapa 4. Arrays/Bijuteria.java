public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double metaVendas, int tamanhoEstoqueLoja) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoqueLoja);
        this.metaVendas = metaVendas;
    }
    
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Loja Bijuteria [" 
        +"Nome da loja: "+ super.getNome()+
        "\nQuantidade de funcionarios: " + super.getQuantidadeFuncionarios()+
        "\nSalário base dos funcionários: " + super.getSalarioBaseFuncionario()+
        "\nEndereço: "+ super.getEndereco()+
        "\nData de fundação: "+ super.getDataFundacao()+
        "\nMetas de vendas: " +getMetaVendas()+"]";
    }
}
